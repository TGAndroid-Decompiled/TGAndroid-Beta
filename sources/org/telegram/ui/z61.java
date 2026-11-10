package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class z61 extends FrameLayout {
    public final int f52305a;
    public final Rect f52306b;
    public final x71 f52307c;

    public z61(x71 x71Var, Context context, int i7, Rect rect) {
        super(context);
        this.f52307c = x71Var;
        this.f52305a = i7;
        this.f52306b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.f52305a;
        Rect rect = this.f52306b;
        x71 x71Var = this.f52307c;
        if (i7 == 0) {
            x71Var.f51608r.setBounds(x71Var.W.getLeft() - rect.left, 0, x71Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            x71Var.f51608r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        x71Var.f51608r.draw(canvas);
    }
}
