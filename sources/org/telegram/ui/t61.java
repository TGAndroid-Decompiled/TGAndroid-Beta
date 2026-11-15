package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class t61 extends FrameLayout {
    public final int f51394a;
    public final Rect f51395b;
    public final t71 f51396c;

    public t61(t71 t71Var, Context context, int i7, Rect rect) {
        super(context);
        this.f51396c = t71Var;
        this.f51394a = i7;
        this.f51395b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.f51394a;
        Rect rect = this.f51395b;
        t71 t71Var = this.f51396c;
        if (i7 == 0) {
            t71Var.f51457r.setBounds(t71Var.X.getLeft() - rect.left, 0, t71Var.X.getRight() + rect.right, getMeasuredHeight());
        } else {
            t71Var.f51457r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        t71Var.f51457r.draw(canvas);
    }
}
