package tg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import fi.e5;
import org.telegram.messenger.iz;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.u4;
public final class t0 implements h6 {
    public final TextPaint f55965a;
    public final TextPaint f55966b;
    public final TextPaint f55967c;
    public final Paint d;
    public final Paint f55968e;
    public final e5 f55969f;

    public t0(e5 e5Var) {
        this.f55969f = e5Var;
        TextPaint textPaint = new TextPaint();
        this.f55965a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.f55966b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.f55967c = textPaint3;
        new Paint(3);
        this.d = new Paint(3);
        Paint paint = new Paint(3);
        this.f55968e = paint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, iz.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, iz.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(352321536);
    }

    @Override
    public final boolean a() {
        return this.f55969f.B0;
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        m6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter c() {
        return m6.f28222v3;
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
                return this.f55966b;
            case 1:
                return this.f55967c;
            case 2:
                return this.f55968e;
            case 3:
                return this.d;
            case 4:
                return this.f55965a;
            default:
                return m6.V0(str);
        }
    }

    @Override
    public final boolean e() {
        return iz.H0;
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
        e5 e5Var = this.f55969f;
        t0 t0Var = e5Var.D0;
        if (str.equals("drawableMsgIn")) {
            if (e5Var.E0 == null) {
                e5Var.E0 = new u4(0, false, false, t0Var);
            }
            return e5Var.E0;
        } else if (str.equals("drawableMsgInSelected")) {
            if (e5Var.F0 == null) {
                e5Var.F0 = new u4(0, false, true, t0Var);
            }
            return e5Var.F0;
        } else if (str.equals("drawableMsgOut")) {
            if (e5Var.G0 == null) {
                e5Var.G0 = new u4(0, true, false, t0Var);
            }
            return e5Var.G0;
        } else if (str.equals("drawableMsgOutSelected")) {
            if (e5Var.H0 == null) {
                e5Var.H0 = new u4(0, true, true, t0Var);
            }
            return e5Var.H0;
        } else if (str.equals("drawableMsgInMedia")) {
            if (e5Var.I0 == null) {
                e5Var.I0 = new u4(1, false, false, t0Var);
            }
            e5Var.I0.invalidateSelf();
            return e5Var.I0;
        } else if (str.equals("drawableMsgInMediaSelected")) {
            if (e5Var.J0 == null) {
                e5Var.J0 = new u4(1, false, true, t0Var);
            }
            return e5Var.J0;
        } else if (str.equals("drawableMsgOutMedia")) {
            if (e5Var.K0 == null) {
                e5Var.K0 = new u4(1, true, false, t0Var);
            }
            return e5Var.K0;
        } else if (str.equals("drawableMsgOutMediaSelected")) {
            if (e5Var.L0 == null) {
                e5Var.L0 = new u4(1, true, true, t0Var);
            }
            return e5Var.L0;
        } else {
            return m6.R0(str);
        }
    }

    @Override
    public final int h(int i7) {
        return this.f55969f.C0.get(i7, m6.x0(null, i7, false));
    }

    @Override
    public final int j(int i7) {
        return h(i7);
    }

    @Override
    public final void i(int i7, int i10) {
    }
}
