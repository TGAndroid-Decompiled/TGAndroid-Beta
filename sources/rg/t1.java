package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.nj0;
import yh.l8;
public final class t1 extends r8 {
    public final l8 Q;
    public final int R;
    public final s1 S;

    public t1(Context context, int i10, d6 d6Var) {
        super(context, d6Var);
        int i11;
        this.Q = new l8(1, 15);
        this.S = new s1(this, 0);
        if (i10 == 1) {
            i11 = i6.fk;
        } else {
            i11 = i6.Mj;
        }
        this.R = i11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        s1 s1Var = this.S;
        if (isEnabled) {
            l8 l8Var = this.Q;
            l8Var.d();
            l8Var.a(canvas, i6.w0(null, this.R, false));
            yf.h.d().a(15, s1Var);
        } else {
            yf.h.d().f(s1Var);
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
        nj0 nj0Var = this.f22730e;
        float width = (nj0Var.getWidth() / 2.0f) + nj0Var.getX();
        float y3 = nj0Var.getY();
        float height = ((nj0Var.getHeight() / 2.0f) + (y3 + nj0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.Q.g(rectF);
    }
}
