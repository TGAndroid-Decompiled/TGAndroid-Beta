package vi;

import java.io.File;
import li.e3;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.o60;
public final class g0 implements Runnable {
    public final int f50417a = 1;
    public final u0 f50418b;
    public final q0 f50419c;
    public final long d;
    public final File e;
    public final boolean f50420f;

    public g0(u0 u0Var, q0 q0Var, long j10, File file, boolean z10) {
        this.f50418b = u0Var;
        this.f50419c = q0Var;
        this.d = j10;
        this.e = file;
        this.f50420f = z10;
    }

    private final void a() {
        u0 u0Var = this.f50418b;
        q0 q0Var = this.f50419c;
        File file = this.e;
        long j10 = this.d;
        boolean z10 = this.f50420f;
        synchronized (u0Var.f50638g) {
            if (!u0Var.G && !q0Var.d && !q0Var.e) {
                q0Var.e = true;
                ((m11) u0Var.e).b(q0Var.f50574a, file.length(), file);
                u0Var.f50639i.post(new g0(u0Var, q0Var, j10, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        l11 l11Var;
        l11 l11Var2;
        switch (this.f50417a) {
            case 0:
                a();
                return;
            default:
                u0 u0Var = this.f50418b;
                q0 q0Var = this.f50419c;
                long j10 = this.d;
                File file = this.e;
                boolean z10 = this.f50420f;
                int i10 = u0Var.Z;
                if (i10 != 10 && i10 != 9) {
                    u0Var.w(8);
                    u0Var.f50643m.b("output completed: generation=" + q0Var.f50574a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                    u0Var.m("completed");
                    e3 e3Var = u0Var.d;
                    long j11 = q0Var.f50574a;
                    o60 o60Var = (o60) e3Var.f17209b;
                    n60 n60Var = o60Var.U;
                    if (n60Var != null) {
                        o60Var.U = null;
                        o60Var.f31182j0 = true;
                        m11 m11Var = o60Var.S;
                        if (m11Var == null) {
                            l11Var2 = null;
                        } else {
                            synchronized (m11Var) {
                                k11 k11Var = (k11) m11Var.f30339c.get(Long.valueOf(j11));
                                if (k11Var != null && !k11Var.e) {
                                    l11Var = new l11(Math.max(k11Var.f29824c, file.length()), k11Var.f29825f, k11Var.f29826g, k11Var.h, k11Var.f29827i);
                                }
                                l11Var = new l11(file.length(), null, null, null, null);
                            }
                            l11Var2 = l11Var;
                        }
                        VideoEditedInfo s10 = o60Var.s(file, j10, l11Var2);
                        s10.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = n60Var.f30757c;
                        photoEntry.effectId = n60Var.d;
                        o60Var.e.r(photoEntry, s10, n60Var.f30755a, n60Var.f30756b, 0, false, n60Var.e);
                        m11 m11Var2 = o60Var.S;
                        if (m11Var2 != null) {
                            m11Var2.d(false);
                        }
                        o60Var.S = null;
                        MediaController.getInstance().requestRecordAudioFocus(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public g0(u0 u0Var, q0 q0Var, File file, long j10, boolean z10) {
        this.f50418b = u0Var;
        this.f50419c = q0Var;
        this.e = file;
        this.d = j10;
        this.f50420f = z10;
    }
}
