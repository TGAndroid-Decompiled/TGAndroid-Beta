package u2;

import android.util.Pair;
import java.util.HashMap;
public final class w extends s1 {
    public final int f47513l;
    public final HashMap f47514m;
    public final HashMap f47515n;

    public w(a aVar) {
        super(new a0(aVar, false));
        this.f47513l = Integer.MAX_VALUE;
        this.f47514m = new HashMap();
        this.f47515n = new HashMap();
    }

    @Override
    public final void A(b2.o1 o1Var) {
        b2.o1 uVar;
        int i10 = this.f47513l;
        if (i10 != Integer.MAX_VALUE) {
            uVar = new v(o1Var, i10);
        } else {
            uVar = new u(o1Var, 0);
        }
        n(uVar);
    }

    @Override
    public final d0 c(f0 f0Var, androidx.biometric.e eVar, long j10) {
        int i10 = this.f47513l;
        a aVar = this.f47479k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.c(f0Var, eVar, j10);
        }
        Object obj = f0Var.f47347a;
        int i11 = i2.a.f12309g;
        f0 a2 = f0Var.a(((Pair) obj).second);
        this.f47514m.put(a2, f0Var);
        d0 c10 = aVar.c(a2, eVar, j10);
        this.f47515n.put(c10, a2);
        return c10;
    }

    @Override
    public final b2.o1 h() {
        a0 a0Var = (a0) this.f47479k;
        int i10 = this.f47513l;
        if (i10 != Integer.MAX_VALUE) {
            return new v(a0Var.f47299o, i10);
        }
        return new u(a0Var.f47299o, 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(d0 d0Var) {
        this.f47479k.o(d0Var);
        f0 f0Var = (f0) this.f47515n.remove(d0Var);
        if (f0Var != null) {
            this.f47514m.remove(f0Var);
        }
    }

    @Override
    public final f0 z(f0 f0Var) {
        if (this.f47513l != Integer.MAX_VALUE) {
            return (f0) this.f47514m.get(f0Var);
        }
        return f0Var;
    }
}
