package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import bi.td;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.ak0;
public final class s1 extends v8 {
    public final td W;
    public final int f49040a0;
    public final org.telegram.ui.web.h1 f49041b0;

    public s1(Context context, int i10, u6 u6Var) {
        super(context, u6Var);
        int i11;
        this.W = new td(1, 15);
        this.f49041b0 = new org.telegram.ui.web.h1(this, 28);
        if (i10 == 1) {
            i11 = y6.fk;
        } else {
            i11 = y6.Mj;
        }
        this.f49040a0 = i11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        org.telegram.ui.web.h1 h1Var = this.f49041b0;
        if (isEnabled) {
            td tdVar = this.W;
            tdVar.d();
            tdVar.a(canvas, y6.x0(null, this.f49040a0, false));
            ag.n.d().a(15, h1Var);
        } else {
            ag.n.d().g(h1Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ag.n.d().g(this.f49041b0);
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
