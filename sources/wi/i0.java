package wi;

import android.os.SystemClock;
import c8.jd;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Components.r31;
import org.telegram.ui.vn;
public final class i0 implements Runnable {
    public final int f57898a;
    public final t0 f57899b;

    public i0(t0 t0Var, int i7) {
        this.f57898a = i7;
        this.f57899b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f57898a) {
            case 0:
                t0 t0Var = this.f57899b;
                if (t0Var.Z == 3) {
                    t0Var.q();
                    return;
                }
                return;
            case 1:
                t0 t0Var2 = this.f57899b;
                x xVar = t0Var2.T;
                File file = t0Var2.U;
                if (xVar != null) {
                    try {
                        synchronized (xVar) {
                            xVar.f58162w = true;
                            try {
                                xVar.g();
                            } finally {
                                xVar.f58162w = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    jd.c(xVar.f58143a);
                }
                if (file != null) {
                    jd.c(file);
                    return;
                }
                return;
            case 2:
                t0 t0Var3 = this.f57899b;
                int i7 = t0Var3.Z;
                if (i7 == 2 || i7 == 6) {
                    t0Var3.I = SystemClock.elapsedRealtime();
                    n nVar = t0Var3.f58108m;
                    nVar.b("recording started: retainedDurationMs=" + t0Var3.H);
                    t0Var3.w(3);
                    long j3 = t0Var3.f58112q - t0Var3.H;
                    if (j3 > 0 && !t0Var3.D) {
                        t0Var3.f58104i.postDelayed(t0Var3.W, j3);
                        return;
                    }
                    t0Var3.D = false;
                    t0Var3.q();
                    return;
                }
                return;
            default:
                t0 t0Var4 = this.f57899b;
                t0Var4.E = false;
                n nVar2 = t0Var4.f58108m;
                nVar2.b("recording segment stopped: state=" + rf.b.t(t0Var4.Z) + ", retainedDurationMs=" + t0Var4.H);
                if (t0Var4.C) {
                    t0Var4.C = false;
                    t0Var4.i();
                    return;
                } else if (t0Var4.A) {
                    t0Var4.A = false;
                    boolean z9 = t0Var4.B;
                    t0Var4.f58105j.execute(new vn(t0Var4, t0Var4.T, z9, t0Var4.S, 18));
                    return;
                } else if (t0Var4.Z == 4) {
                    try {
                        File d = t0Var4.d("round_video_preview_");
                        t0Var4.U = d;
                        t0Var4.M = System.nanoTime();
                        n nVar3 = t0Var4.f58108m;
                        nVar3.b("preview snapshot started: file=" + d.getName());
                        t0Var4.f58105j.execute(new r31(t0Var4, t0Var4.T, d, 25));
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
