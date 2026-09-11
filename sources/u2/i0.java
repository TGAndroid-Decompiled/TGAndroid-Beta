package u2;

import java.io.IOException;
public final class i0 implements e2.h {
    public final a5.a f46700a;
    public final t f46701b;
    public final b0 f46702c;
    public final IOException d;
    public final boolean f46703e;

    public i0(a5.a aVar, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        this.f46700a = aVar;
        this.f46701b = tVar;
        this.f46702c = b0Var;
        this.d = iOException;
        this.f46703e = z10;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        a5.a aVar = this.f46700a;
        k0Var.f(aVar.f285b, (f0) aVar.f286c, this.f46701b, this.f46702c, this.d, this.f46703e);
    }
}
