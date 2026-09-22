package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class so0 extends FrameLayout {
    public final Paint f37427a;
    public float f37428b;
    public o1.k f37429c;
    public final wo0 d;

    public so0(wo0 wo0Var, Context context) {
        super(context);
        this.d = wo0Var;
        this.f37427a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        float f10;
        o1.k kVar = this.f37429c;
        if (kVar != null) {
            kVar.c();
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (z11) {
            float f11 = this.f37428b;
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
            kVar2.f15349u = lVar;
            this.f37429c = kVar2;
            kVar2.b(new td0(this, 1));
            this.f37429c.a(new n9(this, 1));
            this.f37429c.f();
            return;
        }
        this.f37428b = f7;
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
        int i10 = org.telegram.ui.ActionBar.i6.O6;
        wo0 wo0Var = this.d;
        canvas.drawColor(wo0Var.getThemedColor(i10));
        int themedColor = wo0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18862ei);
        Paint paint = this.f37427a;
        paint.setColor(themedColor);
        if (LocaleController.isRTL) {
            dp = getWidth() - AndroidUtilities.dp(28.0f);
        } else {
            dp = AndroidUtilities.dp(28.0f);
        }
        canvas.drawCircle(dp, -AndroidUtilities.dp(28.0f), Math.max(getWidth(), getHeight()) * this.f37428b, paint);
    }
}
