package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.aj0;
import zh.h8;
public final class u1 extends r8 {
    public final h8 Q;
    public final int R;
    public final p0 S;

    public u1(Context context, int i10, f6 f6Var) {
        super(context, f6Var);
        int i11;
        this.Q = new h8(1, 15);
        this.S = new p0(this, 3);
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
        p0 p0Var = this.S;
        if (isEnabled) {
            h8 h8Var = this.Q;
            h8Var.d();
            h8Var.a(canvas, j6.w0(null, this.R, false));
            yf.h.d().a(15, p0Var);
        } else {
            yf.h.d().f(p0Var);
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
        aj0 aj0Var = this.f22710e;
        float width = (aj0Var.getWidth() / 2.0f) + aj0Var.getX();
        float y3 = aj0Var.getY();
        float height = ((aj0Var.getHeight() / 2.0f) + (y3 + aj0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.Q.g(rectF);
    }
}
