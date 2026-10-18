package si;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Components.ay0;
import w7.p7;
public final class i0 implements Runnable {
    public final int f46657a;
    public final s0 f46658b;

    public i0(s0 s0Var, int i10) {
        this.f46657a = i10;
        this.f46658b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f46657a) {
            case 0:
                s0 s0Var = this.f46658b;
                if (s0Var.W == 3) {
                    s0Var.p();
                    return;
                }
                return;
            case 1:
                s0 s0Var2 = this.f46658b;
                x xVar = s0Var2.Q;
                File file = s0Var2.R;
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
                    p7.c(xVar.f46880a);
                }
                if (file != null) {
                    p7.c(file);
                    return;
                }
                return;
            case 2:
                s0 s0Var3 = this.f46658b;
                int i10 = s0Var3.W;
                if (i10 == 2 || i10 == 6) {
                    s0Var3.F = SystemClock.elapsedRealtime();
                    o oVar = s0Var3.f46813m;
                    oVar.b("recording started: retainedDurationMs=" + s0Var3.E);
                    s0Var3.v(3);
                    long j10 = s0Var3.f46815o - s0Var3.E;
                    if (j10 <= 0) {
                        s0Var3.p();
                        return;
                    } else {
                        s0Var3.f46809i.postDelayed(s0Var3.T, j10);
                        return;
                    }
                }
                return;
            default:
                s0 s0Var4 = this.f46658b;
                s0Var4.B = false;
                o oVar2 = s0Var4.f46813m;
                oVar2.b("recording segment stopped: state=" + r4.c.w(s0Var4.W) + ", retainedDurationMs=" + s0Var4.E);
                if (s0Var4.A) {
                    s0Var4.A = false;
                    s0Var4.i();
                    return;
                } else if (s0Var4.f46824y) {
                    s0Var4.f46824y = false;
                    boolean z10 = s0Var4.f46825z;
                    s0Var4.f46810j.execute(new ug.c(s0Var4, s0Var4.Q, z10, s0Var4.P));
                    return;
                } else if (s0Var4.W == 4) {
                    try {
                        File d = s0Var4.d("round_video_preview_");
                        s0Var4.R = d;
                        s0Var4.J = System.nanoTime();
                        o oVar3 = s0Var4.f46813m;
                        oVar3.b("preview snapshot started: file=" + d.getName());
                        s0Var4.f46810j.execute(new ay0(s0Var4, s0Var4.Q, d, 21));
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
