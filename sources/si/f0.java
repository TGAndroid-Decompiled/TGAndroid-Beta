package si;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.p81;
import org.telegram.ui.Components.q60;
import org.telegram.ui.hk;
import org.telegram.ui.re;
public final class f0 implements Runnable {
    public final int f46639a;
    public final s0 f46640b;
    public final long f46641c;

    public f0(s0 s0Var, long j10, int i10) {
        this.f46639a = i10;
        this.f46640b = s0Var;
        this.f46641c = j10;
    }

    @Override
    public final void run() {
        File file;
        long j10;
        long j11;
        hk hkVar;
        p81 p81Var;
        switch (this.f46639a) {
            case 0:
                s0 s0Var = this.f46640b;
                long j12 = this.f46641c;
                if (s0Var.W == 6) {
                    s0Var.E = j12;
                    s0Var.K = 0L;
                    s0Var.G = 0L;
                    s0Var.H = j12;
                    s0Var.v(2);
                    s0Var.f46812l.X(s0Var.Q, s0Var.E * 1000, s0Var.f46816p);
                    return;
                }
                return;
            default:
                s0 s0Var2 = this.f46640b;
                long j13 = this.f46641c;
                if (s0Var2.W == 4) {
                    s0Var2.K = j13;
                    long min = Math.min(s0Var2.f46815o, j13);
                    s0Var2.E = min;
                    s0Var2.G = 0L;
                    s0Var2.H = min;
                    s0Var2.f46805b.setSurfaceTextureListener(null);
                    s0Var2.f46805b.setTransform(s0Var2.h);
                    i2.h0 a2 = new i2.o(s0Var2.f46804a).a();
                    s0Var2.S = a2;
                    a2.z1(s0Var2.f46805b);
                    s0Var2.S.r0(b2.o0.b(Uri.fromFile(s0Var2.R)));
                    s0Var2.S.j(0);
                    s0Var2.S.U(1.0f);
                    s0Var2.S.p0(s0Var2.V);
                    s0Var2.S.b();
                    s0Var2.S.Z0(5, s0Var2.G);
                    s0Var2.f46813m.b("preview player prepared: durationMs=" + s0Var2.E + ", trim=" + s0Var2.G + ".." + s0Var2.H);
                    s0Var2.v(5);
                    l2.f fVar = s0Var2.d;
                    long j14 = s0Var2.E;
                    long j15 = s0Var2.G;
                    long j16 = s0Var2.H;
                    ((l60) fVar.f15844b).f28112w.setProgress(((float) j14) / 60000.0f);
                    l60 l60Var = (l60) fVar.f15844b;
                    l60Var.f28096i0 = false;
                    l60Var.I.setAlpha(0.0f);
                    s0 s0Var3 = ((l60) fVar.f15844b).P;
                    if (s0Var3 == null) {
                        file = null;
                    } else {
                        s0.t();
                        file = s0Var3.R;
                    }
                    if (file != null) {
                        l60 l60Var2 = (l60) fVar.f15844b;
                        l60Var2.U = l60Var2.r(file, j14, null);
                        l60 l60Var3 = (l60) fVar.f15844b;
                        VideoEditedInfo videoEditedInfo = l60Var3.U;
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
                        NotificationCenter.getInstance(l60Var3.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(((l60) fVar.f15844b).f28100n), ((l60) fVar.f15844b).U, file.getAbsolutePath(), new ArrayList());
                        float max = (float) Math.max(1L, j14);
                        float f7 = ((float) j15) / max;
                        float f10 = ((float) j16) / max;
                        q60 q60Var = ((l60) fVar.f15844b).f29860b;
                        if (q60Var != null && (hkVar = ((re) q60Var).f40734b.Y) != null && (p81Var = hkVar.f23946f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            p81Var.f29237b = max2;
                            p81Var.f29238c = Math.max(max2, Math.min(1.0f, f10));
                            p81Var.invalidate();
                        }
                    }
                    s0Var2.q();
                    return;
                }
                return;
        }
    }
}
