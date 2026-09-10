package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.kj0;
import xh.l8;
public final class s1 extends s8 {
    public final l8 Q;
    public final int R;
    public final q0 S;

    public s1(Context context, int i10, f6 f6Var) {
        super(context, f6Var);
        int i11;
        this.Q = new l8(1, 15);
        this.S = new q0(this, 3);
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
        q0 q0Var = this.S;
        if (isEnabled) {
            l8 l8Var = this.Q;
            l8Var.d();
            l8Var.a(canvas, j6.w0(null, this.R, false));
            xf.h.d().a(15, q0Var);
        } else {
            xf.h.d().f(q0Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xf.h.d().f(this.S);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        kj0 kj0Var = this.e;
        float width = (kj0Var.getWidth() / 2.0f) + kj0Var.getX();
        float y3 = kj0Var.getY();
        float height = ((kj0Var.getHeight() / 2.0f) + (y3 + kj0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.Q.g(rectF);
    }
}
