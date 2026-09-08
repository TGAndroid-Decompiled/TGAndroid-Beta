package u2;

import java.io.IOException;
public final class i0 implements e2.h {
    public final a5.a f46728a;
    public final t f46729b;
    public final b0 f46730c;
    public final IOException d;
    public final boolean f46731e;

    public i0(a5.a aVar, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        this.f46728a = aVar;
        this.f46729b = tVar;
        this.f46730c = b0Var;
        this.d = iOException;
        this.f46731e = z10;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        a5.a aVar = this.f46728a;
        k0Var.f(aVar.f297b, (f0) aVar.f298c, this.f46729b, this.f46730c, this.d, this.f46731e);
    }
}
