package q9;

import org.telegram.ui.gs0;
import org.telegram.ui.web.d0;
public final class p implements pa.b {
    public static final d0 f41522c = new d0(12);
    public static final f d = new f(1);
    public pa.a f41523a;
    public volatile pa.b f41524b;

    public p(d0 d0Var, pa.b bVar) {
        this.f41523a = d0Var;
        this.f41524b = bVar;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.f41524b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.g(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f41524b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f41523a = new gs0(25, this.f41523a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.g(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f41524b.get();
    }
}
