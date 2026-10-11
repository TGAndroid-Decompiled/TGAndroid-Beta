package pg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.ai0;
public final class r1 {
    public e1 f45769a;
    public y0 f45770b;
    public Paint f45771c;
    public Paint d;
    public Paint f45772e;
    public Paint f45773f;
    public Paint f45774g;
    public h1 h;
    public float f45775i;
    public float f45776j;
    public q1 f45777k;
    public n1 f45778l;
    public ArrayList f45779m;
    public ArrayList f45780n;
    public Matrix f45781o;
    public float[] f45782p;

    public static float a(float f7, float f10, float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float max = Math.max(Math.min((((f10 - f12) * f16) + ((f7 - f11) * f15)) / ((f16 * f16) + (f15 * f15)), 1.0f), 0.0f);
        float f17 = ((f15 * max) + f11) - f7;
        float f18 = ((max * f16) + f12) - f10;
        return (float) Math.sqrt((f18 * f18) + (f17 * f17));
    }

    public final void b(Canvas canvas, ow0 ow0Var, q1 q1Var) {
        Paint paint;
        Paint paint2;
        float width = (q1Var.d / ow0Var.f29541a) * canvas.getWidth();
        float height = (q1Var.f45762e / ow0Var.f29542b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z10 = q1Var.f45759a;
        if (z10) {
            paint = this.d;
        } else {
            paint = this.f45773f;
        }
        canvas.drawCircle(width, height, dp, paint);
        float width2 = (q1Var.d / ow0Var.f29541a) * canvas.getWidth();
        float height2 = (q1Var.f45762e / ow0Var.f29542b) * canvas.getHeight();
        float dp2 = AndroidUtilities.dp(5.0f);
        if (z10) {
            paint2 = this.f45772e;
        } else {
            paint2 = this.f45774g;
        }
        canvas.drawCircle(width2, height2, dp2, paint2);
    }

    public final void c(float f7, float f10, boolean z10) {
        float[] fArr = this.f45782p;
        fArr[0] = f7;
        fArr[1] = f10;
        d(z10);
    }

    public final void d(boolean z10) {
        int i10;
        float[] fArr = this.f45782p;
        h1 h1Var = this.h;
        if (h1Var != null) {
            float f7 = h1Var.h;
            if (f7 != 0.0f) {
                float f10 = fArr[0] - h1Var.f45688b;
                fArr[0] = f10;
                fArr[1] = fArr[1] - h1Var.f45689c;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                double d = f7 * i10;
                float cos = (float) ((Math.cos(d) * f10) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                h1 h1Var2 = this.h;
                fArr[0] = cos + h1Var2.f45688b;
                fArr[1] = ((float) hg.c.e(d, fArr[1], sin)) + h1Var2.f45689c;
            }
        }
    }

    public final void e() {
        h1 h1Var;
        e1 e1Var = this.f45769a;
        if (e1Var != null && e1Var.getPainting() != null && (h1Var = this.h) != null) {
            h1Var.f45691f = e1Var.getCurrentWeight();
            s0 painting = e1Var.getPainting();
            h1 h1Var2 = this.h;
            int currentColor = e1Var.getCurrentColor();
            if (h1Var2 != null) {
                if (painting.f45804r != null) {
                    painting.f45793f.f(new ai0(painting, h1Var2, currentColor, 17));
                }
            } else {
                painting.getClass();
            }
            this.f45779m.clear();
            this.f45780n.clear();
            this.h = null;
            d1 d1Var = e1Var.f45667a;
            if (d1Var != null) {
                d1Var.c();
            }
            e1Var.f45670e.f45665z = true;
        }
    }
}
