package sd;

import ld.a0;
public final class e extends h {
    public static final e d;

    static {
        int i10 = k.f47303c;
        int i11 = k.d;
        long j10 = k.f47304e;
        String str = k.f47301a;
        ?? a0Var = new a0();
        a0Var.f47297c = new c(i10, j10, str, i11);
        d = a0Var;
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override
    public final String toString() {
        return "Dispatchers.Default";
    }
}
