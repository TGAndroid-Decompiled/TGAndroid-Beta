package zd;
public abstract class q0 implements Runnable, Comparable, l0 {
    private volatile Object _heap;
    public long f60107a;
    public int f60108b = -1;

    public q0(long j3) {
        this.f60107a = j3;
    }

    public final ee.u b() {
        Object obj = this._heap;
        if (obj instanceof ee.u) {
            return (ee.u) obj;
        }
        return null;
    }

    public final int c(long j3, r0 r0Var, s0 s0Var) {
        q0 q0Var;
        boolean z9;
        synchronized (this) {
            if (this._heap == b0.f60044b) {
                return 2;
            }
            synchronized (r0Var) {
                q0[] q0VarArr = r0Var.f10798a;
                if (q0VarArr != null) {
                    q0Var = q0VarArr[0];
                } else {
                    q0Var = null;
                }
                if (s0.f60111r.get(s0Var) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    return 1;
                }
                if (q0Var == null) {
                    r0Var.f60109c = j3;
                } else {
                    long j10 = q0Var.f60107a;
                    if (j10 - j3 < 0) {
                        j3 = j10;
                    }
                    if (j3 - r0Var.f60109c > 0) {
                        r0Var.f60109c = j3;
                    }
                }
                long j11 = this.f60107a;
                long j12 = r0Var.f60109c;
                if (j11 - j12 < 0) {
                    this.f60107a = j12;
                }
                r0Var.a(this);
                return 0;
            }
        }
    }

    @Override
    public final int compareTo(Object obj) {
        int i7 = ((this.f60107a - ((q0) obj).f60107a) > 0L ? 1 : ((this.f60107a - ((q0) obj).f60107a) == 0L ? 0 : -1));
        if (i7 > 0) {
            return 1;
        }
        if (i7 < 0) {
            return -1;
        }
        return 0;
    }

    public final void d(r0 r0Var) {
        if (this._heap != b0.f60044b) {
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
                com.google.android.gms.internal.clearcut.e eVar = b0.f60044b;
                if (obj == eVar) {
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
                this._heap = eVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f60107a + ']';
    }
}
