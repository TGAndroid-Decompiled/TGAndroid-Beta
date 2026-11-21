package tg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import hi.a5;
import org.telegram.messenger.bz;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.u4;
public final class u0 implements h6 {
    public final TextPaint f58184a;
    public final TextPaint f58185b;
    public final TextPaint f58186c;
    public final Paint d;
    public final Paint f58187e;
    public final a5 f58188f;

    public u0(a5 a5Var) {
        this.f58188f = a5Var;
        TextPaint textPaint = new TextPaint();
        this.f58184a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.f58185b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.f58186c = textPaint3;
        new Paint(3);
        this.d = new Paint(3);
        Paint paint = new Paint(3);
        this.f58187e = paint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, bz.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, bz.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(352321536);
    }

    @Override
    public final boolean d() {
        return this.f58188f.C0;
    }

    @Override
    public final void e(float f10, float f11, int i7, int i10) {
        m6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter f() {
        return m6.f29710v3;
    }

    @Override
    public final Paint g(String str) {
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
                return this.f58185b;
            case 1:
                return this.f58186c;
            case 2:
                return this.f58187e;
            case 3:
                return this.d;
            case 4:
                return this.f58184a;
            default:
                return m6.V0(str);
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        a5 a5Var = this.f58188f;
        u0 u0Var = a5Var.E0;
        if (str.equals("drawableMsgIn")) {
            if (a5Var.F0 == null) {
                a5Var.F0 = new u4(0, false, false, u0Var);
            }
            return a5Var.F0;
        } else if (str.equals("drawableMsgInSelected")) {
            if (a5Var.G0 == null) {
                a5Var.G0 = new u4(0, false, true, u0Var);
            }
            return a5Var.G0;
        } else if (str.equals("drawableMsgOut")) {
            if (a5Var.H0 == null) {
                a5Var.H0 = new u4(0, true, false, u0Var);
            }
            return a5Var.H0;
        } else if (str.equals("drawableMsgOutSelected")) {
            if (a5Var.I0 == null) {
                a5Var.I0 = new u4(0, true, true, u0Var);
            }
            return a5Var.I0;
        } else if (str.equals("drawableMsgInMedia")) {
            if (a5Var.J0 == null) {
                a5Var.J0 = new u4(1, false, false, u0Var);
            }
            a5Var.J0.invalidateSelf();
            return a5Var.J0;
        } else if (str.equals("drawableMsgInMediaSelected")) {
            if (a5Var.K0 == null) {
                a5Var.K0 = new u4(1, false, true, u0Var);
            }
            return a5Var.K0;
        } else if (str.equals("drawableMsgOutMedia")) {
            if (a5Var.L0 == null) {
                a5Var.L0 = new u4(1, true, false, u0Var);
            }
            return a5Var.L0;
        } else if (str.equals("drawableMsgOutMediaSelected")) {
            if (a5Var.M0 == null) {
                a5Var.M0 = new u4(1, true, true, u0Var);
            }
            return a5Var.M0;
        } else {
            return m6.R0(str);
        }
    }

    @Override
    public final boolean h() {
        return bz.H0;
    }

    @Override
    public final int i(int i7) {
        return k(i7);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final int k(int i7) {
        return this.f58188f.D0.get(i7, m6.x0(null, i7, false));
    }

    @Override
    public final int m(int i7) {
        return k(i7);
    }

    @Override
    public final void l(int i7, int i10) {
    }
}
