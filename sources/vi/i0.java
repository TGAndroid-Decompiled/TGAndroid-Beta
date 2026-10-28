package vi;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.oy0;
public final class i0 implements Runnable {
    public final int f50437a;
    public final u0 f50438b;

    public i0(u0 u0Var, int i10) {
        this.f50437a = i10;
        this.f50438b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f50437a) {
            case 0:
                u0 u0Var = this.f50438b;
                if (u0Var.Z == 3) {
                    u0Var.q();
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f50438b;
                w wVar = u0Var2.T;
                File file = u0Var2.U;
                if (wVar != null) {
                    try {
                        synchronized (wVar) {
                            wVar.f50680w = true;
                            try {
                                wVar.g();
                            } finally {
                                wVar.f50680w = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    w7.x.c(wVar.f50662a);
                }
                if (file != null) {
                    w7.x.c(file);
                    return;
                }
                return;
            case 2:
                u0 u0Var3 = this.f50438b;
                int i10 = u0Var3.Z;
                if (i10 == 2 || i10 == 6) {
                    u0Var3.I = SystemClock.elapsedRealtime();
                    n nVar = u0Var3.f50643m;
                    nVar.b("recording started: retainedDurationMs=" + u0Var3.H);
                    u0Var3.w(3);
                    long j10 = u0Var3.f50647q - u0Var3.H;
                    if (j10 > 0 && !u0Var3.D) {
                        u0Var3.f50639i.postDelayed(u0Var3.W, j10);
                        return;
                    }
                    u0Var3.D = false;
                    u0Var3.q();
                    return;
                }
                return;
            default:
                u0 u0Var4 = this.f50438b;
                u0Var4.E = false;
                n nVar2 = u0Var4.f50643m;
                nVar2.b("recording segment stopped: state=" + b10.x(u0Var4.Z) + ", retainedDurationMs=" + u0Var4.H);
                if (u0Var4.C) {
                    u0Var4.C = false;
                    u0Var4.i();
                    return;
                } else if (u0Var4.A) {
                    u0Var4.A = false;
                    boolean z10 = u0Var4.B;
                    u0Var4.f50640j.execute(new vg.c(u0Var4, u0Var4.T, z10, u0Var4.S));
                    return;
                } else if (u0Var4.Z == 4) {
                    try {
                        File d = u0Var4.d("round_video_preview_");
                        u0Var4.U = d;
                        u0Var4.M = System.nanoTime();
                        n nVar3 = u0Var4.f50643m;
                        nVar3.b("preview snapshot started: file=" + d.getName());
                        u0Var4.f50640j.execute(new oy0(u0Var4, u0Var4.T, d, 25));
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
