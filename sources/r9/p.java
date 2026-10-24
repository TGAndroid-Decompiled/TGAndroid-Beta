package r9;

import org.telegram.ui.Wallet.e8;
import org.telegram.ui.web.d0;
public final class p implements qa.b {
    public static final d0 f45570c = new d0(19);
    public static final f d = new f(1);
    public qa.a f45571a;
    public volatile qa.b f45572b;

    public p(d0 d0Var, qa.b bVar) {
        this.f45571a = d0Var;
        this.f45572b = bVar;
    }

    public final void a(qa.a aVar) {
        qa.b bVar;
        qa.b bVar2;
        qa.b bVar3 = this.f45572b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.h(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f45572b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f45571a = new e8(8, this.f45571a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.h(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f45572b.get();
    }
}
