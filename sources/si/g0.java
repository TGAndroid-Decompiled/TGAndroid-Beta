package si;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.y01;
public final class g0 implements Runnable {
    public final int f46623a = 1;
    public final t0 f46624b;
    public final p0 f46625c;
    public final long d;
    public final File e;
    public final boolean f46626f;

    public g0(t0 t0Var, p0 p0Var, long j10, File file, boolean z10) {
        this.f46624b = t0Var;
        this.f46625c = p0Var;
        this.d = j10;
        this.e = file;
        this.f46626f = z10;
    }

    private final void a() {
        t0 t0Var = this.f46624b;
        p0 p0Var = this.f46625c;
        File file = this.e;
        long j10 = this.d;
        boolean z10 = this.f46626f;
        synchronized (t0Var.f46790g) {
            if (!t0Var.D && !p0Var.d && !p0Var.e) {
                p0Var.e = true;
                ((y01) t0Var.e).b(p0Var.f46768a, file.length(), file);
                t0Var.f46791i.post(new g0(t0Var, p0Var, j10, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        x01 x01Var;
        x01 x01Var2;
        switch (this.f46623a) {
            case 0:
                a();
                return;
            default:
                t0 t0Var = this.f46624b;
                p0 p0Var = this.f46625c;
                long j10 = this.d;
                File file = this.e;
                boolean z10 = this.f46626f;
                int i10 = t0Var.W;
                if (i10 != 10 && i10 != 9) {
                    t0Var.v(8);
                    t0Var.f46795m.b("output completed: generation=" + p0Var.f46768a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                    t0Var.m("completed");
                    l2.f fVar = t0Var.d;
                    long j11 = p0Var.f46768a;
                    l60 l60Var = (l60) fVar.f15837b;
                    k60 k60Var = l60Var.V;
                    if (k60Var != null) {
                        l60Var.V = null;
                        l60Var.f28090j0 = true;
                        y01 y01Var = l60Var.T;
                        if (y01Var == null) {
                            x01Var2 = null;
                        } else {
                            synchronized (y01Var) {
                                w01 w01Var = (w01) y01Var.f32506c.get(Long.valueOf(j11));
                                if (w01Var != null && !w01Var.e) {
                                    x01Var = new x01(Math.max(w01Var.f31960c, file.length()), w01Var.f31961f, w01Var.f31962g, w01Var.h, w01Var.f31963i);
                                }
                                x01Var = new x01(file.length(), null, null, null, null);
                            }
                            x01Var2 = x01Var;
                        }
                        VideoEditedInfo r10 = l60Var.r(file, j10, x01Var2);
                        r10.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = k60Var.f27757c;
                        photoEntry.effectId = k60Var.d;
                        l60Var.f28085f.r(photoEntry, r10, k60Var.f27755a, k60Var.f27756b, 0, false, k60Var.e);
                        y01 y01Var2 = l60Var.T;
                        if (y01Var2 != null) {
                            y01Var2.d(false);
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

    public g0(t0 t0Var, p0 p0Var, File file, long j10, boolean z10) {
        this.f46624b = t0Var;
        this.f46625c = p0Var;
        this.e = file;
        this.d = j10;
        this.f46626f = z10;
    }
}
