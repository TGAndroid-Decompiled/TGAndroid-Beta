package si;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.q60;
import org.telegram.ui.Components.q81;
import org.telegram.ui.fk;
import org.telegram.ui.pe;
public final class f0 implements Runnable {
    public final int f46592a;
    public final s0 f46593b;
    public final long f46594c;

    public f0(s0 s0Var, long j10, int i10) {
        this.f46592a = i10;
        this.f46593b = s0Var;
        this.f46594c = j10;
    }

    @Override
    public final void run() {
        File file;
        long j10;
        long j11;
        fk fkVar;
        q81 q81Var;
        switch (this.f46592a) {
            case 0:
                s0 s0Var = this.f46593b;
                long j12 = this.f46594c;
                if (s0Var.W == 6) {
                    s0Var.E = j12;
                    s0Var.K = 0L;
                    s0Var.G = 0L;
                    s0Var.H = j12;
                    s0Var.v(2);
                    s0Var.f46763l.X(s0Var.Q, s0Var.E * 1000, s0Var.f46767p);
                    return;
                }
                return;
            default:
                s0 s0Var2 = this.f46593b;
                long j13 = this.f46594c;
                if (s0Var2.W == 4) {
                    s0Var2.K = j13;
                    long min = Math.min(s0Var2.f46766o, j13);
                    s0Var2.E = min;
                    s0Var2.G = 0L;
                    s0Var2.H = min;
                    s0Var2.f46756b.setSurfaceTextureListener(null);
                    s0Var2.f46756b.setTransform(s0Var2.h);
                    i2.i0 a2 = new i2.p(s0Var2.f46755a).a();
                    s0Var2.S = a2;
                    a2.z1(s0Var2.f46756b);
                    s0Var2.S.r0(b2.o0.b(Uri.fromFile(s0Var2.R)));
                    s0Var2.S.j(0);
                    s0Var2.S.U(1.0f);
                    s0Var2.S.p0(s0Var2.V);
                    s0Var2.S.b();
                    s0Var2.S.Z0(5, s0Var2.G);
                    s0Var2.f46764m.b("preview player prepared: durationMs=" + s0Var2.E + ", trim=" + s0Var2.G + ".." + s0Var2.H);
                    s0Var2.v(5);
                    l2.f fVar = s0Var2.d;
                    long j14 = s0Var2.E;
                    long j15 = s0Var2.G;
                    long j16 = s0Var2.H;
                    ((l60) fVar.f15845b).f28115w.setProgress(((float) j14) / 60000.0f);
                    l60 l60Var = (l60) fVar.f15845b;
                    l60Var.f28099i0 = false;
                    l60Var.I.setAlpha(0.0f);
                    s0 s0Var3 = ((l60) fVar.f15845b).P;
                    if (s0Var3 == null) {
                        file = null;
                    } else {
                        s0.t();
                        file = s0Var3.R;
                    }
                    if (file != null) {
                        l60 l60Var2 = (l60) fVar.f15845b;
                        l60Var2.U = l60Var2.r(file, j14, null);
                        l60 l60Var3 = (l60) fVar.f15845b;
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
                        NotificationCenter.getInstance(l60Var3.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(((l60) fVar.f15845b).f28103n), ((l60) fVar.f15845b).U, file.getAbsolutePath(), new ArrayList());
                        float max = (float) Math.max(1L, j14);
                        float f7 = ((float) j15) / max;
                        float f10 = ((float) j16) / max;
                        q60 q60Var = ((l60) fVar.f15845b).f29864b;
                        if (q60Var != null && (fkVar = ((pe) q60Var).f40202b.Y) != null && (q81Var = fkVar.f23942f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            q81Var.f29550b = max2;
                            q81Var.f29551c = Math.max(max2, Math.min(1.0f, f10));
                            q81Var.invalidate();
                        }
                    }
                    s0Var2.q();
                    return;
                }
                return;
        }
    }
}
