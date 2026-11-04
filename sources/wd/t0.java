package wd;
public abstract class t0 extends x {
    public static final int f57532f = 0;
    public long f57533c;
    public boolean d;
    public ed.e f57534e;

    public final void g(boolean z10) {
        long j10;
        long j11 = this.f57533c;
        if (z10) {
            j10 = 4294967296L;
        } else {
            j10 = 1;
        }
        long j12 = j11 - j10;
        this.f57533c = j12;
        if (j12 <= 0 && this.d) {
            shutdown();
        }
    }

    public abstract Thread h();

    public final void i(boolean z10) {
        long j10;
        long j11 = this.f57533c;
        if (z10) {
            j10 = 4294967296L;
        } else {
            j10 = 1;
        }
        this.f57533c = j10 + j11;
        if (!z10) {
            this.d = true;
        }
    }

    public abstract long j();

    public final boolean k() {
        Object removeFirst;
        ed.e eVar = this.f57534e;
        if (eVar == null) {
            return false;
        }
        if (eVar.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = eVar.removeFirst();
        }
        i0 i0Var = (i0) removeFirst;
        if (i0Var == null) {
            return false;
        }
        i0Var.run();
        return true;
    }

    public void l(long j10, q0 q0Var) {
        c0.f57476s.q(j10, q0Var);
    }

    public abstract void shutdown();
}
