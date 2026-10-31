package td;
public abstract class t0 implements Runnable, Comparable, o0 {
    private volatile Object _heap;
    public long f48661a;
    public int f48662b = -1;

    public t0(long j10) {
        this.f48661a = j10;
    }

    public final yd.x a() {
        Object obj = this._heap;
        if (obj instanceof yd.x) {
            return (yd.x) obj;
        }
        return null;
    }

    public final int c(long j10, u0 u0Var, v0 v0Var) {
        t0 t0Var;
        boolean z10;
        synchronized (this) {
            if (this._heap == e0.f48613b) {
                return 2;
            }
            synchronized (u0Var) {
                t0[] t0VarArr = u0Var.f54425a;
                if (t0VarArr != null) {
                    t0Var = t0VarArr[0];
                } else {
                    t0Var = null;
                }
                if (v0.f48673r.get(v0Var) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return 1;
                }
                if (t0Var == null) {
                    u0Var.f48667c = j10;
                } else {
                    long j11 = t0Var.f48661a;
                    if (j11 - j10 < 0) {
                        j10 = j11;
                    }
                    if (j10 - u0Var.f48667c > 0) {
                        u0Var.f48667c = j10;
                    }
                }
                long j12 = this.f48661a;
                long j13 = u0Var.f48667c;
                if (j12 - j13 < 0) {
                    this.f48661a = j13;
                }
                u0Var.a(this);
                return 0;
            }
        }
    }

    @Override
    public final int compareTo(Object obj) {
        int i10 = ((this.f48661a - ((t0) obj).f48661a) > 0L ? 1 : ((this.f48661a - ((t0) obj).f48661a) == 0L ? 0 : -1));
        if (i10 > 0) {
            return 1;
        }
        if (i10 < 0) {
            return -1;
        }
        return 0;
    }

    public final void d(u0 u0Var) {
        if (this._heap != e0.f48613b) {
            this._heap = u0Var;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override
    public final void dispose() {
        u0 u0Var;
        synchronized (this) {
            try {
                Object obj = this._heap;
                ea.a aVar = e0.f48613b;
                if (obj == aVar) {
                    return;
                }
                if (obj instanceof u0) {
                    u0Var = (u0) obj;
                } else {
                    u0Var = null;
                }
                if (u0Var != null) {
                    u0Var.c(this);
                }
                this._heap = aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f48661a + ']';
    }
}
