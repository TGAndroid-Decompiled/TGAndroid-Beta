package wi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gf;
import org.telegram.messenger.j20;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.rt;
public final class g0 implements Runnable {
    public final int f57967a = 1;
    public final t0 f57968b;
    public final p0 f57969c;
    public final long d;
    public final File f57970e;
    public final boolean f57971f;

    public g0(t0 t0Var, p0 p0Var, long j3, File file, boolean z9) {
        this.f57968b = t0Var;
        this.f57969c = p0Var;
        this.d = j3;
        this.f57970e = file;
        this.f57971f = z9;
    }

    private final void a() {
        t0 t0Var = this.f57968b;
        p0 p0Var = this.f57969c;
        File file = this.f57970e;
        long j3 = this.d;
        boolean z9 = this.f57971f;
        synchronized (t0Var.f58198g) {
            if (!t0Var.H && !p0Var.d && !p0Var.f58127e) {
                p0Var.f58127e = true;
                ((hy0) t0Var.f58196e).b(p0Var.f58124a, file.length(), file);
                t0Var.f58199i.post(new g0(t0Var, p0Var, j3, file, z9));
            }
        }
    }

    @Override
    public final void run() {
        gy0 gy0Var;
        gy0 gy0Var2;
        switch (this.f57967a) {
            case 0:
                a();
                return;
            default:
                t0 t0Var = this.f57968b;
                p0 p0Var = this.f57969c;
                long j3 = this.d;
                File file = this.f57970e;
                boolean z9 = this.f57971f;
                int i7 = t0Var.f58192a0;
                if (i7 != 10 && i7 != 9) {
                    t0Var.x(8);
                    t0Var.f58203m.b("output completed: generation=" + p0Var.f58124a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z9);
                    t0Var.m("completed");
                    rt rtVar = t0Var.d;
                    long j10 = p0Var.f58124a;
                    n40 n40Var = (n40) rtVar.f37758b;
                    m40 m40Var = n40Var.U;
                    if (m40Var != null) {
                        n40Var.U = null;
                        n40Var.f36222k0 = true;
                        hy0 hy0Var = n40Var.S;
                        if (hy0Var == null) {
                            gy0Var2 = null;
                        } else {
                            synchronized (hy0Var) {
                                try {
                                    try {
                                        fy0 fy0Var = (fy0) hy0Var.f34477c.get(Long.valueOf(j10));
                                        if (fy0Var != null && !fy0Var.f33694e) {
                                            gy0Var = new gy0(Math.max(fy0Var.f33693c, file.length()), fy0Var.f33695f, fy0Var.f33696g, fy0Var.h, fy0Var.f33697i);
                                        } else {
                                            gy0Var = new gy0(file.length(), null, null, null, null);
                                        }
                                        gy0Var2 = gy0Var;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            }
                        }
                        j20 t6 = n40Var.t(file, j3, gy0Var2);
                        t6.f23490t = !z9;
                        gf gfVar = new gf(0, file.getAbsolutePath(), 0, true, 0, 0);
                        gfVar.f26864x = m40Var.f35885c;
                        gfVar.f26865y = m40Var.d;
                        n40Var.f36214e.u(gfVar, t6, m40Var.f35883a, m40Var.f35884b, 0, false, m40Var.f35886e);
                        hy0 hy0Var2 = n40Var.S;
                        if (hy0Var2 != null) {
                            hy0Var2.d(false);
                        }
                        n40Var.S = null;
                        MediaController.B().Y(false);
                        if (n40Var.W) {
                            n40Var.W = false;
                            n40Var.O = null;
                        }
                    }
                    if (t0Var.G) {
                        t0Var.s();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public g0(t0 t0Var, p0 p0Var, File file, long j3, boolean z9) {
        this.f57968b = t0Var;
        this.f57969c = p0Var;
        this.f57970e = file;
        this.d = j3;
        this.f57971f = z9;
    }
}
