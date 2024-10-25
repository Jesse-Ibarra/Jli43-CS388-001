# Extra Credit Challenge: Trivia Game App

Course Link: [CodePath Android Course](https://courses.codepath.org/courses/and102/unit/4#!labs)

Submitted by: **Jesse Ibarra** 

**Trivia Game App** is an app designed to present trivia questions, allow users to answer them, and provide results at the end.

Time spent: **3** hours spent in total <!-- Replace 'X' with the number of hours you spent on this project -->

## Application Features

### Required Features

The following **required** functionality is completed:

- [X] (2 pts) **Create a JSON file with at least 25 trivia questions.**
    - The JSON file contains trivia questions with 4 possible answers and a correct answer.
    - <img src='Assets/Requirement_1.png' title='Video Walkthrough' width='' alt='Video Walkthrough' />

- [X] (2 pts) **Create a Welcome Activity with trivia info and start button.**
    - The Welcome Activity provides trivia details and a start button to begin the quiz.
  - <img src='Assets/Requirement_2.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

- [X] (2 pts) **Randomly select and display 5 trivia questions.**
    - Each question loads in a separate activity, showing the trivia question and answers.
  - <img src='Assets/Requirement_3.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

- [X] (2 pts) **Display results at the end of the quiz.**
    - Results Activity shows the number of correct answers, percentage, and a dynamic message based on performance.
  - <img src='Assets/Requirement_4.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

- [X] (2 pts) **Display a dynamic message based on the user’s performance.**
    - Dynamic messages like "Great Job!" or "Better luck next time!" based on user score.
  - <img src='Assets/Requirement_4.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

### Stretch Features

The following **stretch** functionality is implemented:

- [ ] (+3 pts) **Save and display the user’s best score.**
    - The app saves the user’s highest score and displays it at the start of each game.
    - ![Image/GIF showing best score](http://i.imgur.com/link/to/your/gif/file.gif) <!-- Replace this link with your actual image/GIF link -->

- [ ] (+2 pts) **Add animations between questions for a smoother experience.**
    - Transitions between questions include animations for a better user experience.
    - ![Image/GIF showing animations](http://i.imgur.com/link/to/your/gif/file.gif) <!-- Replace this link with your actual image/GIF link -->

## Notes
I had an issue where when the app was installed, it was selecting 5 random questions but
when I tried to restart 

## Resources

- [Converting JSON to Models](https://guides.codepath.org/android/converting-json-to-models)
- [Gson](https://guides.codepath.org/android/Leveraging-the-Gson-Library#parsing-the-response)
- [Kotlin Serialization](https://github.com/Kotlin/kotlinx.serialization/blob/master/docs/serialization-guide.md)
- [Using Intents to Pass Data](https://guides.codepath.org/android/Using-Intents-to-Create-Flows)
- [SharedPreferences for Saving Data](https://developer.android.com/training/data-storage/shared-preferences)
- GIF created with [CloudConvert](https://cloudconvert.com/)
## License

```plaintext
    Copyright [2024] [Jesse Ibarra]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.