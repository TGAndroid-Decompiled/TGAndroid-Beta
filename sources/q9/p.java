package q9;

import org.telegram.ui.rv0;
import org.telegram.ui.wk0;
public final class p implements pa.b {
    public static final wk0 f41464c = new wk0(24);
    public static final f d = new f(1);
    public pa.a f41465a;
    public volatile pa.b f41466b;

    public p(wk0 wk0Var, pa.b bVar) {
        this.f41465a = wk0Var;
        this.f41466b = bVar;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.f41466b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.g(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f41466b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f41465a = new rv0(25, this.f41465a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.g(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f41466b.get();
    }
}
