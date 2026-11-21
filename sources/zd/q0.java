package zd;
public abstract class q0 implements Runnable, Comparable, l0 {
    private volatile Object _heap;
    public long f61922a;
    public int f61923b = -1;

    public q0(long j3) {
        this.f61922a = j3;
    }

    public final ee.v b() {
        Object obj = this._heap;
        if (obj instanceof ee.v) {
            return (ee.v) obj;
        }
        return null;
    }

    public final int c(long j3, r0 r0Var, s0 s0Var) {
        q0 q0Var;
        boolean z10;
        synchronized (this) {
            if (this._heap == b0.f61859b) {
                return 2;
            }
            synchronized (r0Var) {
                q0[] q0VarArr = r0Var.f10980a;
                if (q0VarArr != null) {
                    q0Var = q0VarArr[0];
                } else {
                    q0Var = null;
                }
                if (s0.f61926r.get(s0Var) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return 1;
                }
                if (q0Var == null) {
                    r0Var.f61924c = j3;
                } else {
                    long j10 = q0Var.f61922a;
                    if (j10 - j3 < 0) {
                        j3 = j10;
                    }
                    if (j3 - r0Var.f61924c > 0) {
                        r0Var.f61924c = j3;
                    }
                }
                long j11 = this.f61922a;
                long j12 = r0Var.f61924c;
                if (j11 - j12 < 0) {
                    this.f61922a = j12;
                }
                r0Var.a(this);
                return 0;
            }
        }
    }

    @Override
    public final int compareTo(Object obj) {
        int i7 = ((this.f61922a - ((q0) obj).f61922a) > 0L ? 1 : ((this.f61922a - ((q0) obj).f61922a) == 0L ? 0 : -1));
        if (i7 > 0) {
            return 1;
        }
        if (i7 < 0) {
            return -1;
        }
        return 0;
    }

    public final void d(r0 r0Var) {
        if (this._heap != b0.f61859b) {
            this._heap = r0Var;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override
    public final void dispose() {
        r0 r0Var;
        synchronized (this) {
            try {
                Object obj = this._heap;
                ee.t tVar = b0.f61859b;
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

    public String toString() {
        return "Delayed[nanos=" + this.f61922a + ']';
    }
}
