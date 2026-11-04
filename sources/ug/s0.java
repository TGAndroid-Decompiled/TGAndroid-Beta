package ug;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import gi.c5;
import org.telegram.messenger.az;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t4;
public final class s0 implements e6 {
    public final TextPaint f56248a;
    public final TextPaint f56249b;
    public final TextPaint f56250c;
    public final Paint d;
    public final Paint f56251e;
    public final c5 f56252f;

    public s0(c5 c5Var) {
        this.f56252f = c5Var;
        TextPaint textPaint = new TextPaint();
        this.f56248a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.f56249b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.f56250c = textPaint3;
        new Paint(3);
        this.d = new Paint(3);
        Paint paint = new Paint(3);
        this.f56251e = paint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, az.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, az.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(352321536);
    }

    @Override
    public final boolean a() {
        return this.f56252f.C0;
    }

    @Override
    public final void b(float f10, float f11, int i3, int i10) {
        k6.r(f10, f11, i3, i10);
    }

    @Override
    public final ColorFilter c() {
        return k6.f28211v3;
    }

    @Override
    public final Paint d(String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1490966183:
                if (str.equals("paintChatActionText2")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1712385955:
                if (str.equals("paintChatBotButton")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1790254137:
                if (str.equals("paintChatActionBackgroundDarken")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1897339317:
                if (str.equals("paintChatActionBackgroundSelected")) {
                    c2 = 3;
                    break;
                }
                break;
            case 2030114297:
                if (str.equals("paintChatActionText")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return this.f56249b;
            case 1:
                return this.f56250c;
            case 2:
                return this.f56251e;
            case 3:
                return this.d;
            case 4:
                return this.f56248a;
            default:
                return k6.V0(str);
        }
    }

    @Override
    public final boolean e() {
        return az.H0;
    }

    @Override
    public final int f(int i3) {
        return h(i3);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final Drawable getDrawable(String str) {
        c5 c5Var = this.f56252f;
        s0 s0Var = c5Var.E0;
        if (str.equals("drawableMsgIn")) {
            if (c5Var.F0 == null) {
                c5Var.F0 = new t4(0, false, false, s0Var);
            }
            return c5Var.F0;
        } else if (str.equals("drawableMsgInSelected")) {
            if (c5Var.G0 == null) {
                c5Var.G0 = new t4(0, false, true, s0Var);
            }
            return c5Var.G0;
        } else if (str.equals("drawableMsgOut")) {
            if (c5Var.H0 == null) {
                c5Var.H0 = new t4(0, true, false, s0Var);
            }
            return c5Var.H0;
        } else if (str.equals("drawableMsgOutSelected")) {
            if (c5Var.I0 == null) {
                c5Var.I0 = new t4(0, true, true, s0Var);
            }
            return c5Var.I0;
        } else if (str.equals("drawableMsgInMedia")) {
            if (c5Var.J0 == null) {
                c5Var.J0 = new t4(1, false, false, s0Var);
            }
            c5Var.J0.invalidateSelf();
            return c5Var.J0;
        } else if (str.equals("drawableMsgInMediaSelected")) {
            if (c5Var.K0 == null) {
                c5Var.K0 = new t4(1, false, true, s0Var);
            }
            return c5Var.K0;
        } else if (str.equals("drawableMsgOutMedia")) {
            if (c5Var.L0 == null) {
                c5Var.L0 = new t4(1, true, false, s0Var);
            }
            return c5Var.L0;
        } else if (str.equals("drawableMsgOutMediaSelected")) {
            if (c5Var.M0 == null) {
                c5Var.M0 = new t4(1, true, true, s0Var);
            }
            return c5Var.M0;
        } else {
            return k6.R0(str);
        }
    }

    @Override
    public final int h(int i3) {
        return this.f56252f.D0.get(i3, k6.x0(null, i3, false));
    }

    @Override
    public final int j(int i3) {
        return h(i3);
    }

    @Override
    public final void i(int i3, int i10) {
    }
}
