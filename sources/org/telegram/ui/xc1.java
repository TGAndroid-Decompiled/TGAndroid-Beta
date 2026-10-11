package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class xc1 extends FrameLayout {
    public final int f44075a;
    public final Rect f44076b;
    public final wd1 f44077c;

    public xc1(wd1 wd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f44077c = wd1Var;
        this.f44075a = i10;
        this.f44076b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f44075a;
        Rect rect = this.f44076b;
        wd1 wd1Var = this.f44077c;
        if (i10 == 0) {
            wd1Var.f43406r.setBounds(wd1Var.V.getLeft() - rect.left, 0, wd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            wd1Var.f43406r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        wd1Var.f43406r.draw(canvas);
    }
}
