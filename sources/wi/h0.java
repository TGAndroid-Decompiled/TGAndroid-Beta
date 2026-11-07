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
public final class h0 implements Runnable {
    public final int f57881a = 1;
    public final u0 f57882b;
    public final q0 f57883c;
    public final long d;
    public final File f57884e;
    public final boolean f57885f;

    public h0(u0 u0Var, q0 q0Var, long j3, File file, boolean z9) {
        this.f57882b = u0Var;
        this.f57883c = q0Var;
        this.d = j3;
        this.f57884e = file;
        this.f57885f = z9;
    }

    private final void a() {
        u0 u0Var = this.f57882b;
        q0 q0Var = this.f57883c;
        File file = this.f57884e;
        long j3 = this.d;
        boolean z9 = this.f57885f;
        synchronized (u0Var.f58109g) {
            if (!u0Var.H && !q0Var.d && !q0Var.f58037e) {
                q0Var.f58037e = true;
                ((hy0) u0Var.f58107e).b(q0Var.f58034a, file.length(), file);
                u0Var.f58110i.post(new h0(u0Var, q0Var, j3, file, z9));
            }
        }
    }

    @Override
    public final void run() {
        gy0 gy0Var;
        gy0 gy0Var2;
        switch (this.f57881a) {
            case 0:
                a();
                return;
            default:
                u0 u0Var = this.f57882b;
                q0 q0Var = this.f57883c;
                long j3 = this.d;
                File file = this.f57884e;
                boolean z9 = this.f57885f;
                int i7 = u0Var.f58103a0;
                if (i7 != 10 && i7 != 9) {
                    u0Var.x(8);
                    u0Var.f58114m.b("output completed: generation=" + q0Var.f58034a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z9);
                    u0Var.m("completed");
                    qt qtVar = u0Var.d;
                    long j10 = q0Var.f58034a;
                    n40 n40Var = (n40) qtVar.f37389b;
                    m40 m40Var = n40Var.U;
                    if (m40Var != null) {
                        n40Var.U = null;
                        n40Var.f36206k0 = true;
                        hy0 hy0Var = n40Var.S;
                        if (hy0Var == null) {
                            gy0Var2 = null;
                        } else {
                            synchronized (hy0Var) {
                                try {
                                    try {
                                        fy0 fy0Var = (fy0) hy0Var.f34442c.get(Long.valueOf(j10));
                                        if (fy0Var != null && !fy0Var.f33686e) {
                                            gy0Var = new gy0(Math.max(fy0Var.f33685c, file.length()), fy0Var.f33687f, fy0Var.f33688g, fy0Var.h, fy0Var.f33689i);
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
                        t6.f23469t = !z9;
                        gf gfVar = new gf(0, file.getAbsolutePath(), 0, true, 0, 0);
                        gfVar.f26843x = m40Var.f35857c;
                        gfVar.f26844y = m40Var.d;
                        n40Var.f36198e.u(gfVar, t6, m40Var.f35855a, m40Var.f35856b, 0, false, m40Var.f35858e);
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
                    if (u0Var.G) {
                        u0Var.s();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public h0(u0 u0Var, q0 q0Var, File file, long j3, boolean z9) {
        this.f57882b = u0Var;
        this.f57883c = q0Var;
        this.f57884e = file;
        this.d = j3;
        this.f57885f = z9;
    }
}
