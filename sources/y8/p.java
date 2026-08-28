package y8;

import org.telegram.ui.ei1;
public final class p implements x9.b {
    public static final v0.l f49653c = new v0.l(11);
    public static final f d = new f(1);
    public x9.a f49654a;
    public volatile x9.b f49655b;

    public p(v0.l lVar, x9.b bVar) {
        this.f49654a = lVar;
        this.f49655b = bVar;
    }

    public final void a(x9.a aVar) {
        x9.b bVar;
        x9.b bVar2;
        x9.b bVar3 = this.f49655b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.e(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f49655b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f49654a = new ei1(12, this.f49654a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.e(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f49655b.get();
    }
}
