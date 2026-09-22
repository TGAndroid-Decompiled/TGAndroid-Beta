package q9;

import org.telegram.ui.js0;
import org.telegram.ui.rv0;
public final class p implements pa.b {
    public static final js0 f41199c = new js0(21);
    public static final f d = new f(1);
    public pa.a f41200a;
    public volatile pa.b f41201b;

    public p(js0 js0Var, pa.b bVar) {
        this.f41200a = js0Var;
        this.f41201b = bVar;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.f41201b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.j(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f41201b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f41200a = new rv0(24, this.f41200a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.j(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f41201b.get();
    }
}
