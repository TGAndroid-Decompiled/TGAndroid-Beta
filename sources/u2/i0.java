package u2;

import java.io.IOException;
public final class i0 implements e2.h {
    public final a5.a f43643a;
    public final t f43644b;
    public final b0 f43645c;
    public final IOException d;
    public final boolean e;

    public i0(a5.a aVar, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        this.f43643a = aVar;
        this.f43644b = tVar;
        this.f43645c = b0Var;
        this.d = iOException;
        this.e = z10;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        a5.a aVar = this.f43643a;
        k0Var.f(aVar.f277b, (f0) aVar.f278c, this.f43644b, this.f43645c, this.d, this.e);
    }
}
