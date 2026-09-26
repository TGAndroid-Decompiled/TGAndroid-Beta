package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.mj0;
import yh.i8;
public final class r1 extends r8 {
    public final i8 Q;
    public final int R;
    public final q1 S;

    public r1(Context context, int i10, d6 d6Var) {
        super(context, d6Var);
        int i11;
        this.Q = new i8(1, 15);
        this.S = new q1(this, 0);
        if (i10 == 1) {
            i11 = h6.fk;
        } else {
            i11 = h6.Mj;
        }
        this.R = i11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        q1 q1Var = this.S;
        if (isEnabled) {
            i8 i8Var = this.Q;
            i8Var.d();
            i8Var.a(canvas, h6.w0(null, this.R, false));
            yf.h.d().a(15, q1Var);
        } else {
            yf.h.d().f(q1Var);
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
        mj0 mj0Var = this.e;
        float width = (mj0Var.getWidth() / 2.0f) + mj0Var.getX();
        float y3 = mj0Var.getY();
        float height = ((mj0Var.getHeight() / 2.0f) + (y3 + mj0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.Q.g(rectF);
    }
}
