package si;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Components.cy0;
import w7.m7;
public final class i0 implements Runnable {
    public final int f46623a;
    public final s0 f46624b;

    public i0(s0 s0Var, int i10) {
        this.f46623a = i10;
        this.f46624b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f46623a) {
            case 0:
                s0 s0Var = this.f46624b;
                if (s0Var.W == 3) {
                    s0Var.p();
                    return;
                }
                return;
            case 1:
                s0 s0Var2 = this.f46624b;
                w wVar = s0Var2.Q;
                File file = s0Var2.R;
                if (wVar != null) {
                    try {
                        synchronized (wVar) {
                            wVar.v = true;
                            try {
                                wVar.g();
                            } finally {
                                wVar.v = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    m7.c(wVar.f46838a);
                }
                if (file != null) {
                    m7.c(file);
                    return;
                }
                return;
            case 2:
                s0 s0Var3 = this.f46624b;
                int i10 = s0Var3.W;
                if (i10 == 2 || i10 == 6) {
                    s0Var3.F = SystemClock.elapsedRealtime();
                    n nVar = s0Var3.f46771m;
                    nVar.b("recording started: retainedDurationMs=" + s0Var3.E);
                    s0Var3.v(3);
                    long j10 = s0Var3.f46773o - s0Var3.E;
                    if (j10 <= 0) {
                        s0Var3.p();
                        return;
                    } else {
                        s0Var3.f46767i.postDelayed(s0Var3.T, j10);
                        return;
                    }
                }
                return;
            default:
                s0 s0Var4 = this.f46624b;
                s0Var4.B = false;
                n nVar2 = s0Var4.f46771m;
                nVar2.b("recording segment stopped: state=" + r4.c.w(s0Var4.W) + ", retainedDurationMs=" + s0Var4.E);
                if (s0Var4.A) {
                    s0Var4.A = false;
                    s0Var4.i();
                    return;
                } else if (s0Var4.f46782y) {
                    s0Var4.f46782y = false;
                    boolean z10 = s0Var4.f46783z;
                    s0Var4.f46768j.execute(new ug.c(s0Var4, s0Var4.Q, z10, s0Var4.P));
                    return;
                } else if (s0Var4.W == 4) {
                    try {
                        File d = s0Var4.d("round_video_preview_");
                        s0Var4.R = d;
                        s0Var4.J = System.nanoTime();
                        n nVar3 = s0Var4.f46771m;
                        nVar3.b("preview snapshot started: file=" + d.getName());
                        s0Var4.f46768j.execute(new cy0(s0Var4, s0Var4.Q, d, 21));
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
