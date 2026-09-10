package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class yc1 extends FrameLayout {
    public final int f38972a;
    public final RectF f38973b;
    public final ae1 f38974c;

    public yc1(ae1 ae1Var, Context context, int i10) {
        super(context);
        this.f38972a = i10;
        switch (i10) {
            case 1:
                this.f38974c = ae1Var;
                super(context);
                this.f38973b = new RectF();
                return;
            default:
                this.f38974c = ae1Var;
                this.f38973b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f38972a) {
            case 0:
                RectF rectF = this.f38973b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ae1 ae1Var = this.f38974c;
                yc1 yc1Var = ae1Var.D0;
                pd1 pd1Var = ae1Var.f30976x0;
                ad1 ad1Var = ae1Var.f30914a;
                org.telegram.ui.ActionBar.j6.s(yc1Var, pd1Var, ad1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ad1Var.F("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ad1Var.F("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f38973b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ae1 ae1Var2 = this.f38974c;
                yc1 yc1Var2 = ae1Var2.E0;
                pd1 pd1Var2 = ae1Var2.f30976x0;
                ad1 ad1Var2 = ae1Var2.f30914a;
                org.telegram.ui.ActionBar.j6.s(yc1Var2, pd1Var2, ad1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ad1Var2.F("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ad1Var2.F("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
