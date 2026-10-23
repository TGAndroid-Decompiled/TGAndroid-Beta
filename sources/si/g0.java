package si;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.m60;
public final class g0 implements Runnable {
    public final int f47039a = 1;
    public final u0 f47040b;
    public final q0 f47041c;
    public final long d;
    public final File e;
    public final boolean f47042f;

    public g0(u0 u0Var, q0 q0Var, long j10, File file, boolean z10) {
        this.f47040b = u0Var;
        this.f47041c = q0Var;
        this.d = j10;
        this.e = file;
        this.f47042f = z10;
    }

    private final void a() {
        u0 u0Var = this.f47040b;
        q0 q0Var = this.f47041c;
        File file = this.e;
        long j10 = this.d;
        boolean z10 = this.f47042f;
        synchronized (u0Var.f47253g) {
            if (!u0Var.D && !q0Var.d && !q0Var.e) {
                q0Var.e = true;
                ((d11) u0Var.e).b(q0Var.f47189a, file.length(), file);
                u0Var.f47254i.post(new g0(u0Var, q0Var, j10, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        c11 c11Var;
        c11 c11Var2;
        switch (this.f47039a) {
            case 0:
                a();
                return;
            default:
                u0 u0Var = this.f47040b;
                q0 q0Var = this.f47041c;
                long j10 = this.d;
                File file = this.e;
                boolean z10 = this.f47042f;
                int i10 = u0Var.W;
                if (i10 != 10 && i10 != 9) {
                    u0Var.v(8);
                    u0Var.f47258m.b("output completed: generation=" + q0Var.f47189a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                    u0Var.m("completed");
                    l2.f fVar = u0Var.d;
                    long j11 = q0Var.f47189a;
                    m60 m60Var = (m60) fVar.f15906b;
                    l60 l60Var = m60Var.V;
                    if (l60Var != null) {
                        m60Var.V = null;
                        m60Var.f28531j0 = true;
                        d11 d11Var = m60Var.T;
                        if (d11Var == null) {
                            c11Var2 = null;
                        } else {
                            synchronized (d11Var) {
                                b11 b11Var = (b11) d11Var.f25485c.get(Long.valueOf(j11));
                                if (b11Var != null && !b11Var.e) {
                                    c11Var = new c11(Math.max(b11Var.f24928c, file.length()), b11Var.f24929f, b11Var.f24930g, b11Var.h, b11Var.f24931i);
                                }
                                c11Var = new c11(file.length(), null, null, null, null);
                            }
                            c11Var2 = c11Var;
                        }
                        VideoEditedInfo r10 = m60Var.r(file, j10, c11Var2);
                        r10.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = l60Var.f28233c;
                        photoEntry.effectId = l60Var.d;
                        m60Var.f28526f.s(photoEntry, r10, l60Var.f28231a, l60Var.f28232b, 0, false, l60Var.e);
                        d11 d11Var2 = m60Var.T;
                        if (d11Var2 != null) {
                            d11Var2.d(false);
                        }
                        m60Var.T = null;
                        MediaController.getInstance().requestRecordAudioFocus(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public g0(u0 u0Var, q0 q0Var, File file, long j10, boolean z10) {
        this.f47040b = u0Var;
        this.f47041c = q0Var;
        this.e = file;
        this.d = j10;
        this.f47042f = z10;
    }
}
