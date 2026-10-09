package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.fk0;
import yh.b8;
public final class r1 extends r8 {
    public final b8 R;
    public final int S;
    public final org.telegram.ui.web.q0 T;

    public r1(Context context, int i10, e6 e6Var) {
        super(context, e6Var);
        int i11;
        this.R = new b8(1, 15);
        this.T = new org.telegram.ui.web.q0(this, 29);
        if (i10 == 1) {
            i11 = i6.fk;
        } else {
            i11 = i6.Mj;
        }
        this.S = i11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        org.telegram.ui.web.q0 q0Var = this.T;
        if (isEnabled) {
            b8 b8Var = this.R;
            b8Var.d();
            b8Var.a(canvas, i6.x0(null, this.S, false));
            yf.h.d().a(15, q0Var);
        } else {
            yf.h.d().f(q0Var);
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
        fk0 fk0Var = this.f22720e;
        float width = (fk0Var.getWidth() / 2.0f) + fk0Var.getX();
        float y3 = fk0Var.getY();
        float height = ((fk0Var.getHeight() / 2.0f) + (y3 + fk0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.R.g(rectF);
    }
}
