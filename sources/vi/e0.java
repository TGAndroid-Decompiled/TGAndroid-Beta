package vi;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import li.e3;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.s60;
import org.telegram.ui.hk;
import org.telegram.ui.pe;
public final class e0 implements Runnable {
    public final int f50370a;
    public final s0 f50371b;
    public final long f50372c;

    public e0(s0 s0Var, long j10, int i10) {
        this.f50370a = i10;
        this.f50371b = s0Var;
        this.f50372c = j10;
    }

    @Override
    public final void run() {
        File file;
        long j10;
        long j11;
        hk hkVar;
        h91 h91Var;
        switch (this.f50370a) {
            case 0:
                s0 s0Var = this.f50371b;
                long j12 = this.f50372c;
                if (s0Var.W == 6) {
                    s0Var.E = j12;
                    s0Var.K = 0L;
                    s0Var.G = 0L;
                    s0Var.H = j12;
                    s0Var.v(2);
                    s0Var.f50588l.X(s0Var.Q, s0Var.E * 1000, s0Var.f50592p);
                    return;
                }
                return;
            default:
                s0 s0Var2 = this.f50371b;
                long j13 = this.f50372c;
                if (s0Var2.W == 4) {
                    s0Var2.K = j13;
                    long min = Math.min(s0Var2.f50591o, j13);
                    s0Var2.E = min;
                    s0Var2.G = 0L;
                    s0Var2.H = min;
                    s0Var2.f50581b.setSurfaceTextureListener(null);
                    s0Var2.f50581b.setTransform(s0Var2.h);
                    i2.j0 a2 = new i2.o(s0Var2.f50580a).a();
                    s0Var2.S = a2;
                    a2.z1(s0Var2.f50581b);
                    s0Var2.S.r0(b2.p0.b(Uri.fromFile(s0Var2.R)));
                    s0Var2.S.j(0);
                    s0Var2.S.U(1.0f);
                    s0Var2.S.p0(s0Var2.V);
                    s0Var2.S.a();
                    s0Var2.S.Z0(5, s0Var2.G);
                    s0Var2.f50589m.b("preview player prepared: durationMs=" + s0Var2.E + ", trim=" + s0Var2.G + ".." + s0Var2.H);
                    s0Var2.v(5);
                    e3 e3Var = s0Var2.d;
                    long j14 = s0Var2.E;
                    long j15 = s0Var2.G;
                    long j16 = s0Var2.H;
                    ((n60) e3Var.f17210b).f30872w.setProgress(((float) j14) / 60000.0f);
                    n60 n60Var = (n60) e3Var.f17210b;
                    n60Var.f30856i0 = false;
                    n60Var.I.setAlpha(0.0f);
                    s0 s0Var3 = ((n60) e3Var.f17210b).P;
                    if (s0Var3 == null) {
                        file = null;
                    } else {
                        s0.t();
                        file = s0Var3.R;
                    }
                    if (file != null) {
                        n60 n60Var2 = (n60) e3Var.f17210b;
                        n60Var2.U = n60Var2.r(file, j14, null);
                        n60 n60Var3 = (n60) e3Var.f17210b;
                        VideoEditedInfo videoEditedInfo = n60Var3.U;
                        if (j15 > 0) {
                            j10 = j15;
                        } else {
                            j10 = -1;
                        }
                        videoEditedInfo.startTime = j10;
                        if (j16 < j14) {
                            j11 = j16;
                        } else {
                            j11 = -1;
                        }
                        videoEditedInfo.endTime = j11;
                        NotificationCenter.getInstance(n60Var3.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(((n60) e3Var.f17210b).f30860n), ((n60) e3Var.f17210b).U, file.getAbsolutePath(), new ArrayList());
                        float max = (float) Math.max(1L, j14);
                        float f7 = ((float) j15) / max;
                        float f10 = ((float) j16) / max;
                        s60 s60Var = ((n60) e3Var.f17210b).f32864b;
                        if (s60Var != null && (hkVar = ((pe) s60Var).f42479b.Y) != null && (h91Var = hkVar.f25876f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            h91Var.f28879b = max2;
                            h91Var.f28880c = Math.max(max2, Math.min(1.0f, f10));
                            h91Var.invalidate();
                        }
                    }
                    s0Var2.q();
                    return;
                }
                return;
        }
    }
}
