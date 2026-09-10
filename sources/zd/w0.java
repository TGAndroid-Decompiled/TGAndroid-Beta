package zd;
public abstract class w0 extends a0 {
    public static final int f48060f = 0;
    public long f48061c;
    public boolean d;
    public hd.e e;

    public final void f(boolean z10) {
        long j3;
        long j10 = this.f48061c;
        if (z10) {
            j3 = 4294967296L;
        } else {
            j3 = 1;
        }
        long j11 = j10 - j3;
        this.f48061c = j11;
        if (j11 <= 0 && this.d) {
            shutdown();
        }
    }

    public abstract Thread g();

    public final void h(boolean z10) {
        long j3;
        long j10 = this.f48061c;
        if (z10) {
            j3 = 4294967296L;
        } else {
            j3 = 1;
        }
        this.f48061c = j3 + j10;
        if (!z10) {
            this.d = true;
        }
    }

    public abstract long i();

    public final boolean j() {
        Object removeFirst;
        hd.e eVar = this.e;
        if (eVar == null) {
            return false;
        }
        if (eVar.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = eVar.removeFirst();
        }
        l0 l0Var = (l0) removeFirst;
        if (l0Var == null) {
            return false;
        }
        l0Var.run();
        return true;
    }

    public void k(long j3, t0 t0Var) {
        f0.f48011s.o(j3, t0Var);
    }

    public abstract void shutdown();
}
