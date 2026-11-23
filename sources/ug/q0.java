package ug;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.rp;
public final class q0 extends n6 {
    public final int f58959s;
    public final r0 f58960w;

    public q0(r0 r0Var, Context context, int i7) {
        super(context, true, true, true);
        this.f58959s = i7;
        this.f58960w = r0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f58959s) {
            case 0:
                r0 r0Var = this.f58960w;
                if (r0Var.P > 0.0f) {
                    if (r0Var.O == null) {
                        r0Var.O = new rp(r0Var.f58984f.getTextColor());
                    }
                    int L = (int) ((1.0f - r0Var.P) * org.telegram.messenger.g0.L(24.0f));
                    r0Var.O.setBounds(0, L, getWidth(), getHeight() + L);
                    r0Var.O.setAlpha((int) (r0Var.P * 255.0f));
                    r0Var.O.draw(canvas);
                    invalidate();
                }
                float f10 = r0Var.P;
                if (f10 < 1.0f) {
                    if (f10 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (r0Var.P * org.telegram.messenger.g0.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (r0Var.P * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        return;
                    }
                    super.onDraw(canvas);
                    return;
                }
                return;
            default:
                r0 r0Var2 = this.f58960w;
                if (r0Var2.P > 0.0f) {
                    if (r0Var2.O == null) {
                        r0Var2.O = new rp(r0Var2.f58984f.getTextColor());
                    }
                    int L2 = (int) ((1.0f - r0Var2.P) * org.telegram.messenger.g0.L(24.0f));
                    r0Var2.O.setBounds(0, L2, getWidth(), getHeight() + L2);
                    r0Var2.O.setAlpha((int) (r0Var2.P * 255.0f));
                    r0Var2.O.draw(canvas);
                    invalidate();
                }
                float f11 = r0Var2.P;
                if (f11 < 1.0f) {
                    if (f11 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (r0Var2.P * org.telegram.messenger.g0.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (r0Var2.P * 0.4f));
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
