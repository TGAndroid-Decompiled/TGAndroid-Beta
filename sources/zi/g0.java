package zi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.f20;
import org.telegram.messenger.ff;
import org.telegram.ui.Components.a50;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.sy0;
public final class g0 implements Runnable {
    public final int f62132a = 1;
    public final u0 f62133b;
    public final q0 f62134c;
    public final long d;
    public final File f62135e;
    public final boolean f62136f;

    public g0(u0 u0Var, q0 q0Var, long j3, File file, boolean z10) {
        this.f62133b = u0Var;
        this.f62134c = q0Var;
        this.d = j3;
        this.f62135e = file;
        this.f62136f = z10;
    }

    private final void a() {
        u0 u0Var = this.f62133b;
        q0 q0Var = this.f62134c;
        File file = this.f62135e;
        long j3 = this.d;
        boolean z10 = this.f62136f;
        synchronized (u0Var.f62361g) {
            if (!u0Var.H && !q0Var.d && !q0Var.f62292e) {
                q0Var.f62292e = true;
                ((sy0) u0Var.f62359e).b(q0Var.f62289a, file.length(), file);
                u0Var.f62362i.post(new g0(u0Var, q0Var, j3, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        ry0 ry0Var;
        ry0 ry0Var2;
        switch (this.f62132a) {
            case 0:
                a();
                return;
            default:
                u0 u0Var = this.f62133b;
                q0 q0Var = this.f62134c;
                long j3 = this.d;
                File file = this.f62135e;
                boolean z10 = this.f62136f;
                int i7 = u0Var.f62355a0;
                if (i7 != 10 && i7 != 9) {
                    u0Var.x(8);
                    u0Var.f62366m.b("output completed: generation=" + q0Var.f62289a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                    u0Var.m("completed");
                    qf qfVar = u0Var.d;
                    long j10 = q0Var.f62289a;
                    b50 b50Var = (b50) qfVar.f38895b;
                    a50 a50Var = b50Var.V;
                    if (a50Var != null) {
                        b50Var.V = null;
                        b50Var.f33749l0 = true;
                        sy0 sy0Var = b50Var.T;
                        if (sy0Var == null) {
                            ry0Var2 = null;
                        } else {
                            synchronized (sy0Var) {
                                try {
                                    try {
                                        qy0 qy0Var = (qy0) sy0Var.f39725c.get(Long.valueOf(j10));
                                        if (qy0Var != null && !qy0Var.f39015e) {
                                            ry0Var = new ry0(Math.max(qy0Var.f39014c, file.length()), qy0Var.f39016f, qy0Var.f39017g, qy0Var.h, qy0Var.f39018i);
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
                        f20 t6 = b50Var.t(file, j3, ry0Var2);
                        t6.f23845t = !z10;
                        ff ffVar = new ff(0, file.getAbsolutePath(), 0, true, 0, 0);
                        ffVar.f28078x = a50Var.f33320c;
                        ffVar.f28079y = a50Var.d;
                        b50Var.f33740e.u(ffVar, t6, a50Var.f33318a, a50Var.f33319b, 0, false, a50Var.f33321e);
                        sy0 sy0Var2 = b50Var.T;
                        if (sy0Var2 != null) {
                            sy0Var2.d(false);
                        }
                        b50Var.T = null;
                        MediaController.B().Y(false);
                        if (b50Var.f33736a0) {
                            b50Var.f33736a0 = false;
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
        this.f62133b = u0Var;
        this.f62134c = q0Var;
        this.f62135e = file;
        this.d = j3;
        this.f62136f = z10;
    }
}
