package rf;

import org.telegram.messenger.i0;
import ph.x1;
public final class m {
    public final l f46555a;
    public long f46556b;
    public boolean f46557c;
    public final x1 d = new x1(this, 6);

    public m(l lVar) {
        this.f46555a = lVar;
    }

    public final void a(long j10) {
        if (this.f46557c && this.f46556b == j10) {
            return;
        }
        this.f46556b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f46557c = true;
        x1 x1Var = this.d;
        i0.r(x1Var);
        i0.h3(x1Var, 1000L);
    }

    public final void b() {
        this.f46557c = false;
        i0.r(this.d);
    }
}
