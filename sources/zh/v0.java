package zh;

import android.graphics.Bitmap;
import android.os.SystemClock;
import ci.g3;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.uj0;
public final class v0 implements Utilities.Callback {
    public final int f52114a;
    public final b1 f52115b;
    public final y0 f52116c;

    public v0(b1 b1Var, y0 y0Var, int i10) {
        this.f52114a = i10;
        this.f52115b = b1Var;
        this.f52116c = y0Var;
    }

    @Override
    public final void run(Object obj) {
        r5 r5Var;
        g3 g3Var;
        uj0 lottieAnimation;
        int i10;
        switch (this.f52114a) {
            case 0:
                l lVar = (l) obj;
                y0 y0Var = this.f52116c;
                y0Var.v = null;
                if (lVar != null) {
                    Bitmap bitmap = lVar.f52040a;
                    if (y0Var.G) {
                        e.c(bitmap);
                        return;
                    }
                    y0Var.f52162u = lVar;
                    y0Var.H.d(bitmap);
                    y0Var.I.d(bitmap);
                    this.f52115b.invalidate();
                    return;
                }
                return;
            case 1:
                Bitmap bitmap2 = (Bitmap) obj;
                y0 y0Var2 = this.f52116c;
                if (!y0Var2.G && y0Var2.e == null) {
                    this.f52115b.A0(y0Var2, bitmap2);
                    return;
                }
                return;
            default:
                a0 a0Var = (a0) obj;
                if (a0Var != null) {
                    Bitmap bitmap3 = a0Var.f51655a;
                    int i11 = a0Var.e;
                    y0 y0Var3 = this.f52116c;
                    if (y0Var3.G) {
                        e.c(bitmap3);
                        return;
                    }
                    y0Var3.A = a0Var;
                    y0Var3.C = SystemClock.elapsedRealtime();
                    y0Var3.B = 0.0f;
                    y0Var3.D = true;
                    if (i11 > 1 && (r5Var = y0Var3.d) != null && (g3Var = r5Var.f29841k) != null && (lottieAnimation = g3Var.getLottieAnimation()) != null && (i10 = lottieAnimation.e[0]) > 1) {
                        y0Var3.B = (lottieAnimation.f31001a0 * i11) / i10;
                        y0Var3.D = false;
                    }
                    y0Var3.J.d(bitmap3);
                    y0Var3.K.d(bitmap3);
                    r5 r5Var2 = y0Var3.d;
                    b1 b1Var = this.f52115b;
                    if (r5Var2 != null && !b1Var.f51863t7.containsValue(r5Var2)) {
                        y0Var3.d.o(b1Var);
                    }
                    y0Var3.F = true;
                    b1Var.invalidate();
                    return;
                }
                return;
        }
    }
}
