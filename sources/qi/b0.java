package qi;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.v60;
import org.telegram.ui.sk;
import org.telegram.ui.ve;
public final class b0 implements Runnable {
    public final int f46670a;
    public final p0 f46671b;
    public final long f46672c;

    public b0(p0 p0Var, long j3, int i10) {
        this.f46670a = i10;
        this.f46671b = p0Var;
        this.f46672c = j3;
    }

    @Override
    public final void run() {
        File file;
        long j3;
        long j10;
        sk skVar;
        g91 g91Var;
        switch (this.f46670a) {
            case 0:
                p0 p0Var = this.f46671b;
                long j11 = this.f46672c;
                if (p0Var.X == 6) {
                    p0Var.F = j11;
                    p0Var.L = 0L;
                    p0Var.H = 0L;
                    p0Var.I = j11;
                    p0Var.y(2);
                    p0Var.f46862m.C(p0Var.R, p0Var.F * 1000, p0Var.f46866q);
                    return;
                }
                return;
            default:
                p0 p0Var2 = this.f46671b;
                long j12 = this.f46672c;
                if (p0Var2.X == 4) {
                    p0Var2.L = j12;
                    long min = Math.min(p0Var2.f46865p, j12);
                    p0Var2.F = min;
                    p0Var2.H = 0L;
                    p0Var2.I = min;
                    p0Var2.f46853b.setSurfaceTextureListener(null);
                    p0Var2.f46853b.setTransform(p0Var2.f46858i);
                    i2.f0 a2 = new i2.p(p0Var2.f46852a).a();
                    p0Var2.T = a2;
                    a2.x1(p0Var2.f46853b);
                    i2.f0 f0Var = p0Var2.T;
                    b2.k0 b10 = b2.k0.b(Uri.fromFile(p0Var2.S));
                    f0Var.getClass();
                    f0Var.I0(e9.i0.z(b10));
                    p0Var2.T.j(0);
                    p0Var2.T.U(1.0f);
                    p0Var2.T.o0(p0Var2.W);
                    p0Var2.T.b();
                    p0Var2.T.W0(5, p0Var2.H);
                    p0Var2.f46863n.b("preview player prepared: durationMs=" + p0Var2.F + ", trim=" + p0Var2.H + ".." + p0Var2.I);
                    p0Var2.y(5);
                    n4.l lVar = p0Var2.d;
                    long j13 = p0Var2.F;
                    long j14 = p0Var2.H;
                    long j15 = p0Var2.I;
                    ((v60) lVar.f16325a).f31437w.setProgress(((float) j13) / 60000.0f);
                    v60 v60Var = (v60) lVar.f16325a;
                    v60Var.f31421i0 = false;
                    v60Var.I.setAlpha(0.0f);
                    p0 p0Var3 = ((v60) lVar.f16325a).P;
                    if (p0Var3 == null) {
                        file = null;
                    } else {
                        p0.v();
                        file = p0Var3.S;
                    }
                    if (file != null) {
                        v60 v60Var2 = (v60) lVar.f16325a;
                        v60Var2.U = v60Var2.r(file, j13, null);
                        v60 v60Var3 = (v60) lVar.f16325a;
                        VideoEditedInfo videoEditedInfo = v60Var3.U;
                        if (j14 > 0) {
                            j3 = j14;
                        } else {
                            j3 = -1;
                        }
                        videoEditedInfo.startTime = j3;
                        if (j15 < j13) {
                            j10 = j15;
                        } else {
                            j10 = -1;
                        }
                        videoEditedInfo.endTime = j10;
                        NotificationCenter.getInstance(v60Var3.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(((v60) lVar.f16325a).f31425n), ((v60) lVar.f16325a).U, file.getAbsolutePath(), new ArrayList());
                        float max = (float) Math.max(1L, j13);
                        float f7 = ((float) j14) / max;
                        float f10 = ((float) j15) / max;
                        a70 a70Var = ((v60) lVar.f16325a).f24577b;
                        if (a70Var != null && (skVar = ((ve) a70Var).f42768b.Y) != null && (g91Var = skVar.f23651f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            g91Var.f26367b = max2;
                            g91Var.f26368c = Math.max(max2, Math.min(1.0f, f10));
                            g91Var.invalidate();
                        }
                    }
                    p0Var2.s();
                    return;
                }
                return;
        }
    }
}
