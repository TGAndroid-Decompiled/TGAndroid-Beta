package zi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.d20;
import org.telegram.messenger.ef;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.y40;
public final class g0 implements Runnable {
    public final int f62215a = 1;
    public final u0 f62216b;
    public final q0 f62217c;
    public final long d;
    public final File f62218e;
    public final boolean f62219f;

    public g0(u0 u0Var, q0 q0Var, long j3, File file, boolean z10) {
        this.f62216b = u0Var;
        this.f62217c = q0Var;
        this.d = j3;
        this.f62218e = file;
        this.f62219f = z10;
    }

    private final void a() {
        u0 u0Var = this.f62216b;
        q0 q0Var = this.f62217c;
        File file = this.f62218e;
        long j3 = this.d;
        boolean z10 = this.f62219f;
        synchronized (u0Var.f62446g) {
            if (!u0Var.H && !q0Var.d && !q0Var.f62377e) {
                q0Var.f62377e = true;
                ((ry0) u0Var.f62444e).b(q0Var.f62374a, file.length(), file);
                u0Var.f62447i.post(new g0(u0Var, q0Var, j3, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        qy0 qy0Var;
        qy0 qy0Var2;
        switch (this.f62215a) {
            case 0:
                a();
                return;
            default:
                u0 u0Var = this.f62216b;
                q0 q0Var = this.f62217c;
                long j3 = this.d;
                File file = this.f62218e;
                boolean z10 = this.f62219f;
                int i7 = u0Var.f62440a0;
                if (i7 != 10 && i7 != 9) {
                    u0Var.x(8);
                    u0Var.f62451m.b("output completed: generation=" + q0Var.f62374a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                    u0Var.m("completed");
                    aa aaVar = u0Var.d;
                    long j10 = q0Var.f62374a;
                    y40 y40Var = (y40) aaVar.f30491b;
                    x40 x40Var = y40Var.V;
                    if (x40Var != null) {
                        y40Var.V = null;
                        y40Var.f42335l0 = true;
                        ry0 ry0Var = y40Var.T;
                        if (ry0Var == null) {
                            qy0Var2 = null;
                        } else {
                            synchronized (ry0Var) {
                                try {
                                    try {
                                        py0 py0Var = (py0) ry0Var.f39436c.get(Long.valueOf(j10));
                                        if (py0Var != null && !py0Var.f38616e) {
                                            qy0Var = new qy0(Math.max(py0Var.f38615c, file.length()), py0Var.f38617f, py0Var.f38618g, py0Var.h, py0Var.f38619i);
                                        } else {
                                            qy0Var = new qy0(file.length(), null, null, null, null);
                                        }
                                        qy0Var2 = qy0Var;
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
                        d20 t6 = y40Var.t(file, j3, qy0Var2);
                        t6.f23606t = !z10;
                        ef efVar = new ef(0, file.getAbsolutePath(), 0, true, 0, 0);
                        efVar.f27982x = x40Var.f41824c;
                        efVar.f27983y = x40Var.d;
                        y40Var.f42326e.u(efVar, t6, x40Var.f41822a, x40Var.f41823b, 0, false, x40Var.f41825e);
                        ry0 ry0Var2 = y40Var.T;
                        if (ry0Var2 != null) {
                            ry0Var2.d(false);
                        }
                        y40Var.T = null;
                        MediaController.B().Y(false);
                        if (y40Var.f42322a0) {
                            y40Var.f42322a0 = false;
                            y40Var.P = null;
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

    public g0(u0 u0Var, q0 q0Var, File file, long j3, boolean z10) {
        this.f62216b = u0Var;
        this.f62217c = q0Var;
        this.f62218e = file;
        this.d = j3;
        this.f62219f = z10;
    }
}
