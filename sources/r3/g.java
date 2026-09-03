package r3;
public class g implements s {
    public final long f46579a;
    public final long f46580b;
    public final int f46581c;
    public final long d;
    public final int f46582e;
    public final long f46583f;
    public final boolean f46584g;

    public g(long j10, int i10, int i11, boolean z4, long j11) {
        this.f46579a = j10;
        this.f46580b = j11;
        this.f46581c = i11 == -1 ? 1 : i11;
        this.f46582e = i10;
        this.f46584g = z4;
        if (j10 == -1) {
            this.d = -1L;
            this.f46583f = -9223372036854775807L;
            return;
        }
        long j12 = j10 - j11;
        this.d = j12;
        this.f46583f = (Math.max(0L, j12) * 8000000) / i10;
    }

    @Override
    public final boolean c() {
        if (this.d == -1 && !this.f46584g) {
            return false;
        }
        return true;
    }

    @Override
    public final r f(long j10) {
        long j11 = this.f46580b;
        long j12 = this.d;
        int i10 = (j12 > (-1L) ? 1 : (j12 == (-1L) ? 0 : -1));
        if (i10 == 0 && !this.f46584g) {
            t tVar = new t(0L, j11);
            return new r(tVar, tVar);
        }
        int i11 = this.f46582e;
        long j13 = this.f46581c;
        long j14 = (((i11 * j10) / 8000000) / j13) * j13;
        if (i10 != 0) {
            j14 = Math.min(j14, j12 - j13);
        }
        long max = Math.max(j14, 0L) + j11;
        long max2 = (Math.max(0L, max - j11) * 8000000) / i11;
        t tVar2 = new t(max2, max);
        if (i10 != 0 && max2 < j10) {
            long j15 = max + j13;
            if (j15 < this.f46579a) {
                return new r(tVar2, new t((Math.max(0L, j15 - j11) * 8000000) / i11, j15));
            }
        }
        return new r(tVar2, tVar2);
    }

    @Override
    public final long g() {
        return this.f46583f;
    }
}
