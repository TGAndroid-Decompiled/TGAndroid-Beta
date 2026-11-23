package tg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import hi.l5;
import org.telegram.messenger.bz;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u4;
public final class y0 implements i6 {
    public final TextPaint f58302a;
    public final TextPaint f58303b;
    public final TextPaint f58304c;
    public final Paint d;
    public final Paint f58305e;
    public final l5 f58306f;

    public y0(l5 l5Var) {
        this.f58306f = l5Var;
        TextPaint textPaint = new TextPaint();
        this.f58302a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.f58303b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.f58304c = textPaint3;
        new Paint(3);
        this.d = new Paint(3);
        Paint paint = new Paint(3);
        this.f58305e = paint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, bz.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, bz.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(352321536);
    }

    @Override
    public final boolean b() {
        return this.f58306f.D0;
    }

    @Override
    public final void c(float f10, float f11, int i7, int i10) {
        n6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter d() {
        return n6.f29783v3;
    }

    @Override
    public final Paint e(String str) {
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
                return this.f58303b;
            case 1:
                return this.f58304c;
            case 2:
                return this.f58305e;
            case 3:
                return this.d;
            case 4:
                return this.f58302a;
            default:
                return n6.V0(str);
        }
    }

    @Override
    public final boolean f() {
        return bz.H0;
    }

    @Override
    public final int g(int i7) {
        return i(i7);
    }

    @Override
    public final Drawable getDrawable(String str) {
        l5 l5Var = this.f58306f;
        y0 y0Var = l5Var.F0;
        if (str.equals("drawableMsgIn")) {
            if (l5Var.G0 == null) {
                l5Var.G0 = new u4(0, false, false, y0Var);
            }
            return l5Var.G0;
        } else if (str.equals("drawableMsgInSelected")) {
            if (l5Var.H0 == null) {
                l5Var.H0 = new u4(0, false, true, y0Var);
            }
            return l5Var.H0;
        } else if (str.equals("drawableMsgOut")) {
            if (l5Var.I0 == null) {
                l5Var.I0 = new u4(0, true, false, y0Var);
            }
            return l5Var.I0;
        } else if (str.equals("drawableMsgOutSelected")) {
            if (l5Var.J0 == null) {
                l5Var.J0 = new u4(0, true, true, y0Var);
            }
            return l5Var.J0;
        } else if (str.equals("drawableMsgInMedia")) {
            if (l5Var.K0 == null) {
                l5Var.K0 = new u4(1, false, false, y0Var);
            }
            l5Var.K0.invalidateSelf();
            return l5Var.K0;
        } else if (str.equals("drawableMsgInMediaSelected")) {
            if (l5Var.L0 == null) {
                l5Var.L0 = new u4(1, false, true, y0Var);
            }
            return l5Var.L0;
        } else if (str.equals("drawableMsgOutMedia")) {
            if (l5Var.M0 == null) {
                l5Var.M0 = new u4(1, true, false, y0Var);
            }
            return l5Var.M0;
        } else if (str.equals("drawableMsgOutMediaSelected")) {
            if (l5Var.N0 == null) {
                l5Var.N0 = new u4(1, true, true, y0Var);
            }
            return l5Var.N0;
        } else {
            return n6.R0(str);
        }
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final int i(int i7) {
        return this.f58306f.E0.get(i7, n6.x0(null, i7, false));
    }

    @Override
    public final int k(int i7) {
        return i(i7);
    }

    @Override
    public final void j(int i7, int i10) {
    }
}
