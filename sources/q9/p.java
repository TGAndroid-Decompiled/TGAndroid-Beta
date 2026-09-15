package q9;

import org.telegram.ui.rv0;
import org.telegram.ui.zr0;
public final class p implements pa.b {
    public static final zr0 f41203c = new zr0(22);
    public static final f d = new f(1);
    public pa.a f41204a;
    public volatile pa.b f41205b;

    public p(zr0 zr0Var, pa.b bVar) {
        this.f41204a = zr0Var;
        this.f41205b = bVar;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.f41205b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.j(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f41205b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f41204a = new rv0(24, this.f41204a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.j(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f41205b.get();
    }
}
