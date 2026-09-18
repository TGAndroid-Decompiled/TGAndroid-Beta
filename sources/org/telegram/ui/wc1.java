package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class wc1 extends FrameLayout {
    public final int f38795a;
    public final Rect f38796b;
    public final vd1 f38797c;

    public wc1(vd1 vd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f38797c = vd1Var;
        this.f38795a = i10;
        this.f38796b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f38795a;
        Rect rect = this.f38796b;
        vd1 vd1Var = this.f38797c;
        if (i10 == 0) {
            vd1Var.f38513r.setBounds(vd1Var.V.getLeft() - rect.left, 0, vd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            vd1Var.f38513r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        vd1Var.f38513r.draw(canvas);
    }
}
