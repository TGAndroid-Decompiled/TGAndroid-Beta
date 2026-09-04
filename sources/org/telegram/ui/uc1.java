package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class uc1 extends FrameLayout {
    public final int f41065a;
    public final RectF f41066b;
    public final wd1 f41067c;

    public uc1(wd1 wd1Var, Context context, int i10) {
        super(context);
        this.f41065a = i10;
        switch (i10) {
            case 1:
                this.f41067c = wd1Var;
                super(context);
                this.f41066b = new RectF();
                return;
            default:
                this.f41067c = wd1Var;
                this.f41066b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f41065a) {
            case 0:
                RectF rectF = this.f41066b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                wd1 wd1Var = this.f41067c;
                uc1 uc1Var = wd1Var.D0;
                ld1 ld1Var = wd1Var.f41977x0;
                wc1 wc1Var = wd1Var.f41914a;
                org.telegram.ui.ActionBar.j6.s(uc1Var, ld1Var, wc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, wc1Var.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, wc1Var.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f41066b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                wd1 wd1Var2 = this.f41067c;
                uc1 uc1Var2 = wd1Var2.E0;
                ld1 ld1Var2 = wd1Var2.f41977x0;
                wc1 wc1Var2 = wd1Var2.f41914a;
                org.telegram.ui.ActionBar.j6.s(uc1Var2, ld1Var2, wc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, wc1Var2.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, wc1Var2.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
