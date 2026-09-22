package u2;

import java.io.IOException;
public final class i0 implements e2.h {
    public final a5.a f43384a;
    public final t f43385b;
    public final b0 f43386c;
    public final IOException d;
    public final boolean e;

    public i0(a5.a aVar, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        this.f43384a = aVar;
        this.f43385b = tVar;
        this.f43386c = b0Var;
        this.d = iOException;
        this.e = z10;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        a5.a aVar = this.f43384a;
        k0Var.f(aVar.f277b, (f0) aVar.f278c, this.f43385b, this.f43386c, this.d, this.e);
    }
}
