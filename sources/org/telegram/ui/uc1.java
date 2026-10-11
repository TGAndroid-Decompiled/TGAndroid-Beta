package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class uc1 extends FrameLayout {
    public final int f42559a;
    public final RectF f42560b;
    public final wd1 f42561c;

    public uc1(wd1 wd1Var, Context context, int i10) {
        super(context);
        this.f42559a = i10;
        switch (i10) {
            case 1:
                this.f42561c = wd1Var;
                super(context);
                this.f42560b = new RectF();
                return;
            default:
                this.f42561c = wd1Var;
                this.f42560b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f42559a) {
            case 0:
                RectF rectF = this.f42560b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                wd1 wd1Var = this.f42561c;
                uc1 uc1Var = wd1Var.D0;
                ld1 ld1Var = wd1Var.f43422x0;
                wc1 wc1Var = wd1Var.f43359a;
                org.telegram.ui.ActionBar.h6.s(uc1Var, ld1Var, wc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, wc1Var.F("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.h6.b1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, wc1Var.F("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f42560b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                wd1 wd1Var2 = this.f42561c;
                uc1 uc1Var2 = wd1Var2.E0;
                ld1 ld1Var2 = wd1Var2.f43422x0;
                wc1 wc1Var2 = wd1Var2.f43359a;
                org.telegram.ui.ActionBar.h6.s(uc1Var2, ld1Var2, wc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, wc1Var2.F("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.h6.b1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, wc1Var2.F("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
