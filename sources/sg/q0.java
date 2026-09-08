package sg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.sp;
public final class q0 extends q6 {
    public final int f46256s;
    public final r0 v;

    public q0(r0 r0Var, Context context, int i10) {
        super(context, true, true, true);
        this.f46256s = i10;
        this.v = r0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f46256s) {
            case 0:
                r0 r0Var = this.v;
                if (r0Var.M > 0.0f) {
                    if (r0Var.L == null) {
                        r0Var.L = new sp(r0Var.d.getTextColor());
                    }
                    int dp = (int) ((1.0f - r0Var.M) * AndroidUtilities.dp(24.0f));
                    r0Var.L.setBounds(0, dp, getWidth(), getHeight() + dp);
                    r0Var.L.setAlpha((int) (r0Var.M * 255.0f));
                    r0Var.L.draw(canvas);
                    invalidate();
                }
                float f7 = r0Var.M;
                if (f7 < 1.0f) {
                    if (f7 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (r0Var.M * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (r0Var.M * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        return;
                    }
                    super.onDraw(canvas);
                    return;
                }
                return;
            default:
                r0 r0Var2 = this.v;
                if (r0Var2.M > 0.0f) {
                    if (r0Var2.L == null) {
                        r0Var2.L = new sp(r0Var2.d.getTextColor());
                    }
                    int dp2 = (int) ((1.0f - r0Var2.M) * AndroidUtilities.dp(24.0f));
                    r0Var2.L.setBounds(0, dp2, getWidth(), getHeight() + dp2);
                    r0Var2.L.setAlpha((int) (r0Var2.M * 255.0f));
                    r0Var2.L.draw(canvas);
                    invalidate();
                }
                float f10 = r0Var2.M;
                if (f10 < 1.0f) {
                    if (f10 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (r0Var2.M * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (r0Var2.M * 0.4f));
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
