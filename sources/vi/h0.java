package vi;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ny0;
public final class h0 implements Runnable {
    public final int f50388a;
    public final s0 f50389b;

    public h0(s0 s0Var, int i10) {
        this.f50388a = i10;
        this.f50389b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f50388a) {
            case 0:
                s0 s0Var = this.f50389b;
                if (s0Var.W == 3) {
                    s0Var.p();
                    return;
                }
                return;
            case 1:
                s0 s0Var2 = this.f50389b;
                v vVar = s0Var2.Q;
                File file = s0Var2.R;
                if (vVar != null) {
                    try {
                        synchronized (vVar) {
                            vVar.v = true;
                            try {
                                vVar.g();
                            } finally {
                                vVar.v = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    w7.x.c(vVar.f50611a);
                }
                if (file != null) {
                    w7.x.c(file);
                    return;
                }
                return;
            case 2:
                s0 s0Var3 = this.f50389b;
                int i10 = s0Var3.W;
                if (i10 == 2 || i10 == 6) {
                    s0Var3.F = SystemClock.elapsedRealtime();
                    n nVar = s0Var3.f50589m;
                    nVar.b("recording started: retainedDurationMs=" + s0Var3.E);
                    s0Var3.v(3);
                    long j10 = s0Var3.f50591o - s0Var3.E;
                    if (j10 <= 0) {
                        s0Var3.p();
                        return;
                    } else {
                        s0Var3.f50585i.postDelayed(s0Var3.T, j10);
                        return;
                    }
                }
                return;
            default:
                s0 s0Var4 = this.f50389b;
                s0Var4.B = false;
                n nVar2 = s0Var4.f50589m;
                nVar2.b("recording segment stopped: state=" + b10.x(s0Var4.W) + ", retainedDurationMs=" + s0Var4.E);
                if (s0Var4.A) {
                    s0Var4.A = false;
                    s0Var4.i();
                    return;
                } else if (s0Var4.f50600y) {
                    s0Var4.f50600y = false;
                    boolean z10 = s0Var4.f50601z;
                    s0Var4.f50586j.execute(new vg.c(s0Var4, s0Var4.Q, z10, s0Var4.P));
                    return;
                } else if (s0Var4.W == 4) {
                    try {
                        File d = s0Var4.d("round_video_preview_");
                        s0Var4.R = d;
                        s0Var4.J = System.nanoTime();
                        n nVar3 = s0Var4.f50589m;
                        nVar3.b("preview snapshot started: file=" + d.getName());
                        s0Var4.f50586j.execute(new ny0(s0Var4, s0Var4.Q, d, 25));
                        return;
                    } catch (IOException e) {
                        s0Var4.h(e);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
