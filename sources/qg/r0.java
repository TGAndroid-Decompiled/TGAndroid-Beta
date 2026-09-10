package qg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.zp;
public final class r0 extends o6 {
    public final int f40884s;
    public final s0 v;

    public r0(s0 s0Var, Context context, int i10) {
        super(context, true, true, true);
        this.f40884s = i10;
        this.v = s0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f40884s) {
            case 0:
                s0 s0Var = this.v;
                if (s0Var.M > 0.0f) {
                    if (s0Var.L == null) {
                        s0Var.L = new zp(s0Var.d.getTextColor());
                    }
                    int dp = (int) ((1.0f - s0Var.M) * AndroidUtilities.dp(24.0f));
                    s0Var.L.setBounds(0, dp, getWidth(), getHeight() + dp);
                    s0Var.L.setAlpha((int) (s0Var.M * 255.0f));
                    s0Var.L.draw(canvas);
                    invalidate();
                }
                float f7 = s0Var.M;
                if (f7 < 1.0f) {
                    if (f7 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (s0Var.M * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (s0Var.M * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        return;
                    }
                    super.onDraw(canvas);
                    return;
                }
                return;
            default:
                s0 s0Var2 = this.v;
                if (s0Var2.M > 0.0f) {
                    if (s0Var2.L == null) {
                        s0Var2.L = new zp(s0Var2.d.getTextColor());
                    }
                    int dp2 = (int) ((1.0f - s0Var2.M) * AndroidUtilities.dp(24.0f));
                    s0Var2.L.setBounds(0, dp2, getWidth(), getHeight() + dp2);
                    s0Var2.L.setAlpha((int) (s0Var2.M * 255.0f));
                    s0Var2.L.draw(canvas);
                    invalidate();
                }
                float f10 = s0Var2.M;
                if (f10 < 1.0f) {
                    if (f10 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (s0Var2.M * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (s0Var2.M * 0.4f));
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
