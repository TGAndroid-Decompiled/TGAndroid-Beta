package sg;

import ai.ee;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.ak0;
public final class s1 extends r8 {
    public final ee W;
    public final int f46862a0;
    public final org.telegram.ui.web.a2 f46863b0;

    public s1(Context context, int i10, g6 g6Var) {
        super(context, g6Var);
        int i11;
        this.W = new ee(1, 15);
        this.f46863b0 = new org.telegram.ui.web.a2(this, 25);
        if (i10 == 1) {
            i11 = k6.fk;
        } else {
            i11 = k6.Mj;
        }
        this.f46862a0 = i11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        org.telegram.ui.web.a2 a2Var = this.f46863b0;
        if (isEnabled) {
            ee eeVar = this.W;
            eeVar.d();
            eeVar.a(canvas, k6.x0(null, this.f46862a0, false));
            zf.h.d().a(15, a2Var);
        } else {
            zf.h.d().f(a2Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zf.h.d().f(this.f46863b0);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ak0 ak0Var = this.e;
        float width = (ak0Var.getWidth() / 2.0f) + ak0Var.getX();
        float y3 = ak0Var.getY();
        float height = ((ak0Var.getHeight() / 2.0f) + (y3 + ak0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.W.g(rectF);
    }
}
