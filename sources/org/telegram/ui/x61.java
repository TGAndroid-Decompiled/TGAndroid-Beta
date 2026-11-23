package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class x61 extends FrameLayout {
    public final int f53699a;
    public final Rect f53700b;
    public final x71 f53701c;

    public x61(x71 x71Var, Context context, int i7, Rect rect) {
        super(context);
        this.f53701c = x71Var;
        this.f53699a = i7;
        this.f53700b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.f53699a;
        Rect rect = this.f53700b;
        x71 x71Var = this.f53701c;
        if (i7 == 0) {
            x71Var.f53763r.setBounds(x71Var.X.getLeft() - rect.left, 0, x71Var.X.getRight() + rect.right, getMeasuredHeight());
        } else {
            x71Var.f53763r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        x71Var.f53763r.draw(canvas);
    }
}
