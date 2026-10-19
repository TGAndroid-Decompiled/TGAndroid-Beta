package si;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.web.z1;
public final class b implements Runnable {
    public final int f46551a;
    public final j f46552b;
    public final l0 f46553c;
    public final long d;

    public b(j jVar, l0 l0Var, long j10, int i10) {
        this.f46551a = i10;
        this.f46552b = jVar;
        this.f46553c = l0Var;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f46551a) {
            case 0:
                j jVar = this.f46552b;
                jVar.f46626c.post(new b(jVar, this.f46553c, this.d, 1));
                return;
            default:
                j jVar2 = this.f46552b;
                l0 l0Var = this.f46553c;
                long j10 = this.d;
                if (jVar2.V && jVar2.G == l0Var) {
                    n nVar = jVar2.f46644j;
                    nVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + j.z(j10));
                    s0 s0Var = (s0) jVar2.f46647k.f14830b;
                    Handler handler = s0Var.f46762i;
                    l2.f fVar = s0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new z1(fVar, 27));
                    return;
                }
                return;
        }
    }
}
