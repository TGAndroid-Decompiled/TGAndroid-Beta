package pg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.zl0;
public final class s1 {
    public f1 f41241a;
    public y0 f41242b;
    public Paint f41243c;
    public Paint d;
    public Paint e;
    public Paint f41244f;
    public Paint f41245g;
    public i1 h;
    public float f41246i;
    public float f41247j;
    public r1 f41248k;
    public o1 f41249l;
    public ArrayList f41250m;
    public ArrayList f41251n;
    public Matrix f41252o;
    public float[] f41253p;

    public static float a(float f7, float f10, float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float max = Math.max(Math.min((((f10 - f12) * f16) + ((f7 - f11) * f15)) / ((f16 * f16) + (f15 * f15)), 1.0f), 0.0f);
        float f17 = ((f15 * max) + f11) - f7;
        float f18 = ((max * f16) + f12) - f10;
        return (float) Math.sqrt((f18 * f18) + (f17 * f17));
    }

    public final void b(Canvas canvas, wv0 wv0Var, r1 r1Var) {
        Paint paint;
        Paint paint2;
        float width = (r1Var.d / wv0Var.f30196a) * canvas.getWidth();
        float height = (r1Var.e / wv0Var.f30197b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z10 = r1Var.f41211a;
        if (z10) {
            paint = this.d;
        } else {
            paint = this.f41244f;
        }
        canvas.drawCircle(width, height, dp, paint);
        float width2 = (r1Var.d / wv0Var.f30196a) * canvas.getWidth();
        float height2 = (r1Var.e / wv0Var.f30197b) * canvas.getHeight();
        float dp2 = AndroidUtilities.dp(5.0f);
        if (z10) {
            paint2 = this.e;
        } else {
            paint2 = this.f41245g;
        }
        canvas.drawCircle(width2, height2, dp2, paint2);
    }

    public final void c(float f7, float f10, boolean z10) {
        float[] fArr = this.f41253p;
        fArr[0] = f7;
        fArr[1] = f10;
        d(z10);
    }

    public final void d(boolean z10) {
        int i10;
        float[] fArr = this.f41253p;
        i1 i1Var = this.h;
        if (i1Var != null) {
            float f7 = i1Var.h;
            if (f7 != 0.0f) {
                float f10 = fArr[0] - i1Var.f41139b;
                fArr[0] = f10;
                fArr[1] = fArr[1] - i1Var.f41140c;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                double d = f7 * i10;
                float cos = (float) ((Math.cos(d) * f10) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                i1 i1Var2 = this.h;
                fArr[0] = cos + i1Var2.f41139b;
                fArr[1] = ((float) hg.k0.e(d, fArr[1], sin)) + i1Var2.f41140c;
            }
        }
    }

    public final void e() {
        i1 i1Var;
        f1 f1Var = this.f41241a;
        if (f1Var != null && f1Var.getPainting() != null && (i1Var = this.h) != null) {
            i1Var.f41141f = f1Var.getCurrentWeight();
            s0 painting = f1Var.getPainting();
            i1 i1Var2 = this.h;
            int currentColor = f1Var.getCurrentColor();
            if (i1Var2 != null) {
                if (painting.f41233r != null) {
                    painting.f41222f.f(new zl0(painting, i1Var2, currentColor, 11));
                }
            } else {
                painting.getClass();
            }
            this.f41250m.clear();
            this.f41251n.clear();
            this.h = null;
            e1 e1Var = f1Var.f41121a;
            if (e1Var != null) {
                e1Var.c();
            }
            f1Var.e.f41118z = true;
        }
    }
}
