package u9;

import org.telegram.ui.wc1;
import r0.f1;
public final class o implements ua.b {
    public static final f1 f58557c = new f1(29);
    public static final ab.m d = new ab.m(2);
    public ua.a f58558a;
    public volatile ua.b f58559b;

    public o(f1 f1Var, ua.b bVar) {
        this.f58558a = f1Var;
        this.f58559b = bVar;
    }

    public final void a(ua.a aVar) {
        ua.b bVar;
        ua.b bVar2;
        ua.b bVar3 = this.f58559b;
        ab.m mVar = d;
        if (bVar3 != mVar) {
            aVar.b(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f58559b;
            if (bVar != mVar) {
                bVar2 = bVar;
            } else {
                this.f58558a = new wc1(17, this.f58558a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.b(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f58559b.get();
    }
}
