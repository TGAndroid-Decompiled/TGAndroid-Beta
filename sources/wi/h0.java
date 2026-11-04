package wi;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.rn;
import x7.u5;
public final class h0 implements Runnable {
    public final int f57846a;
    public final t0 f57847b;

    public h0(t0 t0Var, int i3) {
        this.f57846a = i3;
        this.f57847b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f57846a) {
            case 0:
                t0 t0Var = this.f57847b;
                if (t0Var.Z == 3) {
                    t0Var.q();
                    return;
                }
                return;
            case 1:
                t0 t0Var2 = this.f57847b;
                w wVar = t0Var2.T;
                File file = t0Var2.U;
                if (wVar != null) {
                    try {
                        synchronized (wVar) {
                            wVar.f58118w = true;
                            try {
                                wVar.g();
                            } finally {
                                wVar.f58118w = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    u5.c(wVar.f58099a);
                }
                if (file != null) {
                    u5.c(file);
                    return;
                }
                return;
            case 2:
                t0 t0Var3 = this.f57847b;
                int i3 = t0Var3.Z;
                if (i3 == 2 || i3 == 6) {
                    t0Var3.I = SystemClock.elapsedRealtime();
                    n nVar = t0Var3.f58064m;
                    nVar.b("recording started: retainedDurationMs=" + t0Var3.H);
                    t0Var3.w(3);
                    long j10 = t0Var3.f58068q - t0Var3.H;
                    if (j10 > 0 && !t0Var3.D) {
                        t0Var3.f58060i.postDelayed(t0Var3.W, j10);
                        return;
                    }
                    t0Var3.D = false;
                    t0Var3.q();
                    return;
                }
                return;
            default:
                t0 t0Var4 = this.f57847b;
                t0Var4.E = false;
                n nVar2 = t0Var4.f58064m;
                nVar2.b("recording segment stopped: state=" + t4.c.t(t0Var4.Z) + ", retainedDurationMs=" + t0Var4.H);
                if (t0Var4.C) {
                    t0Var4.C = false;
                    t0Var4.i();
                    return;
                } else if (t0Var4.A) {
                    t0Var4.A = false;
                    boolean z10 = t0Var4.B;
                    t0Var4.f58061j.execute(new rn(t0Var4, t0Var4.T, z10, t0Var4.S, 16));
                    return;
                } else if (t0Var4.Z == 4) {
                    try {
                        File d = t0Var4.d("round_video_preview_");
                        t0Var4.U = d;
                        t0Var4.M = System.nanoTime();
                        n nVar3 = t0Var4.f58064m;
                        nVar3.b("preview snapshot started: file=" + d.getName());
                        t0Var4.f58061j.execute(new iv0(t0Var4, t0Var4.T, d, 23));
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
