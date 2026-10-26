package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class tb1 extends FrameLayout {
    public final int f43730a;
    public final Rect f43731b;
    public final tc1 f43732c;

    public tb1(tc1 tc1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f43732c = tc1Var;
        this.f43730a = i10;
        this.f43731b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f43730a;
        Rect rect = this.f43731b;
        tc1 tc1Var = this.f43732c;
        if (i10 == 0) {
            tc1Var.f43783r.setBounds(tc1Var.W.getLeft() - rect.left, 0, tc1Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            tc1Var.f43783r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        tc1Var.f43783r.draw(canvas);
    }
}
