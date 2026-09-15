package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class wc1 extends FrameLayout {
    public final int f38840a;
    public final Rect f38841b;
    public final vd1 f38842c;

    public wc1(vd1 vd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f38842c = vd1Var;
        this.f38840a = i10;
        this.f38841b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f38840a;
        Rect rect = this.f38841b;
        vd1 vd1Var = this.f38842c;
        if (i10 == 0) {
            vd1Var.f38559r.setBounds(vd1Var.V.getLeft() - rect.left, 0, vd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            vd1Var.f38559r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        vd1Var.f38559r.draw(canvas);
    }
}
