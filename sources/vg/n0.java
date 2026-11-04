package vg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.h6;
public final class n0 extends h6 {
    public final int f56743s;
    public final o0 f56744w;

    public n0(o0 o0Var, Context context, int i3) {
        super(context, true, true, true);
        this.f56743s = i3;
        this.f56744w = o0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f56743s) {
            case 0:
                o0 o0Var = this.f56744w;
                if (o0Var.P > 0.0f) {
                    if (o0Var.O == null) {
                        o0Var.O = new cp(o0Var.f56763f.getTextColor());
                    }
                    int L = (int) ((1.0f - o0Var.P) * org.telegram.messenger.g0.L(24.0f));
                    o0Var.O.setBounds(0, L, getWidth(), getHeight() + L);
                    o0Var.O.setAlpha((int) (o0Var.P * 255.0f));
                    o0Var.O.draw(canvas);
                    invalidate();
                }
                float f10 = o0Var.P;
                if (f10 < 1.0f) {
                    if (f10 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (o0Var.P * org.telegram.messenger.g0.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (o0Var.P * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        return;
                    }
                    super.onDraw(canvas);
                    return;
                }
                return;
            default:
                o0 o0Var2 = this.f56744w;
                if (o0Var2.P > 0.0f) {
                    if (o0Var2.O == null) {
                        o0Var2.O = new cp(o0Var2.f56763f.getTextColor());
                    }
                    int L2 = (int) ((1.0f - o0Var2.P) * org.telegram.messenger.g0.L(24.0f));
                    o0Var2.O.setBounds(0, L2, getWidth(), getHeight() + L2);
                    o0Var2.O.setAlpha((int) (o0Var2.P * 255.0f));
                    o0Var2.O.draw(canvas);
                    invalidate();
                }
                float f11 = o0Var2.P;
                if (f11 < 1.0f) {
                    if (f11 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (o0Var2.P * org.telegram.messenger.g0.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (o0Var2.P * 0.4f));
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
