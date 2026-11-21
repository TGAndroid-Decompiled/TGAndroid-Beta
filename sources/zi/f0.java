package zi;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.e20;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.g50;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.w61;
import org.telegram.ui.ee;
import org.telegram.ui.rj;
public final class f0 implements Runnable {
    public final int f62124a;
    public final u0 f62125b;
    public final long f62126c;

    public f0(u0 u0Var, long j3, int i7) {
        this.f62124a = i7;
        this.f62125b = u0Var;
        this.f62126c = j3;
    }

    @Override
    public final void run() {
        File file;
        long j3;
        long j10;
        rj rjVar;
        w61 w61Var;
        switch (this.f62124a) {
            case 0:
                u0 u0Var = this.f62125b;
                long j11 = this.f62126c;
                if (u0Var.f62351a0 == 6) {
                    u0Var.I = j11;
                    u0Var.O = 0L;
                    u0Var.K = 0L;
                    u0Var.L = j11;
                    u0Var.x(2);
                    u0Var.f62361l.V(u0Var.U, u0Var.I * 1000, u0Var.f62367r);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f62125b;
                long j12 = this.f62126c;
                if (u0Var2.f62351a0 == 4) {
                    u0Var2.O = j12;
                    long min = Math.min(u0Var2.f62366q, j12);
                    u0Var2.I = min;
                    u0Var2.K = 0L;
                    u0Var2.L = min;
                    u0Var2.f62352b.setSurfaceTextureListener(null);
                    u0Var2.f62352b.setTransform(u0Var2.h);
                    l2.f0 a10 = new l2.n(u0Var2.f62350a).a();
                    u0Var2.W = a10;
                    a10.z1(u0Var2.f62352b);
                    u0Var2.W.m0(e2.l0.b(Uri.fromFile(u0Var2.V)));
                    u0Var2.W.k(0);
                    u0Var2.W.T(1.0f);
                    u0Var2.W.I0(u0Var2.Z);
                    u0Var2.W.a();
                    u0Var2.W.Z0(5, u0Var2.K);
                    u0Var2.f62362m.b("preview player prepared: durationMs=" + u0Var2.I + ", trim=" + u0Var2.K + ".." + u0Var2.L);
                    u0Var2.x(5);
                    qf qfVar = u0Var2.d;
                    long j13 = u0Var2.I;
                    long j14 = u0Var2.K;
                    long j15 = u0Var2.L;
                    ((b50) qfVar.f38902b).f33769w.setProgress(((float) j13) / 60000.0f);
                    b50 b50Var = (b50) qfVar.f38902b;
                    b50Var.f33755k0 = false;
                    b50Var.I.setAlpha(0.0f);
                    b50 b50Var2 = (b50) qfVar.f38902b;
                    if (b50Var2.V == null) {
                        u0 u0Var3 = b50Var2.P;
                        if (u0Var3 == null) {
                            file = null;
                        } else {
                            u0.v();
                            file = u0Var3.V;
                        }
                        if (file != null) {
                            b50 b50Var3 = (b50) qfVar.f38902b;
                            b50Var3.U = b50Var3.t(file, j13, null);
                            b50 b50Var4 = (b50) qfVar.f38902b;
                            e20 e20Var = b50Var4.U;
                            if (j14 > 0) {
                                j3 = j14;
                            } else {
                                j3 = -1;
                            }
                            e20Var.f23662a = j3;
                            if (j15 < j13) {
                                j10 = j15;
                            } else {
                                j10 = -1;
                            }
                            e20Var.f23664b = j10;
                            ks.f(b50Var4.f33749f).k(162, Integer.valueOf(((b50) qfVar.f38902b).h), ((b50) qfVar.f38902b).U, file.getAbsolutePath(), new ArrayList());
                            float max = (float) Math.max(1L, j13);
                            float f10 = ((float) j14) / max;
                            float f11 = ((float) j15) / max;
                            g50 g50Var = ((b50) qfVar.f38902b).f35793b;
                            if (g50Var != null && (rjVar = ((ee) g50Var).f47246b.f45946a0) != null && (w61Var = rjVar.f32620g1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f10));
                                w61Var.f41671b = max2;
                                w61Var.f41672c = Math.max(max2, Math.min(1.0f, f11));
                                w61Var.invalidate();
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
