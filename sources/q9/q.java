package q9;

import pg.e0;
public final class q implements pa.b {
    public static final e0 f46116c = new e0(7);
    public static final f d = new f(1);
    public pa.a f46117a;
    public volatile pa.b f46118b;

    public q(e0 e0Var, pa.b bVar) {
        this.f46117a = e0Var;
        this.f46118b = bVar;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.f46118b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.g(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f46118b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f46117a = new p(0, this.f46117a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.g(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f46118b.get();
    }
}
