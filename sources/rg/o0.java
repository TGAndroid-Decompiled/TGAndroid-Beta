package rg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.vp;
public final class o0 extends p6 {
    public final int f42687s;
    public final p0 v;

    public o0(p0 p0Var, Context context, int i10) {
        super(context, true, true, true);
        this.f42687s = i10;
        this.v = p0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f42687s) {
            case 0:
                p0 p0Var = this.v;
                if (p0Var.M > 0.0f) {
                    if (p0Var.L == null) {
                        p0Var.L = new vp(p0Var.d.getTextColor());
                    }
                    int dp = (int) ((1.0f - p0Var.M) * AndroidUtilities.dp(24.0f));
                    p0Var.L.setBounds(0, dp, getWidth(), getHeight() + dp);
                    p0Var.L.setAlpha((int) (p0Var.M * 255.0f));
                    p0Var.L.draw(canvas);
                    invalidate();
                }
                float f7 = p0Var.M;
                if (f7 < 1.0f) {
                    if (f7 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (p0Var.M * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (p0Var.M * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        return;
                    }
                    super.onDraw(canvas);
                    return;
                }
                return;
            default:
                p0 p0Var2 = this.v;
                if (p0Var2.M > 0.0f) {
                    if (p0Var2.L == null) {
                        p0Var2.L = new vp(p0Var2.d.getTextColor());
                    }
                    int dp2 = (int) ((1.0f - p0Var2.M) * AndroidUtilities.dp(24.0f));
                    p0Var2.L.setBounds(0, dp2, getWidth(), getHeight() + dp2);
                    p0Var2.L.setAlpha((int) (p0Var2.M * 255.0f));
                    p0Var2.L.draw(canvas);
                    invalidate();
                }
                float f10 = p0Var2.M;
                if (f10 < 1.0f) {
                    if (f10 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (p0Var2.M * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (p0Var2.M * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        return;
                    }
                    super.onDraw(canvas);
                    return;
                }
                return;
        }
    }
}
