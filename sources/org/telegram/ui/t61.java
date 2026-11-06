package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class t61 extends FrameLayout {
    public final int f49961a;
    public final RectF f49962b;
    public final u71 f49963c;

    public t61(u71 u71Var, Context context, int i7) {
        super(context);
        this.f49961a = i7;
        switch (i7) {
            case 1:
                this.f49963c = u71Var;
                super(context);
                this.f49962b = new RectF();
                return;
            default:
                this.f49963c = u71Var;
                this.f49962b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f49961a) {
            case 0:
                RectF rectF = this.f49962b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                u71 u71Var = this.f49963c;
                t61 t61Var = u71Var.E0;
                k71 k71Var = u71Var.f50332y0;
                v61 v61Var = u71Var.f50266a;
                org.telegram.ui.ActionBar.k6.t(t61Var, k71Var, v61Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, v61Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, v61Var.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f49962b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                u71 u71Var2 = this.f49963c;
                t61 t61Var2 = u71Var2.F0;
                k71 k71Var2 = u71Var2.f50332y0;
                v61 v61Var2 = u71Var2.f50266a;
                org.telegram.ui.ActionBar.k6.t(t61Var2, k71Var2, v61Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, v61Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, v61Var2.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
