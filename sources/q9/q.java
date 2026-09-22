package q9;

import org.telegram.ui.rv0;
public final class q implements pa.b {
    public static final p f41527c = new p(0);
    public static final f d = new f(1);
    public pa.a f41528a;
    public volatile pa.b f41529b;

    public q(p pVar, pa.b bVar) {
        this.f41528a = pVar;
        this.f41529b = bVar;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.f41529b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.h(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f41529b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f41528a = new rv0(25, this.f41528a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.h(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f41529b.get();
    }
}
