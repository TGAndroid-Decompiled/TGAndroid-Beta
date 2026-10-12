package q9;

import org.telegram.ui.ns0;
import pg.e0;
public final class p implements pa.b {
    public static final e0 f45975c = new e0(5);
    public static final f d = new f(1);
    public pa.a f45976a;
    public volatile pa.b f45977b;

    public p(e0 e0Var, pa.b bVar) {
        this.f45976a = e0Var;
        this.f45977b = bVar;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.f45977b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.g(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f45977b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f45976a = new ns0(29, this.f45976a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.g(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f45977b.get();
    }
}
