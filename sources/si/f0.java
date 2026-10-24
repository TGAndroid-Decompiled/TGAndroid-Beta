package si;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.y81;
import org.telegram.ui.gk;
import org.telegram.ui.pe;
public final class f0 implements Runnable {
    public final int f47034a;
    public final u0 f47035b;
    public final long f47036c;

    public f0(u0 u0Var, long j10, int i10) {
        this.f47034a = i10;
        this.f47035b = u0Var;
        this.f47036c = j10;
    }

    @Override
    public final void run() {
        File file;
        long j10;
        long j11;
        gk gkVar;
        y81 y81Var;
        switch (this.f47034a) {
            case 0:
                u0 u0Var = this.f47035b;
                long j12 = this.f47036c;
                if (u0Var.W == 6) {
                    u0Var.E = j12;
                    u0Var.K = 0L;
                    u0Var.G = 0L;
                    u0Var.H = j12;
                    u0Var.v(2);
                    u0Var.f47256l.X(u0Var.Q, u0Var.E * 1000, u0Var.f47260p);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f47035b;
                long j13 = this.f47036c;
                if (u0Var2.W == 4) {
                    u0Var2.K = j13;
                    long min = Math.min(u0Var2.f47259o, j13);
                    u0Var2.E = min;
                    u0Var2.G = 0L;
                    u0Var2.H = min;
                    u0Var2.f47249b.setSurfaceTextureListener(null);
                    u0Var2.f47249b.setTransform(u0Var2.h);
                    i2.h0 a2 = new i2.o(u0Var2.f47248a).a();
                    u0Var2.S = a2;
                    a2.z1(u0Var2.f47249b);
                    u0Var2.S.r0(b2.o0.b(Uri.fromFile(u0Var2.R)));
                    u0Var2.S.j(0);
                    u0Var2.S.U(1.0f);
                    u0Var2.S.p0(u0Var2.V);
                    u0Var2.S.b();
                    u0Var2.S.Z0(5, u0Var2.G);
                    u0Var2.f47257m.b("preview player prepared: durationMs=" + u0Var2.E + ", trim=" + u0Var2.G + ".." + u0Var2.H);
                    u0Var2.v(5);
                    l2.f fVar = u0Var2.d;
                    long j14 = u0Var2.E;
                    long j15 = u0Var2.G;
                    long j16 = u0Var2.H;
                    ((k60) fVar.f15906b).f27900w.setProgress(((float) j14) / 60000.0f);
                    k60 k60Var = (k60) fVar.f15906b;
                    k60Var.f27884i0 = false;
                    k60Var.I.setAlpha(0.0f);
                    u0 u0Var3 = ((k60) fVar.f15906b).P;
                    if (u0Var3 == null) {
                        file = null;
                    } else {
                        u0.t();
                        file = u0Var3.R;
                    }
                    if (file != null) {
                        k60 k60Var2 = (k60) fVar.f15906b;
                        k60Var2.U = k60Var2.r(file, j14, null);
                        k60 k60Var3 = (k60) fVar.f15906b;
                        VideoEditedInfo videoEditedInfo = k60Var3.U;
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
                        NotificationCenter.getInstance(k60Var3.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(((k60) fVar.f15906b).f27888n), ((k60) fVar.f15906b).U, file.getAbsolutePath(), new ArrayList());
                        float max = (float) Math.max(1L, j14);
                        float f7 = ((float) j15) / max;
                        float f10 = ((float) j16) / max;
                        p60 p60Var = ((k60) fVar.f15906b).f29811b;
                        if (p60Var != null && (gkVar = ((pe) p60Var).f40517b.Y) != null && (y81Var = gkVar.f24086f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            y81Var.f32849b = max2;
                            y81Var.f32850c = Math.max(max2, Math.min(1.0f, f10));
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
