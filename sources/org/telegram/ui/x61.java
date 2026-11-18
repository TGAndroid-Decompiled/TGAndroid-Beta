package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class x61 extends FrameLayout {
    public final int f53675a;
    public final Rect f53676b;
    public final x71 f53677c;

    public x61(x71 x71Var, Context context, int i7, Rect rect) {
        super(context);
        this.f53677c = x71Var;
        this.f53675a = i7;
        this.f53676b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.f53675a;
        Rect rect = this.f53676b;
        x71 x71Var = this.f53677c;
        if (i7 == 0) {
            x71Var.f53730r.setBounds(x71Var.X.getLeft() - rect.left, 0, x71Var.X.getRight() + rect.right, getMeasuredHeight());
        } else {
            x71Var.f53730r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        x71Var.f53730r.draw(canvas);
    }
}
