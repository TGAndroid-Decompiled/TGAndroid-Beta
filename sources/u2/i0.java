package u2;

import java.io.IOException;
public final class i0 implements e2.h {
    public final a5.a f46701a;
    public final t f46702b;
    public final b0 f46703c;
    public final IOException d;
    public final boolean f46704e;

    public i0(a5.a aVar, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        this.f46701a = aVar;
        this.f46702b = tVar;
        this.f46703c = b0Var;
        this.d = iOException;
        this.f46704e = z10;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        a5.a aVar = this.f46701a;
        k0Var.f(aVar.f285b, (f0) aVar.f286c, this.f46702b, this.f46703c, this.d, this.f46704e);
    }
}
