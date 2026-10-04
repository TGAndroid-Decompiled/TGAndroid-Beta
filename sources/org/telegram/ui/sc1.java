package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class sc1 extends FrameLayout {
    public final int f40455a;
    public final Rect f40456b;
    public final rd1 f40457c;

    public sc1(rd1 rd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f40457c = rd1Var;
        this.f40455a = i10;
        this.f40456b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f40455a;
        Rect rect = this.f40456b;
        rd1 rd1Var = this.f40457c;
        if (i10 == 0) {
            rd1Var.f40079r.setBounds(rd1Var.V.getLeft() - rect.left, 0, rd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            rd1Var.f40079r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        rd1Var.f40079r.draw(canvas);
    }
}
