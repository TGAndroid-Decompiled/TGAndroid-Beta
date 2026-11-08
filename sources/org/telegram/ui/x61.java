package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class x61 extends FrameLayout {
    public final int f51790a;
    public final Rect f51791b;
    public final v71 f51792c;

    public x61(v71 v71Var, Context context, int i7, Rect rect) {
        super(context);
        this.f51792c = v71Var;
        this.f51790a = i7;
        this.f51791b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.f51790a;
        Rect rect = this.f51791b;
        v71 v71Var = this.f51792c;
        if (i7 == 0) {
            v71Var.f50567r.setBounds(v71Var.W.getLeft() - rect.left, 0, v71Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            v71Var.f50567r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        v71Var.f50567r.draw(canvas);
    }
}
