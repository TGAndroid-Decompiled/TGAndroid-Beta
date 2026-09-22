package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class yc1 extends FrameLayout {
    public final int f39903a;
    public final Rect f39904b;
    public final xd1 f39905c;

    public yc1(xd1 xd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f39905c = xd1Var;
        this.f39903a = i10;
        this.f39904b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f39903a;
        Rect rect = this.f39904b;
        xd1 xd1Var = this.f39905c;
        if (i10 == 0) {
            xd1Var.f39540r.setBounds(xd1Var.V.getLeft() - rect.left, 0, xd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            xd1Var.f39540r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        xd1Var.f39540r.draw(canvas);
    }
}
