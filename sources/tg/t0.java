package tg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import hi.b5;
import org.telegram.messenger.bz;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.v4;
public final class t0 implements i6 {
    public final TextPaint f58131a;
    public final TextPaint f58132b;
    public final TextPaint f58133c;
    public final Paint d;
    public final Paint f58134e;
    public final b5 f58135f;

    public t0(b5 b5Var) {
        this.f58135f = b5Var;
        TextPaint textPaint = new TextPaint();
        this.f58131a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.f58132b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.f58133c = textPaint3;
        new Paint(3);
        this.d = new Paint(3);
        Paint paint = new Paint(3);
        this.f58134e = paint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, bz.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, bz.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(352321536);
    }

    @Override
    public final boolean d() {
        return this.f58135f.C0;
    }

    @Override
    public final void e(float f10, float f11, int i7, int i10) {
        n6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter f() {
        return n6.f29728v3;
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
                return this.f58132b;
            case 1:
                return this.f58133c;
            case 2:
                return this.f58134e;
            case 3:
                return this.d;
            case 4:
                return this.f58131a;
            default:
                return n6.V0(str);
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        b5 b5Var = this.f58135f;
        t0 t0Var = b5Var.E0;
        if (str.equals("drawableMsgIn")) {
            if (b5Var.F0 == null) {
                b5Var.F0 = new v4(0, false, false, t0Var);
            }
            return b5Var.F0;
        } else if (str.equals("drawableMsgInSelected")) {
            if (b5Var.G0 == null) {
                b5Var.G0 = new v4(0, false, true, t0Var);
            }
            return b5Var.G0;
        } else if (str.equals("drawableMsgOut")) {
            if (b5Var.H0 == null) {
                b5Var.H0 = new v4(0, true, false, t0Var);
            }
            return b5Var.H0;
        } else if (str.equals("drawableMsgOutSelected")) {
            if (b5Var.I0 == null) {
                b5Var.I0 = new v4(0, true, true, t0Var);
            }
            return b5Var.I0;
        } else if (str.equals("drawableMsgInMedia")) {
            if (b5Var.J0 == null) {
                b5Var.J0 = new v4(1, false, false, t0Var);
            }
            b5Var.J0.invalidateSelf();
            return b5Var.J0;
        } else if (str.equals("drawableMsgInMediaSelected")) {
            if (b5Var.K0 == null) {
                b5Var.K0 = new v4(1, false, true, t0Var);
            }
            return b5Var.K0;
        } else if (str.equals("drawableMsgOutMedia")) {
            if (b5Var.L0 == null) {
                b5Var.L0 = new v4(1, true, false, t0Var);
            }
            return b5Var.L0;
        } else if (str.equals("drawableMsgOutMediaSelected")) {
            if (b5Var.M0 == null) {
                b5Var.M0 = new v4(1, true, true, t0Var);
            }
            return b5Var.M0;
        } else {
            return n6.R0(str);
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
        return this.f58135f.D0.get(i7, n6.x0(null, i7, false));
    }

    @Override
    public final int m(int i7) {
        return k(i7);
    }

    @Override
    public final void l(int i7, int i10) {
    }
}
