package qg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.ai0;
public final class p1 {
    public c1 f44503a;
    public w0 f44504b;
    public Paint f44505c;
    public Paint d;
    public Paint f44506e;
    public Paint f44507f;
    public Paint f44508g;
    public f1 h;
    public float f44509i;
    public float f44510j;
    public o1 f44511k;
    public l1 f44512l;
    public ArrayList f44513m;
    public ArrayList f44514n;
    public Matrix f44515o;
    public float[] f44516p;

    public static float a(float f7, float f10, float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float max = Math.max(Math.min((((f10 - f12) * f16) + ((f7 - f11) * f15)) / ((f16 * f16) + (f15 * f15)), 1.0f), 0.0f);
        float f17 = ((f15 * max) + f11) - f7;
        float f18 = ((max * f16) + f12) - f10;
        return (float) Math.sqrt((f18 * f18) + (f17 * f17));
    }

    public final void b(Canvas canvas, iv0 iv0Var, o1 o1Var) {
        Paint paint;
        Paint paint2;
        float width = (o1Var.d / iv0Var.f27271a) * canvas.getWidth();
        float height = (o1Var.f44500e / iv0Var.f27272b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z10 = o1Var.f44497a;
        if (z10) {
            paint = this.d;
        } else {
            paint = this.f44507f;
        }
        canvas.drawCircle(width, height, dp, paint);
        float width2 = (o1Var.d / iv0Var.f27271a) * canvas.getWidth();
        float height2 = (o1Var.f44500e / iv0Var.f27272b) * canvas.getHeight();
        float dp2 = AndroidUtilities.dp(5.0f);
        if (z10) {
            paint2 = this.f44506e;
        } else {
            paint2 = this.f44508g;
        }
        canvas.drawCircle(width2, height2, dp2, paint2);
    }

    public final void c(float f7, float f10, boolean z10) {
        float[] fArr = this.f44516p;
        fArr[0] = f7;
        fArr[1] = f10;
        d(z10);
    }

    public final void d(boolean z10) {
        int i10;
        float[] fArr = this.f44516p;
        f1 f1Var = this.h;
        if (f1Var != null) {
            float f7 = f1Var.h;
            if (f7 != 0.0f) {
                float f10 = fArr[0] - f1Var.f44428b;
                fArr[0] = f10;
                fArr[1] = fArr[1] - f1Var.f44429c;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                double d = f7 * i10;
                float cos = (float) ((Math.cos(d) * f10) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                f1 f1Var2 = this.h;
                fArr[0] = cos + f1Var2.f44428b;
                fArr[1] = ((float) i2.g.e(d, fArr[1], sin)) + f1Var2.f44429c;
            }
        }
    }

    public final void e() {
        f1 f1Var;
        c1 c1Var = this.f44503a;
        if (c1Var != null && c1Var.getPainting() != null && (f1Var = this.h) != null) {
            f1Var.f44431f = c1Var.getCurrentWeight();
            q0 painting = c1Var.getPainting();
            f1 f1Var2 = this.h;
            int currentColor = c1Var.getCurrentColor();
            if (f1Var2 != null) {
                if (painting.f44533r != null) {
                    painting.f44522f.f(new ai0(painting, f1Var2, currentColor, 12));
                }
            } else {
                painting.getClass();
            }
            this.f44513m.clear();
            this.f44514n.clear();
            this.h = null;
            b1 b1Var = c1Var.f44387a;
            if (b1Var != null) {
                b1Var.c();
            }
            c1Var.f44390e.f44420z = true;
        }
    }
}
