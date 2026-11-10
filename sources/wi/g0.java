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
import org.telegram.ui.Components.qt;
public final class g0 implements Runnable {
    public final int f57984a = 1;
    public final t0 f57985b;
    public final p0 f57986c;
    public final long d;
    public final File f57987e;
    public final boolean f57988f;

    public g0(t0 t0Var, p0 p0Var, long j3, File file, boolean z9) {
        this.f57985b = t0Var;
        this.f57986c = p0Var;
        this.d = j3;
        this.f57987e = file;
        this.f57988f = z9;
    }

    private final void a() {
        t0 t0Var = this.f57985b;
        p0 p0Var = this.f57986c;
        File file = this.f57987e;
        long j3 = this.d;
        boolean z9 = this.f57988f;
        synchronized (t0Var.f58212g) {
            if (!t0Var.H && !p0Var.d && !p0Var.f58141e) {
                p0Var.f58141e = true;
                ((hy0) t0Var.f58210e).b(p0Var.f58138a, file.length(), file);
                t0Var.f58213i.post(new g0(t0Var, p0Var, j3, file, z9));
            }
        }
    }

    @Override
    public final void run() {
        gy0 gy0Var;
        gy0 gy0Var2;
        switch (this.f57984a) {
            case 0:
                a();
                return;
            default:
                t0 t0Var = this.f57985b;
                p0 p0Var = this.f57986c;
                long j3 = this.d;
                File file = this.f57987e;
                boolean z9 = this.f57988f;
                int i7 = t0Var.f58206a0;
                if (i7 != 10 && i7 != 9) {
                    t0Var.x(8);
                    t0Var.f58217m.b("output completed: generation=" + p0Var.f58138a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z9);
                    t0Var.m("completed");
                    qt qtVar = t0Var.d;
                    long j10 = p0Var.f58138a;
                    n40 n40Var = (n40) qtVar.f37395b;
                    m40 m40Var = n40Var.U;
                    if (m40Var != null) {
                        n40Var.U = null;
                        n40Var.f36220k0 = true;
                        hy0 hy0Var = n40Var.S;
                        if (hy0Var == null) {
                            gy0Var2 = null;
                        } else {
                            synchronized (hy0Var) {
                                try {
                                    try {
                                        fy0 fy0Var = (fy0) hy0Var.f34483c.get(Long.valueOf(j10));
                                        if (fy0Var != null && !fy0Var.f33687e) {
                                            gy0Var = new gy0(Math.max(fy0Var.f33686c, file.length()), fy0Var.f33688f, fy0Var.f33689g, fy0Var.h, fy0Var.f33690i);
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
                        t6.f23494t = !z9;
                        gf gfVar = new gf(0, file.getAbsolutePath(), 0, true, 0, 0);
                        gfVar.f26868x = m40Var.f35840c;
                        gfVar.f26869y = m40Var.d;
                        n40Var.f36212e.u(gfVar, t6, m40Var.f35838a, m40Var.f35839b, 0, false, m40Var.f35841e);
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
        this.f57985b = t0Var;
        this.f57986c = p0Var;
        this.f57987e = file;
        this.d = j3;
        this.f57988f = z9;
    }
}
