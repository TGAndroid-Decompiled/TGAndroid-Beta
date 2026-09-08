package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class xc1 extends FrameLayout {
    public final int f42713a;
    public final Rect f42714b;
    public final wd1 f42715c;

    public xc1(wd1 wd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f42715c = wd1Var;
        this.f42713a = i10;
        this.f42714b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f42713a;
        Rect rect = this.f42714b;
        wd1 wd1Var = this.f42715c;
        if (i10 == 0) {
            wd1Var.f41988r.setBounds(wd1Var.V.getLeft() - rect.left, 0, wd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            wd1Var.f41988r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        wd1Var.f41988r.draw(canvas);
    }
}
