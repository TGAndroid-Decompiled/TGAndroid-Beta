package wi;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.b20;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.y00;
import org.telegram.ui.de;
import org.telegram.ui.mj;
public final class e0 implements Runnable {
    public final int f57826a;
    public final t0 f57827b;
    public final long f57828c;

    public e0(t0 t0Var, long j10, int i3) {
        this.f57826a = i3;
        this.f57827b = t0Var;
        this.f57828c = j10;
    }

    @Override
    public final void run() {
        File file;
        long j10;
        long j11;
        mj mjVar;
        a61 a61Var;
        switch (this.f57826a) {
            case 0:
                t0 t0Var = this.f57827b;
                long j12 = this.f57828c;
                if (t0Var.Z == 6) {
                    t0Var.H = j12;
                    t0Var.N = 0L;
                    t0Var.J = 0L;
                    t0Var.K = j12;
                    t0Var.w(2);
                    t0Var.f58063l.X(t0Var.T, t0Var.H * 1000, t0Var.f58069r);
                    return;
                }
                return;
            default:
                t0 t0Var2 = this.f57827b;
                long j13 = this.f57828c;
                if (t0Var2.Z == 4) {
                    t0Var2.N = j13;
                    long min = Math.min(t0Var2.f58068q, j13);
                    t0Var2.H = min;
                    t0Var2.J = 0L;
                    t0Var2.K = min;
                    t0Var2.f58055b.setSurfaceTextureListener(null);
                    t0Var2.f58055b.setTransform(t0Var2.h);
                    k2.i0 a10 = new k2.n(t0Var2.f58053a).a();
                    t0Var2.V = a10;
                    a10.z1(t0Var2.f58055b);
                    t0Var2.V.v0(d2.n0.b(Uri.fromFile(t0Var2.U)));
                    t0Var2.V.k(0);
                    t0Var2.V.R(1.0f);
                    t0Var2.V.u0(t0Var2.Y);
                    t0Var2.V.a();
                    t0Var2.V.Z0(5, t0Var2.J);
                    t0Var2.f58064m.b("preview player prepared: durationMs=" + t0Var2.H + ", trim=" + t0Var2.J + ".." + t0Var2.K);
                    t0Var2.w(5);
                    y00 y00Var = t0Var2.d;
                    long j14 = t0Var2.H;
                    long j15 = t0Var2.J;
                    long j16 = t0Var2.K;
                    ((j40) y00Var.f40562a).f34954w.setProgress(((float) j14) / 60000.0f);
                    j40 j40Var = (j40) y00Var.f40562a;
                    j40Var.f34939j0 = false;
                    j40Var.I.setAlpha(0.0f);
                    j40 j40Var2 = (j40) y00Var.f40562a;
                    if (j40Var2.V == null) {
                        t0 t0Var3 = j40Var2.P;
                        if (t0Var3 == null) {
                            file = null;
                        } else {
                            t0.u();
                            file = t0Var3.U;
                        }
                        if (file != null) {
                            j40 j40Var3 = (j40) y00Var.f40562a;
                            j40Var3.U = j40Var3.s(file, j14, null);
                            j40 j40Var4 = (j40) y00Var.f40562a;
                            b20 b20Var = j40Var4.U;
                            if (j15 > 0) {
                                j10 = j15;
                            } else {
                                j10 = -1;
                            }
                            b20Var.f21708a = j10;
                            if (j16 < j14) {
                                j11 = j16;
                            } else {
                                j11 = -1;
                            }
                            b20Var.f21710b = j11;
                            hs.f(j40Var4.f34934f).k(162, Integer.valueOf(((j40) y00Var.f40562a).h), ((j40) y00Var.f40562a).U, file.getAbsolutePath(), new ArrayList());
                            float max = (float) Math.max(1L, j14);
                            float f10 = ((float) j15) / max;
                            float f11 = ((float) j16) / max;
                            o40 o40Var = ((j40) y00Var.f40562a).f37061b;
                            if (o40Var != null && (mjVar = ((de) o40Var).f44668b.f51237a0) != null && (a61Var = mjVar.f31124g1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f10));
                                a61Var.f31734b = max2;
                                a61Var.f31735c = Math.max(max2, Math.min(1.0f, f11));
                                a61Var.invalidate();
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
