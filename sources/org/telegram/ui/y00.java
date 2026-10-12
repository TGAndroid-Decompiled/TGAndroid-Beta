package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class y00 extends org.telegram.ui.Components.s6 {
    public final int f41997s = 0;
    public final Object v;
    public final ViewGroup f41998w;

    public y00(zh.d7 d7Var, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.f41998w = d7Var;
        this.v = drawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        switch (this.f41997s) {
            case 0:
                z00 z00Var = (z00) this.f41998w;
                int a2 = z00Var.f42446w.a(z00Var.v, false);
                setTextColor(a2);
                Paint paint = (Paint) this.v;
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f7 = 0.2f;
                } else {
                    f7 = 0.1f;
                }
                paint.setColor(org.telegram.ui.ActionBar.g6.m1(f7, a2));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set((getWidth() - getDrawable().c()) - AndroidUtilities.dpf2(9.32f), (getHeight() - AndroidUtilities.dpf2(14.66f)) / 2.0f, getWidth(), (AndroidUtilities.dpf2(14.66f) + getHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                super.dispatchDraw(canvas);
                return;
            default:
                Drawable drawable = (Drawable) this.v;
                if (!((zh.d7) this.f41998w).d) {
                    int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().c()) - AndroidUtilities.dp(20.0f));
                    drawable.setBounds(measuredWidth, org.telegram.messenger.yh.B(17.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(17.0f) + measuredWidth, (AndroidUtilities.dp(17.0f) + getMeasuredHeight()) / 2);
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    public y00(z00 z00Var, Context context) {
        super(context, false, true, true);
        this.f41998w = z00Var;
        this.v = new Paint(1);
    }
}
