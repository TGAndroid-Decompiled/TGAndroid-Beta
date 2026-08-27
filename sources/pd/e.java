package pd;

public final class e extends h {
    public static final e d;

    static {
        int i10 = k.f45725c;
        int i11 = k.d;
        long j10 = k.f45726e;
        String str = k.f45723a;
        e eVar = new e();
        eVar.f45719c = new c(i10, j10, str, i11);
        d = eVar;
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
