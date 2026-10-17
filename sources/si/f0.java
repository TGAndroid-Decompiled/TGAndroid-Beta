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
    public final int f46618a;
    public final t0 f46619b;
    public final long f46620c;

    public f0(t0 t0Var, long j10, int i10) {
        this.f46618a = i10;
        this.f46619b = t0Var;
        this.f46620c = j10;
    }

    @Override
    public final void run() {
        File file;
        long j10;
        long j11;
        hk hkVar;
        p81 p81Var;
        switch (this.f46618a) {
            case 0:
                t0 t0Var = this.f46619b;
                long j12 = this.f46620c;
                if (t0Var.W == 6) {
                    t0Var.E = j12;
                    t0Var.K = 0L;
                    t0Var.G = 0L;
                    t0Var.H = j12;
                    t0Var.v(2);
                    t0Var.f46794l.X(t0Var.Q, t0Var.E * 1000, t0Var.f46798p);
                    return;
                }
                return;
            default:
                t0 t0Var2 = this.f46619b;
                long j13 = this.f46620c;
                if (t0Var2.W == 4) {
                    t0Var2.K = j13;
                    long min = Math.min(t0Var2.f46797o, j13);
                    t0Var2.E = min;
                    t0Var2.G = 0L;
                    t0Var2.H = min;
                    t0Var2.f46787b.setSurfaceTextureListener(null);
                    t0Var2.f46787b.setTransform(t0Var2.h);
                    i2.g0 a2 = new i2.n(t0Var2.f46786a).a();
                    t0Var2.S = a2;
                    a2.z1(t0Var2.f46787b);
                    t0Var2.S.r0(b2.o0.b(Uri.fromFile(t0Var2.R)));
                    t0Var2.S.j(0);
                    t0Var2.S.U(1.0f);
                    t0Var2.S.p0(t0Var2.V);
                    t0Var2.S.b();
                    t0Var2.S.Z0(5, t0Var2.G);
                    t0Var2.f46795m.b("preview player prepared: durationMs=" + t0Var2.E + ", trim=" + t0Var2.G + ".." + t0Var2.H);
                    t0Var2.v(5);
                    l2.f fVar = t0Var2.d;
                    long j14 = t0Var2.E;
                    long j15 = t0Var2.G;
                    long j16 = t0Var2.H;
                    ((l60) fVar.f15837b).f28105w.setProgress(((float) j14) / 60000.0f);
                    l60 l60Var = (l60) fVar.f15837b;
                    l60Var.f28089i0 = false;
                    l60Var.I.setAlpha(0.0f);
                    t0 t0Var3 = ((l60) fVar.f15837b).P;
                    if (t0Var3 == null) {
                        file = null;
                    } else {
                        t0.t();
                        file = t0Var3.R;
                    }
                    if (file != null) {
                        l60 l60Var2 = (l60) fVar.f15837b;
                        l60Var2.U = l60Var2.r(file, j14, null);
                        l60 l60Var3 = (l60) fVar.f15837b;
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
                        NotificationCenter.getInstance(l60Var3.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(((l60) fVar.f15837b).f28093n), ((l60) fVar.f15837b).U, file.getAbsolutePath(), new ArrayList());
                        float max = (float) Math.max(1L, j14);
                        float f7 = ((float) j15) / max;
                        float f10 = ((float) j16) / max;
                        q60 q60Var = ((l60) fVar.f15837b).f29852b;
                        if (q60Var != null && (hkVar = ((re) q60Var).f40709b.Y) != null && (p81Var = hkVar.f23939f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            p81Var.f29230b = max2;
                            p81Var.f29231c = Math.max(max2, Math.min(1.0f, f10));
                            p81Var.invalidate();
                        }
                    }
                    t0Var2.q();
                    return;
                }
                return;
        }
    }
}
