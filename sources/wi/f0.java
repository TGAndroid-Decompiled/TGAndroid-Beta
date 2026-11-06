package wi;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.j20;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.s40;
import org.telegram.ui.fe;
import org.telegram.ui.qj;
public final class f0 implements Runnable {
    public final int f57872a;
    public final t0 f57873b;
    public final long f57874c;

    public f0(t0 t0Var, long j3, int i7) {
        this.f57872a = i7;
        this.f57873b = t0Var;
        this.f57874c = j3;
    }

    @Override
    public final void run() {
        File file;
        long j3;
        long j10;
        qj qjVar;
        g61 g61Var;
        switch (this.f57872a) {
            case 0:
                t0 t0Var = this.f57873b;
                long j11 = this.f57874c;
                if (t0Var.Z == 6) {
                    t0Var.H = j11;
                    t0Var.N = 0L;
                    t0Var.J = 0L;
                    t0Var.K = j11;
                    t0Var.w(2);
                    t0Var.f58108l.X(t0Var.T, t0Var.H * 1000, t0Var.f58114r);
                    return;
                }
                return;
            default:
                t0 t0Var2 = this.f57873b;
                long j12 = this.f57874c;
                if (t0Var2.Z == 4) {
                    t0Var2.N = j12;
                    long min = Math.min(t0Var2.f58113q, j12);
                    t0Var2.H = min;
                    t0Var2.J = 0L;
                    t0Var2.K = min;
                    t0Var2.f58100b.setSurfaceTextureListener(null);
                    t0Var2.f58100b.setTransform(t0Var2.h);
                    l2.i0 a10 = new l2.n(t0Var2.f58098a).a();
                    t0Var2.V = a10;
                    a10.z1(t0Var2.f58100b);
                    t0Var2.V.m0(e2.l0.b(Uri.fromFile(t0Var2.U)));
                    t0Var2.V.k(0);
                    t0Var2.V.T(1.0f);
                    t0Var2.V.I0(t0Var2.Y);
                    t0Var2.V.a();
                    t0Var2.V.Z0(5, t0Var2.J);
                    t0Var2.f58109m.b("preview player prepared: durationMs=" + t0Var2.H + ", trim=" + t0Var2.J + ".." + t0Var2.K);
                    t0Var2.w(5);
                    qt qtVar = t0Var2.d;
                    long j13 = t0Var2.H;
                    long j14 = t0Var2.J;
                    long j15 = t0Var2.K;
                    ((n40) qtVar.f37394b).f36185w.setProgress(((float) j13) / 60000.0f);
                    n40 n40Var = (n40) qtVar.f37394b;
                    n40Var.f36169i0 = false;
                    n40Var.H.setAlpha(0.0f);
                    n40 n40Var2 = (n40) qtVar.f37394b;
                    if (n40Var2.U == null) {
                        t0 t0Var3 = n40Var2.O;
                        if (t0Var3 == null) {
                            file = null;
                        } else {
                            t0.u();
                            file = t0Var3.U;
                        }
                        if (file != null) {
                            n40 n40Var3 = (n40) qtVar.f37394b;
                            n40Var3.T = n40Var3.s(file, j13, null);
                            n40 n40Var4 = (n40) qtVar.f37394b;
                            j20 j20Var = n40Var4.T;
                            if (j14 > 0) {
                                j3 = j14;
                            } else {
                                j3 = -1;
                            }
                            j20Var.f23443a = j3;
                            if (j15 < j13) {
                                j10 = j15;
                            } else {
                                j10 = -1;
                            }
                            j20Var.f23445b = j10;
                            qs.f(n40Var4.f36165f).k(162, Integer.valueOf(((n40) qtVar.f37394b).h), ((n40) qtVar.f37394b).T, file.getAbsolutePath(), new ArrayList());
                            float max = (float) Math.max(1L, j13);
                            float f10 = ((float) j14) / max;
                            float f11 = ((float) j15) / max;
                            s40 s40Var = ((n40) qtVar.f37394b).f38214b;
                            if (s40Var != null && (qjVar = ((fe) s40Var).f45615b.Z) != null && (g61Var = qjVar.f31043f1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f10));
                                g61Var.f33808b = max2;
                                g61Var.f33809c = Math.max(max2, Math.min(1.0f, f11));
                                g61Var.invalidate();
                            }
                        }
                    }
                    t0Var2.r();
                    return;
                }
                return;
        }
    }
}
