package u2;

import java.io.IOException;
public final class i0 implements e2.h {
    public final a5.a f43388a;
    public final t f43389b;
    public final b0 f43390c;
    public final IOException d;
    public final boolean e;

    public i0(a5.a aVar, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        this.f43388a = aVar;
        this.f43389b = tVar;
        this.f43390c = b0Var;
        this.d = iOException;
        this.e = z10;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        a5.a aVar = this.f43388a;
        k0Var.f(aVar.f275b, (f0) aVar.f276c, this.f43389b, this.f43390c, this.d, this.e);
    }
}
