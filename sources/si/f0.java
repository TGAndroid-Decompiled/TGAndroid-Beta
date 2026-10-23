package si;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.y81;
import org.telegram.ui.gk;
import org.telegram.ui.pe;
public final class f0 implements Runnable {
    public final int f47035a;
    public final u0 f47036b;
    public final long f47037c;

    public f0(u0 u0Var, long j10, int i10) {
        this.f47035a = i10;
        this.f47036b = u0Var;
        this.f47037c = j10;
    }

    @Override
    public final void run() {
        File file;
        long j10;
        long j11;
        gk gkVar;
        y81 y81Var;
        switch (this.f47035a) {
            case 0:
                u0 u0Var = this.f47036b;
                long j12 = this.f47037c;
                if (u0Var.W == 6) {
                    u0Var.E = j12;
                    u0Var.K = 0L;
                    u0Var.G = 0L;
                    u0Var.H = j12;
                    u0Var.v(2);
                    u0Var.f47257l.X(u0Var.Q, u0Var.E * 1000, u0Var.f47261p);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f47036b;
                long j13 = this.f47037c;
                if (u0Var2.W == 4) {
                    u0Var2.K = j13;
                    long min = Math.min(u0Var2.f47260o, j13);
                    u0Var2.E = min;
                    u0Var2.G = 0L;
                    u0Var2.H = min;
                    u0Var2.f47250b.setSurfaceTextureListener(null);
                    u0Var2.f47250b.setTransform(u0Var2.h);
                    i2.h0 a2 = new i2.o(u0Var2.f47249a).a();
                    u0Var2.S = a2;
                    a2.z1(u0Var2.f47250b);
                    u0Var2.S.r0(b2.o0.b(Uri.fromFile(u0Var2.R)));
                    u0Var2.S.j(0);
                    u0Var2.S.U(1.0f);
                    u0Var2.S.p0(u0Var2.V);
                    u0Var2.S.b();
                    u0Var2.S.Z0(5, u0Var2.G);
                    u0Var2.f47258m.b("preview player prepared: durationMs=" + u0Var2.E + ", trim=" + u0Var2.G + ".." + u0Var2.H);
                    u0Var2.v(5);
                    l2.f fVar = u0Var2.d;
                    long j14 = u0Var2.E;
                    long j15 = u0Var2.G;
                    long j16 = u0Var2.H;
                    ((m60) fVar.f15906b).f28546w.setProgress(((float) j14) / 60000.0f);
                    m60 m60Var = (m60) fVar.f15906b;
                    m60Var.f28530i0 = false;
                    m60Var.I.setAlpha(0.0f);
                    u0 u0Var3 = ((m60) fVar.f15906b).P;
                    if (u0Var3 == null) {
                        file = null;
                    } else {
                        u0.t();
                        file = u0Var3.R;
                    }
                    if (file != null) {
                        m60 m60Var2 = (m60) fVar.f15906b;
                        m60Var2.U = m60Var2.r(file, j14, null);
                        m60 m60Var3 = (m60) fVar.f15906b;
                        VideoEditedInfo videoEditedInfo = m60Var3.U;
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
                        NotificationCenter.getInstance(m60Var3.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(((m60) fVar.f15906b).f28534n), ((m60) fVar.f15906b).U, file.getAbsolutePath(), new ArrayList());
                        float max = (float) Math.max(1L, j14);
                        float f7 = ((float) j15) / max;
                        float f10 = ((float) j16) / max;
                        r60 r60Var = ((m60) fVar.f15906b).f30390b;
                        if (r60Var != null && (gkVar = ((pe) r60Var).f40456b.Y) != null && (y81Var = gkVar.f24085f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            y81Var.f32833b = max2;
                            y81Var.f32834c = Math.max(max2, Math.min(1.0f, f10));
                            y81Var.invalidate();
                        }
                    }
                    u0Var2.q();
                    return;
                }
                return;
        }
    }
}
