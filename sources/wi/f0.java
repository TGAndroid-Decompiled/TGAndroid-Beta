package wi;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.j20;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.t40;
import org.telegram.ui.fe;
import org.telegram.ui.sj;
public final class f0 implements Runnable {
    public final int f57976a;
    public final t0 f57977b;
    public final long f57978c;

    public f0(t0 t0Var, long j3, int i7) {
        this.f57976a = i7;
        this.f57977b = t0Var;
        this.f57978c = j3;
    }

    @Override
    public final void run() {
        File file;
        long j3;
        long j10;
        sj sjVar;
        i61 i61Var;
        switch (this.f57976a) {
            case 0:
                t0 t0Var = this.f57977b;
                long j11 = this.f57978c;
                if (t0Var.f58202a0 == 6) {
                    t0Var.I = j11;
                    t0Var.O = 0L;
                    t0Var.K = 0L;
                    t0Var.L = j11;
                    t0Var.x(2);
                    t0Var.f58212l.V(t0Var.U, t0Var.I * 1000, t0Var.f58218r);
                    return;
                }
                return;
            default:
                t0 t0Var2 = this.f57977b;
                long j12 = this.f57978c;
                if (t0Var2.f58202a0 == 4) {
                    t0Var2.O = j12;
                    long min = Math.min(t0Var2.f58217q, j12);
                    t0Var2.I = min;
                    t0Var2.K = 0L;
                    t0Var2.L = min;
                    t0Var2.f58203b.setSurfaceTextureListener(null);
                    t0Var2.f58203b.setTransform(t0Var2.h);
                    l2.i0 a10 = new l2.n(t0Var2.f58201a).a();
                    t0Var2.W = a10;
                    a10.z1(t0Var2.f58203b);
                    t0Var2.W.m0(e2.l0.b(Uri.fromFile(t0Var2.V)));
                    t0Var2.W.k(0);
                    t0Var2.W.T(1.0f);
                    t0Var2.W.I0(t0Var2.Z);
                    t0Var2.W.a();
                    t0Var2.W.Z0(5, t0Var2.K);
                    t0Var2.f58213m.b("preview player prepared: durationMs=" + t0Var2.I + ", trim=" + t0Var2.K + ".." + t0Var2.L);
                    t0Var2.x(5);
                    rt rtVar = t0Var2.d;
                    long j13 = t0Var2.I;
                    long j14 = t0Var2.K;
                    long j15 = t0Var2.L;
                    ((o40) rtVar.f37805b).f36642w.setProgress(((float) j13) / 60000.0f);
                    o40 o40Var = (o40) rtVar.f37805b;
                    o40Var.f36627j0 = false;
                    o40Var.H.setAlpha(0.0f);
                    o40 o40Var2 = (o40) rtVar.f37805b;
                    if (o40Var2.U == null) {
                        t0 t0Var3 = o40Var2.O;
                        if (t0Var3 == null) {
                            file = null;
                        } else {
                            t0.v();
                            file = t0Var3.V;
                        }
                        if (file != null) {
                            o40 o40Var3 = (o40) rtVar.f37805b;
                            o40Var3.T = o40Var3.t(file, j13, null);
                            o40 o40Var4 = (o40) rtVar.f37805b;
                            j20 j20Var = o40Var4.T;
                            if (j14 > 0) {
                                j3 = j14;
                            } else {
                                j3 = -1;
                            }
                            j20Var.f23471a = j3;
                            if (j15 < j13) {
                                j10 = j15;
                            } else {
                                j10 = -1;
                            }
                            j20Var.f23473b = j10;
                            qs.f(o40Var4.f36622f).k(162, Integer.valueOf(((o40) rtVar.f37805b).h), ((o40) rtVar.f37805b).T, file.getAbsolutePath(), new ArrayList());
                            float max = (float) Math.max(1L, j13);
                            float f10 = ((float) j14) / max;
                            float f11 = ((float) j15) / max;
                            t40 t40Var = ((o40) rtVar.f37805b).f38590b;
                            if (t40Var != null && (sjVar = ((fe) t40Var).f45692b.Z) != null && (i61Var = sjVar.f31053f1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f10));
                                i61Var.f34612b = max2;
                                i61Var.f34613c = Math.max(max2, Math.min(1.0f, f11));
                                i61Var.invalidate();
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
