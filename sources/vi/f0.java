package vi;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import li.e3;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.t60;
import org.telegram.ui.jk;
import org.telegram.ui.qe;
public final class f0 implements Runnable {
    public final int f50413a;
    public final u0 f50414b;
    public final long f50415c;

    public f0(u0 u0Var, long j10, int i10) {
        this.f50413a = i10;
        this.f50414b = u0Var;
        this.f50415c = j10;
    }

    @Override
    public final void run() {
        File file;
        long j10;
        long j11;
        jk jkVar;
        i91 i91Var;
        switch (this.f50413a) {
            case 0:
                u0 u0Var = this.f50414b;
                long j12 = this.f50415c;
                if (u0Var.Z == 6) {
                    u0Var.H = j12;
                    u0Var.N = 0L;
                    u0Var.J = 0L;
                    u0Var.K = j12;
                    u0Var.w(2);
                    u0Var.f50642l.X(u0Var.T, u0Var.H * 1000, u0Var.f50648r);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f50414b;
                long j13 = this.f50415c;
                if (u0Var2.Z == 4) {
                    u0Var2.N = j13;
                    long min = Math.min(u0Var2.f50647q, j13);
                    u0Var2.H = min;
                    u0Var2.J = 0L;
                    u0Var2.K = min;
                    u0Var2.f50635b.setSurfaceTextureListener(null);
                    u0Var2.f50635b.setTransform(u0Var2.h);
                    i2.j0 a2 = new i2.o(u0Var2.f50633a).a();
                    u0Var2.V = a2;
                    a2.z1(u0Var2.f50635b);
                    u0Var2.V.r0(b2.p0.b(Uri.fromFile(u0Var2.U)));
                    u0Var2.V.j(0);
                    u0Var2.V.U(1.0f);
                    u0Var2.V.p0(u0Var2.Y);
                    u0Var2.V.a();
                    u0Var2.V.Z0(5, u0Var2.J);
                    u0Var2.f50643m.b("preview player prepared: durationMs=" + u0Var2.H + ", trim=" + u0Var2.J + ".." + u0Var2.K);
                    u0Var2.w(5);
                    e3 e3Var = u0Var2.d;
                    long j14 = u0Var2.H;
                    long j15 = u0Var2.J;
                    long j16 = u0Var2.K;
                    ((o60) e3Var.f17209b).v.setProgress(((float) j14) / 60000.0f);
                    o60 o60Var = (o60) e3Var.f17209b;
                    o60Var.f31181i0 = false;
                    o60Var.H.setAlpha(0.0f);
                    o60 o60Var2 = (o60) e3Var.f17209b;
                    if (o60Var2.U == null) {
                        u0 u0Var3 = o60Var2.O;
                        if (u0Var3 == null) {
                            file = null;
                        } else {
                            u0.u();
                            file = u0Var3.U;
                        }
                        if (file != null) {
                            o60 o60Var3 = (o60) e3Var.f17209b;
                            o60Var3.T = o60Var3.s(file, j14, null);
                            o60 o60Var4 = (o60) e3Var.f17209b;
                            VideoEditedInfo videoEditedInfo = o60Var4.T;
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
                            NotificationCenter.getInstance(o60Var4.f31177f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(((o60) e3Var.f17209b).h), ((o60) e3Var.f17209b).T, file.getAbsolutePath(), new ArrayList());
                            float max = (float) Math.max(1L, j14);
                            float f7 = ((float) j15) / max;
                            float f10 = ((float) j16) / max;
                            t60 t60Var = ((o60) e3Var.f17209b).f33241b;
                            if (t60Var != null && (jkVar = ((qe) t60Var).f42685b.Y) != null && (i91Var = jkVar.f25880f1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                                i91Var.f29266b = max2;
                                i91Var.f29267c = Math.max(max2, Math.min(1.0f, f10));
                                i91Var.invalidate();
                            }
                        }
                    }
                    u0Var2.r();
                    return;
                }
                return;
        }
    }
}
