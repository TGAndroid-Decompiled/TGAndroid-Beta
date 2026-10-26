package sg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import fi.q5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
public final class f1 implements u6 {
    public final TextPaint f48203a;
    public final TextPaint f48204b;
    public final TextPaint f48205c;
    public final Paint d;
    public final Paint e;
    public final q5 f48206f;

    public f1(q5 q5Var) {
        this.f48206f = q5Var;
        TextPaint textPaint = new TextPaint();
        this.f48203a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.f48204b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.f48205c = textPaint3;
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
        return this.f48206f.B0;
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        y6.q(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter c() {
        return y6.f23689v3;
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
                return this.f48204b;
            case 1:
                return this.f48205c;
            case 2:
                return this.e;
            case 3:
                return this.d;
            case 4:
                return this.f48203a;
            default:
                return y6.U0(str);
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
        return this.f48206f.C0.get(i10, y6.x0(null, i10, false));
    }

    @Override
    public final Drawable getDrawable(String str) {
        q5 q5Var = this.f48206f;
        f1 f1Var = q5Var.D0;
        if (str.equals("drawableMsgIn")) {
            if (q5Var.E0 == null) {
                q5Var.E0 = new l5(0, false, false, f1Var);
            }
            return q5Var.E0;
        } else if (str.equals("drawableMsgInSelected")) {
            if (q5Var.F0 == null) {
                q5Var.F0 = new l5(0, false, true, f1Var);
            }
            return q5Var.F0;
        } else if (str.equals("drawableMsgOut")) {
            if (q5Var.G0 == null) {
                q5Var.G0 = new l5(0, true, false, f1Var);
            }
            return q5Var.G0;
        } else if (str.equals("drawableMsgOutSelected")) {
            if (q5Var.H0 == null) {
                q5Var.H0 = new l5(0, true, true, f1Var);
            }
            return q5Var.H0;
        } else if (str.equals("drawableMsgInMedia")) {
            if (q5Var.I0 == null) {
                q5Var.I0 = new l5(1, false, false, f1Var);
            }
            q5Var.I0.invalidateSelf();
            return q5Var.I0;
        } else if (str.equals("drawableMsgInMediaSelected")) {
            if (q5Var.J0 == null) {
                q5Var.J0 = new l5(1, false, true, f1Var);
            }
            return q5Var.J0;
        } else if (str.equals("drawableMsgOutMedia")) {
            if (q5Var.K0 == null) {
                q5Var.K0 = new l5(1, true, false, f1Var);
            }
            return q5Var.K0;
        } else if (str.equals("drawableMsgOutMediaSelected")) {
            if (q5Var.L0 == null) {
                q5Var.L0 = new l5(1, true, true, f1Var);
            }
            return q5Var.L0;
        } else {
            return y6.Q0(str);
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
