package com.example.trivia_app

import android.os.Parcel
import android.os.Parcelable

data class TriviaQuestion(
    val question: String,
    val answers: List<String>,
    val correctAnswer: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.createStringArrayList() ?: emptyList(),
        parcel.readString() ?: ""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(question)
        parcel.writeStringList(answers)
        parcel.writeString(correctAnswer)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TriviaQuestion> {
        override fun createFromParcel(parcel: Parcel): TriviaQuestion {
            return TriviaQuestion(parcel)
        }

        override fun newArray(size: Int): Array<TriviaQuestion?> {
            return arrayOfNulls(size)
        }
    }
}
