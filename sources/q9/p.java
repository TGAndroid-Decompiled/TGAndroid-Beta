package q9;

import org.telegram.ui.qv0;
import org.telegram.ui.sw0;
public final class p implements pa.b {
    public static final sw0 f44269c = new sw0(15);
    public static final f d = new f(1);
    public pa.a f44270a;
    public volatile pa.b f44271b;

    public p(sw0 sw0Var, pa.b bVar) {
        this.f44270a = sw0Var;
        this.f44271b = bVar;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.f44271b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.h(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f44271b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f44270a = new qv0(25, this.f44270a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.h(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f44271b.get();
    }
}
