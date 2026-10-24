package si;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.k60;
public final class g0 implements Runnable {
    public final int f47038a = 1;
    public final u0 f47039b;
    public final q0 f47040c;
    public final long d;
    public final File e;
    public final boolean f47041f;

    public g0(u0 u0Var, q0 q0Var, long j10, File file, boolean z10) {
        this.f47039b = u0Var;
        this.f47040c = q0Var;
        this.d = j10;
        this.e = file;
        this.f47041f = z10;
    }

    private final void a() {
        u0 u0Var = this.f47039b;
        q0 q0Var = this.f47040c;
        File file = this.e;
        long j10 = this.d;
        boolean z10 = this.f47041f;
        synchronized (u0Var.f47252g) {
            if (!u0Var.D && !q0Var.d && !q0Var.e) {
                q0Var.e = true;
                ((c11) u0Var.e).b(q0Var.f47188a, file.length(), file);
                u0Var.f47253i.post(new g0(u0Var, q0Var, j10, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        b11 b11Var;
        b11 b11Var2;
        switch (this.f47038a) {
            case 0:
                a();
                return;
            default:
                u0 u0Var = this.f47039b;
                q0 q0Var = this.f47040c;
                long j10 = this.d;
                File file = this.e;
                boolean z10 = this.f47041f;
                int i10 = u0Var.W;
                if (i10 != 10 && i10 != 9) {
                    u0Var.v(8);
                    u0Var.f47257m.b("output completed: generation=" + q0Var.f47188a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                    u0Var.m("completed");
                    l2.f fVar = u0Var.d;
                    long j11 = q0Var.f47188a;
                    k60 k60Var = (k60) fVar.f15906b;
                    j60 j60Var = k60Var.V;
                    if (j60Var != null) {
                        k60Var.V = null;
                        k60Var.f27885j0 = true;
                        c11 c11Var = k60Var.T;
                        if (c11Var == null) {
                            b11Var2 = null;
                        } else {
                            synchronized (c11Var) {
                                a11 a11Var = (a11) c11Var.f25155c.get(Long.valueOf(j11));
                                if (a11Var != null && !a11Var.e) {
                                    b11Var = new b11(Math.max(a11Var.f24603c, file.length()), a11Var.f24604f, a11Var.f24605g, a11Var.h, a11Var.f24606i);
                                }
                                b11Var = new b11(file.length(), null, null, null, null);
                            }
                            b11Var2 = b11Var;
                        }
                        VideoEditedInfo r10 = k60Var.r(file, j10, b11Var2);
                        r10.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = j60Var.f27581c;
                        photoEntry.effectId = j60Var.d;
                        k60Var.f27880f.s(photoEntry, r10, j60Var.f27579a, j60Var.f27580b, 0, false, j60Var.e);
                        c11 c11Var2 = k60Var.T;
                        if (c11Var2 != null) {
                            c11Var2.d(false);
                        }
                        k60Var.T = null;
                        MediaController.getInstance().requestRecordAudioFocus(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public g0(u0 u0Var, q0 q0Var, File file, long j10, boolean z10) {
        this.f47039b = u0Var;
        this.f47040c = q0Var;
        this.e = file;
        this.d = j10;
        this.f47041f = z10;
    }
}
