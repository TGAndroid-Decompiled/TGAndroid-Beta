package u9;

import org.telegram.ui.wc1;
import r0.f1;
public final class o implements ua.b {
    public static final f1 f58603c = new f1(29);
    public static final ab.m d = new ab.m(2);
    public ua.a f58604a;
    public volatile ua.b f58605b;

    public o(f1 f1Var, ua.b bVar) {
        this.f58604a = f1Var;
        this.f58605b = bVar;
    }

    public final void a(ua.a aVar) {
        ua.b bVar;
        ua.b bVar2;
        ua.b bVar3 = this.f58605b;
        ab.m mVar = d;
        if (bVar3 != mVar) {
            aVar.b(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f58605b;
            if (bVar != mVar) {
                bVar2 = bVar;
            } else {
                this.f58604a = new wc1(17, this.f58604a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.b(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f58605b.get();
    }
}
