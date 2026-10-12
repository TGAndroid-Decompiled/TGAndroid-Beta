package qi;

import android.os.Handler;
import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.u60;
import org.telegram.ui.Components.v60;
public final class c0 implements Runnable {
    public final int f46684a = 1;
    public final p0 f46685b;
    public final l0 f46686c;
    public final long d;
    public final File f46687e;
    public final boolean f46688f;

    public c0(p0 p0Var, l0 l0Var, long j3, File file, boolean z10) {
        this.f46685b = p0Var;
        this.f46686c = l0Var;
        this.d = j3;
        this.f46687e = file;
        this.f46688f = z10;
    }

    private final void a() {
        Handler handler;
        c0 c0Var;
        p0 p0Var = this.f46685b;
        l0 l0Var = this.f46686c;
        File file = this.f46687e;
        long j3 = this.d;
        boolean z10 = this.f46688f;
        synchronized (p0Var.f46865g) {
            if (!p0Var.E && !l0Var.d && !l0Var.f46810e) {
                l0Var.f46810e = true;
                try {
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    ((m11) p0Var.f46863e).b(l0Var.f46807a, file.length(), file);
                    handler = p0Var.f46867j;
                    c0Var = new c0(p0Var, l0Var, j3, file, z10);
                } catch (Throwable th3) {
                    th = th3;
                    file = file;
                    try {
                        p0Var.f46871n.a("output completion callback failed", th);
                        handler = p0Var.f46867j;
                        c0Var = new c0(p0Var, l0Var, j3, file, z10);
                        handler.post(c0Var);
                    } catch (Throwable th4) {
                        p0Var.f46867j.post(new c0(p0Var, l0Var, j3, file, z10));
                        throw th4;
                    }
                }
                handler.post(c0Var);
            }
        }
    }

    @Override
    public final void run() {
        l11 l11Var;
        l11 l11Var2;
        switch (this.f46684a) {
            case 0:
                a();
                return;
            default:
                p0 p0Var = this.f46685b;
                l0 l0Var = this.f46686c;
                long j3 = this.d;
                File file = this.f46687e;
                boolean z10 = this.f46688f;
                int i10 = p0Var.X;
                if (i10 != 10 && i10 != 9) {
                    p0Var.y(8);
                    p0Var.f46871n.b("output completed: generation=" + l0Var.f46807a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                    p0Var.o("completed");
                    p0Var.w(file);
                    n4.l lVar = p0Var.d;
                    long j10 = l0Var.f46807a;
                    v60 v60Var = (v60) lVar.f16326a;
                    u60 u60Var = v60Var.V;
                    if (u60Var != null) {
                        v60Var.V = null;
                        v60Var.f31422j0 = true;
                        m11 m11Var = v60Var.T;
                        if (m11Var == null) {
                            l11Var2 = null;
                        } else {
                            synchronized (m11Var) {
                                k11 k11Var = (k11) m11Var.f28355c.get(Long.valueOf(j10));
                                if (k11Var != null && !k11Var.f27727e) {
                                    l11Var = new l11(Math.max(k11Var.f27726c, file.length()), k11Var.f27728f, k11Var.f27729g, k11Var.h, k11Var.f27730i);
                                }
                                l11Var = new l11(file.length(), null, null, null, null);
                            }
                            l11Var2 = l11Var;
                        }
                        VideoEditedInfo r10 = v60Var.r(file, j3, l11Var2);
                        r10.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = u60Var.f31062c;
                        photoEntry.effectId = u60Var.d;
                        v60Var.f31417f.r(photoEntry, r10, u60Var.f31060a, u60Var.f31061b, 0, false, u60Var.f31063e);
                        m11 m11Var2 = v60Var.T;
                        if (m11Var2 != null) {
                            m11Var2.d(false);
                        }
                        v60Var.T = null;
                        MediaController.getInstance().requestRecordAudioFocus(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public c0(p0 p0Var, l0 l0Var, File file, long j3, boolean z10) {
        this.f46685b = p0Var;
        this.f46686c = l0Var;
        this.f46687e = file;
        this.d = j3;
        this.f46688f = z10;
    }
}
