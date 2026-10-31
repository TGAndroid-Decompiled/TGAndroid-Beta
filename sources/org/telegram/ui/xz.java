package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
public final class xz extends org.telegram.ui.Components.f6 {
    public final int f43668s = 0;
    public final Object f43669w;
    public final ViewGroup f43670x;

    public xz(rh.w7 w7Var, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.f43670x = w7Var;
        this.f43669w = drawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        switch (this.f43668s) {
            case 0:
                yz yzVar = (yz) this.f43670x;
                int a2 = yzVar.f43921x.a(yzVar.f43920w, false);
                setTextColor(a2);
                Paint paint = (Paint) this.f43669w;
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f7 = 0.2f;
                } else {
                    f7 = 0.1f;
                }
                paint.setColor(org.telegram.ui.ActionBar.t6.r1(f7, a2));
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set((getWidth() - getDrawable().c()) - org.telegram.messenger.i0.N(9.32f), (getHeight() - org.telegram.messenger.i0.N(14.66f)) / 2.0f, getWidth(), (org.telegram.messenger.i0.N(14.66f) + getHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
                super.dispatchDraw(canvas);
                return;
            default:
                Drawable drawable = (Drawable) this.f43669w;
                if (!((rh.w7) this.f43670x).d) {
                    int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().c()) - org.telegram.messenger.i0.L(20.0f));
                    drawable.setBounds(measuredWidth, org.telegram.messenger.z20.y(17.0f, getMeasuredHeight(), 2), org.telegram.messenger.i0.L(17.0f) + measuredWidth, (org.telegram.messenger.i0.L(17.0f) + getMeasuredHeight()) / 2);
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    public xz(yz yzVar, Context context) {
        super(context, false, true, true);
        this.f43670x = yzVar;
        this.f43669w = new Paint(1);
    }
}
