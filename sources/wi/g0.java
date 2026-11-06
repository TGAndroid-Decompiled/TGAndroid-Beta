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
    public final int f57876a = 1;
    public final t0 f57877b;
    public final p0 f57878c;
    public final long d;
    public final File f57879e;
    public final boolean f57880f;

    public g0(t0 t0Var, p0 p0Var, long j3, File file, boolean z9) {
        this.f57877b = t0Var;
        this.f57878c = p0Var;
        this.d = j3;
        this.f57879e = file;
        this.f57880f = z9;
    }

    private final void a() {
        t0 t0Var = this.f57877b;
        p0 p0Var = this.f57878c;
        File file = this.f57879e;
        long j3 = this.d;
        boolean z9 = this.f57880f;
        synchronized (t0Var.f58104g) {
            if (!t0Var.G && !p0Var.d && !p0Var.f58037e) {
                p0Var.f58037e = true;
                ((gy0) t0Var.f58102e).b(p0Var.f58034a, file.length(), file);
                t0Var.f58105i.post(new g0(t0Var, p0Var, j3, file, z9));
            }
        }
    }

    @Override
    public final void run() {
        fy0 fy0Var;
        fy0 fy0Var2;
        switch (this.f57876a) {
            case 0:
                a();
                return;
            default:
                t0 t0Var = this.f57877b;
                p0 p0Var = this.f57878c;
                long j3 = this.d;
                File file = this.f57879e;
                boolean z9 = this.f57880f;
                int i7 = t0Var.Z;
                if (i7 != 10 && i7 != 9) {
                    t0Var.w(8);
                    t0Var.f58109m.b("output completed: generation=" + p0Var.f58034a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z9);
                    t0Var.m("completed");
                    qt qtVar = t0Var.d;
                    long j10 = p0Var.f58034a;
                    n40 n40Var = (n40) qtVar.f37394b;
                    m40 m40Var = n40Var.U;
                    if (m40Var != null) {
                        n40Var.U = null;
                        n40Var.f36170j0 = true;
                        gy0 gy0Var = n40Var.S;
                        if (gy0Var == null) {
                            fy0Var2 = null;
                        } else {
                            synchronized (gy0Var) {
                                ey0 ey0Var = (ey0) gy0Var.f34101c.get(Long.valueOf(j10));
                                if (ey0Var != null && !ey0Var.f33367e) {
                                    fy0Var = new fy0(Math.max(ey0Var.f33366c, file.length()), ey0Var.f33368f, ey0Var.f33369g, ey0Var.h, ey0Var.f33370i);
                                }
                                fy0Var = new fy0(file.length(), null, null, null, null);
                            }
                            fy0Var2 = fy0Var;
                        }
                        j20 s5 = n40Var.s(file, j3, fy0Var2);
                        s5.f23462t = !z9;
                        gf gfVar = new gf(0, file.getAbsolutePath(), 0, true, 0, 0);
                        gfVar.f26843x = m40Var.f35842c;
                        gfVar.f26844y = m40Var.d;
                        n40Var.f36163e.u(gfVar, s5, m40Var.f35840a, m40Var.f35841b, 0, false, m40Var.f35843e);
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
        this.f57877b = t0Var;
        this.f57878c = p0Var;
        this.f57879e = file;
        this.d = j3;
        this.f57880f = z9;
    }
}
