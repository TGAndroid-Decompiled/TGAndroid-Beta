package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
public final class wz extends org.telegram.ui.Components.f6 {
    public final int f43184s = 0;
    public final Object f43185w;
    public final ViewGroup f43186x;

    public wz(rh.w7 w7Var, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.f43186x = w7Var;
        this.f43185w = drawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        switch (this.f43184s) {
            case 0:
                xz xzVar = (xz) this.f43186x;
                int a2 = xzVar.f43487x.a(xzVar.f43486w, false);
                setTextColor(a2);
                Paint paint = (Paint) this.f43185w;
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
                Drawable drawable = (Drawable) this.f43185w;
                if (!((rh.w7) this.f43186x).d) {
                    int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().c()) - org.telegram.messenger.i0.L(20.0f));
                    drawable.setBounds(measuredWidth, org.telegram.messenger.a30.y(17.0f, getMeasuredHeight(), 2), org.telegram.messenger.i0.L(17.0f) + measuredWidth, (org.telegram.messenger.i0.L(17.0f) + getMeasuredHeight()) / 2);
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    public wz(xz xzVar, Context context) {
        super(context, false, true, true);
        this.f43186x = xzVar;
        this.f43185w = new Paint(1);
    }
}
