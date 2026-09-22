package u2;

import java.io.IOException;
public final class i0 implements e2.h {
    public final a5.a f43697a;
    public final t f43698b;
    public final b0 f43699c;
    public final IOException d;
    public final boolean e;

    public i0(a5.a aVar, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        this.f43697a = aVar;
        this.f43698b = tVar;
        this.f43699c = b0Var;
        this.d = iOException;
        this.e = z10;
    }

    @Override
    public final void accept(Object obj) {
        l0 l0Var = (l0) obj;
        a5.a aVar = this.f43697a;
        l0Var.f(aVar.f276b, (f0) aVar.f277c, this.f43698b, this.f43699c, this.d, this.e);
    }
}
