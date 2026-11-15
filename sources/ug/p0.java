package ug;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.lp;
public final class p0 extends h6 {
    public final int f58254s;
    public final q0 f58255w;

    public p0(q0 q0Var, Context context, int i7) {
        super(context, true, true, true);
        this.f58254s = i7;
        this.f58255w = q0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f58254s) {
            case 0:
                q0 q0Var = this.f58255w;
                if (q0Var.P > 0.0f) {
                    if (q0Var.O == null) {
                        q0Var.O = new lp(q0Var.f58267f.getTextColor());
                    }
                    int L = (int) ((1.0f - q0Var.P) * org.telegram.messenger.g0.L(24.0f));
                    q0Var.O.setBounds(0, L, getWidth(), getHeight() + L);
                    q0Var.O.setAlpha((int) (q0Var.P * 255.0f));
                    q0Var.O.draw(canvas);
                    invalidate();
                }
                float f10 = q0Var.P;
                if (f10 < 1.0f) {
                    if (f10 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (q0Var.P * org.telegram.messenger.g0.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (q0Var.P * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        return;
                    }
                    super.onDraw(canvas);
                    return;
                }
                return;
            default:
                q0 q0Var2 = this.f58255w;
                if (q0Var2.P > 0.0f) {
                    if (q0Var2.O == null) {
                        q0Var2.O = new lp(q0Var2.f58267f.getTextColor());
                    }
                    int L2 = (int) ((1.0f - q0Var2.P) * org.telegram.messenger.g0.L(24.0f));
                    q0Var2.O.setBounds(0, L2, getWidth(), getHeight() + L2);
                    q0Var2.O.setAlpha((int) (q0Var2.P * 255.0f));
                    q0Var2.O.draw(canvas);
                    invalidate();
                }
                float f11 = q0Var2.P;
                if (f11 < 1.0f) {
                    if (f11 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (q0Var2.P * org.telegram.messenger.g0.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (q0Var2.P * 0.4f));
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
