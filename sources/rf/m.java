package rf;

import org.telegram.messenger.i0;
import ph.x1;
public final class m {
    public final l f46544a;
    public long f46545b;
    public boolean f46546c;
    public final x1 d = new x1(this, 6);

    public m(l lVar) {
        this.f46544a = lVar;
    }

    public final void a(long j10) {
        if (this.f46546c && this.f46545b == j10) {
            return;
        }
        this.f46545b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f46546c = true;
        x1 x1Var = this.d;
        i0.r(x1Var);
        i0.h3(x1Var, 1000L);
    }

    public final void b() {
        this.f46546c = false;
        i0.r(this.d);
    }
}
