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
import org.telegram.ui.Components.yj0;
public final class s1 extends q8 {
    public final de R;
    public final int S;
    public final org.telegram.ui.web.z1 T;

    public s1(Context context, int i10, d6 d6Var) {
        super(context, d6Var);
        int i11;
        this.R = new de(1, 15);
        this.T = new org.telegram.ui.web.z1(this, 25);
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
        org.telegram.ui.web.z1 z1Var = this.T;
        if (isEnabled) {
            de deVar = this.R;
            deVar.d();
            deVar.a(canvas, h6.x0(null, this.S, false));
            zf.h.d().a(15, z1Var);
        } else {
            zf.h.d().f(z1Var);
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
        yj0 yj0Var = this.e;
        float width = (yj0Var.getWidth() / 2.0f) + yj0Var.getX();
        float y3 = yj0Var.getY();
        float height = ((yj0Var.getHeight() / 2.0f) + (y3 + yj0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.R.g(rectF);
    }
}
