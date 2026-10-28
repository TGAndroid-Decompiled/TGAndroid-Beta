package s9;

import org.telegram.ui.bh1;
public final class q implements ra.b {
    public static final s0.b f48050c = new s0.b(5);
    public static final f d = new f(1);
    public ra.a f48051a;
    public volatile ra.b f48052b;

    public q(s0.b bVar, ra.b bVar2) {
        this.f48051a = bVar;
        this.f48052b = bVar2;
    }

    public final void a(ra.a aVar) {
        ra.b bVar;
        ra.b bVar2;
        ra.b bVar3 = this.f48052b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.i(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f48052b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f48051a = new bh1(12, this.f48051a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.i(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f48052b.get();
    }
}
