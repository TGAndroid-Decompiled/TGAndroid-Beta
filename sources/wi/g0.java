package wi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gf;
import org.telegram.messenger.j20;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.rt;
public final class g0 implements Runnable {
    public final int f57980a = 1;
    public final t0 f57981b;
    public final p0 f57982c;
    public final long d;
    public final File f57983e;
    public final boolean f57984f;

    public g0(t0 t0Var, p0 p0Var, long j3, File file, boolean z9) {
        this.f57981b = t0Var;
        this.f57982c = p0Var;
        this.d = j3;
        this.f57983e = file;
        this.f57984f = z9;
    }

    private final void a() {
        t0 t0Var = this.f57981b;
        p0 p0Var = this.f57982c;
        File file = this.f57983e;
        long j3 = this.d;
        boolean z9 = this.f57984f;
        synchronized (t0Var.f58208g) {
            if (!t0Var.H && !p0Var.d && !p0Var.f58137e) {
                p0Var.f58137e = true;
                ((iy0) t0Var.f58206e).b(p0Var.f58134a, file.length(), file);
                t0Var.f58209i.post(new g0(t0Var, p0Var, j3, file, z9));
            }
        }
    }

    @Override
    public final void run() {
        hy0 hy0Var;
        hy0 hy0Var2;
        switch (this.f57980a) {
            case 0:
                a();
                return;
            default:
                t0 t0Var = this.f57981b;
                p0 p0Var = this.f57982c;
                long j3 = this.d;
                File file = this.f57983e;
                boolean z9 = this.f57984f;
                int i7 = t0Var.f58202a0;
                if (i7 != 10 && i7 != 9) {
                    t0Var.x(8);
                    t0Var.f58213m.b("output completed: generation=" + p0Var.f58134a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z9);
                    t0Var.m("completed");
                    rt rtVar = t0Var.d;
                    long j10 = p0Var.f58134a;
                    o40 o40Var = (o40) rtVar.f37805b;
                    n40 n40Var = o40Var.U;
                    if (n40Var != null) {
                        o40Var.U = null;
                        o40Var.f36628k0 = true;
                        iy0 iy0Var = o40Var.S;
                        if (iy0Var == null) {
                            hy0Var2 = null;
                        } else {
                            synchronized (iy0Var) {
                                try {
                                    try {
                                        gy0 gy0Var = (gy0) iy0Var.f34882c.get(Long.valueOf(j10));
                                        if (gy0Var != null && !gy0Var.f34093e) {
                                            hy0Var = new hy0(Math.max(gy0Var.f34092c, file.length()), gy0Var.f34094f, gy0Var.f34095g, gy0Var.h, gy0Var.f34096i);
                                        } else {
                                            hy0Var = new hy0(file.length(), null, null, null, null);
                                        }
                                        hy0Var2 = hy0Var;
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
                        j20 t6 = o40Var.t(file, j3, hy0Var2);
                        t6.f23490t = !z9;
                        gf gfVar = new gf(0, file.getAbsolutePath(), 0, true, 0, 0);
                        gfVar.f26864x = n40Var.f36247c;
                        gfVar.f26865y = n40Var.d;
                        o40Var.f36620e.u(gfVar, t6, n40Var.f36245a, n40Var.f36246b, 0, false, n40Var.f36248e);
                        iy0 iy0Var2 = o40Var.S;
                        if (iy0Var2 != null) {
                            iy0Var2.d(false);
                        }
                        o40Var.S = null;
                        MediaController.B().Y(false);
                        if (o40Var.W) {
                            o40Var.W = false;
                            o40Var.O = null;
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
        this.f57981b = t0Var;
        this.f57982c = p0Var;
        this.f57983e = file;
        this.d = j3;
        this.f57984f = z9;
    }
}
