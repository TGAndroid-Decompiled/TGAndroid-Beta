package si;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.y01;
import org.telegram.ui.Components.z01;
public final class g0 implements Runnable {
    public final int f46596a = 1;
    public final s0 f46597b;
    public final o0 f46598c;
    public final long d;
    public final File e;
    public final boolean f46599f;

    public g0(s0 s0Var, o0 o0Var, long j10, File file, boolean z10) {
        this.f46597b = s0Var;
        this.f46598c = o0Var;
        this.d = j10;
        this.e = file;
        this.f46599f = z10;
    }

    private final void a() {
        s0 s0Var = this.f46597b;
        o0 o0Var = this.f46598c;
        File file = this.e;
        long j10 = this.d;
        boolean z10 = this.f46599f;
        synchronized (s0Var.f46759g) {
            if (!s0Var.D && !o0Var.d && !o0Var.e) {
                o0Var.e = true;
                ((z01) s0Var.e).b(o0Var.f46737a, file.length(), file);
                s0Var.f46760i.post(new g0(s0Var, o0Var, j10, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        y01 y01Var;
        y01 y01Var2;
        switch (this.f46596a) {
            case 0:
                a();
                return;
            default:
                s0 s0Var = this.f46597b;
                o0 o0Var = this.f46598c;
                long j10 = this.d;
                File file = this.e;
                boolean z10 = this.f46599f;
                int i10 = s0Var.W;
                if (i10 != 10 && i10 != 9) {
                    s0Var.v(8);
                    s0Var.f46764m.b("output completed: generation=" + o0Var.f46737a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                    s0Var.m("completed");
                    l2.f fVar = s0Var.d;
                    long j11 = o0Var.f46737a;
                    l60 l60Var = (l60) fVar.f15845b;
                    k60 k60Var = l60Var.V;
                    if (k60Var != null) {
                        l60Var.V = null;
                        l60Var.f28100j0 = true;
                        z01 z01Var = l60Var.T;
                        if (z01Var == null) {
                            y01Var2 = null;
                        } else {
                            synchronized (z01Var) {
                                x01 x01Var = (x01) z01Var.f32803c.get(Long.valueOf(j11));
                                if (x01Var != null && !x01Var.e) {
                                    y01Var = new y01(Math.max(x01Var.f32248c, file.length()), x01Var.f32249f, x01Var.f32250g, x01Var.h, x01Var.f32251i);
                                }
                                y01Var = new y01(file.length(), null, null, null, null);
                            }
                            y01Var2 = y01Var;
                        }
                        VideoEditedInfo r10 = l60Var.r(file, j10, y01Var2);
                        r10.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = k60Var.f27725c;
                        photoEntry.effectId = k60Var.d;
                        l60Var.f28095f.s(photoEntry, r10, k60Var.f27723a, k60Var.f27724b, 0, false, k60Var.e);
                        z01 z01Var2 = l60Var.T;
                        if (z01Var2 != null) {
                            z01Var2.d(false);
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
        this.f46597b = s0Var;
        this.f46598c = o0Var;
        this.e = file;
        this.d = j10;
        this.f46599f = z10;
    }
}
