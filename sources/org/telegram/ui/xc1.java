package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class xc1 extends FrameLayout {
    public final int f43891a;
    public final RectF f43892b;
    public final zd1 f43893c;

    public xc1(zd1 zd1Var, Context context, int i10) {
        super(context);
        this.f43891a = i10;
        switch (i10) {
            case 1:
                this.f43893c = zd1Var;
                super(context);
                this.f43892b = new RectF();
                return;
            default:
                this.f43893c = zd1Var;
                this.f43892b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f43891a) {
            case 0:
                RectF rectF = this.f43892b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                zd1 zd1Var = this.f43893c;
                xc1 xc1Var = zd1Var.D0;
                od1 od1Var = zd1Var.f44792x0;
                zc1 zc1Var = zd1Var.f44729a;
                org.telegram.ui.ActionBar.h6.s(xc1Var, od1Var, zc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, zc1Var.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.h6.b1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, zc1Var.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f43892b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                zd1 zd1Var2 = this.f43893c;
                xc1 xc1Var2 = zd1Var2.E0;
                od1 od1Var2 = zd1Var2.f44792x0;
                zc1 zc1Var2 = zd1Var2.f44729a;
                org.telegram.ui.ActionBar.h6.s(xc1Var2, od1Var2, zc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, zc1Var2.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.h6.b1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, zc1Var2.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
