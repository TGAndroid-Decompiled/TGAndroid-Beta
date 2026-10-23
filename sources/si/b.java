package si;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.web.z1;
public final class b implements Runnable {
    public final int f46560a;
    public final j f46561b;
    public final l0 f46562c;
    public final long d;

    public b(j jVar, l0 l0Var, long j10, int i10) {
        this.f46560a = i10;
        this.f46561b = jVar;
        this.f46562c = l0Var;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f46560a) {
            case 0:
                j jVar = this.f46561b;
                jVar.f46635c.post(new b(jVar, this.f46562c, this.d, 1));
                return;
            default:
                j jVar2 = this.f46561b;
                l0 l0Var = this.f46562c;
                long j10 = this.d;
                if (jVar2.V && jVar2.G == l0Var) {
                    n nVar = jVar2.f46653j;
                    nVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + j.z(j10));
                    s0 s0Var = (s0) jVar2.f46656k.f14830b;
                    Handler handler = s0Var.f46771i;
                    l2.f fVar = s0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new z1(fVar, 27));
                    return;
                }
                return;
        }
    }
}
