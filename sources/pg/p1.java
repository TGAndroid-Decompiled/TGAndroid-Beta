package pg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.gm0;
public final class p1 {
    public c1 f40961a;
    public w0 f40962b;
    public Paint f40963c;
    public Paint d;
    public Paint e;
    public Paint f40964f;
    public Paint f40965g;
    public f1 h;
    public float f40966i;
    public float f40967j;
    public o1 f40968k;
    public l1 f40969l;
    public ArrayList f40970m;
    public ArrayList f40971n;
    public Matrix f40972o;
    public float[] f40973p;

    public static float a(float f7, float f10, float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float max = Math.max(Math.min((((f10 - f12) * f16) + ((f7 - f11) * f15)) / ((f16 * f16) + (f15 * f15)), 1.0f), 0.0f);
        float f17 = ((f15 * max) + f11) - f7;
        float f18 = ((max * f16) + f12) - f10;
        return (float) Math.sqrt((f18 * f18) + (f17 * f17));
    }

    public final void b(Canvas canvas, kv0 kv0Var, o1 o1Var) {
        Paint paint;
        Paint paint2;
        float width = (o1Var.d / kv0Var.f25698a) * canvas.getWidth();
        float height = (o1Var.e / kv0Var.f25699b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z10 = o1Var.f40956a;
        if (z10) {
            paint = this.d;
        } else {
            paint = this.f40964f;
        }
        canvas.drawCircle(width, height, dp, paint);
        float width2 = (o1Var.d / kv0Var.f25698a) * canvas.getWidth();
        float height2 = (o1Var.e / kv0Var.f25699b) * canvas.getHeight();
        float dp2 = AndroidUtilities.dp(5.0f);
        if (z10) {
            paint2 = this.e;
        } else {
            paint2 = this.f40965g;
        }
        canvas.drawCircle(width2, height2, dp2, paint2);
    }

    public final void c(float f7, float f10, boolean z10) {
        float[] fArr = this.f40973p;
        fArr[0] = f7;
        fArr[1] = f10;
        d(z10);
    }

    public final void d(boolean z10) {
        int i10;
        float[] fArr = this.f40973p;
        f1 f1Var = this.h;
        if (f1Var != null) {
            float f7 = f1Var.h;
            if (f7 != 0.0f) {
                float f10 = fArr[0] - f1Var.f40890b;
                fArr[0] = f10;
                fArr[1] = fArr[1] - f1Var.f40891c;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                double d = f7 * i10;
                float cos = (float) ((Math.cos(d) * f10) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                f1 f1Var2 = this.h;
                fArr[0] = cos + f1Var2.f40890b;
                fArr[1] = ((float) hg.k0.e(d, fArr[1], sin)) + f1Var2.f40891c;
            }
        }
    }

    public final void e() {
        f1 f1Var;
        c1 c1Var = this.f40961a;
        if (c1Var != null && c1Var.getPainting() != null && (f1Var = this.h) != null) {
            f1Var.f40892f = c1Var.getCurrentWeight();
            q0 painting = c1Var.getPainting();
            f1 f1Var2 = this.h;
            int currentColor = c1Var.getCurrentColor();
            if (f1Var2 != null) {
                if (painting.f40989r != null) {
                    painting.f40978f.f(new gm0(painting, f1Var2, currentColor, 11));
                }
            } else {
                painting.getClass();
            }
            this.f40970m.clear();
            this.f40971n.clear();
            this.h = null;
            b1 b1Var = c1Var.f40851a;
            if (b1Var != null) {
                b1Var.c();
            }
            c1Var.e.f40882z = true;
        }
    }
}
