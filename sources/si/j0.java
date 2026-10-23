package si;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Components.fy0;
import w7.m7;
public final class j0 implements Runnable {
    public final int f47128a;
    public final u0 f47129b;

    public j0(u0 u0Var, int i10) {
        this.f47128a = i10;
        this.f47129b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f47128a) {
            case 0:
                u0 u0Var = this.f47129b;
                if (u0Var.W == 3) {
                    u0Var.p();
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f47129b;
                w wVar = u0Var2.Q;
                File file = u0Var2.R;
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
                    m7.c(wVar.f47277a);
                }
                if (file != null) {
                    m7.c(file);
                    return;
                }
                return;
            case 2:
                u0 u0Var3 = this.f47129b;
                int i10 = u0Var3.W;
                if (i10 == 2 || i10 == 6) {
                    u0Var3.F = SystemClock.elapsedRealtime();
                    n nVar = u0Var3.f47258m;
                    nVar.b("recording started: retainedDurationMs=" + u0Var3.E);
                    u0Var3.v(3);
                    long j10 = u0Var3.f47260o - u0Var3.E;
                    if (j10 <= 0) {
                        u0Var3.p();
                        return;
                    } else {
                        u0Var3.f47254i.postDelayed(u0Var3.T, j10);
                        return;
                    }
                }
                return;
            default:
                u0 u0Var4 = this.f47129b;
                u0Var4.B = false;
                n nVar2 = u0Var4.f47258m;
                nVar2.b("recording segment stopped: state=" + o0.w(u0Var4.W) + ", retainedDurationMs=" + u0Var4.E);
                if (u0Var4.A) {
                    u0Var4.A = false;
                    u0Var4.i();
                    return;
                } else if (u0Var4.f47269y) {
                    u0Var4.f47269y = false;
                    boolean z10 = u0Var4.f47270z;
                    u0Var4.f47255j.execute(new i0(u0Var4, u0Var4.Q, z10, u0Var4.P));
                    return;
                } else if (u0Var4.W == 4) {
                    try {
                        File d = u0Var4.d("round_video_preview_");
                        u0Var4.R = d;
                        u0Var4.J = System.nanoTime();
                        n nVar3 = u0Var4.f47258m;
                        nVar3.b("preview snapshot started: file=" + d.getName());
                        u0Var4.f47255j.execute(new fy0(u0Var4, u0Var4.Q, d, 21));
                        return;
                    } catch (IOException e) {
                        u0Var4.h(e);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
