package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class vc1 extends FrameLayout {
    public final int f42823a;
    public final RectF f42824b;
    public final xd1 f42825c;

    public vc1(xd1 xd1Var, Context context, int i10) {
        super(context);
        this.f42823a = i10;
        switch (i10) {
            case 1:
                this.f42825c = xd1Var;
                super(context);
                this.f42824b = new RectF();
                return;
            default:
                this.f42825c = xd1Var;
                this.f42824b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f42823a) {
            case 0:
                RectF rectF = this.f42824b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                xd1 xd1Var = this.f42825c;
                vc1 vc1Var = xd1Var.D0;
                md1 md1Var = xd1Var.f43998x0;
                xc1 xc1Var = xd1Var.f43935a;
                org.telegram.ui.ActionBar.i6.s(vc1Var, md1Var, xc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, xc1Var.F("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.i6.b1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, xc1Var.F("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f42824b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                xd1 xd1Var2 = this.f42825c;
                vc1 vc1Var2 = xd1Var2.E0;
                md1 md1Var2 = xd1Var2.f43998x0;
                xc1 xc1Var2 = xd1Var2.f43935a;
                org.telegram.ui.ActionBar.i6.s(vc1Var2, md1Var2, xc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, xc1Var2.F("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.i6.b1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, xc1Var2.F("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
