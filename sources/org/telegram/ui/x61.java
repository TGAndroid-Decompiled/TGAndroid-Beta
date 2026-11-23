package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class x61 extends FrameLayout {
    public final int f53621a;
    public final Rect f53622b;
    public final x71 f53623c;

    public x61(x71 x71Var, Context context, int i7, Rect rect) {
        super(context);
        this.f53623c = x71Var;
        this.f53621a = i7;
        this.f53622b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.f53621a;
        Rect rect = this.f53622b;
        x71 x71Var = this.f53623c;
        if (i7 == 0) {
            x71Var.f53685r.setBounds(x71Var.X.getLeft() - rect.left, 0, x71Var.X.getRight() + rect.right, getMeasuredHeight());
        } else {
            x71Var.f53685r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        x71Var.f53685r.draw(canvas);
    }
}
