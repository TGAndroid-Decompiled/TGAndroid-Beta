package u2;

import java.io.IOException;
public final class i0 implements e2.h {
    public final a5.a f46729a;
    public final t f46730b;
    public final b0 f46731c;
    public final IOException d;
    public final boolean f46732e;

    public i0(a5.a aVar, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        this.f46729a = aVar;
        this.f46730b = tVar;
        this.f46731c = b0Var;
        this.d = iOException;
        this.f46732e = z10;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        a5.a aVar = this.f46729a;
        k0Var.f(aVar.f297b, (f0) aVar.f298c, this.f46730b, this.f46731c, this.d, this.f46732e);
    }
}
