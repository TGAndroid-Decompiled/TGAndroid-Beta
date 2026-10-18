package sg;

import ai.de;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.xj0;
public final class s1 extends q8 {
    public final de R;
    public final int S;
    public final org.telegram.ui.web.a2 T;

    public s1(Context context, int i10, d6 d6Var) {
        super(context, d6Var);
        int i11;
        this.R = new de(1, 15);
        this.T = new org.telegram.ui.web.a2(this, 25);
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
        org.telegram.ui.web.a2 a2Var = this.T;
        if (isEnabled) {
            de deVar = this.R;
            deVar.d();
            deVar.a(canvas, h6.x0(null, this.S, false));
            zf.h.d().a(15, a2Var);
        } else {
            zf.h.d().f(a2Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zf.h.d().f(this.T);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        xj0 xj0Var = this.e;
        float width = (xj0Var.getWidth() / 2.0f) + xj0Var.getX();
        float y3 = xj0Var.getY();
        float height = ((xj0Var.getHeight() / 2.0f) + (y3 + xj0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.R.g(rectF);
    }
}
