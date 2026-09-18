package q9;

import org.telegram.ui.bs0;
import org.telegram.ui.tv0;
public final class p implements pa.b {
    public static final bs0 f41230c = new bs0(22);
    public static final f d = new f(1);
    public pa.a f41231a;
    public volatile pa.b f41232b;

    public p(bs0 bs0Var, pa.b bVar) {
        this.f41231a = bs0Var;
        this.f41232b = bVar;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.f41232b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.j(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f41232b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f41231a = new tv0(24, this.f41231a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.j(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f41232b.get();
    }
}
