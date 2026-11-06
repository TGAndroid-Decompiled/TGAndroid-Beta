package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class w61 extends FrameLayout {
    public final int f50995a;
    public final Rect f50996b;
    public final u71 f50997c;

    public w61(u71 u71Var, Context context, int i7, Rect rect) {
        super(context);
        this.f50997c = u71Var;
        this.f50995a = i7;
        this.f50996b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.f50995a;
        Rect rect = this.f50996b;
        u71 u71Var = this.f50997c;
        if (i7 == 0) {
            u71Var.f50291r.setBounds(u71Var.W.getLeft() - rect.left, 0, u71Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            u71Var.f50291r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        u71Var.f50291r.draw(canvas);
    }
}
