package u2;

import java.io.IOException;
public final class i0 implements e2.h {
    public final a5.a f43676a;
    public final t f43677b;
    public final b0 f43678c;
    public final IOException d;
    public final boolean e;

    public i0(a5.a aVar, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        this.f43676a = aVar;
        this.f43677b = tVar;
        this.f43678c = b0Var;
        this.d = iOException;
        this.e = z10;
    }

    @Override
    public final void accept(Object obj) {
        l0 l0Var = (l0) obj;
        a5.a aVar = this.f43676a;
        l0Var.f(aVar.f277b, (f0) aVar.f278c, this.f43677b, this.f43678c, this.d, this.e);
    }
}
