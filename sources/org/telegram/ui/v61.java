package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class v61 extends FrameLayout {
    public final int f50590a;
    public final RectF f50591b;
    public final w71 f50592c;

    public v61(w71 w71Var, Context context, int i7) {
        super(context);
        this.f50590a = i7;
        switch (i7) {
            case 1:
                this.f50592c = w71Var;
                super(context);
                this.f50591b = new RectF();
                return;
            default:
                this.f50592c = w71Var;
                this.f50591b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f50590a) {
            case 0:
                RectF rectF = this.f50591b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                w71 w71Var = this.f50592c;
                v61 v61Var = w71Var.E0;
                m71 m71Var = w71Var.f50968y0;
                x61 x61Var = w71Var.f50902a;
                org.telegram.ui.ActionBar.l6.t(v61Var, m71Var, x61Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, x61Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.l6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, x61Var.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f50591b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                w71 w71Var2 = this.f50592c;
                v61 v61Var2 = w71Var2.F0;
                m71 m71Var2 = w71Var2.f50968y0;
                x61 x61Var2 = w71Var2.f50902a;
                org.telegram.ui.ActionBar.l6.t(v61Var2, m71Var2, x61Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, x61Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.l6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, x61Var2.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
