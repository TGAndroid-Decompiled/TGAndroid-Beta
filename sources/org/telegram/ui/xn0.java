package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class xn0 extends FrameLayout {
    public final Paint f44623a;
    public float f44624b;
    public o1.k f44625c;
    public final bo0 d;

    public xn0(bo0 bo0Var, Context context) {
        super(context);
        this.d = bo0Var;
        this.f44623a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        float f9;
        float f10;
        o1.k kVar = this.f44625c;
        if (kVar != null) {
            kVar.c();
        }
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        if (z11) {
            float f11 = this.f44624b;
            if (f11 == f9) {
                return;
            }
            o1.k kVar2 = new o1.k(new ib.a(f11 * 100.0f));
            o1.l lVar = new o1.l(f9 * 100.0f);
            if (z10) {
                f10 = 500.0f;
            } else {
                f10 = 650.0f;
            }
            lVar.b(f10);
            lVar.a(1.0f);
            kVar2.f19045u = lVar;
            this.f44625c = kVar2;
            kVar2.b(new cd0(this, 1));
            this.f44625c.a(new k9(this, 1));
            this.f44625c.f();
            return;
        }
        this.f44624b = f9;
        TextView textView = this.d.Q;
        if (textView != null) {
            textView.setAlpha((f9 * 0.2f) + 0.8f);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        super.onDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.g6.O6;
        bo0 bo0Var = this.d;
        canvas.drawColor(bo0Var.getThemedColor(i10));
        int themedColor = bo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ei);
        Paint paint = this.f44623a;
        paint.setColor(themedColor);
        if (LocaleController.isRTL) {
            dp = getWidth() - AndroidUtilities.dp(28.0f);
        } else {
            dp = AndroidUtilities.dp(28.0f);
        }
        canvas.drawCircle(dp, -AndroidUtilities.dp(28.0f), Math.max(getWidth(), getHeight()) * this.f44624b, paint);
    }
}
