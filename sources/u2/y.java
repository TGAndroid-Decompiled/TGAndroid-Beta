package u2;

import android.util.Pair;
import java.util.HashMap;
public final class y extends v1 {
    public final int f47921l;
    public final HashMap f47922m;
    public final HashMap f47923n;

    public y(a aVar) {
        super(new c0(aVar, false));
        this.f47921l = Integer.MAX_VALUE;
        this.f47922m = new HashMap();
        this.f47923n = new HashMap();
    }

    @Override
    public final void A(b2.o1 o1Var) {
        b2.o1 wVar;
        int i10 = this.f47921l;
        if (i10 != Integer.MAX_VALUE) {
            wVar = new x(o1Var, i10);
        } else {
            wVar = new w(o1Var, 0);
        }
        n(wVar);
    }

    @Override
    public final f0 c(h0 h0Var, androidx.biometric.e eVar, long j10) {
        int i10 = this.f47921l;
        a aVar = this.f47912k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.c(h0Var, eVar, j10);
        }
        Object obj = h0Var.f47767a;
        int i11 = i2.a.f12338g;
        h0 a2 = h0Var.a(((Pair) obj).second);
        this.f47922m.put(a2, h0Var);
        f0 c10 = aVar.c(a2, eVar, j10);
        this.f47923n.put(c10, a2);
        return c10;
    }

    @Override
    public final b2.o1 h() {
        c0 c0Var = (c0) this.f47912k;
        int i10 = this.f47921l;
        if (i10 != Integer.MAX_VALUE) {
            return new x(c0Var.f47717o, i10);
        }
        return new w(c0Var.f47717o, 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(f0 f0Var) {
        this.f47912k.o(f0Var);
        h0 h0Var = (h0) this.f47923n.remove(f0Var);
        if (h0Var != null) {
            this.f47922m.remove(h0Var);
        }
    }

    @Override
    public final h0 z(h0 h0Var) {
        if (this.f47921l != Integer.MAX_VALUE) {
            return (h0) this.f47922m.get(h0Var);
        }
        return h0Var;
    }
}
