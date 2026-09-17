package u2;

import java.io.IOException;
public final class i0 implements e2.h {
    public final a5.a f43411a;
    public final t f43412b;
    public final b0 f43413c;
    public final IOException d;
    public final boolean e;

    public i0(a5.a aVar, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        this.f43411a = aVar;
        this.f43412b = tVar;
        this.f43413c = b0Var;
        this.d = iOException;
        this.e = z10;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        a5.a aVar = this.f43411a;
        k0Var.f(aVar.f277b, (f0) aVar.f278c, this.f43412b, this.f43413c, this.d, this.e);
    }
}
