package ri;

import android.os.SystemClock;
import bi.h4;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Cells.c1;
import w7.m7;
public final class g0 implements Runnable {
    public final int f44524a;
    public final r0 f44525b;

    public g0(r0 r0Var, int i10) {
        this.f44524a = i10;
        this.f44525b = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f44524a) {
            case 0:
                r0 r0Var = this.f44525b;
                if (r0Var.W == 3) {
                    r0Var.p();
                    return;
                }
                return;
            case 1:
                r0 r0Var2 = this.f44525b;
                v vVar = r0Var2.Q;
                File file = r0Var2.R;
                if (vVar != null) {
                    try {
                        synchronized (vVar) {
                            vVar.v = true;
                            vVar.g();
                            vVar.v = false;
                        }
                    } catch (IOException unused) {
                    }
                    m7.c(vVar.f44751a);
                }
                if (file != null) {
                    m7.c(file);
                    return;
                }
                return;
            case 2:
                r0 r0Var3 = this.f44525b;
                int i10 = r0Var3.W;
                if (i10 == 2 || i10 == 6) {
                    r0Var3.F = SystemClock.elapsedRealtime();
                    n nVar = r0Var3.f44684m;
                    nVar.b("recording started: retainedDurationMs=" + r0Var3.E);
                    r0Var3.v(3);
                    long j10 = r0Var3.f44686o - r0Var3.E;
                    if (j10 <= 0) {
                        r0Var3.p();
                        return;
                    } else {
                        r0Var3.f44680i.postDelayed(r0Var3.T, j10);
                        return;
                    }
                }
                return;
            default:
                r0 r0Var4 = this.f44525b;
                r0Var4.B = false;
                n nVar2 = r0Var4.f44684m;
                nVar2.b("recording segment stopped: state=" + c1.y(r0Var4.W) + ", retainedDurationMs=" + r0Var4.E);
                if (r0Var4.A) {
                    r0Var4.A = false;
                    r0Var4.i();
                    return;
                } else if (r0Var4.f44695y) {
                    r0Var4.f44695y = false;
                    boolean z10 = r0Var4.f44696z;
                    r0Var4.f44681j.execute(new h4(r0Var4, r0Var4.Q, z10, r0Var4.P, 29));
                    return;
                } else if (r0Var4.W == 4) {
                    try {
                        File d = r0Var4.d("round_video_preview_");
                        r0Var4.R = d;
                        r0Var4.J = System.nanoTime();
                        n nVar3 = r0Var4.f44684m;
                        nVar3.b("preview snapshot started: file=" + d.getName());
                        r0Var4.f44681j.execute(new pi.g(r0Var4, r0Var4.Q, d, 6));
                        return;
                    } catch (IOException e) {
                        r0Var4.h(e);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
