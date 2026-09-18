package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.lj0;
import yh.i8;
public final class q1 extends r8 {
    public final i8 Q;
    public final int R;
    public final org.telegram.ui.web.u0 S;

    public q1(Context context, int i10, e6 e6Var) {
        super(context, e6Var);
        int i11;
        this.Q = new i8(1, 15);
        this.S = new org.telegram.ui.web.u0(this, 29);
        if (i10 == 1) {
            i11 = j6.fk;
        } else {
            i11 = j6.Mj;
        }
        this.R = i11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        org.telegram.ui.web.u0 u0Var = this.S;
        if (isEnabled) {
            i8 i8Var = this.Q;
            i8Var.d();
            i8Var.a(canvas, j6.w0(null, this.R, false));
            yf.h.d().a(15, u0Var);
        } else {
            yf.h.d().f(u0Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yf.h.d().f(this.S);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        lj0 lj0Var = this.e;
        float width = (lj0Var.getWidth() / 2.0f) + lj0Var.getX();
        float y3 = lj0Var.getY();
        float height = ((lj0Var.getHeight() / 2.0f) + (y3 + lj0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.Q.g(rectF);
    }
}
