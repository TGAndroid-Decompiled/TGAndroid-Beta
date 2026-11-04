package t9;

import org.telegram.ui.na1;
public final class p implements ta.b {
    public static final s0.b f55072c = new s0.b(17);
    public static final f d = new f(1);
    public ta.a f55073a;
    public volatile ta.b f55074b;

    public p(s0.b bVar, ta.b bVar2) {
        this.f55073a = bVar;
        this.f55074b = bVar2;
    }

    public final void a(ta.a aVar) {
        ta.b bVar;
        ta.b bVar2;
        ta.b bVar3 = this.f55074b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.c(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f55074b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f55073a = new na1(14, this.f55073a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.c(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f55074b.get();
    }
}
