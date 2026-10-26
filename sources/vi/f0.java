package vi;

import java.io.File;
import li.e3;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.j11;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.n60;
public final class f0 implements Runnable {
    public final int f50378a = 1;
    public final s0 f50379b;
    public final o0 f50380c;
    public final long d;
    public final File e;
    public final boolean f50381f;

    public f0(s0 s0Var, o0 o0Var, long j10, File file, boolean z10) {
        this.f50379b = s0Var;
        this.f50380c = o0Var;
        this.d = j10;
        this.e = file;
        this.f50381f = z10;
    }

    private final void a() {
        s0 s0Var = this.f50379b;
        o0 o0Var = this.f50380c;
        File file = this.e;
        long j10 = this.d;
        boolean z10 = this.f50381f;
        synchronized (s0Var.f50587g) {
            if (!s0Var.D && !o0Var.d && !o0Var.e) {
                o0Var.e = true;
                ((l11) s0Var.e).b(o0Var.f50522a, file.length(), file);
                s0Var.f50588i.post(new f0(s0Var, o0Var, j10, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        k11 k11Var;
        k11 k11Var2;
        switch (this.f50378a) {
            case 0:
                a();
                return;
            default:
                s0 s0Var = this.f50379b;
                o0 o0Var = this.f50380c;
                long j10 = this.d;
                File file = this.e;
                boolean z10 = this.f50381f;
                int i10 = s0Var.W;
                if (i10 != 10 && i10 != 9) {
                    s0Var.v(8);
                    s0Var.f50592m.b("output completed: generation=" + o0Var.f50522a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                    s0Var.m("completed");
                    e3 e3Var = s0Var.d;
                    long j11 = o0Var.f50522a;
                    n60 n60Var = (n60) e3Var.f17210b;
                    m60 m60Var = n60Var.V;
                    if (m60Var != null) {
                        n60Var.V = null;
                        n60Var.f30859j0 = true;
                        l11 l11Var = n60Var.T;
                        if (l11Var == null) {
                            k11Var2 = null;
                        } else {
                            synchronized (l11Var) {
                                j11 j11Var = (j11) l11Var.f30029c.get(Long.valueOf(j11));
                                if (j11Var != null && !j11Var.e) {
                                    k11Var = new k11(Math.max(j11Var.f29449c, file.length()), j11Var.f29450f, j11Var.f29451g, j11Var.h, j11Var.f29452i);
                                }
                                k11Var = new k11(file.length(), null, null, null, null);
                            }
                            k11Var2 = k11Var;
                        }
                        VideoEditedInfo r6 = n60Var.r(file, j10, k11Var2);
                        r6.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = m60Var.f30411c;
                        photoEntry.effectId = m60Var.d;
                        n60Var.f30854f.r(photoEntry, r6, m60Var.f30409a, m60Var.f30410b, 0, false, m60Var.e);
                        l11 l11Var2 = n60Var.T;
                        if (l11Var2 != null) {
                            l11Var2.d(false);
                        }
                        n60Var.T = null;
                        MediaController.getInstance().requestRecordAudioFocus(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public f0(s0 s0Var, o0 o0Var, File file, long j10, boolean z10) {
        this.f50379b = s0Var;
        this.f50380c = o0Var;
        this.e = file;
        this.d = j10;
        this.f50381f = z10;
    }
}
