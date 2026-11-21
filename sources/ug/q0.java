package ug;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.up;
public final class q0 extends o6 {
    public final int f58875s;
    public final r0 f58876w;

    public q0(r0 r0Var, Context context, int i7) {
        super(context, true, true, true);
        this.f58875s = i7;
        this.f58876w = r0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f58875s) {
            case 0:
                r0 r0Var = this.f58876w;
                if (r0Var.P > 0.0f) {
                    if (r0Var.O == null) {
                        r0Var.O = new up(r0Var.f58900f.getTextColor());
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
                r0 r0Var2 = this.f58876w;
                if (r0Var2.P > 0.0f) {
                    if (r0Var2.O == null) {
                        r0Var2.O = new up(r0Var2.f58900f.getTextColor());
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
