package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class yc1 extends FrameLayout {
    public final int f44315a;
    public final Rect f44316b;
    public final xd1 f44317c;

    public yc1(xd1 xd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f44317c = xd1Var;
        this.f44315a = i10;
        this.f44316b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f44315a;
        Rect rect = this.f44316b;
        xd1 xd1Var = this.f44317c;
        if (i10 == 0) {
            xd1Var.f43984r.setBounds(xd1Var.V.getLeft() - rect.left, 0, xd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            xd1Var.f43984r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        xd1Var.f43984r.draw(canvas);
    }
}
