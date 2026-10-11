package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.hk0;
import yh.b8;
public final class r1 extends r8 {
    public final b8 R;
    public final int S;
    public final org.telegram.ui.web.t0 T;

    public r1(Context context, int i10, d6 d6Var) {
        super(context, d6Var);
        int i11;
        this.R = new b8(1, 15);
        this.T = new org.telegram.ui.web.t0(this, 29);
        if (i10 == 1) {
            i11 = h6.fk;
        } else {
            i11 = h6.Mj;
        }
        this.S = i11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        org.telegram.ui.web.t0 t0Var = this.T;
        if (isEnabled) {
            b8 b8Var = this.R;
            b8Var.d();
            b8Var.a(canvas, h6.x0(null, this.S, false));
            yf.h.d().a(15, t0Var);
        } else {
            yf.h.d().f(t0Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yf.h.d().f(this.T);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        hk0 hk0Var = this.f22712e;
        float width = (hk0Var.getWidth() / 2.0f) + hk0Var.getX();
        float y3 = hk0Var.getY();
        float height = ((hk0Var.getHeight() / 2.0f) + (y3 + hk0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.R.g(rectF);
    }
}
