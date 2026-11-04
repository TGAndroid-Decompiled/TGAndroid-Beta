package wd;
public abstract class q0 implements Runnable, Comparable, l0 {
    private volatile Object _heap;
    public long f57527a;
    public int f57528b = -1;

    public q0(long j10) {
        this.f57527a = j10;
    }

    public final be.v b() {
        Object obj = this._heap;
        if (obj instanceof be.v) {
            return (be.v) obj;
        }
        return null;
    }

    public final int c(long j10, r0 r0Var, s0 s0Var) {
        q0 q0Var;
        boolean z10;
        synchronized (this) {
            if (this._heap == b0.f57464b) {
                return 2;
            }
            synchronized (r0Var) {
                q0[] q0VarArr = r0Var.f3288a;
                if (q0VarArr != null) {
                    q0Var = q0VarArr[0];
                } else {
                    q0Var = null;
                }
                if (s0.f57531r.get(s0Var) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return 1;
                }
                if (q0Var == null) {
                    r0Var.f57529c = j10;
                } else {
                    long j11 = q0Var.f57527a;
                    if (j11 - j10 < 0) {
                        j10 = j11;
                    }
                    if (j10 - r0Var.f57529c > 0) {
                        r0Var.f57529c = j10;
                    }
                }
                long j12 = this.f57527a;
                long j13 = r0Var.f57529c;
                if (j12 - j13 < 0) {
                    this.f57527a = j13;
                }
                r0Var.a(this);
                return 0;
            }
        }
    }

    @Override
    public final int compareTo(Object obj) {
        int i3 = ((this.f57527a - ((q0) obj).f57527a) > 0L ? 1 : ((this.f57527a - ((q0) obj).f57527a) == 0L ? 0 : -1));
        if (i3 > 0) {
            return 1;
        }
        if (i3 < 0) {
            return -1;
        }
        return 0;
    }

    @Override
    public final void dispose() {
        r0 r0Var;
        synchronized (this) {
            try {
                Object obj = this._heap;
                be.t tVar = b0.f57464b;
                if (obj == tVar) {
                    return;
                }
                if (obj instanceof r0) {
                    r0Var = (r0) obj;
                } else {
                    r0Var = null;
                }
                if (r0Var != null) {
                    r0Var.b(this);
                }
                this._heap = tVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(r0 r0Var) {
        if (this._heap != b0.f57464b) {
            this._heap = r0Var;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public String toString() {
        return "Delayed[nanos=" + this.f57527a + ']';
    }
}
