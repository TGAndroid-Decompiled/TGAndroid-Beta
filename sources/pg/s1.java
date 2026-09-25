package pg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.wl0;
public final class s1 {
    public f1 f41244a;
    public y0 f41245b;
    public Paint f41246c;
    public Paint d;
    public Paint e;
    public Paint f41247f;
    public Paint f41248g;
    public i1 h;
    public float f41249i;
    public float f41250j;
    public r1 f41251k;
    public o1 f41252l;
    public ArrayList f41253m;
    public ArrayList f41254n;
    public Matrix f41255o;
    public float[] f41256p;

    public static float a(float f7, float f10, float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float max = Math.max(Math.min((((f10 - f12) * f16) + ((f7 - f11) * f15)) / ((f16 * f16) + (f15 * f15)), 1.0f), 0.0f);
        float f17 = ((f15 * max) + f11) - f7;
        float f18 = ((max * f16) + f12) - f10;
        return (float) Math.sqrt((f18 * f18) + (f17 * f17));
    }

    public final void b(Canvas canvas, uv0 uv0Var, r1 r1Var) {
        Paint paint;
        Paint paint2;
        float width = (r1Var.d / uv0Var.f28933a) * canvas.getWidth();
        float height = (r1Var.e / uv0Var.f28934b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z10 = r1Var.f41214a;
        if (z10) {
            paint = this.d;
        } else {
            paint = this.f41247f;
        }
        canvas.drawCircle(width, height, dp, paint);
        float width2 = (r1Var.d / uv0Var.f28933a) * canvas.getWidth();
        float height2 = (r1Var.e / uv0Var.f28934b) * canvas.getHeight();
        float dp2 = AndroidUtilities.dp(5.0f);
        if (z10) {
            paint2 = this.e;
        } else {
            paint2 = this.f41248g;
        }
        canvas.drawCircle(width2, height2, dp2, paint2);
    }

    public final void c(float f7, float f10, boolean z10) {
        float[] fArr = this.f41256p;
        fArr[0] = f7;
        fArr[1] = f10;
        d(z10);
    }

    public final void d(boolean z10) {
        int i10;
        float[] fArr = this.f41256p;
        i1 i1Var = this.h;
        if (i1Var != null) {
            float f7 = i1Var.h;
            if (f7 != 0.0f) {
                float f10 = fArr[0] - i1Var.f41142b;
                fArr[0] = f10;
                fArr[1] = fArr[1] - i1Var.f41143c;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                double d = f7 * i10;
                float cos = (float) ((Math.cos(d) * f10) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                i1 i1Var2 = this.h;
                fArr[0] = cos + i1Var2.f41142b;
                fArr[1] = ((float) hg.c.e(d, fArr[1], sin)) + i1Var2.f41143c;
            }
        }
    }

    public final void e() {
        i1 i1Var;
        f1 f1Var = this.f41244a;
        if (f1Var != null && f1Var.getPainting() != null && (i1Var = this.h) != null) {
            i1Var.f41144f = f1Var.getCurrentWeight();
            s0 painting = f1Var.getPainting();
            i1 i1Var2 = this.h;
            int currentColor = f1Var.getCurrentColor();
            if (i1Var2 != null) {
                if (painting.f41236r != null) {
                    painting.f41225f.f(new wl0(painting, i1Var2, currentColor, 11));
                }
            } else {
                painting.getClass();
            }
            this.f41253m.clear();
            this.f41254n.clear();
            this.h = null;
            e1 e1Var = f1Var.f41124a;
            if (e1Var != null) {
                e1Var.c();
            }
            f1Var.e.f41121z = true;
        }
    }
}
