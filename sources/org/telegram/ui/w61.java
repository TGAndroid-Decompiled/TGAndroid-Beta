package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class w61 extends FrameLayout {
    public final int f50930a;
    public final RectF f50931b;
    public final x71 f50932c;

    public w61(x71 x71Var, Context context, int i7) {
        super(context);
        this.f50930a = i7;
        switch (i7) {
            case 1:
                this.f50932c = x71Var;
                super(context);
                this.f50931b = new RectF();
                return;
            default:
                this.f50932c = x71Var;
                this.f50931b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f50930a) {
            case 0:
                RectF rectF = this.f50931b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                x71 x71Var = this.f50932c;
                w61 w61Var = x71Var.E0;
                n71 n71Var = x71Var.f51627y0;
                y61 y61Var = x71Var.f51561a;
                org.telegram.ui.ActionBar.m6.t(w61Var, n71Var, y61Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, y61Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.m6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, y61Var.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f50931b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                x71 x71Var2 = this.f50932c;
                w61 w61Var2 = x71Var2.F0;
                n71 n71Var2 = x71Var2.f51627y0;
                y61 y61Var2 = x71Var2.f51561a;
                org.telegram.ui.ActionBar.m6.t(w61Var2, n71Var2, y61Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, y61Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.m6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, y61Var2.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
