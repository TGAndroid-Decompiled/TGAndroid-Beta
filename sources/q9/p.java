package q9;

import org.telegram.ui.ls0;
import pg.e0;
public final class p implements pa.b {
    public static final e0 f46036c = new e0(5);
    public static final f d = new f(1);
    public pa.a f46037a;
    public volatile pa.b f46038b;

    public p(e0 e0Var, pa.b bVar) {
        this.f46037a = e0Var;
        this.f46038b = bVar;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.f46038b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.g(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f46038b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f46037a = new ls0(29, this.f46037a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.g(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f46038b.get();
    }
}
