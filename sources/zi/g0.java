package zi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.e20;
import org.telegram.messenger.ef;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.y40;
public final class g0 implements Runnable {
    public final int f62087a = 1;
    public final u0 f62088b;
    public final q0 f62089c;
    public final long d;
    public final File f62090e;
    public final boolean f62091f;

    public g0(u0 u0Var, q0 q0Var, long j3, File file, boolean z10) {
        this.f62088b = u0Var;
        this.f62089c = q0Var;
        this.d = j3;
        this.f62090e = file;
        this.f62091f = z10;
    }

    private final void a() {
        u0 u0Var = this.f62088b;
        q0 q0Var = this.f62089c;
        File file = this.f62090e;
        long j3 = this.d;
        boolean z10 = this.f62091f;
        synchronized (u0Var.f62316g) {
            if (!u0Var.H && !q0Var.d && !q0Var.f62247e) {
                q0Var.f62247e = true;
                ((qy0) u0Var.f62314e).b(q0Var.f62244a, file.length(), file);
                u0Var.f62317i.post(new g0(u0Var, q0Var, j3, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        py0 py0Var;
        py0 py0Var2;
        switch (this.f62087a) {
            case 0:
                a();
                return;
            default:
                u0 u0Var = this.f62088b;
                q0 q0Var = this.f62089c;
                long j3 = this.d;
                File file = this.f62090e;
                boolean z10 = this.f62091f;
                int i7 = u0Var.f62310a0;
                if (i7 != 10 && i7 != 9) {
                    u0Var.x(8);
                    u0Var.f62321m.b("output completed: generation=" + q0Var.f62244a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                    u0Var.m("completed");
                    of ofVar = u0Var.d;
                    long j10 = q0Var.f62244a;
                    y40 y40Var = (y40) ofVar.f38076b;
                    x40 x40Var = y40Var.V;
                    if (x40Var != null) {
                        y40Var.V = null;
                        y40Var.f42307l0 = true;
                        qy0 qy0Var = y40Var.T;
                        if (qy0Var == null) {
                            py0Var2 = null;
                        } else {
                            synchronized (qy0Var) {
                                try {
                                    try {
                                        oy0 oy0Var = (oy0) qy0Var.f38941c.get(Long.valueOf(j10));
                                        if (oy0Var != null && !oy0Var.f38192e) {
                                            py0Var = new py0(Math.max(oy0Var.f38191c, file.length()), oy0Var.f38193f, oy0Var.f38194g, oy0Var.h, oy0Var.f38195i);
                                        } else {
                                            py0Var = new py0(file.length(), null, null, null, null);
                                        }
                                        py0Var2 = py0Var;
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
                        e20 t6 = y40Var.t(file, j3, py0Var2);
                        t6.f23653t = !z10;
                        ef efVar = new ef(0, file.getAbsolutePath(), 0, true, 0, 0);
                        efVar.f27866x = x40Var.f41883c;
                        efVar.f27867y = x40Var.d;
                        y40Var.f42298e.u(efVar, t6, x40Var.f41881a, x40Var.f41882b, 0, false, x40Var.f41884e);
                        qy0 qy0Var2 = y40Var.T;
                        if (qy0Var2 != null) {
                            qy0Var2.d(false);
                        }
                        y40Var.T = null;
                        MediaController.B().Y(false);
                        if (y40Var.f42294a0) {
                            y40Var.f42294a0 = false;
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
        this.f62088b = u0Var;
        this.f62089c = q0Var;
        this.f62090e = file;
        this.d = j3;
        this.f62091f = z10;
    }
}
