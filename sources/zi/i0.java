package zi;

import android.os.SystemClock;
import c8.pe;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.xn;
public final class i0 implements Runnable {
    public final int f62236a;
    public final u0 f62237b;

    public i0(u0 u0Var, int i7) {
        this.f62236a = i7;
        this.f62237b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f62236a) {
            case 0:
                u0 u0Var = this.f62237b;
                if (u0Var.f62440a0 == 3) {
                    u0Var.q();
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f62237b;
                x xVar = u0Var2.U;
                File file = u0Var2.V;
                if (xVar != null) {
                    try {
                        synchronized (xVar) {
                            xVar.f62505w = true;
                            try {
                                xVar.g();
                            } finally {
                                xVar.f62505w = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    pe.c(xVar.f62486a);
                }
                if (file != null) {
                    pe.c(file);
                    return;
                }
                return;
            case 2:
                u0 u0Var3 = this.f62237b;
                int i7 = u0Var3.f62440a0;
                if (i7 == 2 || i7 == 6) {
                    u0Var3.J = SystemClock.elapsedRealtime();
                    o oVar = u0Var3.f62451m;
                    oVar.b("recording started: retainedDurationMs=" + u0Var3.I);
                    u0Var3.x(3);
                    long j3 = u0Var3.f62455q - u0Var3.I;
                    if (j3 > 0 && !u0Var3.D) {
                        u0Var3.f62447i.postDelayed(u0Var3.X, j3);
                        return;
                    }
                    u0Var3.D = false;
                    u0Var3.q();
                    return;
                }
                return;
            default:
                u0 u0Var4 = this.f62237b;
                u0Var4.E = false;
                o oVar2 = u0Var4.f62451m;
                oVar2.b("recording segment stopped: state=" + yi.i.e(u0Var4.f62440a0) + ", retainedDurationMs=" + u0Var4.I);
                if (u0Var4.C) {
                    u0Var4.C = false;
                    u0Var4.i();
                    return;
                } else if (u0Var4.A) {
                    u0Var4.A = false;
                    boolean z10 = u0Var4.B;
                    u0Var4.f62448j.execute(new xn(u0Var4, u0Var4.U, z10, u0Var4.T, 18));
                    return;
                } else if (u0Var4.f62440a0 == 4) {
                    try {
                        File d = u0Var4.d("round_video_preview_");
                        u0Var4.V = d;
                        u0Var4.N = System.nanoTime();
                        o oVar3 = u0Var4.f62451m;
                        oVar3.b("preview snapshot started: file=" + d.getName());
                        u0Var4.f62448j.execute(new wg.p(u0Var4, u0Var4.U, d, 9));
                        return;
                    } catch (IOException e10) {
                        u0Var4.h(e10);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
