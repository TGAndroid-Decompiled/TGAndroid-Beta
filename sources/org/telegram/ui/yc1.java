package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class yc1 extends FrameLayout {
    public final int f44359a;
    public final Rect f44360b;
    public final xd1 f44361c;

    public yc1(xd1 xd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f44361c = xd1Var;
        this.f44359a = i10;
        this.f44360b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f44359a;
        Rect rect = this.f44360b;
        xd1 xd1Var = this.f44361c;
        if (i10 == 0) {
            xd1Var.f44028r.setBounds(xd1Var.V.getLeft() - rect.left, 0, xd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            xd1Var.f44028r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        xd1Var.f44028r.draw(canvas);
    }
}
