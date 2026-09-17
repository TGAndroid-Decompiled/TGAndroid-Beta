package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class yc1 extends FrameLayout {
    public final int f39854a;
    public final Rect f39855b;
    public final xd1 f39856c;

    public yc1(xd1 xd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f39856c = xd1Var;
        this.f39854a = i10;
        this.f39855b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f39854a;
        Rect rect = this.f39855b;
        xd1 xd1Var = this.f39856c;
        if (i10 == 0) {
            xd1Var.f39577r.setBounds(xd1Var.V.getLeft() - rect.left, 0, xd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            xd1Var.f39577r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        xd1Var.f39577r.draw(canvas);
    }
}
