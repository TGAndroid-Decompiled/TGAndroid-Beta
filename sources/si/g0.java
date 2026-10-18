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
    public final int f46644a = 1;
    public final s0 f46645b;
    public final o0 f46646c;
    public final long d;
    public final File e;
    public final boolean f46647f;

    public g0(s0 s0Var, o0 o0Var, long j10, File file, boolean z10) {
        this.f46645b = s0Var;
        this.f46646c = o0Var;
        this.d = j10;
        this.e = file;
        this.f46647f = z10;
    }

    private final void a() {
        s0 s0Var = this.f46645b;
        o0 o0Var = this.f46646c;
        File file = this.e;
        long j10 = this.d;
        boolean z10 = this.f46647f;
        synchronized (s0Var.f46808g) {
            if (!s0Var.D && !o0Var.d && !o0Var.e) {
                o0Var.e = true;
                ((y01) s0Var.e).b(o0Var.f46783a, file.length(), file);
                s0Var.f46809i.post(new g0(s0Var, o0Var, j10, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        x01 x01Var;
        x01 x01Var2;
        switch (this.f46644a) {
            case 0:
                a();
                return;
            default:
                s0 s0Var = this.f46645b;
                o0 o0Var = this.f46646c;
                long j10 = this.d;
                File file = this.e;
                boolean z10 = this.f46647f;
                int i10 = s0Var.W;
                if (i10 != 10 && i10 != 9) {
                    s0Var.v(8);
                    s0Var.f46813m.b("output completed: generation=" + o0Var.f46783a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                    s0Var.m("completed");
                    l2.f fVar = s0Var.d;
                    long j11 = o0Var.f46783a;
                    l60 l60Var = (l60) fVar.f15844b;
                    k60 k60Var = l60Var.V;
                    if (k60Var != null) {
                        l60Var.V = null;
                        l60Var.f28097j0 = true;
                        y01 y01Var = l60Var.T;
                        if (y01Var == null) {
                            x01Var2 = null;
                        } else {
                            synchronized (y01Var) {
                                w01 w01Var = (w01) y01Var.f32513c.get(Long.valueOf(j11));
                                if (w01Var != null && !w01Var.e) {
                                    x01Var = new x01(Math.max(w01Var.f31967c, file.length()), w01Var.f31968f, w01Var.f31969g, w01Var.h, w01Var.f31970i);
                                }
                                x01Var = new x01(file.length(), null, null, null, null);
                            }
                            x01Var2 = x01Var;
                        }
                        VideoEditedInfo r10 = l60Var.r(file, j10, x01Var2);
                        r10.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = k60Var.f27764c;
                        photoEntry.effectId = k60Var.d;
                        l60Var.f28092f.r(photoEntry, r10, k60Var.f27762a, k60Var.f27763b, 0, false, k60Var.e);
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

    public g0(s0 s0Var, o0 o0Var, File file, long j10, boolean z10) {
        this.f46645b = s0Var;
        this.f46646c = o0Var;
        this.e = file;
        this.d = j10;
        this.f46647f = z10;
    }
}
