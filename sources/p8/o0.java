package p8;

public final class o0 extends c0 {
    public final transient b0 d;

    public final transient p0 f45566e;

    public o0(b0 b0Var, p0 p0Var) {
        this.d = b0Var;
        this.f45566e = p0Var;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override
    public final z i() {
        return this.f45566e;
    }

    @Override
    public final int n(int i10, Object[] objArr) {
        return this.f45566e.n(i10, objArr);
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final int size() {
        return ((q0) this.d).f45579f;
    }

    @Override
    public final x0 iterator() {
        return this.f45566e.listIterator(0);
    }
}
