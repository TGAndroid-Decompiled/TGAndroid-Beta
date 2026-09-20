package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class yc1 extends FrameLayout {
    public final int f39883a;
    public final Rect f39884b;
    public final xd1 f39885c;

    public yc1(xd1 xd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f39885c = xd1Var;
        this.f39883a = i10;
        this.f39884b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f39883a;
        Rect rect = this.f39884b;
        xd1 xd1Var = this.f39885c;
        if (i10 == 0) {
            xd1Var.f39516r.setBounds(xd1Var.V.getLeft() - rect.left, 0, xd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            xd1Var.f39516r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        xd1Var.f39516r.draw(canvas);
    }
}
