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
import org.telegram.ui.qj;
public final class g0 implements Runnable {
    public final int f57872a;
    public final u0 f57873b;
    public final long f57874c;

    public g0(u0 u0Var, long j3, int i7) {
        this.f57872a = i7;
        this.f57873b = u0Var;
        this.f57874c = j3;
    }

    @Override
    public final void run() {
        File file;
        long j3;
        long j10;
        qj qjVar;
        h61 h61Var;
        switch (this.f57872a) {
            case 0:
                u0 u0Var = this.f57873b;
                long j11 = this.f57874c;
                if (u0Var.f58103a0 == 6) {
                    u0Var.I = j11;
                    u0Var.O = 0L;
                    u0Var.K = 0L;
                    u0Var.L = j11;
                    u0Var.x(2);
                    u0Var.f58113l.W(u0Var.U, u0Var.I * 1000, u0Var.f58119r);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f57873b;
                long j12 = this.f57874c;
                if (u0Var2.f58103a0 == 4) {
                    u0Var2.O = j12;
                    long min = Math.min(u0Var2.f58118q, j12);
                    u0Var2.I = min;
                    u0Var2.K = 0L;
                    u0Var2.L = min;
                    u0Var2.f58104b.setSurfaceTextureListener(null);
                    u0Var2.f58104b.setTransform(u0Var2.h);
                    l2.i0 a10 = new l2.n(u0Var2.f58102a).a();
                    u0Var2.W = a10;
                    a10.z1(u0Var2.f58104b);
                    u0Var2.W.m0(e2.l0.b(Uri.fromFile(u0Var2.V)));
                    u0Var2.W.k(0);
                    u0Var2.W.T(1.0f);
                    u0Var2.W.I0(u0Var2.Z);
                    u0Var2.W.a();
                    u0Var2.W.Z0(5, u0Var2.K);
                    u0Var2.f58114m.b("preview player prepared: durationMs=" + u0Var2.I + ", trim=" + u0Var2.K + ".." + u0Var2.L);
                    u0Var2.x(5);
                    qt qtVar = u0Var2.d;
                    long j13 = u0Var2.I;
                    long j14 = u0Var2.K;
                    long j15 = u0Var2.L;
                    ((n40) qtVar.f37389b).f36220w.setProgress(((float) j13) / 60000.0f);
                    n40 n40Var = (n40) qtVar.f37389b;
                    n40Var.f36205j0 = false;
                    n40Var.H.setAlpha(0.0f);
                    n40 n40Var2 = (n40) qtVar.f37389b;
                    if (n40Var2.U == null) {
                        u0 u0Var3 = n40Var2.O;
                        if (u0Var3 == null) {
                            file = null;
                        } else {
                            u0.v();
                            file = u0Var3.V;
                        }
                        if (file != null) {
                            n40 n40Var3 = (n40) qtVar.f37389b;
                            n40Var3.T = n40Var3.t(file, j13, null);
                            n40 n40Var4 = (n40) qtVar.f37389b;
                            j20 j20Var = n40Var4.T;
                            if (j14 > 0) {
                                j3 = j14;
                            } else {
                                j3 = -1;
                            }
                            j20Var.f23450a = j3;
                            if (j15 < j13) {
                                j10 = j15;
                            } else {
                                j10 = -1;
                            }
                            j20Var.f23452b = j10;
                            qs.f(n40Var4.f36200f).k(162, Integer.valueOf(((n40) qtVar.f37389b).h), ((n40) qtVar.f37389b).T, file.getAbsolutePath(), new ArrayList());
                            float max = (float) Math.max(1L, j13);
                            float f10 = ((float) j14) / max;
                            float f11 = ((float) j15) / max;
                            s40 s40Var = ((n40) qtVar.f37389b).f38208b;
                            if (s40Var != null && (qjVar = ((fe) s40Var).f45614b.Z) != null && (h61Var = qjVar.f31044f1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f10));
                                h61Var.f34190b = max2;
                                h61Var.f34191c = Math.max(max2, Math.min(1.0f, f11));
                                h61Var.invalidate();
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
