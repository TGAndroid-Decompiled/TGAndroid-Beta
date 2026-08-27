package yf;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.ol0;

public final class o1 {

    public b1 f49997a;

    public v0 f49998b;

    public Paint f49999c;
    public Paint d;

    public Paint f50000e;

    public Paint f50001f;

    public Paint f50002g;
    public e1 h;

    public float f50003i;

    public float f50004j;

    public n1 f50005k;

    public k1 f50006l;

    public ArrayList f50007m;

    public ArrayList f50008n;

    public Matrix f50009o;

    public float[] f50010p;

    public static float a(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f14 - f12;
        float f17 = f15 - f13;
        float fMax = Math.max(Math.min((((f11 - f13) * f17) + ((f10 - f12) * f16)) / ((f17 * f17) + (f16 * f16)), 1.0f), 0.0f);
        float f18 = ((f16 * fMax) + f12) - f10;
        float f19 = ((fMax * f17) + f13) - f11;
        return (float) Math.sqrt((f19 * f19) + (f18 * f18));
    }

    public final void b(Canvas canvas, tu0 tu0Var, n1 n1Var) {
        float width = (n1Var.d / tu0Var.f32893a) * canvas.getWidth();
        float height = (n1Var.f49992e / tu0Var.f32894b) * canvas.getHeight();
        float fDp = AndroidUtilities.dp(5.0f);
        boolean z10 = n1Var.f49989a;
        canvas.drawCircle(width, height, fDp, z10 ? this.d : this.f50001f);
        canvas.drawCircle((n1Var.d / tu0Var.f32893a) * canvas.getWidth(), (n1Var.f49992e / tu0Var.f32894b) * canvas.getHeight(), AndroidUtilities.dp(5.0f), z10 ? this.f50000e : this.f50002g);
    }

    public final void c(float f10, float f11, boolean z10) {
        float[] fArr = this.f50010p;
        fArr[0] = f10;
        fArr[1] = f11;
        d(z10);
    }

    public final void d(boolean z10) {
        float[] fArr = this.f50010p;
        e1 e1Var = this.h;
        if (e1Var != null) {
            float f10 = e1Var.h;
            if (f10 != 0.0f) {
                float f11 = fArr[0] - e1Var.f49922b;
                fArr[0] = f11;
                fArr[1] = fArr[1] - e1Var.f49923c;
                double d = f10 * (z10 ? -1 : 1);
                float fCos = (float) ((Math.cos(d) * ((double) f11)) - (Math.sin(d) * ((double) fArr[1])));
                float fB = (float) i0.a.b(d, fArr[1], Math.sin(d) * ((double) fArr[0]));
                e1 e1Var2 = this.h;
                fArr[0] = fCos + e1Var2.f49922b;
                fArr[1] = fB + e1Var2.f49923c;
            }
        }
    }

    public final void e() {
        e1 e1Var;
        b1 b1Var = this.f49997a;
        if (b1Var == null || b1Var.getPainting() == null || (e1Var = this.h) == null) {
            return;
        }
        e1Var.f49925f = b1Var.getCurrentWeight();
        p0 painting = b1Var.getPainting();
        e1 e1Var2 = this.h;
        int currentColor = b1Var.getCurrentColor();
        if (e1Var2 == null) {
            painting.getClass();
        } else if (painting.f50026r != null) {
            painting.f50015f.f(new ol0(painting, e1Var2, currentColor, 17));
        }
        this.f50007m.clear();
        this.f50008n.clear();
        this.h = null;
        a1 a1Var = b1Var.f49878a;
        if (a1Var != null) {
            a1Var.c();
        }
        b1Var.f49881e.f49918z = true;
    }
}
