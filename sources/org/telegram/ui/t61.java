package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class t61 extends FrameLayout {
    public final int f51393a;
    public final Rect f51394b;
    public final t71 f51395c;

    public t61(t71 t71Var, Context context, int i7, Rect rect) {
        super(context);
        this.f51395c = t71Var;
        this.f51393a = i7;
        this.f51394b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.f51393a;
        Rect rect = this.f51394b;
        t71 t71Var = this.f51395c;
        if (i7 == 0) {
            t71Var.f51456r.setBounds(t71Var.X.getLeft() - rect.left, 0, t71Var.X.getRight() + rect.right, getMeasuredHeight());
        } else {
            t71Var.f51456r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        t71Var.f51456r.draw(canvas);
    }
}
