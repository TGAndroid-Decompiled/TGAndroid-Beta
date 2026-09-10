package u2;

import java.io.IOException;
public final class j0 implements e2.h {
    public final a5.a f42347a;
    public final u f42348b;
    public final c0 f42349c;
    public final IOException d;
    public final boolean e;

    public j0(a5.a aVar, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        this.f42347a = aVar;
        this.f42348b = uVar;
        this.f42349c = c0Var;
        this.d = iOException;
        this.e = z10;
    }

    @Override
    public final void accept(Object obj) {
        m0 m0Var = (m0) obj;
        a5.a aVar = this.f42347a;
        m0Var.f(aVar.f275b, (g0) aVar.f276c, this.f42348b, this.f42349c, this.d, this.e);
    }
}
