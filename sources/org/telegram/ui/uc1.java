package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class uc1 extends FrameLayout {
    public final int f37948a;
    public final RectF f37949b;
    public final wd1 f37950c;

    public uc1(wd1 wd1Var, Context context, int i10) {
        super(context);
        this.f37948a = i10;
        switch (i10) {
            case 1:
                this.f37950c = wd1Var;
                super(context);
                this.f37949b = new RectF();
                return;
            default:
                this.f37950c = wd1Var;
                this.f37949b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f37948a) {
            case 0:
                RectF rectF = this.f37949b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                wd1 wd1Var = this.f37950c;
                uc1 uc1Var = wd1Var.D0;
                ld1 ld1Var = wd1Var.f38848x0;
                wc1 wc1Var = wd1Var.f38786a;
                org.telegram.ui.ActionBar.i6.s(uc1Var, ld1Var, wc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, wc1Var.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.i6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, wc1Var.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f37949b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                wd1 wd1Var2 = this.f37950c;
                uc1 uc1Var2 = wd1Var2.E0;
                ld1 ld1Var2 = wd1Var2.f38848x0;
                wc1 wc1Var2 = wd1Var2.f38786a;
                org.telegram.ui.ActionBar.i6.s(uc1Var2, ld1Var2, wc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, wc1Var2.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.i6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, wc1Var2.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
