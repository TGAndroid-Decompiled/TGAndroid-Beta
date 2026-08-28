package xf;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.jh0;
public final class p1 {
    public c1 f49295a;
    public w0 f49296b;
    public Paint f49297c;
    public Paint d;
    public Paint f49298e;
    public Paint f49299f;
    public Paint f49300g;
    public f1 h;
    public float f49301i;
    public float f49302j;
    public o1 f49303k;
    public l1 f49304l;
    public ArrayList f49305m;
    public ArrayList f49306n;
    public Matrix f49307o;
    public float[] f49308p;

    public static float a(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f14 - f12;
        float f17 = f15 - f13;
        float max = Math.max(Math.min((((f11 - f13) * f17) + ((f10 - f12) * f16)) / ((f17 * f17) + (f16 * f16)), 1.0f), 0.0f);
        float f18 = ((f16 * max) + f12) - f10;
        float f19 = ((max * f17) + f13) - f11;
        return (float) Math.sqrt((f19 * f19) + (f18 * f18));
    }

    public final void b(Canvas canvas, qu0 qu0Var, o1 o1Var) {
        Paint paint;
        Paint paint2;
        float width = (o1Var.d / qu0Var.f32026a) * canvas.getWidth();
        float height = (o1Var.f49292e / qu0Var.f32027b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z10 = o1Var.f49289a;
        if (z10) {
            paint = this.d;
        } else {
            paint = this.f49299f;
        }
        canvas.drawCircle(width, height, dp, paint);
        float width2 = (o1Var.d / qu0Var.f32026a) * canvas.getWidth();
        float height2 = (o1Var.f49292e / qu0Var.f32027b) * canvas.getHeight();
        float dp2 = AndroidUtilities.dp(5.0f);
        if (z10) {
            paint2 = this.f49298e;
        } else {
            paint2 = this.f49300g;
        }
        canvas.drawCircle(width2, height2, dp2, paint2);
    }

    public final void c(float f10, float f11, boolean z10) {
        float[] fArr = this.f49308p;
        fArr[0] = f10;
        fArr[1] = f11;
        d(z10);
    }

    public final void d(boolean z10) {
        int i9;
        float[] fArr = this.f49308p;
        f1 f1Var = this.h;
        if (f1Var != null) {
            float f10 = f1Var.h;
            if (f10 != 0.0f) {
                float f11 = fArr[0] - f1Var.f49220b;
                fArr[0] = f11;
                fArr[1] = fArr[1] - f1Var.f49221c;
                if (z10) {
                    i9 = -1;
                } else {
                    i9 = 1;
                }
                double d = f10 * i9;
                float cos = (float) ((Math.cos(d) * f11) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                f1 f1Var2 = this.h;
                fArr[0] = cos + f1Var2.f49220b;
                fArr[1] = ((float) j3.r0.b(d, fArr[1], sin)) + f1Var2.f49221c;
            }
        }
    }

    public final void e() {
        f1 f1Var;
        c1 c1Var = this.f49295a;
        if (c1Var != null && c1Var.getPainting() != null && (f1Var = this.h) != null) {
            f1Var.f49223f = c1Var.getCurrentWeight();
            q0 painting = c1Var.getPainting();
            f1 f1Var2 = this.h;
            int currentColor = c1Var.getCurrentColor();
            if (f1Var2 != null) {
                if (painting.f49325r != null) {
                    painting.f49314f.f(new jh0(painting, f1Var2, currentColor, 17));
                }
            } else {
                painting.getClass();
            }
            this.f49305m.clear();
            this.f49306n.clear();
            this.h = null;
            b1 b1Var = c1Var.f49178a;
            if (b1Var != null) {
                b1Var.c();
            }
            c1Var.f49181e.f49211z = true;
        }
    }
}
