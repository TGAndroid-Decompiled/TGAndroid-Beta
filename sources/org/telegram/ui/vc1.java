package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class vc1 extends FrameLayout {
    public final int f38394a;
    public final RectF f38395b;
    public final xd1 f38396c;

    public vc1(xd1 xd1Var, Context context, int i10) {
        super(context);
        this.f38394a = i10;
        switch (i10) {
            case 1:
                this.f38396c = xd1Var;
                super(context);
                this.f38395b = new RectF();
                return;
            default:
                this.f38396c = xd1Var;
                this.f38395b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f38394a) {
            case 0:
                RectF rectF = this.f38395b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                xd1 xd1Var = this.f38396c;
                vc1 vc1Var = xd1Var.D0;
                md1 md1Var = xd1Var.f39598x0;
                xc1 xc1Var = xd1Var.f39536a;
                org.telegram.ui.ActionBar.j6.s(vc1Var, md1Var, xc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, xc1Var.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, xc1Var.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f38395b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                xd1 xd1Var2 = this.f38396c;
                vc1 vc1Var2 = xd1Var2.E0;
                md1 md1Var2 = xd1Var2.f39598x0;
                xc1 xc1Var2 = xd1Var2.f39536a;
                org.telegram.ui.ActionBar.j6.s(vc1Var2, md1Var2, xc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, xc1Var2.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, xc1Var2.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
