package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class v61 extends FrameLayout {
    public final int f52829a;
    public final Rect f52830b;
    public final v71 f52831c;

    public v61(v71 v71Var, Context context, int i7, Rect rect) {
        super(context);
        this.f52831c = v71Var;
        this.f52829a = i7;
        this.f52830b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.f52829a;
        Rect rect = this.f52830b;
        v71 v71Var = this.f52831c;
        if (i7 == 0) {
            v71Var.f52893r.setBounds(v71Var.X.getLeft() - rect.left, 0, v71Var.X.getRight() + rect.right, getMeasuredHeight());
        } else {
            v71Var.f52893r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        v71Var.f52893r.draw(canvas);
    }
}
