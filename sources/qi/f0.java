package qi;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Cells.c1;
public final class f0 implements Runnable {
    public final int f46691a;
    public final p0 f46692b;

    public f0(p0 p0Var, int i10) {
        this.f46691a = i10;
        this.f46692b = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f46691a) {
            case 0:
                p0 p0Var = this.f46692b;
                if (p0Var.X == 3) {
                    p0Var.r();
                    return;
                }
                return;
            case 1:
                p0 p0Var2 = this.f46692b;
                int i10 = p0Var2.X;
                if (i10 == 2 || i10 == 6) {
                    p0Var2.G = SystemClock.elapsedRealtime();
                    l lVar = p0Var2.f46863n;
                    lVar.b("recording started: retainedDurationMs=" + p0Var2.F);
                    p0Var2.y(3);
                    long j3 = p0Var2.f46865p - p0Var2.F;
                    if (j3 <= 0) {
                        p0Var2.r();
                        return;
                    } else {
                        p0Var2.f46859j.postDelayed(p0Var2.U, j3);
                        return;
                    }
                }
                return;
            default:
                p0 p0Var3 = this.f46692b;
                p0Var3.C = false;
                l lVar2 = p0Var3.f46863n;
                lVar2.b("recording segment stopped: state=" + c1.w(p0Var3.X) + ", retainedDurationMs=" + p0Var3.F);
                if (p0Var3.B) {
                    p0Var3.B = false;
                    p0Var3.k();
                    return;
                } else if (p0Var3.f46874z) {
                    p0Var3.f46874z = false;
                    boolean z10 = p0Var3.A;
                    p0Var3.f46860k.execute(new e0(p0Var3, p0Var3.R, z10, p0Var3.Q));
                    return;
                } else if (p0Var3.X == 4) {
                    try {
                        File d = p0Var3.d("round_video_preview_");
                        p0Var3.S = d;
                        p0Var3.K = System.nanoTime();
                        l lVar3 = p0Var3.f46863n;
                        lVar3.b("preview snapshot started: file=" + d.getName());
                        p0Var3.f46860k.execute(new pi.h(p0Var3, p0Var3.R, d, 3));
                        return;
                    } catch (IOException e7) {
                        p0Var3.j(e7);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
