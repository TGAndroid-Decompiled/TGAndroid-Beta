package rg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import ei.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.k6;
public final class e1 implements g6 {
    public final TextPaint f45752a;
    public final TextPaint f45753b;
    public final TextPaint f45754c;
    public final Paint d;
    public final Paint e;
    public final r5 f45755f;

    public e1(r5 r5Var) {
        this.f45755f = r5Var;
        TextPaint textPaint = new TextPaint();
        this.f45752a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.f45753b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.f45754c = textPaint3;
        new Paint(3);
        this.d = new Paint(3);
        Paint paint = new Paint(3);
        this.e = paint;
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
    }

    @Override
    public final boolean a() {
        return this.f45755f.B0;
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        k6.q(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter c() {
        return k6.f21514v3;
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
                return this.f45753b;
            case 1:
                return this.f45754c;
            case 2:
                return this.e;
            case 3:
                return this.d;
            case 4:
                return this.f45752a;
            default:
                return k6.U0(str);
        }
    }

    @Override
    public final int e(int i10) {
        return g(i10);
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final int g(int i10) {
        return this.f45755f.C0.get(i10, k6.x0(null, i10, false));
    }

    @Override
    public final Drawable getDrawable(String str) {
        r5 r5Var = this.f45755f;
        e1 e1Var = r5Var.D0;
        if (str.equals("drawableMsgIn")) {
            if (r5Var.E0 == null) {
                r5Var.E0 = new j5(0, false, false, e1Var);
            }
            return r5Var.E0;
        } else if (str.equals("drawableMsgInSelected")) {
            if (r5Var.F0 == null) {
                r5Var.F0 = new j5(0, false, true, e1Var);
            }
            return r5Var.F0;
        } else if (str.equals("drawableMsgOut")) {
            if (r5Var.G0 == null) {
                r5Var.G0 = new j5(0, true, false, e1Var);
            }
            return r5Var.G0;
        } else if (str.equals("drawableMsgOutSelected")) {
            if (r5Var.H0 == null) {
                r5Var.H0 = new j5(0, true, true, e1Var);
            }
            return r5Var.H0;
        } else if (str.equals("drawableMsgInMedia")) {
            if (r5Var.I0 == null) {
                r5Var.I0 = new j5(1, false, false, e1Var);
            }
            r5Var.I0.invalidateSelf();
            return r5Var.I0;
        } else if (str.equals("drawableMsgInMediaSelected")) {
            if (r5Var.J0 == null) {
                r5Var.J0 = new j5(1, false, true, e1Var);
            }
            return r5Var.J0;
        } else if (str.equals("drawableMsgOutMedia")) {
            if (r5Var.K0 == null) {
                r5Var.K0 = new j5(1, true, false, e1Var);
            }
            return r5Var.K0;
        } else if (str.equals("drawableMsgOutMediaSelected")) {
            if (r5Var.L0 == null) {
                r5Var.L0 = new j5(1, true, true, e1Var);
            }
            return r5Var.L0;
        } else {
            return k6.Q0(str);
        }
    }

    @Override
    public final int i(int i10) {
        return g(i10);
    }

    @Override
    public final void h(int i10, int i11) {
    }
}
