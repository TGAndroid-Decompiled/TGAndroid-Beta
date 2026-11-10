package wi;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.j20;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.s40;
import org.telegram.ui.fe;
import org.telegram.ui.sj;
public final class f0 implements Runnable {
    public final int f57980a;
    public final t0 f57981b;
    public final long f57982c;

    public f0(t0 t0Var, long j3, int i7) {
        this.f57980a = i7;
        this.f57981b = t0Var;
        this.f57982c = j3;
    }

    @Override
    public final void run() {
        File file;
        long j3;
        long j10;
        sj sjVar;
        h61 h61Var;
        switch (this.f57980a) {
            case 0:
                t0 t0Var = this.f57981b;
                long j11 = this.f57982c;
                if (t0Var.f58206a0 == 6) {
                    t0Var.I = j11;
                    t0Var.O = 0L;
                    t0Var.K = 0L;
                    t0Var.L = j11;
                    t0Var.x(2);
                    t0Var.f58216l.V(t0Var.U, t0Var.I * 1000, t0Var.f58222r);
                    return;
                }
                return;
            default:
                t0 t0Var2 = this.f57981b;
                long j12 = this.f57982c;
                if (t0Var2.f58206a0 == 4) {
                    t0Var2.O = j12;
                    long min = Math.min(t0Var2.f58221q, j12);
                    t0Var2.I = min;
                    t0Var2.K = 0L;
                    t0Var2.L = min;
                    t0Var2.f58207b.setSurfaceTextureListener(null);
                    t0Var2.f58207b.setTransform(t0Var2.h);
                    l2.i0 a10 = new l2.n(t0Var2.f58205a).a();
                    t0Var2.W = a10;
                    a10.z1(t0Var2.f58207b);
                    t0Var2.W.m0(e2.l0.b(Uri.fromFile(t0Var2.V)));
                    t0Var2.W.k(0);
                    t0Var2.W.T(1.0f);
                    t0Var2.W.I0(t0Var2.Z);
                    t0Var2.W.a();
                    t0Var2.W.Z0(5, t0Var2.K);
                    t0Var2.f58217m.b("preview player prepared: durationMs=" + t0Var2.I + ", trim=" + t0Var2.K + ".." + t0Var2.L);
                    t0Var2.x(5);
                    qt qtVar = t0Var2.d;
                    long j13 = t0Var2.I;
                    long j14 = t0Var2.K;
                    long j15 = t0Var2.L;
                    ((n40) qtVar.f37395b).f36234w.setProgress(((float) j13) / 60000.0f);
                    n40 n40Var = (n40) qtVar.f37395b;
                    n40Var.f36219j0 = false;
                    n40Var.H.setAlpha(0.0f);
                    n40 n40Var2 = (n40) qtVar.f37395b;
                    if (n40Var2.U == null) {
                        t0 t0Var3 = n40Var2.O;
                        if (t0Var3 == null) {
                            file = null;
                        } else {
                            t0.v();
                            file = t0Var3.V;
                        }
                        if (file != null) {
                            n40 n40Var3 = (n40) qtVar.f37395b;
                            n40Var3.T = n40Var3.t(file, j13, null);
                            n40 n40Var4 = (n40) qtVar.f37395b;
                            j20 j20Var = n40Var4.T;
                            if (j14 > 0) {
                                j3 = j14;
                            } else {
                                j3 = -1;
                            }
                            j20Var.f23475a = j3;
                            if (j15 < j13) {
                                j10 = j15;
                            } else {
                                j10 = -1;
                            }
                            j20Var.f23477b = j10;
                            qs.f(n40Var4.f36214f).k(162, Integer.valueOf(((n40) qtVar.f37395b).h), ((n40) qtVar.f37395b).T, file.getAbsolutePath(), new ArrayList());
                            float max = (float) Math.max(1L, j13);
                            float f10 = ((float) j14) / max;
                            float f11 = ((float) j15) / max;
                            s40 s40Var = ((n40) qtVar.f37395b).f38162b;
                            if (s40Var != null && (sjVar = ((fe) s40Var).f45690b.Z) != null && (h61Var = sjVar.f31064f1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f10));
                                h61Var.f34212b = max2;
                                h61Var.f34213c = Math.max(max2, Math.min(1.0f, f11));
                                h61Var.invalidate();
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
