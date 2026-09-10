package q9;

import org.telegram.ui.fz0;
import org.telegram.ui.js0;
public final class p implements pa.b {
    public static final js0 f40580c = new js0(15);
    public static final f d = new f(1);
    public pa.a f40581a;
    public volatile pa.b f40582b;

    public p(js0 js0Var, pa.b bVar) {
        this.f40581a = js0Var;
        this.f40582b = bVar;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.f40582b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.j(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f40582b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f40581a = new fz0(21, this.f40581a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.j(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f40582b.get();
    }
}
