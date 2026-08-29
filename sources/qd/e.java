package qd;

import jd.a0;
public final class e extends h {
    public static final e d;

    static {
        int i10 = k.f46632c;
        int i11 = k.d;
        long j10 = k.f46633e;
        String str = k.f46630a;
        ?? a0Var = new a0();
        a0Var.f46626c = new c(i10, j10, str, i11);
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
