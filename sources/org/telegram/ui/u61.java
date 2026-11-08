package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class u61 extends FrameLayout {
    public final int f50243a;
    public final RectF f50244b;
    public final v71 f50245c;

    public u61(v71 v71Var, Context context, int i7) {
        super(context);
        this.f50243a = i7;
        switch (i7) {
            case 1:
                this.f50245c = v71Var;
                super(context);
                this.f50244b = new RectF();
                return;
            default:
                this.f50245c = v71Var;
                this.f50244b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f50243a) {
            case 0:
                RectF rectF = this.f50244b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                v71 v71Var = this.f50245c;
                u61 u61Var = v71Var.E0;
                l71 l71Var = v71Var.f50586y0;
                w61 w61Var = v71Var.f50520a;
                org.telegram.ui.ActionBar.k6.t(u61Var, l71Var, w61Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, w61Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, w61Var.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f50244b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                v71 v71Var2 = this.f50245c;
                u61 u61Var2 = v71Var2.F0;
                l71 l71Var2 = v71Var2.f50586y0;
                w61 w61Var2 = v71Var2.f50520a;
                org.telegram.ui.ActionBar.k6.t(u61Var2, l71Var2, w61Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, w61Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, w61Var2.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
