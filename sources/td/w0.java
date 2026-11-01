package td;
public abstract class w0 extends a0 {
    public static final int f48685f = 0;
    public long f48686c;
    public boolean d;
    public bd.g e;

    public final void f(boolean z10) {
        long j10;
        long j11 = this.f48686c;
        if (z10) {
            j10 = 4294967296L;
        } else {
            j10 = 1;
        }
        long j12 = j11 - j10;
        this.f48686c = j12;
        if (j12 <= 0 && this.d) {
            shutdown();
        }
    }

    public abstract Thread g();

    public final void h(boolean z10) {
        long j10;
        long j11 = this.f48686c;
        if (z10) {
            j10 = 4294967296L;
        } else {
            j10 = 1;
        }
        this.f48686c = j10 + j11;
        if (!z10) {
            this.d = true;
        }
    }

    public abstract long i();

    public final boolean j() {
        Object removeFirst;
        bd.g gVar = this.e;
        if (gVar == null) {
            return false;
        }
        if (gVar.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = gVar.removeFirst();
        }
        l0 l0Var = (l0) removeFirst;
        if (l0Var == null) {
            return false;
        }
        l0Var.run();
        return true;
    }

    public void k(long j10, t0 t0Var) {
        f0.f48635s.o(j10, t0Var);
    }

    public abstract void shutdown();
}
