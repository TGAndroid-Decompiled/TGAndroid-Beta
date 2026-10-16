package ri;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.y81;
import org.telegram.ui.sk;
import org.telegram.ui.xe;
public final class d0 implements Runnable {
    public final int f44509a;
    public final r0 f44510b;
    public final long f44511c;

    public d0(r0 r0Var, long j10, int i10) {
        this.f44509a = i10;
        this.f44510b = r0Var;
        this.f44511c = j10;
    }

    @Override
    public final void run() {
        File file;
        long j10;
        long j11;
        sk skVar;
        y81 y81Var;
        switch (this.f44509a) {
            case 0:
                r0 r0Var = this.f44510b;
                long j12 = this.f44511c;
                if (r0Var.W == 6) {
                    r0Var.E = j12;
                    r0Var.K = 0L;
                    r0Var.G = 0L;
                    r0Var.H = j12;
                    r0Var.v(2);
                    r0Var.f44683l.X(r0Var.Q, r0Var.E * 1000, r0Var.f44687p);
                    return;
                }
                return;
            default:
                r0 r0Var2 = this.f44510b;
                long j13 = this.f44511c;
                if (r0Var2.W == 4) {
                    r0Var2.K = j13;
                    long min = Math.min(r0Var2.f44686o, j13);
                    r0Var2.E = min;
                    r0Var2.G = 0L;
                    r0Var2.H = min;
                    r0Var2.f44676b.setSurfaceTextureListener(null);
                    r0Var2.f44676b.setTransform(r0Var2.h);
                    i2.h0 a2 = new i2.o(r0Var2.f44675a).a();
                    r0Var2.S = a2;
                    a2.z1(r0Var2.f44676b);
                    r0Var2.S.r0(b2.p0.b(Uri.fromFile(r0Var2.R)));
                    r0Var2.S.j(0);
                    r0Var2.S.U(1.0f);
                    r0Var2.S.p0(r0Var2.V);
                    r0Var2.S.b();
                    r0Var2.S.Z0(5, r0Var2.G);
                    r0Var2.f44684m.b("preview player prepared: durationMs=" + r0Var2.E + ", trim=" + r0Var2.G + ".." + r0Var2.H);
                    r0Var2.v(5);
                    m.h hVar = r0Var2.d;
                    long j14 = r0Var2.E;
                    long j15 = r0Var2.G;
                    long j16 = r0Var2.H;
                    ((o60) hVar.f14848b).f27581w.setProgress(((float) j14) / 60000.0f);
                    o60 o60Var = (o60) hVar.f14848b;
                    o60Var.f27565i0 = false;
                    o60Var.I.setAlpha(0.0f);
                    r0 r0Var3 = ((o60) hVar.f14848b).P;
                    if (r0Var3 == null) {
                        file = null;
                    } else {
                        r0.t();
                        file = r0Var3.R;
                    }
                    if (file != null) {
                        o60 o60Var2 = (o60) hVar.f14848b;
                        o60Var2.U = o60Var2.r(file, j14, null);
                        o60 o60Var3 = (o60) hVar.f14848b;
                        VideoEditedInfo videoEditedInfo = o60Var3.U;
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
                        NotificationCenter.getInstance(o60Var3.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(((o60) hVar.f14848b).f27569n), ((o60) hVar.f14848b).U, file.getAbsolutePath(), new ArrayList());
                        float max = (float) Math.max(1L, j14);
                        float f7 = ((float) j15) / max;
                        float f10 = ((float) j16) / max;
                        t60 t60Var = ((o60) hVar.f14848b).f29259b;
                        if (t60Var != null && (skVar = ((xe) t60Var).f41548b.Y) != null && (y81Var = skVar.f22584f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            y81Var.f31187b = max2;
                            y81Var.f31188c = Math.max(max2, Math.min(1.0f, f10));
                            y81Var.invalidate();
                        }
                    }
                    r0Var2.q();
                    return;
                }
                return;
        }
    }
}
