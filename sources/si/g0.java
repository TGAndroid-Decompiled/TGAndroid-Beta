package si;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.y01;
import org.telegram.ui.Components.z01;
public final class g0 implements Runnable {
    public final int f46606a = 1;
    public final s0 f46607b;
    public final o0 f46608c;
    public final long d;
    public final File e;
    public final boolean f46609f;

    public g0(s0 s0Var, o0 o0Var, long j10, File file, boolean z10) {
        this.f46607b = s0Var;
        this.f46608c = o0Var;
        this.d = j10;
        this.e = file;
        this.f46609f = z10;
    }

    private final void a() {
        s0 s0Var = this.f46607b;
        o0 o0Var = this.f46608c;
        File file = this.e;
        long j10 = this.d;
        boolean z10 = this.f46609f;
        synchronized (s0Var.f46769g) {
            if (!s0Var.D && !o0Var.d && !o0Var.e) {
                o0Var.e = true;
                ((a11) s0Var.e).b(o0Var.f46747a, file.length(), file);
                s0Var.f46770i.post(new g0(s0Var, o0Var, j10, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        z01 z01Var;
        z01 z01Var2;
        switch (this.f46606a) {
            case 0:
                a();
                return;
            default:
                s0 s0Var = this.f46607b;
                o0 o0Var = this.f46608c;
                long j10 = this.d;
                File file = this.e;
                boolean z10 = this.f46609f;
                int i10 = s0Var.W;
                if (i10 != 10 && i10 != 9) {
                    s0Var.v(8);
                    s0Var.f46774m.b("output completed: generation=" + o0Var.f46747a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                    s0Var.m("completed");
                    l2.f fVar = s0Var.d;
                    long j11 = o0Var.f46747a;
                    l60 l60Var = (l60) fVar.f15843b;
                    k60 k60Var = l60Var.V;
                    if (k60Var != null) {
                        l60Var.V = null;
                        l60Var.f28043j0 = true;
                        a11 a11Var = l60Var.T;
                        if (a11Var == null) {
                            z01Var2 = null;
                        } else {
                            synchronized (a11Var) {
                                y01 y01Var = (y01) a11Var.f24464c.get(Long.valueOf(j11));
                                if (y01Var != null && !y01Var.e) {
                                    z01Var = new z01(Math.max(y01Var.f32537c, file.length()), y01Var.f32538f, y01Var.f32539g, y01Var.h, y01Var.f32540i);
                                }
                                z01Var = new z01(file.length(), null, null, null, null);
                            }
                            z01Var2 = z01Var;
                        }
                        VideoEditedInfo r10 = l60Var.r(file, j10, z01Var2);
                        r10.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = k60Var.f27769c;
                        photoEntry.effectId = k60Var.d;
                        l60Var.f28038f.s(photoEntry, r10, k60Var.f27767a, k60Var.f27768b, 0, false, k60Var.e);
                        a11 a11Var2 = l60Var.T;
                        if (a11Var2 != null) {
                            a11Var2.d(false);
                        }
                        l60Var.T = null;
                        MediaController.getInstance().requestRecordAudioFocus(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public g0(s0 s0Var, o0 o0Var, File file, long j10, boolean z10) {
        this.f46607b = s0Var;
        this.f46608c = o0Var;
        this.e = file;
        this.d = j10;
        this.f46609f = z10;
    }
}
