package zi;

import android.os.SystemClock;
import c8.le;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.wn;
public final class j0 implements Runnable {
    public final int f61544a;
    public final v0 f61545b;

    public j0(v0 v0Var, int i7) {
        this.f61544a = i7;
        this.f61545b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f61544a) {
            case 0:
                v0 v0Var = this.f61545b;
                if (v0Var.f61745a0 == 3) {
                    v0Var.q();
                    return;
                }
                return;
            case 1:
                v0 v0Var2 = this.f61545b;
                y yVar = v0Var2.U;
                File file = v0Var2.V;
                if (yVar != null) {
                    try {
                        synchronized (yVar) {
                            yVar.f61810w = true;
                            try {
                                yVar.g();
                            } finally {
                                yVar.f61810w = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    le.c(yVar.f61791a);
                }
                if (file != null) {
                    le.c(file);
                    return;
                }
                return;
            case 2:
                v0 v0Var3 = this.f61545b;
                int i7 = v0Var3.f61745a0;
                if (i7 == 2 || i7 == 6) {
                    v0Var3.J = SystemClock.elapsedRealtime();
                    p pVar = v0Var3.f61756m;
                    pVar.b("recording started: retainedDurationMs=" + v0Var3.I);
                    v0Var3.x(3);
                    long j3 = v0Var3.f61760q - v0Var3.I;
                    if (j3 > 0 && !v0Var3.D) {
                        v0Var3.f61752i.postDelayed(v0Var3.X, j3);
                        return;
                    }
                    v0Var3.D = false;
                    v0Var3.q();
                    return;
                }
                return;
            default:
                v0 v0Var4 = this.f61545b;
                v0Var4.E = false;
                p pVar2 = v0Var4.f61756m;
                pVar2.b("recording segment stopped: state=" + p0.b(v0Var4.f61745a0) + ", retainedDurationMs=" + v0Var4.I);
                if (v0Var4.C) {
                    v0Var4.C = false;
                    v0Var4.i();
                    return;
                } else if (v0Var4.A) {
                    v0Var4.A = false;
                    boolean z10 = v0Var4.B;
                    v0Var4.f61753j.execute(new wn(v0Var4, v0Var4.U, z10, v0Var4.T, 18));
                    return;
                } else if (v0Var4.f61745a0 == 4) {
                    try {
                        File d = v0Var4.d("round_video_preview_");
                        v0Var4.V = d;
                        v0Var4.N = System.nanoTime();
                        p pVar3 = v0Var4.f61756m;
                        pVar3.b("preview snapshot started: file=" + d.getName());
                        v0Var4.f61753j.execute(new yi.d(v0Var4, v0Var4.U, d, 3));
                        return;
                    } catch (IOException e10) {
                        v0Var4.h(e10);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
