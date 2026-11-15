package tg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import hi.c5;
import org.telegram.messenger.gz;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.r4;
public final class t0 implements e6 {
    public final TextPaint f57564a;
    public final TextPaint f57565b;
    public final TextPaint f57566c;
    public final Paint d;
    public final Paint f57567e;
    public final c5 f57568f;

    public t0(c5 c5Var) {
        this.f57568f = c5Var;
        TextPaint textPaint = new TextPaint();
        this.f57564a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.f57565b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.f57566c = textPaint3;
        new Paint(3);
        this.d = new Paint(3);
        Paint paint = new Paint(3);
        this.f57567e = paint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, gz.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, gz.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(352321536);
    }

    @Override
    public final boolean a() {
        return this.f57568f.C0;
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        j6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter c() {
        return j6.f29181v3;
    }

    @Override
    public final Paint d(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1490966183:
                if (str.equals("paintChatActionText2")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1712385955:
                if (str.equals("paintChatBotButton")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1790254137:
                if (str.equals("paintChatActionBackgroundDarken")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1897339317:
                if (str.equals("paintChatActionBackgroundSelected")) {
                    c10 = 3;
                    break;
                }
                break;
            case 2030114297:
                if (str.equals("paintChatActionText")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return this.f57565b;
            case 1:
                return this.f57566c;
            case 2:
                return this.f57567e;
            case 3:
                return this.d;
            case 4:
                return this.f57564a;
            default:
                return j6.V0(str);
        }
    }

    @Override
    public final boolean e() {
        return gz.H0;
    }

    @Override
    public final int f(int i7) {
        return h(i7);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final Drawable getDrawable(String str) {
        c5 c5Var = this.f57568f;
        t0 t0Var = c5Var.E0;
        if (str.equals("drawableMsgIn")) {
            if (c5Var.F0 == null) {
                c5Var.F0 = new r4(0, false, false, t0Var);
            }
            return c5Var.F0;
        } else if (str.equals("drawableMsgInSelected")) {
            if (c5Var.G0 == null) {
                c5Var.G0 = new r4(0, false, true, t0Var);
            }
            return c5Var.G0;
        } else if (str.equals("drawableMsgOut")) {
            if (c5Var.H0 == null) {
                c5Var.H0 = new r4(0, true, false, t0Var);
            }
            return c5Var.H0;
        } else if (str.equals("drawableMsgOutSelected")) {
            if (c5Var.I0 == null) {
                c5Var.I0 = new r4(0, true, true, t0Var);
            }
            return c5Var.I0;
        } else if (str.equals("drawableMsgInMedia")) {
            if (c5Var.J0 == null) {
                c5Var.J0 = new r4(1, false, false, t0Var);
            }
            c5Var.J0.invalidateSelf();
            return c5Var.J0;
        } else if (str.equals("drawableMsgInMediaSelected")) {
            if (c5Var.K0 == null) {
                c5Var.K0 = new r4(1, false, true, t0Var);
            }
            return c5Var.K0;
        } else if (str.equals("drawableMsgOutMedia")) {
            if (c5Var.L0 == null) {
                c5Var.L0 = new r4(1, true, false, t0Var);
            }
            return c5Var.L0;
        } else if (str.equals("drawableMsgOutMediaSelected")) {
            if (c5Var.M0 == null) {
                c5Var.M0 = new r4(1, true, true, t0Var);
            }
            return c5Var.M0;
        } else {
            return j6.R0(str);
        }
    }

    @Override
    public final int h(int i7) {
        return this.f57568f.D0.get(i7, j6.x0(null, i7, false));
    }

    @Override
    public final int j(int i7) {
        return h(i7);
    }

    @Override
    public final void i(int i7, int i10) {
    }
}
