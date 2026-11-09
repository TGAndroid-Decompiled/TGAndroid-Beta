package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class y61 extends FrameLayout {
    public final int f51971a;
    public final Rect f51972b;
    public final w71 f51973c;

    public y61(w71 w71Var, Context context, int i7, Rect rect) {
        super(context);
        this.f51973c = w71Var;
        this.f51971a = i7;
        this.f51972b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.f51971a;
        Rect rect = this.f51972b;
        w71 w71Var = this.f51973c;
        if (i7 == 0) {
            w71Var.f50949r.setBounds(w71Var.W.getLeft() - rect.left, 0, w71Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            w71Var.f50949r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        w71Var.f50949r.draw(canvas);
    }
}
