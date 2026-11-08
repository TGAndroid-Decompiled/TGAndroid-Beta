package ug;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.j6;
public final class o0 extends j6 {
    public final int f56730s;
    public final p0 f56731w;

    public o0(p0 p0Var, Context context, int i7) {
        super(context, true, true, true);
        this.f56730s = i7;
        this.f56731w = p0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f56730s) {
            case 0:
                p0 p0Var = this.f56731w;
                if (p0Var.O > 0.0f) {
                    if (p0Var.N == null) {
                        p0Var.N = new cp(p0Var.f56757f.getTextColor());
                    }
                    int L = (int) ((1.0f - p0Var.O) * org.telegram.messenger.g0.L(24.0f));
                    p0Var.N.setBounds(0, L, getWidth(), getHeight() + L);
                    p0Var.N.setAlpha((int) (p0Var.O * 255.0f));
                    p0Var.N.draw(canvas);
                    invalidate();
                }
                float f10 = p0Var.O;
                if (f10 < 1.0f) {
                    if (f10 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (p0Var.O * org.telegram.messenger.g0.L(-24.0f)));
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
                p0 p0Var2 = this.f56731w;
                if (p0Var2.O > 0.0f) {
                    if (p0Var2.N == null) {
                        p0Var2.N = new cp(p0Var2.f56757f.getTextColor());
                    }
                    int L2 = (int) ((1.0f - p0Var2.O) * org.telegram.messenger.g0.L(24.0f));
                    p0Var2.N.setBounds(0, L2, getWidth(), getHeight() + L2);
                    p0Var2.N.setAlpha((int) (p0Var2.O * 255.0f));
                    p0Var2.N.draw(canvas);
                    invalidate();
                }
                float f11 = p0Var2.O;
                if (f11 < 1.0f) {
                    if (f11 != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, (int) (p0Var2.O * org.telegram.messenger.g0.L(-24.0f)));
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
