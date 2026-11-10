package wi;

import android.os.SystemClock;
import c8.jd;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Components.r31;
import org.telegram.ui.xn;
public final class i0 implements Runnable {
    public final int f58005a;
    public final t0 f58006b;

    public i0(t0 t0Var, int i7) {
        this.f58005a = i7;
        this.f58006b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f58005a) {
            case 0:
                t0 t0Var = this.f58006b;
                if (t0Var.f58206a0 == 3) {
                    t0Var.q();
                    return;
                }
                return;
            case 1:
                t0 t0Var2 = this.f58006b;
                x xVar = t0Var2.U;
                File file = t0Var2.V;
                if (xVar != null) {
                    try {
                        synchronized (xVar) {
                            xVar.f58271w = true;
                            try {
                                xVar.g();
                            } finally {
                                xVar.f58271w = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    jd.c(xVar.f58252a);
                }
                if (file != null) {
                    jd.c(file);
                    return;
                }
                return;
            case 2:
                t0 t0Var3 = this.f58006b;
                int i7 = t0Var3.f58206a0;
                if (i7 == 2 || i7 == 6) {
                    t0Var3.J = SystemClock.elapsedRealtime();
                    o oVar = t0Var3.f58217m;
                    oVar.b("recording started: retainedDurationMs=" + t0Var3.I);
                    t0Var3.x(3);
                    long j3 = t0Var3.f58221q - t0Var3.I;
                    if (j3 > 0 && !t0Var3.D) {
                        t0Var3.f58213i.postDelayed(t0Var3.X, j3);
                        return;
                    }
                    t0Var3.D = false;
                    t0Var3.q();
                    return;
                }
                return;
            default:
                t0 t0Var4 = this.f58006b;
                t0Var4.E = false;
                o oVar2 = t0Var4.f58217m;
                oVar2.b("recording segment stopped: state=" + rf.b.u(t0Var4.f58206a0) + ", retainedDurationMs=" + t0Var4.I);
                if (t0Var4.C) {
                    t0Var4.C = false;
                    t0Var4.i();
                    return;
                } else if (t0Var4.A) {
                    t0Var4.A = false;
                    boolean z9 = t0Var4.B;
                    t0Var4.f58214j.execute(new xn(t0Var4, t0Var4.U, z9, t0Var4.T, 18));
                    return;
                } else if (t0Var4.f58206a0 == 4) {
                    try {
                        File d = t0Var4.d("round_video_preview_");
                        t0Var4.V = d;
                        t0Var4.N = System.nanoTime();
                        o oVar3 = t0Var4.f58217m;
                        oVar3.b("preview snapshot started: file=" + d.getName());
                        t0Var4.f58214j.execute(new r31(t0Var4, t0Var4.U, d, 25));
                        return;
                    } catch (IOException e10) {
                        t0Var4.h(e10);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
