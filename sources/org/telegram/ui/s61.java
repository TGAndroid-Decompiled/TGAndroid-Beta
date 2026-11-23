package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class s61 extends FrameLayout {
    public final int f51985a;
    public final RectF f51986b;
    public final v71 f51987c;

    public s61(v71 v71Var, Context context, int i7) {
        super(context);
        this.f51985a = i7;
        switch (i7) {
            case 1:
                this.f51987c = v71Var;
                super(context);
                this.f51986b = new RectF();
                return;
            default:
                this.f51987c = v71Var;
                this.f51986b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f51985a) {
            case 0:
                RectF rectF = this.f51986b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                v71 v71Var = this.f51987c;
                s61 s61Var = v71Var.F0;
                l71 l71Var = v71Var.f52914z0;
                u61 u61Var = v71Var.f52845a;
                org.telegram.ui.ActionBar.n6.t(s61Var, l71Var, u61Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, u61Var.e("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.n6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, u61Var.e("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f51986b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                v71 v71Var2 = this.f51987c;
                s61 s61Var2 = v71Var2.G0;
                l71 l71Var2 = v71Var2.f52914z0;
                u61 u61Var2 = v71Var2.f52845a;
                org.telegram.ui.ActionBar.n6.t(s61Var2, l71Var2, u61Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, u61Var2.e("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.n6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, u61Var2.e("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
