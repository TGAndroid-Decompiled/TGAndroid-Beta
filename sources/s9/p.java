package s9;

import org.telegram.ui.zg1;
public final class p implements ra.b {
    public static final s0.b f48012c = new s0.b(5);
    public static final f d = new f(1);
    public ra.a f48013a;
    public volatile ra.b f48014b;

    public p(s0.b bVar, ra.b bVar2) {
        this.f48013a = bVar;
        this.f48014b = bVar2;
    }

    public final void a(ra.a aVar) {
        ra.b bVar;
        ra.b bVar2;
        ra.b bVar3 = this.f48014b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.i(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f48014b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f48013a = new zg1(12, this.f48013a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.i(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f48014b.get();
    }
}
