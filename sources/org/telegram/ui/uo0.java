package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class uo0 extends FrameLayout {
    public final Paint f38101a;
    public float f38102b;
    public o1.k f38103c;
    public final yo0 d;

    public uo0(yo0 yo0Var, Context context) {
        super(context);
        this.d = yo0Var;
        this.f38101a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        float f10;
        o1.k kVar = this.f38103c;
        if (kVar != null) {
            kVar.c();
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (z11) {
            float f11 = this.f38102b;
            if (f11 == f7) {
                return;
            }
            o1.k kVar2 = new o1.k(new o1.j(f11 * 100.0f));
            o1.l lVar = new o1.l(f7 * 100.0f);
            if (z10) {
                f10 = 500.0f;
            } else {
                f10 = 650.0f;
            }
            lVar.b(f10);
            lVar.a(1.0f);
            kVar2.f15361u = lVar;
            this.f38103c = kVar2;
            kVar2.b(new vd0(this, 1));
            this.f38103c.a(new p9(this, 1));
            this.f38103c.f();
            return;
        }
        this.f38102b = f7;
        TextView textView = this.d.U;
        if (textView != null) {
            textView.setAlpha((f7 * 0.2f) + 0.8f);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        super.onDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.j6.O6;
        yo0 yo0Var = this.d;
        canvas.drawColor(yo0Var.getThemedColor(i10));
        int themedColor = yo0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18890ei);
        Paint paint = this.f38101a;
        paint.setColor(themedColor);
        if (LocaleController.isRTL) {
            dp = getWidth() - AndroidUtilities.dp(28.0f);
        } else {
            dp = AndroidUtilities.dp(28.0f);
        }
        canvas.drawCircle(dp, -AndroidUtilities.dp(28.0f), Math.max(getWidth(), getHeight()) * this.f38102b, paint);
    }
}
