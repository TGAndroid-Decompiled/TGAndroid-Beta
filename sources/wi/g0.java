package wi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gf;
import org.telegram.messenger.j20;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.qt;
public final class g0 implements Runnable {
    public final int f57851a = 1;
    public final t0 f57852b;
    public final p0 f57853c;
    public final long d;
    public final File f57854e;
    public final boolean f57855f;

    public g0(t0 t0Var, p0 p0Var, long j3, File file, boolean z9) {
        this.f57852b = t0Var;
        this.f57853c = p0Var;
        this.d = j3;
        this.f57854e = file;
        this.f57855f = z9;
    }

    private final void a() {
        t0 t0Var = this.f57852b;
        p0 p0Var = this.f57853c;
        File file = this.f57854e;
        long j3 = this.d;
        boolean z9 = this.f57855f;
        synchronized (t0Var.f58079g) {
            if (!t0Var.G && !p0Var.d && !p0Var.f58012e) {
                p0Var.f58012e = true;
                ((gy0) t0Var.f58077e).b(p0Var.f58009a, file.length(), file);
                t0Var.f58080i.post(new g0(t0Var, p0Var, j3, file, z9));
            }
        }
    }

    @Override
    public final void run() {
        fy0 fy0Var;
        fy0 fy0Var2;
        switch (this.f57851a) {
            case 0:
                a();
                return;
            default:
                t0 t0Var = this.f57852b;
                p0 p0Var = this.f57853c;
                long j3 = this.d;
                File file = this.f57854e;
                boolean z9 = this.f57855f;
                int i7 = t0Var.Z;
                if (i7 != 10 && i7 != 9) {
                    t0Var.w(8);
                    t0Var.f58084m.b("output completed: generation=" + p0Var.f58009a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z9);
                    t0Var.m("completed");
                    qt qtVar = t0Var.d;
                    long j10 = p0Var.f58009a;
                    n40 n40Var = (n40) qtVar.f37504b;
                    m40 m40Var = n40Var.U;
                    if (m40Var != null) {
                        n40Var.U = null;
                        n40Var.f36253j0 = true;
                        gy0 gy0Var = n40Var.S;
                        if (gy0Var == null) {
                            fy0Var2 = null;
                        } else {
                            synchronized (gy0Var) {
                                ey0 ey0Var = (ey0) gy0Var.f34153c.get(Long.valueOf(j10));
                                if (ey0Var != null && !ey0Var.f33371e) {
                                    fy0Var = new fy0(Math.max(ey0Var.f33370c, file.length()), ey0Var.f33372f, ey0Var.f33373g, ey0Var.h, ey0Var.f33374i);
                                }
                                fy0Var = new fy0(file.length(), null, null, null, null);
                            }
                            fy0Var2 = fy0Var;
                        }
                        j20 s5 = n40Var.s(file, j3, fy0Var2);
                        s5.f23462t = !z9;
                        gf gfVar = new gf(0, file.getAbsolutePath(), 0, true, 0, 0);
                        gfVar.f26843x = m40Var.f35871c;
                        gfVar.f26844y = m40Var.d;
                        n40Var.f36246e.u(gfVar, s5, m40Var.f35869a, m40Var.f35870b, 0, false, m40Var.f35872e);
                        gy0 gy0Var2 = n40Var.S;
                        if (gy0Var2 != null) {
                            gy0Var2.d(false);
                        }
                        n40Var.S = null;
                        MediaController.B().Y(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public g0(t0 t0Var, p0 p0Var, File file, long j3, boolean z9) {
        this.f57852b = t0Var;
        this.f57853c = p0Var;
        this.f57854e = file;
        this.d = j3;
        this.f57855f = z9;
    }
}
