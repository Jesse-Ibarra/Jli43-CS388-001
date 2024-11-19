package com.codepath.bitlife;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/codepath/bitlife/WaterIntakeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/codepath/bitlife/WaterIntakeAdapter$ViewHolder;", "context", "Landroid/content/Context;", "entries", "", "Lcom/codepath/bitlife/data/DisplayWaterIntake;", "(Landroid/content/Context;Ljava/util/List;)V", "dateFormat", "Ljava/text/SimpleDateFormat;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateEntries", "newEntries", "", "ViewHolder", "app_debug"})
public final class WaterIntakeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.codepath.bitlife.WaterIntakeAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.codepath.bitlife.data.DisplayWaterIntake> entries = null;
    @org.jetbrains.annotations.NotNull
    private final java.text.SimpleDateFormat dateFormat = null;
    
    public WaterIntakeAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.List<com.codepath.bitlife.data.DisplayWaterIntake> entries) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.codepath.bitlife.WaterIntakeAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.codepath.bitlife.WaterIntakeAdapter.ViewHolder holder, int position) {
    }
    
    public final void updateEntries(@org.jetbrains.annotations.NotNull
    java.util.List<com.codepath.bitlife.data.DisplayWaterIntake> newEntries) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/codepath/bitlife/WaterIntakeAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/codepath/bitlife/WaterIntakeAdapter;Landroid/view/View;)V", "amountTextView", "Landroid/widget/TextView;", "getAmountTextView", "()Landroid/widget/TextView;", "dateTextView", "getDateTextView", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView dateTextView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView amountTextView = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getDateTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getAmountTextView() {
            return null;
        }
    }
}