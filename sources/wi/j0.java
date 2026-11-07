package wi;

import android.os.SystemClock;
import c8.jd;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Components.r31;
import org.telegram.ui.vn;
public final class j0 implements Runnable {
    public final int f57903a;
    public final u0 f57904b;

    public j0(u0 u0Var, int i7) {
        this.f57903a = i7;
        this.f57904b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f57903a) {
            case 0:
                u0 u0Var = this.f57904b;
                if (u0Var.f58103a0 == 3) {
                    u0Var.q();
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f57904b;
                y yVar = u0Var2.U;
                File file = u0Var2.V;
                if (yVar != null) {
                    try {
                        synchronized (yVar) {
                            yVar.f58168w = true;
                            try {
                                yVar.g();
                            } finally {
                                yVar.f58168w = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    jd.c(yVar.f58149a);
                }
                if (file != null) {
                    jd.c(file);
                    return;
                }
                return;
            case 2:
                u0 u0Var3 = this.f57904b;
                int i7 = u0Var3.f58103a0;
                if (i7 == 2 || i7 == 6) {
                    u0Var3.J = SystemClock.elapsedRealtime();
                    o oVar = u0Var3.f58114m;
                    oVar.b("recording started: retainedDurationMs=" + u0Var3.I);
                    u0Var3.x(3);
                    long j3 = u0Var3.f58118q - u0Var3.I;
                    if (j3 > 0 && !u0Var3.D) {
                        u0Var3.f58110i.postDelayed(u0Var3.X, j3);
                        return;
                    }
                    u0Var3.D = false;
                    u0Var3.q();
                    return;
                }
                return;
            default:
                u0 u0Var4 = this.f57904b;
                u0Var4.E = false;
                o oVar2 = u0Var4.f58114m;
                oVar2.b("recording segment stopped: state=" + rf.b.t(u0Var4.f58103a0) + ", retainedDurationMs=" + u0Var4.I);
                if (u0Var4.C) {
                    u0Var4.C = false;
                    u0Var4.i();
                    return;
                } else if (u0Var4.A) {
                    u0Var4.A = false;
                    boolean z9 = u0Var4.B;
                    u0Var4.f58111j.execute(new vn(u0Var4, u0Var4.U, z9, u0Var4.T, 18));
                    return;
                } else if (u0Var4.f58103a0 == 4) {
                    try {
                        File d = u0Var4.d("round_video_preview_");
                        u0Var4.V = d;
                        u0Var4.N = System.nanoTime();
                        o oVar3 = u0Var4.f58114m;
                        oVar3.b("preview snapshot started: file=" + d.getName());
                        u0Var4.f58111j.execute(new r31(u0Var4, u0Var4.U, d, 25));
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
