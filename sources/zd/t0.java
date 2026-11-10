package zd;
public abstract class t0 extends x {
    public static final int f60120f = 0;
    public long f60121c;
    public boolean d;
    public hd.d f60122e;

    public final void g(boolean z9) {
        long j3;
        long j10 = this.f60121c;
        if (z9) {
            j3 = 4294967296L;
        } else {
            j3 = 1;
        }
        long j11 = j10 - j3;
        this.f60121c = j11;
        if (j11 <= 0 && this.d) {
            shutdown();
        }
    }

    public abstract Thread h();

    public final void i(boolean z9) {
        long j3;
        long j10 = this.f60121c;
        if (z9) {
            j3 = 4294967296L;
        } else {
            j3 = 1;
        }
        this.f60121c = j3 + j10;
        if (!z9) {
            this.d = true;
        }
    }

    public abstract long j();

    public final boolean k() {
        Object removeFirst;
        hd.d dVar = this.f60122e;
        if (dVar == null) {
            return false;
        }
        if (dVar.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = dVar.removeFirst();
        }
        i0 i0Var = (i0) removeFirst;
        if (i0Var == null) {
            return false;
        }
        i0Var.run();
        return true;
    }

    public void l(long j3, q0 q0Var) {
        c0.f60064s.q(j3, q0Var);
    }

    public abstract void shutdown();
}
