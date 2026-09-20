package pg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.fm0;
public final class r1 {
    public e1 f41243a;
    public y0 f41244b;
    public Paint f41245c;
    public Paint d;
    public Paint e;
    public Paint f41246f;
    public Paint f41247g;
    public h1 h;
    public float f41248i;
    public float f41249j;
    public q1 f41250k;
    public n1 f41251l;
    public ArrayList f41252m;
    public ArrayList f41253n;
    public Matrix f41254o;
    public float[] f41255p;

    public static float a(float f7, float f10, float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float max = Math.max(Math.min((((f10 - f12) * f16) + ((f7 - f11) * f15)) / ((f16 * f16) + (f15 * f15)), 1.0f), 0.0f);
        float f17 = ((f15 * max) + f11) - f7;
        float f18 = ((max * f16) + f12) - f10;
        return (float) Math.sqrt((f18 * f18) + (f17 * f17));
    }

    public final void b(Canvas canvas, uv0 uv0Var, q1 q1Var) {
        Paint paint;
        Paint paint2;
        float width = (q1Var.d / uv0Var.f28868a) * canvas.getWidth();
        float height = (q1Var.e / uv0Var.f28869b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z10 = q1Var.f41235a;
        if (z10) {
            paint = this.d;
        } else {
            paint = this.f41246f;
        }
        canvas.drawCircle(width, height, dp, paint);
        float width2 = (q1Var.d / uv0Var.f28868a) * canvas.getWidth();
        float height2 = (q1Var.e / uv0Var.f28869b) * canvas.getHeight();
        float dp2 = AndroidUtilities.dp(5.0f);
        if (z10) {
            paint2 = this.e;
        } else {
            paint2 = this.f41247g;
        }
        canvas.drawCircle(width2, height2, dp2, paint2);
    }

    public final void c(float f7, float f10, boolean z10) {
        float[] fArr = this.f41255p;
        fArr[0] = f7;
        fArr[1] = f10;
        d(z10);
    }

    public final void d(boolean z10) {
        int i10;
        float[] fArr = this.f41255p;
        h1 h1Var = this.h;
        if (h1Var != null) {
            float f7 = h1Var.h;
            if (f7 != 0.0f) {
                float f10 = fArr[0] - h1Var.f41168b;
                fArr[0] = f10;
                fArr[1] = fArr[1] - h1Var.f41169c;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                double d = f7 * i10;
                float cos = (float) ((Math.cos(d) * f10) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                h1 h1Var2 = this.h;
                fArr[0] = cos + h1Var2.f41168b;
                fArr[1] = ((float) hg.k0.e(d, fArr[1], sin)) + h1Var2.f41169c;
            }
        }
    }

    public final void e() {
        h1 h1Var;
        e1 e1Var = this.f41243a;
        if (e1Var != null && e1Var.getPainting() != null && (h1Var = this.h) != null) {
            h1Var.f41170f = e1Var.getCurrentWeight();
            s0 painting = e1Var.getPainting();
            h1 h1Var2 = this.h;
            int currentColor = e1Var.getCurrentColor();
            if (h1Var2 != null) {
                if (painting.f41275r != null) {
                    painting.f41264f.f(new fm0(painting, h1Var2, currentColor, 11));
                }
            } else {
                painting.getClass();
            }
            this.f41252m.clear();
            this.f41253n.clear();
            this.h = null;
            d1 d1Var = e1Var.f41148a;
            if (d1Var != null) {
                d1Var.c();
            }
            e1Var.e.f41147z = true;
        }
    }
}
