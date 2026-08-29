package q8;
public final class o0 extends c0 {
    public final transient b0 d;
    public final transient p0 f46473e;

    public o0(b0 b0Var, p0 p0Var) {
        this.d = b0Var;
        this.f46473e = p0Var;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.d.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final z i() {
        return this.f46473e;
    }

    @Override
    public final int n(int i10, Object[] objArr) {
        return this.f46473e.n(i10, objArr);
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final int size() {
        return ((q0) this.d).f46486f;
    }

    @Override
    public final x0 w() {
        return this.f46473e.listIterator(0);
    }
}
