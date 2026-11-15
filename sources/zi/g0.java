package zi;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.g20;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.q40;
import org.telegram.ui.Components.v40;
import org.telegram.ui.ce;
import org.telegram.ui.qj;
public final class g0 implements Runnable {
    public final int f61519a;
    public final v0 f61520b;
    public final long f61521c;

    public g0(v0 v0Var, long j3, int i7) {
        this.f61519a = i7;
        this.f61520b = v0Var;
        this.f61521c = j3;
    }

    @Override
    public final void run() {
        File file;
        long j3;
        long j10;
        qj qjVar;
        i61 i61Var;
        switch (this.f61519a) {
            case 0:
                v0 v0Var = this.f61520b;
                long j11 = this.f61521c;
                if (v0Var.f61745a0 == 6) {
                    v0Var.I = j11;
                    v0Var.O = 0L;
                    v0Var.K = 0L;
                    v0Var.L = j11;
                    v0Var.x(2);
                    v0Var.f61755l.V(v0Var.U, v0Var.I * 1000, v0Var.f61761r);
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f61520b;
                long j12 = this.f61521c;
                if (v0Var2.f61745a0 == 4) {
                    v0Var2.O = j12;
                    long min = Math.min(v0Var2.f61760q, j12);
                    v0Var2.I = min;
                    v0Var2.K = 0L;
                    v0Var2.L = min;
                    v0Var2.f61746b.setSurfaceTextureListener(null);
                    v0Var2.f61746b.setTransform(v0Var2.h);
                    l2.f0 a10 = new l2.n(v0Var2.f61744a).a();
                    v0Var2.W = a10;
                    a10.z1(v0Var2.f61746b);
                    v0Var2.W.m0(e2.l0.b(Uri.fromFile(v0Var2.V)));
                    v0Var2.W.k(0);
                    v0Var2.W.T(1.0f);
                    v0Var2.W.I0(v0Var2.Z);
                    v0Var2.W.a();
                    v0Var2.W.Z0(5, v0Var2.K);
                    v0Var2.f61756m.b("preview player prepared: durationMs=" + v0Var2.I + ", trim=" + v0Var2.K + ".." + v0Var2.L);
                    v0Var2.x(5);
                    ff ffVar = v0Var2.d;
                    long j13 = v0Var2.I;
                    long j14 = v0Var2.K;
                    long j15 = v0Var2.L;
                    ((q40) ffVar.f34586b).f38512w.setProgress(((float) j13) / 60000.0f);
                    q40 q40Var = (q40) ffVar.f34586b;
                    q40Var.f38498k0 = false;
                    q40Var.I.setAlpha(0.0f);
                    q40 q40Var2 = (q40) ffVar.f34586b;
                    if (q40Var2.V == null) {
                        v0 v0Var3 = q40Var2.P;
                        if (v0Var3 == null) {
                            file = null;
                        } else {
                            v0.v();
                            file = v0Var3.V;
                        }
                        if (file != null) {
                            q40 q40Var3 = (q40) ffVar.f34586b;
                            q40Var3.U = q40Var3.t(file, j13, null);
                            q40 q40Var4 = (q40) ffVar.f34586b;
                            g20 g20Var = q40Var4.U;
                            if (j14 > 0) {
                                j3 = j14;
                            } else {
                                j3 = -1;
                            }
                            g20Var.f23632a = j3;
                            if (j15 < j13) {
                                j10 = j15;
                            } else {
                                j10 = -1;
                            }
                            g20Var.f23634b = j10;
                            ns.f(q40Var4.f38492f).k(162, Integer.valueOf(((q40) ffVar.f34586b).h), ((q40) ffVar.f34586b).U, file.getAbsolutePath(), new ArrayList());
                            float max = (float) Math.max(1L, j13);
                            float f10 = ((float) j14) / max;
                            float f11 = ((float) j15) / max;
                            v40 v40Var = ((q40) ffVar.f34586b).f41253b;
                            if (v40Var != null && (qjVar = ((ce) v40Var).f46084b.f45118a0) != null && (i61Var = qjVar.f32200g1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f10));
                                i61Var.f35465b = max2;
                                i61Var.f35466c = Math.max(max2, Math.min(1.0f, f11));
                                i61Var.invalidate();
                            }
                        }
                    }
                    v0Var2.r();
                    return;
                }
                return;
        }
    }
}
