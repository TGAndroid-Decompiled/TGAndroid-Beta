package r3;
public class g implements s {
    public final long f46548a;
    public final long f46549b;
    public final int f46550c;
    public final long d;
    public final int f46551e;
    public final long f46552f;
    public final boolean f46553g;

    public g(long j10, int i10, int i11, boolean z4, long j11) {
        this.f46548a = j10;
        this.f46549b = j11;
        this.f46550c = i11 == -1 ? 1 : i11;
        this.f46551e = i10;
        this.f46553g = z4;
        if (j10 == -1) {
            this.d = -1L;
            this.f46552f = -9223372036854775807L;
            return;
        }
        long j12 = j10 - j11;
        this.d = j12;
        this.f46552f = (Math.max(0L, j12) * 8000000) / i10;
    }

    @Override
    public final boolean c() {
        if (this.d == -1 && !this.f46553g) {
            return false;
        }
        return true;
    }

    @Override
    public final r f(long j10) {
        long j11 = this.f46549b;
        long j12 = this.d;
        int i10 = (j12 > (-1L) ? 1 : (j12 == (-1L) ? 0 : -1));
        if (i10 == 0 && !this.f46553g) {
            t tVar = new t(0L, j11);
            return new r(tVar, tVar);
        }
        int i11 = this.f46551e;
        long j13 = this.f46550c;
        long j14 = (((i11 * j10) / 8000000) / j13) * j13;
        if (i10 != 0) {
            j14 = Math.min(j14, j12 - j13);
        }
        long max = Math.max(j14, 0L) + j11;
        long max2 = (Math.max(0L, max - j11) * 8000000) / i11;
        t tVar2 = new t(max2, max);
        if (i10 != 0 && max2 < j10) {
            long j15 = max + j13;
            if (j15 < this.f46548a) {
                return new r(tVar2, new t((Math.max(0L, j15 - j11) * 8000000) / i11, j15));
            }
        }
        return new r(tVar2, tVar2);
    }

    @Override
    public final long g() {
        return this.f46552f;
    }
}
