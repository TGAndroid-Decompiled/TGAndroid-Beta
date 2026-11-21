package zi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.e20;
import org.telegram.messenger.ef;
import org.telegram.ui.Components.a50;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.sy0;
public final class g0 implements Runnable {
    public final int f62128a = 1;
    public final u0 f62129b;
    public final q0 f62130c;
    public final long d;
    public final File f62131e;
    public final boolean f62132f;

    public g0(u0 u0Var, q0 q0Var, long j3, File file, boolean z10) {
        this.f62129b = u0Var;
        this.f62130c = q0Var;
        this.d = j3;
        this.f62131e = file;
        this.f62132f = z10;
    }

    private final void a() {
        u0 u0Var = this.f62129b;
        q0 q0Var = this.f62130c;
        File file = this.f62131e;
        long j3 = this.d;
        boolean z10 = this.f62132f;
        synchronized (u0Var.f62357g) {
            if (!u0Var.H && !q0Var.d && !q0Var.f62288e) {
                q0Var.f62288e = true;
                ((sy0) u0Var.f62355e).b(q0Var.f62285a, file.length(), file);
                u0Var.f62358i.post(new g0(u0Var, q0Var, j3, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        ry0 ry0Var;
        ry0 ry0Var2;
        switch (this.f62128a) {
            case 0:
                a();
                return;
            default:
                u0 u0Var = this.f62129b;
                q0 q0Var = this.f62130c;
                long j3 = this.d;
                File file = this.f62131e;
                boolean z10 = this.f62132f;
                int i7 = u0Var.f62351a0;
                if (i7 != 10 && i7 != 9) {
                    u0Var.x(8);
                    u0Var.f62362m.b("output completed: generation=" + q0Var.f62285a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                    u0Var.m("completed");
                    qf qfVar = u0Var.d;
                    long j10 = q0Var.f62285a;
                    b50 b50Var = (b50) qfVar.f38902b;
                    a50 a50Var = b50Var.V;
                    if (a50Var != null) {
                        b50Var.V = null;
                        b50Var.f33756l0 = true;
                        sy0 sy0Var = b50Var.T;
                        if (sy0Var == null) {
                            ry0Var2 = null;
                        } else {
                            synchronized (sy0Var) {
                                try {
                                    try {
                                        qy0 qy0Var = (qy0) sy0Var.f39733c.get(Long.valueOf(j10));
                                        if (qy0Var != null && !qy0Var.f39022e) {
                                            ry0Var = new ry0(Math.max(qy0Var.f39021c, file.length()), qy0Var.f39023f, qy0Var.f39024g, qy0Var.h, qy0Var.f39025i);
                                        } else {
                                            ry0Var = new ry0(file.length(), null, null, null, null);
                                        }
                                        ry0Var2 = ry0Var;
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
                        e20 t6 = b50Var.t(file, j3, ry0Var2);
                        t6.f23681t = !z10;
                        ef efVar = new ef(0, file.getAbsolutePath(), 0, true, 0, 0);
                        efVar.f27894x = a50Var.f33307c;
                        efVar.f27895y = a50Var.d;
                        b50Var.f33747e.u(efVar, t6, a50Var.f33305a, a50Var.f33306b, 0, false, a50Var.f33308e);
                        sy0 sy0Var2 = b50Var.T;
                        if (sy0Var2 != null) {
                            sy0Var2.d(false);
                        }
                        b50Var.T = null;
                        MediaController.B().Y(false);
                        if (b50Var.f33743a0) {
                            b50Var.f33743a0 = false;
                            b50Var.P = null;
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
        this.f62129b = u0Var;
        this.f62130c = q0Var;
        this.f62131e = file;
        this.d = j3;
        this.f62132f = z10;
    }
}
