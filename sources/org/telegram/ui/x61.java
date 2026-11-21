package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class x61 extends FrameLayout {
    public final int f53695a;
    public final Rect f53696b;
    public final x71 f53697c;

    public x61(x71 x71Var, Context context, int i7, Rect rect) {
        super(context);
        this.f53697c = x71Var;
        this.f53695a = i7;
        this.f53696b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.f53695a;
        Rect rect = this.f53696b;
        x71 x71Var = this.f53697c;
        if (i7 == 0) {
            x71Var.f53759r.setBounds(x71Var.X.getLeft() - rect.left, 0, x71Var.X.getRight() + rect.right, getMeasuredHeight());
        } else {
            x71Var.f53759r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        x71Var.f53759r.draw(canvas);
    }
}
