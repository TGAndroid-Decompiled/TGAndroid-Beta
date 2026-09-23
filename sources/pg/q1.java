package pg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.yl0;
public final class q1 {
    public d1 f40889a;
    public x0 f40890b;
    public Paint f40891c;
    public Paint d;
    public Paint e;
    public Paint f40892f;
    public Paint f40893g;
    public g1 h;
    public float f40894i;
    public float f40895j;
    public p1 f40896k;
    public m1 f40897l;
    public ArrayList f40898m;
    public ArrayList f40899n;
    public Matrix f40900o;
    public float[] f40901p;

    public static float a(float f7, float f10, float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float max = Math.max(Math.min((((f10 - f12) * f16) + ((f7 - f11) * f15)) / ((f16 * f16) + (f15 * f15)), 1.0f), 0.0f);
        float f17 = ((f15 * max) + f11) - f7;
        float f18 = ((max * f16) + f12) - f10;
        return (float) Math.sqrt((f18 * f18) + (f17 * f17));
    }

    public final void b(Canvas canvas, jv0 jv0Var, p1 p1Var) {
        Paint paint;
        Paint paint2;
        float width = (p1Var.d / jv0Var.f25428a) * canvas.getWidth();
        float height = (p1Var.e / jv0Var.f25429b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z10 = p1Var.f40883a;
        if (z10) {
            paint = this.d;
        } else {
            paint = this.f40892f;
        }
        canvas.drawCircle(width, height, dp, paint);
        float width2 = (p1Var.d / jv0Var.f25428a) * canvas.getWidth();
        float height2 = (p1Var.e / jv0Var.f25429b) * canvas.getHeight();
        float dp2 = AndroidUtilities.dp(5.0f);
        if (z10) {
            paint2 = this.e;
        } else {
            paint2 = this.f40893g;
        }
        canvas.drawCircle(width2, height2, dp2, paint2);
    }

    public final void c(float f7, float f10, boolean z10) {
        float[] fArr = this.f40901p;
        fArr[0] = f7;
        fArr[1] = f10;
        d(z10);
    }

    public final void d(boolean z10) {
        int i10;
        float[] fArr = this.f40901p;
        g1 g1Var = this.h;
        if (g1Var != null) {
            float f7 = g1Var.h;
            if (f7 != 0.0f) {
                float f10 = fArr[0] - g1Var.f40817b;
                fArr[0] = f10;
                fArr[1] = fArr[1] - g1Var.f40818c;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                double d = f7 * i10;
                float cos = (float) ((Math.cos(d) * f10) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                g1 g1Var2 = this.h;
                fArr[0] = cos + g1Var2.f40817b;
                fArr[1] = ((float) hg.c.e(d, fArr[1], sin)) + g1Var2.f40818c;
            }
        }
    }

    public final void e() {
        g1 g1Var;
        d1 d1Var = this.f40889a;
        if (d1Var != null && d1Var.getPainting() != null && (g1Var = this.h) != null) {
            g1Var.f40819f = d1Var.getCurrentWeight();
            r0 painting = d1Var.getPainting();
            g1 g1Var2 = this.h;
            int currentColor = d1Var.getCurrentColor();
            if (g1Var2 != null) {
                if (painting.f40919r != null) {
                    painting.f40908f.f(new yl0(painting, g1Var2, currentColor, 11));
                }
            } else {
                painting.getClass();
            }
            this.f40898m.clear();
            this.f40899n.clear();
            this.h = null;
            c1 c1Var = d1Var.f40799a;
            if (c1Var != null) {
                c1Var.c();
            }
            d1Var.e.f40798z = true;
        }
    }
}
