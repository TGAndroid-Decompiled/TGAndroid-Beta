package rg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.fx;
public final class p1 {
    public c1 f47525a;
    public w0 f47526b;
    public Paint f47527c;
    public Paint d;
    public Paint e;
    public Paint f47528f;
    public Paint f47529g;
    public f1 h;
    public float f47530i;
    public float f47531j;
    public o1 f47532k;
    public l1 f47533l;
    public ArrayList f47534m;
    public ArrayList f47535n;
    public Matrix f47536o;
    public float[] f47537p;

    public static float a(float f7, float f10, float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float max = Math.max(Math.min((((f10 - f12) * f16) + ((f7 - f11) * f15)) / ((f16 * f16) + (f15 * f15)), 1.0f), 0.0f);
        float f17 = ((f15 * max) + f11) - f7;
        float f18 = ((max * f16) + f12) - f10;
        return (float) Math.sqrt((f18 * f18) + (f17 * f17));
    }

    public final void b(Canvas canvas, rw0 rw0Var, o1 o1Var) {
        Paint paint;
        Paint paint2;
        float width = (o1Var.d / rw0Var.f32392a) * canvas.getWidth();
        float height = (o1Var.e / rw0Var.f32393b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z10 = o1Var.f47517a;
        if (z10) {
            paint = this.d;
        } else {
            paint = this.f47528f;
        }
        canvas.drawCircle(width, height, dp, paint);
        float width2 = (o1Var.d / rw0Var.f32392a) * canvas.getWidth();
        float height2 = (o1Var.e / rw0Var.f32393b) * canvas.getHeight();
        float dp2 = AndroidUtilities.dp(5.0f);
        if (z10) {
            paint2 = this.e;
        } else {
            paint2 = this.f47529g;
        }
        canvas.drawCircle(width2, height2, dp2, paint2);
    }

    public final void c(float f7, float f10, boolean z10) {
        float[] fArr = this.f47537p;
        fArr[0] = f7;
        fArr[1] = f10;
        d(z10);
    }

    public final void d(boolean z10) {
        int i10;
        float[] fArr = this.f47537p;
        f1 f1Var = this.h;
        if (f1Var != null) {
            float f7 = f1Var.h;
            if (f7 != 0.0f) {
                float f10 = fArr[0] - f1Var.f47451b;
                fArr[0] = f10;
                fArr[1] = fArr[1] - f1Var.f47452c;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                double d = f7 * i10;
                float cos = (float) ((Math.cos(d) * f10) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                f1 f1Var2 = this.h;
                fArr[0] = cos + f1Var2.f47451b;
                fArr[1] = ((float) org.telegram.messenger.t.a(d, fArr[1], sin)) + f1Var2.f47452c;
            }
        }
    }

    public final void e() {
        f1 f1Var;
        c1 c1Var = this.f47525a;
        if (c1Var != null && c1Var.getPainting() != null && (f1Var = this.h) != null) {
            f1Var.f47453f = c1Var.getCurrentWeight();
            q0 painting = c1Var.getPainting();
            f1 f1Var2 = this.h;
            int currentColor = c1Var.getCurrentColor();
            if (f1Var2 != null) {
                if (painting.f47552r != null) {
                    painting.f47541f.f(new fx(painting, f1Var2, currentColor, 24));
                }
            } else {
                painting.getClass();
            }
            this.f47534m.clear();
            this.f47535n.clear();
            this.h = null;
            b1 b1Var = c1Var.f47410a;
            if (b1Var != null) {
                b1Var.c();
            }
            c1Var.e.f47447z = true;
        }
    }
}
