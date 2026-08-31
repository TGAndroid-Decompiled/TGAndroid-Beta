package s8;
public final class l0 extends z {
    public final transient x d;
    public final transient m0 f47116e;

    public l0(x xVar, m0 m0Var) {
        this.d = xVar;
        this.f47116e = m0Var;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.d.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final v i() {
        return this.f47116e;
    }

    @Override
    public final int n(int i10, Object[] objArr) {
        return this.f47116e.n(i10, objArr);
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final int size() {
        return ((n0) this.d).f47121f;
    }

    @Override
    public final u0 w() {
        return this.f47116e.listIterator(0);
    }
}
