package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class wo0 extends FrameLayout {
    public final Paint f41331a;
    public float f41332b;
    public o1.k f41333c;
    public final ap0 d;

    public wo0(ap0 ap0Var, Context context) {
        super(context);
        this.d = ap0Var;
        this.f41331a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        float f10;
        o1.k kVar = this.f41333c;
        if (kVar != null) {
            kVar.c();
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (z11) {
            float f11 = this.f41332b;
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
            kVar2.f16161u = lVar;
            this.f41333c = kVar2;
            kVar2.b(new wd0(this, 1));
            this.f41333c.a(new q9(this, 1));
            this.f41333c.h();
            return;
        }
        this.f41332b = f7;
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
        int i10 = org.telegram.ui.ActionBar.g6.O6;
        ap0 ap0Var = this.d;
        canvas.drawColor(ap0Var.getThemedColor(i10));
        int themedColor = ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19629ei);
        Paint paint = this.f41331a;
        paint.setColor(themedColor);
        if (LocaleController.isRTL) {
            dp = getWidth() - AndroidUtilities.dp(28.0f);
        } else {
            dp = AndroidUtilities.dp(28.0f);
        }
        canvas.drawCircle(dp, -AndroidUtilities.dp(28.0f), Math.max(getWidth(), getHeight()) * this.f41332b, paint);
    }
}
