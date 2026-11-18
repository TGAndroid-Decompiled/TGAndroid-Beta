package zi;

import android.os.SystemClock;
import c8.oe;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.yn;
public final class i0 implements Runnable {
    public final int f62108a;
    public final u0 f62109b;

    public i0(u0 u0Var, int i7) {
        this.f62108a = i7;
        this.f62109b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f62108a) {
            case 0:
                u0 u0Var = this.f62109b;
                if (u0Var.f62310a0 == 3) {
                    u0Var.q();
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f62109b;
                x xVar = u0Var2.U;
                File file = u0Var2.V;
                if (xVar != null) {
                    try {
                        synchronized (xVar) {
                            xVar.f62375w = true;
                            try {
                                xVar.g();
                            } finally {
                                xVar.f62375w = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    oe.c(xVar.f62356a);
                }
                if (file != null) {
                    oe.c(file);
                    return;
                }
                return;
            case 2:
                u0 u0Var3 = this.f62109b;
                int i7 = u0Var3.f62310a0;
                if (i7 == 2 || i7 == 6) {
                    u0Var3.J = SystemClock.elapsedRealtime();
                    o oVar = u0Var3.f62321m;
                    oVar.b("recording started: retainedDurationMs=" + u0Var3.I);
                    u0Var3.x(3);
                    long j3 = u0Var3.f62325q - u0Var3.I;
                    if (j3 > 0 && !u0Var3.D) {
                        u0Var3.f62317i.postDelayed(u0Var3.X, j3);
                        return;
                    }
                    u0Var3.D = false;
                    u0Var3.q();
                    return;
                }
                return;
            default:
                u0 u0Var4 = this.f62109b;
                u0Var4.E = false;
                o oVar2 = u0Var4.f62321m;
                oVar2.b("recording segment stopped: state=" + yi.i.e(u0Var4.f62310a0) + ", retainedDurationMs=" + u0Var4.I);
                if (u0Var4.C) {
                    u0Var4.C = false;
                    u0Var4.i();
                    return;
                } else if (u0Var4.A) {
                    u0Var4.A = false;
                    boolean z10 = u0Var4.B;
                    u0Var4.f62318j.execute(new yn(u0Var4, u0Var4.U, z10, u0Var4.T, 18));
                    return;
                } else if (u0Var4.f62310a0 == 4) {
                    try {
                        File d = u0Var4.d("round_video_preview_");
                        u0Var4.V = d;
                        u0Var4.N = System.nanoTime();
                        o oVar3 = u0Var4.f62321m;
                        oVar3.b("preview snapshot started: file=" + d.getName());
                        u0Var4.f62318j.execute(new wg.q(u0Var4, u0Var4.U, d, 7));
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
