package zd;
public abstract class t0 implements Runnable, Comparable, o0 {
    private volatile Object _heap;
    public long f48047a;
    public int f48048b = -1;

    public t0(long j3) {
        this.f48047a = j3;
    }

    public final ee.y a() {
        Object obj = this._heap;
        if (obj instanceof ee.y) {
            return (ee.y) obj;
        }
        return null;
    }

    public final int c(long j3, u0 u0Var, v0 v0Var) {
        t0 t0Var;
        boolean z10;
        synchronized (this) {
            if (this._heap == e0.f48001b) {
                return 2;
            }
            synchronized (u0Var) {
                t0[] t0VarArr = u0Var.f7507a;
                if (t0VarArr != null) {
                    t0Var = t0VarArr[0];
                } else {
                    t0Var = null;
                }
                if (v0.f48059r.get(v0Var) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return 1;
                }
                if (t0Var == null) {
                    u0Var.f48053c = j3;
                } else {
                    long j10 = t0Var.f48047a;
                    if (j10 - j3 < 0) {
                        j3 = j10;
                    }
                    if (j3 - u0Var.f48053c > 0) {
                        u0Var.f48053c = j3;
                    }
                }
                long j11 = this.f48047a;
                long j12 = u0Var.f48053c;
                if (j11 - j12 < 0) {
                    this.f48047a = j12;
                }
                u0Var.a(this);
                return 0;
            }
        }
    }

    @Override
    public final int compareTo(Object obj) {
        int i10 = ((this.f48047a - ((t0) obj).f48047a) > 0L ? 1 : ((this.f48047a - ((t0) obj).f48047a) == 0L ? 0 : -1));
        if (i10 > 0) {
            return 1;
        }
        if (i10 < 0) {
            return -1;
        }
        return 0;
    }

    @Override
    public final void dispose() {
        u0 u0Var;
        synchronized (this) {
            try {
                Object obj = this._heap;
                ee.v vVar = e0.f48001b;
                if (obj == vVar) {
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
                this._heap = vVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(u0 u0Var) {
        if (this._heap != e0.f48001b) {
            this._heap = u0Var;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public String toString() {
        return "Delayed[nanos=" + this.f48047a + ']';
    }
}
