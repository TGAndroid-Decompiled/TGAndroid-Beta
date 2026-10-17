package si;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Components.ay0;
import w7.p7;
public final class j0 implements Runnable {
    public final int f46647a;
    public final t0 f46648b;

    public j0(t0 t0Var, int i10) {
        this.f46647a = i10;
        this.f46648b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f46647a) {
            case 0:
                t0 t0Var = this.f46648b;
                if (t0Var.W == 3) {
                    t0Var.p();
                    return;
                }
                return;
            case 1:
                t0 t0Var2 = this.f46648b;
                x xVar = t0Var2.Q;
                File file = t0Var2.R;
                if (xVar != null) {
                    try {
                        synchronized (xVar) {
                            xVar.v = true;
                            try {
                                xVar.g();
                            } finally {
                                xVar.v = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    p7.c(xVar.f46862a);
                }
                if (file != null) {
                    p7.c(file);
                    return;
                }
                return;
            case 2:
                t0 t0Var3 = this.f46648b;
                int i10 = t0Var3.W;
                if (i10 == 2 || i10 == 6) {
                    t0Var3.F = SystemClock.elapsedRealtime();
                    o oVar = t0Var3.f46795m;
                    oVar.b("recording started: retainedDurationMs=" + t0Var3.E);
                    t0Var3.v(3);
                    long j10 = t0Var3.f46797o - t0Var3.E;
                    if (j10 <= 0) {
                        t0Var3.p();
                        return;
                    } else {
                        t0Var3.f46791i.postDelayed(t0Var3.T, j10);
                        return;
                    }
                }
                return;
            default:
                t0 t0Var4 = this.f46648b;
                t0Var4.B = false;
                o oVar2 = t0Var4.f46795m;
                oVar2.b("recording segment stopped: state=" + r.c.w(t0Var4.W) + ", retainedDurationMs=" + t0Var4.E);
                if (t0Var4.A) {
                    t0Var4.A = false;
                    t0Var4.i();
                    return;
                } else if (t0Var4.f46806y) {
                    t0Var4.f46806y = false;
                    boolean z10 = t0Var4.f46807z;
                    t0Var4.f46792j.execute(new i0(t0Var4, t0Var4.Q, z10, t0Var4.P));
                    return;
                } else if (t0Var4.W == 4) {
                    try {
                        File d = t0Var4.d("round_video_preview_");
                        t0Var4.R = d;
                        t0Var4.J = System.nanoTime();
                        o oVar3 = t0Var4.f46795m;
                        oVar3.b("preview snapshot started: file=" + d.getName());
                        t0Var4.f46792j.execute(new ay0(t0Var4, t0Var4.Q, d, 21));
                        return;
                    } catch (IOException e) {
                        t0Var4.h(e);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
