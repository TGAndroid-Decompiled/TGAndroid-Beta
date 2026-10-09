package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class yc1 extends FrameLayout {
    public final int f44313a;
    public final Rect f44314b;
    public final xd1 f44315c;

    public yc1(xd1 xd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f44315c = xd1Var;
        this.f44313a = i10;
        this.f44314b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f44313a;
        Rect rect = this.f44314b;
        xd1 xd1Var = this.f44315c;
        if (i10 == 0) {
            xd1Var.f43982r.setBounds(xd1Var.V.getLeft() - rect.left, 0, xd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            xd1Var.f43982r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        xd1Var.f43982r.draw(canvas);
    }
}
