package r9;

import org.telegram.ui.web.o0;
import r0.s0;
public final class p implements qa.b {
    public static final s0 f43817c = new s0(3);
    public static final f d = new f(1);
    public qa.a f43818a;
    public volatile qa.b f43819b;

    public p(s0 s0Var, qa.b bVar) {
        this.f43818a = s0Var;
        this.f43819b = bVar;
    }

    public final void a(qa.a aVar) {
        qa.b bVar;
        qa.b bVar2;
        qa.b bVar3 = this.f43819b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.h(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f43819b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f43818a = new o0(4, this.f43818a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.h(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f43819b.get();
    }
}
