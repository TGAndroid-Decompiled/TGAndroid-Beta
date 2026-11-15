package zi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.g20;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.q40;
public final class h0 implements Runnable {
    public final int f61523a = 1;
    public final v0 f61524b;
    public final r0 f61525c;
    public final long d;
    public final File f61526e;
    public final boolean f61527f;

    public h0(v0 v0Var, r0 r0Var, long j3, File file, boolean z10) {
        this.f61524b = v0Var;
        this.f61525c = r0Var;
        this.d = j3;
        this.f61526e = file;
        this.f61527f = z10;
    }

    private final void a() {
        v0 v0Var = this.f61524b;
        r0 r0Var = this.f61525c;
        File file = this.f61526e;
        long j3 = this.d;
        boolean z10 = this.f61527f;
        synchronized (v0Var.f61751g) {
            if (!v0Var.H && !r0Var.d && !r0Var.f61682e) {
                r0Var.f61682e = true;
                ((jy0) v0Var.f61749e).b(r0Var.f61679a, file.length(), file);
                v0Var.f61752i.post(new h0(v0Var, r0Var, j3, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        iy0 iy0Var;
        iy0 iy0Var2;
        switch (this.f61523a) {
            case 0:
                a();
                return;
            default:
                v0 v0Var = this.f61524b;
                r0 r0Var = this.f61525c;
                long j3 = this.d;
                File file = this.f61526e;
                boolean z10 = this.f61527f;
                int i7 = v0Var.f61745a0;
                if (i7 != 10 && i7 != 9) {
                    v0Var.x(8);
                    v0Var.f61756m.b("output completed: generation=" + r0Var.f61679a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                    v0Var.m("completed");
                    ff ffVar = v0Var.d;
                    long j10 = r0Var.f61679a;
                    q40 q40Var = (q40) ffVar.f34586b;
                    p40 p40Var = q40Var.V;
                    if (p40Var != null) {
                        q40Var.V = null;
                        q40Var.f38499l0 = true;
                        jy0 jy0Var = q40Var.T;
                        if (jy0Var == null) {
                            iy0Var2 = null;
                        } else {
                            synchronized (jy0Var) {
                                try {
                                    try {
                                        hy0 hy0Var = (hy0) jy0Var.f36203c.get(Long.valueOf(j10));
                                        if (hy0Var != null && !hy0Var.f35373e) {
                                            iy0Var = new iy0(Math.max(hy0Var.f35372c, file.length()), hy0Var.f35374f, hy0Var.f35375g, hy0Var.h, hy0Var.f35376i);
                                        } else {
                                            iy0Var = new iy0(file.length(), null, null, null, null);
                                        }
                                        iy0Var2 = iy0Var;
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
                        g20 t6 = q40Var.t(file, j3, iy0Var2);
                        t6.f23651t = !z10;
                        org.telegram.messenger.ff ffVar2 = new org.telegram.messenger.ff(0, file.getAbsolutePath(), 0, true, 0, 0);
                        ffVar2.f27727x = p40Var.f38196c;
                        ffVar2.f27728y = p40Var.d;
                        q40Var.f38490e.u(ffVar2, t6, p40Var.f38194a, p40Var.f38195b, 0, false, p40Var.f38197e);
                        jy0 jy0Var2 = q40Var.T;
                        if (jy0Var2 != null) {
                            jy0Var2.d(false);
                        }
                        q40Var.T = null;
                        MediaController.B().Y(false);
                        if (q40Var.f38486a0) {
                            q40Var.f38486a0 = false;
                            q40Var.P = null;
                        }
                    }
                    if (v0Var.G) {
                        v0Var.s();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public h0(v0 v0Var, r0 r0Var, File file, long j3, boolean z10) {
        this.f61524b = v0Var;
        this.f61525c = r0Var;
        this.f61526e = file;
        this.d = j3;
        this.f61527f = z10;
    }
}
