package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class tc1 extends FrameLayout {
    public final int f37692a;
    public final RectF f37693b;
    public final vd1 f37694c;

    public tc1(vd1 vd1Var, Context context, int i10) {
        super(context);
        this.f37692a = i10;
        switch (i10) {
            case 1:
                this.f37694c = vd1Var;
                super(context);
                this.f37693b = new RectF();
                return;
            default:
                this.f37694c = vd1Var;
                this.f37693b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f37692a) {
            case 0:
                RectF rectF = this.f37693b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                vd1 vd1Var = this.f37694c;
                tc1 tc1Var = vd1Var.D0;
                kd1 kd1Var = vd1Var.f38529x0;
                vc1 vc1Var = vd1Var.f38467a;
                org.telegram.ui.ActionBar.j6.s(tc1Var, kd1Var, vc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, vc1Var.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, vc1Var.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f37693b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                vd1 vd1Var2 = this.f37694c;
                tc1 tc1Var2 = vd1Var2.E0;
                kd1 kd1Var2 = vd1Var2.f38529x0;
                vc1 vc1Var2 = vd1Var2.f38467a;
                org.telegram.ui.ActionBar.j6.s(tc1Var2, kd1Var2, vc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, vc1Var2.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, vc1Var2.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
