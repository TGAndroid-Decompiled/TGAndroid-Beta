package wi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.b20;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.y00;
public final class f0 implements Runnable {
    public final int f57831a = 1;
    public final t0 f57832b;
    public final p0 f57833c;
    public final long d;
    public final File f57834e;
    public final boolean f57835f;

    public f0(t0 t0Var, p0 p0Var, long j10, File file, boolean z10) {
        this.f57832b = t0Var;
        this.f57833c = p0Var;
        this.d = j10;
        this.f57834e = file;
        this.f57835f = z10;
    }

    private final void a() {
        t0 t0Var = this.f57832b;
        p0 p0Var = this.f57833c;
        File file = this.f57834e;
        long j10 = this.d;
        boolean z10 = this.f57835f;
        synchronized (t0Var.f58059g) {
            if (!t0Var.G && !p0Var.d && !p0Var.f57995e) {
                p0Var.f57995e = true;
                ((gy0) t0Var.f58057e).b(p0Var.f57992a, file.length(), file);
                t0Var.f58060i.post(new f0(t0Var, p0Var, j10, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        fy0 fy0Var;
        fy0 fy0Var2;
        switch (this.f57831a) {
            case 0:
                a();
                return;
            default:
                t0 t0Var = this.f57832b;
                p0 p0Var = this.f57833c;
                long j10 = this.d;
                File file = this.f57834e;
                boolean z10 = this.f57835f;
                int i3 = t0Var.Z;
                if (i3 != 10 && i3 != 9) {
                    t0Var.w(8);
                    t0Var.f58064m.b("output completed: generation=" + p0Var.f57992a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                    t0Var.m("completed");
                    y00 y00Var = t0Var.d;
                    long j11 = p0Var.f57992a;
                    j40 j40Var = (j40) y00Var.f40562a;
                    i40 i40Var = j40Var.V;
                    if (i40Var != null) {
                        j40Var.V = null;
                        j40Var.f34940k0 = true;
                        gy0 gy0Var = j40Var.T;
                        if (gy0Var == null) {
                            fy0Var2 = null;
                        } else {
                            synchronized (gy0Var) {
                                ey0 ey0Var = (ey0) gy0Var.f34232c.get(Long.valueOf(j11));
                                if (ey0Var != null && !ey0Var.f33605e) {
                                    fy0Var = new fy0(Math.max(ey0Var.f33604c, file.length()), ey0Var.f33606f, ey0Var.f33607g, ey0Var.h, ey0Var.f33608i);
                                }
                                fy0Var = new fy0(file.length(), null, null, null, null);
                            }
                            fy0Var2 = fy0Var;
                        }
                        b20 s6 = j40Var.s(file, j10, fy0Var2);
                        s6.f21727t = !z10;
                        ye yeVar = new ye(0, file.getAbsolutePath(), 0, true, 0, 0);
                        yeVar.f25329x = i40Var.f34588c;
                        yeVar.f25330y = i40Var.d;
                        j40Var.f34932e.u(yeVar, s6, i40Var.f34586a, i40Var.f34587b, 0, false, i40Var.f34589e);
                        gy0 gy0Var2 = j40Var.T;
                        if (gy0Var2 != null) {
                            gy0Var2.d(false);
                        }
                        j40Var.T = null;
                        MediaController.B().Y(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public f0(t0 t0Var, p0 p0Var, File file, long j10, boolean z10) {
        this.f57832b = t0Var;
        this.f57833c = p0Var;
        this.f57834e = file;
        this.d = j10;
        this.f57835f = z10;
    }
}
