package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class s00 extends org.telegram.ui.Components.q6 {
    public final int f40269s = 0;
    public final Object v;
    public final ViewGroup f40270w;

    public s00(zh.j7 j7Var, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.f40270w = j7Var;
        this.v = drawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        switch (this.f40269s) {
            case 0:
                t00 t00Var = (t00) this.f40270w;
                int a2 = t00Var.f40581w.a(t00Var.v, false);
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
                if (!((zh.j7) this.f40270w).d) {
                    int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().d()) - AndroidUtilities.dp(20.0f));
                    drawable.setBounds(measuredWidth, org.telegram.messenger.wl.y(17.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(17.0f) + measuredWidth, (AndroidUtilities.dp(17.0f) + getMeasuredHeight()) / 2);
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    public s00(t00 t00Var, Context context) {
        super(context, false, true, true);
        this.f40270w = t00Var;
        this.v = new Paint(1);
    }
}
