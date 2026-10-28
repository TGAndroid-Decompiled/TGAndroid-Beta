package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class sb1 extends FrameLayout {
    public final int f43289a;
    public final RectF f43290b;
    public final vc1 f43291c;

    public sb1(vc1 vc1Var, Context context, int i10) {
        super(context);
        this.f43289a = i10;
        switch (i10) {
            case 1:
                this.f43291c = vc1Var;
                super(context);
                this.f43290b = new RectF();
                return;
            default:
                this.f43291c = vc1Var;
                this.f43290b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f43289a) {
            case 0:
                RectF rectF = this.f43290b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                vc1 vc1Var = this.f43291c;
                sb1 sb1Var = vc1Var.E0;
                kc1 kc1Var = vc1Var.f44312y0;
                ub1 ub1Var = vc1Var.f44246a;
                org.telegram.ui.ActionBar.y6.s(sb1Var, kc1Var, ub1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ub1Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.y6.c1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ub1Var.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f43290b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                vc1 vc1Var2 = this.f43291c;
                sb1 sb1Var2 = vc1Var2.F0;
                kc1 kc1Var2 = vc1Var2.f44312y0;
                ub1 ub1Var2 = vc1Var2.f44246a;
                org.telegram.ui.ActionBar.y6.s(sb1Var2, kc1Var2, ub1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ub1Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.y6.c1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ub1Var2.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
