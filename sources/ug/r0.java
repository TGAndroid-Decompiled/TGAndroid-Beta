package ug;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.sp;
public final class r0 extends n6 {
    public final int f58849s;
    public final s0 f58850w;

    public r0(s0 s0Var, Context context, int i7) {
        super(context, true, true, true);
        this.f58849s = i7;
        this.f58850w = s0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f58849s) {
            case 0:
                s0 s0Var = this.f58850w;
                if (s0Var.P > 0.0f) {
                    if (s0Var.O == null) {
                        s0Var.O = new sp(s0Var.f58863f.getTextColor());
                    }
                    int L = (int) ((1.0f - s0Var.P) * org.telegram.messenger.g0.L(24.0f));
                    s0Var.O.setBounds(0, L, getWidth(), getHeight() + L);
                    s0Var.O.setAlpha((int) (s0Var.P * 255.0f));
                    s0Var.O.draw(canvas);
                    invalidate();
                }
                float f10 = s0Var.P;
                if (f10 < 1.0f) {
                    if (f10 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (s0Var.P * org.telegram.messenger.g0.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (s0Var.P * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        return;
                    }
                    super.onDraw(canvas);
                    return;
                }
                return;
            default:
                s0 s0Var2 = this.f58850w;
                if (s0Var2.P > 0.0f) {
                    if (s0Var2.O == null) {
                        s0Var2.O = new sp(s0Var2.f58863f.getTextColor());
                    }
                    int L2 = (int) ((1.0f - s0Var2.P) * org.telegram.messenger.g0.L(24.0f));
                    s0Var2.O.setBounds(0, L2, getWidth(), getHeight() + L2);
                    s0Var2.O.setAlpha((int) (s0Var2.P * 255.0f));
                    s0Var2.O.draw(canvas);
                    invalidate();
                }
                float f11 = s0Var2.P;
                if (f11 < 1.0f) {
                    if (f11 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (s0Var2.P * org.telegram.messenger.g0.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (s0Var2.P * 0.4f));
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
