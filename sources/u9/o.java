package u9;

import org.telegram.ui.uc1;
import r0.f1;
public final class o implements ua.b {
    public static final f1 f58683c = new f1(29);
    public static final ab.m d = new ab.m(2);
    public ua.a f58684a;
    public volatile ua.b f58685b;

    public o(f1 f1Var, ua.b bVar) {
        this.f58684a = f1Var;
        this.f58685b = bVar;
    }

    public final void a(ua.a aVar) {
        ua.b bVar;
        ua.b bVar2;
        ua.b bVar3 = this.f58685b;
        ab.m mVar = d;
        if (bVar3 != mVar) {
            aVar.b(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f58685b;
            if (bVar != mVar) {
                bVar2 = bVar;
            } else {
                this.f58684a = new uc1(17, this.f58684a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.b(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f58685b.get();
    }
}
