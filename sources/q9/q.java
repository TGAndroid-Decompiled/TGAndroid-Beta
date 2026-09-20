package q9;

import org.telegram.ui.rv0;
public final class q implements pa.b {
    public static final p f41506c = new p(0);
    public static final f d = new f(1);
    public pa.a f41507a;
    public volatile pa.b f41508b;

    public q(p pVar, pa.b bVar) {
        this.f41507a = pVar;
        this.f41508b = bVar;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.f41508b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.f(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f41508b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f41507a = new rv0(25, this.f41507a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.f(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f41508b.get();
    }
}
