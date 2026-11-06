package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class w61 extends FrameLayout {
    public final int f51000a;
    public final Rect f51001b;
    public final u71 f51002c;

    public w61(u71 u71Var, Context context, int i7, Rect rect) {
        super(context);
        this.f51002c = u71Var;
        this.f51000a = i7;
        this.f51001b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.f51000a;
        Rect rect = this.f51001b;
        u71 u71Var = this.f51002c;
        if (i7 == 0) {
            u71Var.f50312r.setBounds(u71Var.W.getLeft() - rect.left, 0, u71Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            u71Var.f50312r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        u71Var.f50312r.draw(canvas);
    }
}
