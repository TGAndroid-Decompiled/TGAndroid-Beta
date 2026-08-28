package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class yn0 extends FrameLayout {
    public final Paint f44913a;
    public float f44914b;
    public o1.j f44915c;
    public final co0 d;

    public yn0(co0 co0Var, Context context) {
        super(context);
        this.d = co0Var;
        this.f44913a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        float f10;
        float f11;
        o1.j jVar = this.f44915c;
        if (jVar != null) {
            jVar.c();
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z11) {
            float f12 = this.f44914b;
            if (f12 == f10) {
                return;
            }
            o1.j jVar2 = new o1.j(new gb.a(f12 * 100.0f));
            o1.k kVar = new o1.k(f10 * 100.0f);
            if (z10) {
                f11 = 500.0f;
            } else {
                f11 = 650.0f;
            }
            kVar.b(f11);
            kVar.a(1.0f);
            jVar2.f18800u = kVar;
            this.f44915c = jVar2;
            jVar2.b(new ad0(this, 1));
            this.f44915c.a(new l9(this, 1));
            this.f44915c.f();
            return;
        }
        this.f44914b = f10;
        TextView textView = this.d.Q;
        if (textView != null) {
            textView.setAlpha((f10 * 0.2f) + 0.8f);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        super.onDraw(canvas);
        int i9 = org.telegram.ui.ActionBar.f6.O6;
        co0 co0Var = this.d;
        canvas.drawColor(co0Var.getThemedColor(i9));
        int themedColor = co0Var.getThemedColor(org.telegram.ui.ActionBar.f6.ei);
        Paint paint = this.f44913a;
        paint.setColor(themedColor);
        if (LocaleController.isRTL) {
            dp = getWidth() - AndroidUtilities.dp(28.0f);
        } else {
            dp = AndroidUtilities.dp(28.0f);
        }
        canvas.drawCircle(dp, -AndroidUtilities.dp(28.0f), Math.max(getWidth(), getHeight()) * this.f44914b, paint);
    }
}
