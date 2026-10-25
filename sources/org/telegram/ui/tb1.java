package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class tb1 extends FrameLayout {
    public final int f43727a;
    public final Rect f43728b;
    public final tc1 f43729c;

    public tb1(tc1 tc1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f43729c = tc1Var;
        this.f43727a = i10;
        this.f43728b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f43727a;
        Rect rect = this.f43728b;
        tc1 tc1Var = this.f43729c;
        if (i10 == 0) {
            tc1Var.f43780r.setBounds(tc1Var.W.getLeft() - rect.left, 0, tc1Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            tc1Var.f43780r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        tc1Var.f43780r.draw(canvas);
    }
}
