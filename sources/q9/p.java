package q9;

import org.telegram.ui.kv0;
import pg.e0;
public final class p implements pa.b {
    public static final e0 f41155c = new e0(5);
    public static final f d = new f(1);
    public pa.a f41156a;
    public volatile pa.b f41157b;

    public p(e0 e0Var, pa.b bVar) {
        this.f41156a = e0Var;
        this.f41157b = bVar;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.f41157b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.g(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f41157b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f41156a = new kv0(24, this.f41156a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.g(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f41157b.get();
    }
}
