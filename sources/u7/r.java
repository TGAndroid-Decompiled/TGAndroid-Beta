package u7;

import c8.qc;
public final class r extends s {
    public final transient int f57895c;
    public final transient int d;
    public final s f57896e;

    public r(s sVar, int i7, int i10) {
        this.f57896e = sVar;
        this.f57895c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        qc.a(i7, this.d);
        return this.f57896e.get(i7 + this.f57895c);
    }

    @Override
    public final int i() {
        return this.f57896e.j() + this.f57895c + this.d;
    }

    @Override
    public final int j() {
        return this.f57896e.j() + this.f57895c;
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final Object[] l() {
        return this.f57896e.l();
    }

    @Override
    public final s subList(int i7, int i10) {
        qc.b(i7, i10, this.d);
        int i11 = this.f57895c;
        return this.f57896e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
