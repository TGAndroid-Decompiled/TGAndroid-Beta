package zf;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.jp;
public final class o0 extends j6 {
    public final int f50632s;
    public final p0 v;

    public o0(p0 p0Var, Context context, int i9) {
        super(context, true, true, true);
        this.f50632s = i9;
        this.v = p0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f50632s) {
            case 0:
                p0 p0Var = this.v;
                if (p0Var.I > 0.0f) {
                    if (p0Var.H == null) {
                        p0Var.H = new jp(p0Var.d.getTextColor());
                    }
                    int dp = (int) ((1.0f - p0Var.I) * AndroidUtilities.dp(24.0f));
                    p0Var.H.setBounds(0, dp, getWidth(), getHeight() + dp);
                    p0Var.H.setAlpha((int) (p0Var.I * 255.0f));
                    p0Var.H.draw(canvas);
                    invalidate();
                }
                float f10 = p0Var.I;
                if (f10 < 1.0f) {
                    if (f10 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (p0Var.I * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (p0Var.I * 0.4f));
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
                if (p0Var2.I > 0.0f) {
                    if (p0Var2.H == null) {
                        p0Var2.H = new jp(p0Var2.d.getTextColor());
                    }
                    int dp2 = (int) ((1.0f - p0Var2.I) * AndroidUtilities.dp(24.0f));
                    p0Var2.H.setBounds(0, dp2, getWidth(), getHeight() + dp2);
                    p0Var2.H.setAlpha((int) (p0Var2.I * 255.0f));
                    p0Var2.H.draw(canvas);
                    invalidate();
                }
                float f11 = p0Var2.I;
                if (f11 < 1.0f) {
                    if (f11 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (p0Var2.I * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (p0Var2.I * 0.4f));
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
