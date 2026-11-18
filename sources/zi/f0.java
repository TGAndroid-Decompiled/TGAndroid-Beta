package zi;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.e20;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.y40;
import org.telegram.ui.ee;
import org.telegram.ui.rj;
public final class f0 implements Runnable {
    public final int f62082a;
    public final u0 f62083b;
    public final long f62084c;

    public f0(u0 u0Var, long j3, int i7) {
        this.f62082a = i7;
        this.f62083b = u0Var;
        this.f62084c = j3;
    }

    @Override
    public final void run() {
        File file;
        long j3;
        long j10;
        rj rjVar;
        t61 t61Var;
        switch (this.f62082a) {
            case 0:
                u0 u0Var = this.f62083b;
                long j11 = this.f62084c;
                if (u0Var.f62309a0 == 6) {
                    u0Var.I = j11;
                    u0Var.O = 0L;
                    u0Var.K = 0L;
                    u0Var.L = j11;
                    u0Var.x(2);
                    u0Var.f62319l.V(u0Var.U, u0Var.I * 1000, u0Var.f62325r);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f62083b;
                long j12 = this.f62084c;
                if (u0Var2.f62309a0 == 4) {
                    u0Var2.O = j12;
                    long min = Math.min(u0Var2.f62324q, j12);
                    u0Var2.I = min;
                    u0Var2.K = 0L;
                    u0Var2.L = min;
                    u0Var2.f62310b.setSurfaceTextureListener(null);
                    u0Var2.f62310b.setTransform(u0Var2.h);
                    l2.f0 a10 = new l2.n(u0Var2.f62308a).a();
                    u0Var2.W = a10;
                    a10.z1(u0Var2.f62310b);
                    u0Var2.W.m0(e2.l0.b(Uri.fromFile(u0Var2.V)));
                    u0Var2.W.k(0);
                    u0Var2.W.T(1.0f);
                    u0Var2.W.I0(u0Var2.Z);
                    u0Var2.W.a();
                    u0Var2.W.Z0(5, u0Var2.K);
                    u0Var2.f62320m.b("preview player prepared: durationMs=" + u0Var2.I + ", trim=" + u0Var2.K + ".." + u0Var2.L);
                    u0Var2.x(5);
                    of ofVar = u0Var2.d;
                    long j13 = u0Var2.I;
                    long j14 = u0Var2.K;
                    long j15 = u0Var2.L;
                    ((y40) ofVar.f38076b).f42320w.setProgress(((float) j13) / 60000.0f);
                    y40 y40Var = (y40) ofVar.f38076b;
                    y40Var.f42306k0 = false;
                    y40Var.I.setAlpha(0.0f);
                    y40 y40Var2 = (y40) ofVar.f38076b;
                    if (y40Var2.V == null) {
                        u0 u0Var3 = y40Var2.P;
                        if (u0Var3 == null) {
                            file = null;
                        } else {
                            u0.v();
                            file = u0Var3.V;
                        }
                        if (file != null) {
                            y40 y40Var3 = (y40) ofVar.f38076b;
                            y40Var3.U = y40Var3.t(file, j13, null);
                            y40 y40Var4 = (y40) ofVar.f38076b;
                            e20 e20Var = y40Var4.U;
                            if (j14 > 0) {
                                j3 = j14;
                            } else {
                                j3 = -1;
                            }
                            e20Var.f23637a = j3;
                            if (j15 < j13) {
                                j10 = j15;
                            } else {
                                j10 = -1;
                            }
                            e20Var.f23639b = j10;
                            ks.f(y40Var4.f42300f).k(162, Integer.valueOf(((y40) ofVar.f38076b).h), ((y40) ofVar.f38076b).U, file.getAbsolutePath(), new ArrayList());
                            float max = (float) Math.max(1L, j13);
                            float f10 = ((float) j14) / max;
                            float f11 = ((float) j15) / max;
                            d50 d50Var = ((y40) ofVar.f38076b).f34604b;
                            if (d50Var != null && (rjVar = ((ee) d50Var).f47210b.f45932a0) != null && (t61Var = rjVar.f32592g1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f10));
                                t61Var.f39919b = max2;
                                t61Var.f39920c = Math.max(max2, Math.min(1.0f, f11));
                                t61Var.invalidate();
                            }
                        }
                    }
                    u0Var2.r();
                    return;
                }
                return;
        }
    }
}
