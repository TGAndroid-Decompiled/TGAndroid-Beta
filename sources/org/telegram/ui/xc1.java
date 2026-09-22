package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class xc1 extends FrameLayout {
    public final int f39590a;
    public final Rect f39591b;
    public final wd1 f39592c;

    public xc1(wd1 wd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f39592c = wd1Var;
        this.f39590a = i10;
        this.f39591b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f39590a;
        Rect rect = this.f39591b;
        wd1 wd1Var = this.f39592c;
        if (i10 == 0) {
            wd1Var.f38832r.setBounds(wd1Var.V.getLeft() - rect.left, 0, wd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            wd1Var.f38832r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        wd1Var.f38832r.draw(canvas);
    }
}
