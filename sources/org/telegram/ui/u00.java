package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class u00 extends org.telegram.ui.Components.o6 {
    public final int f37069s = 0;
    public final Object v;
    public final ViewGroup f37070w;

    public u00(xh.n7 n7Var, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.f37070w = n7Var;
        this.v = drawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        switch (this.f37069s) {
            case 0:
                v00 v00Var = (v00) this.f37070w;
                int a2 = v00Var.f37372w.a(v00Var.v, false);
                setTextColor(a2);
                Paint paint = (Paint) this.v;
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f7 = 0.2f;
                } else {
                    f7 = 0.1f;
                }
                paint.setColor(org.telegram.ui.ActionBar.j6.l1(f7, a2));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set((getWidth() - getDrawable().d()) - AndroidUtilities.dpf2(9.32f), (getHeight() - AndroidUtilities.dpf2(14.66f)) / 2.0f, getWidth(), (AndroidUtilities.dpf2(14.66f) + getHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                super.dispatchDraw(canvas);
                return;
            default:
                Drawable drawable = (Drawable) this.v;
                if (!((xh.n7) this.f37070w).d) {
                    int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().d()) - AndroidUtilities.dp(20.0f));
                    drawable.setBounds(measuredWidth, org.telegram.messenger.em.y(17.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(17.0f) + measuredWidth, (AndroidUtilities.dp(17.0f) + getMeasuredHeight()) / 2);
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    public u00(v00 v00Var, Context context) {
        super(context, false, true, true);
        this.f37070w = v00Var;
        this.v = new Paint(1);
    }
}
