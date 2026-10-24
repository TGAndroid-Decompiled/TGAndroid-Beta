package sg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.o6;
public final class o0 extends o6 {
    public final int f46794s;
    public final p0 v;

    public o0(p0 p0Var, Context context, int i10) {
        super(context, true, true, true);
        this.f46794s = i10;
        this.v = p0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f46794s) {
            case 0:
                p0 p0Var = this.v;
                if (p0Var.O > 0.0f) {
                    if (p0Var.N == null) {
                        p0Var.N = new cq(p0Var.f46802f.getTextColor());
                    }
                    int dp = (int) ((1.0f - p0Var.O) * AndroidUtilities.dp(24.0f));
                    p0Var.N.setBounds(0, dp, getWidth(), getHeight() + dp);
                    p0Var.N.setAlpha((int) (p0Var.O * 255.0f));
                    p0Var.N.draw(canvas);
                    invalidate();
                }
                float f7 = p0Var.O;
                if (f7 < 1.0f) {
                    if (f7 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (p0Var.O * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (p0Var.O * 0.4f));
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
                if (p0Var2.O > 0.0f) {
                    if (p0Var2.N == null) {
                        p0Var2.N = new cq(p0Var2.f46802f.getTextColor());
                    }
                    int dp2 = (int) ((1.0f - p0Var2.O) * AndroidUtilities.dp(24.0f));
                    p0Var2.N.setBounds(0, dp2, getWidth(), getHeight() + dp2);
                    p0Var2.N.setAlpha((int) (p0Var2.O * 255.0f));
                    p0Var2.N.draw(canvas);
                    invalidate();
                }
                float f10 = p0Var2.O;
                if (f10 < 1.0f) {
                    if (f10 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (p0Var2.O * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (p0Var2.O * 0.4f));
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
