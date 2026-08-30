package v4;

import java.util.List;
public abstract class k extends n3.j implements f {
    public f e;
    public long f45613f;

    @Override
    public final int b(long j10) {
        f fVar = this.e;
        fVar.getClass();
        return fVar.b(j10 - this.f45613f);
    }

    @Override
    public final void c() {
        this.f14222b = 0;
        this.e = null;
    }

    @Override
    public final long g(int i10) {
        f fVar = this.e;
        fVar.getClass();
        return fVar.g(i10) + this.f45613f;
    }

    public final void k(long j10, f fVar, long j11) {
        this.f14245c = j10;
        this.e = fVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f45613f = j10;
    }

    @Override
    public final List m(long j10) {
        f fVar = this.e;
        fVar.getClass();
        return fVar.m(j10 - this.f45613f);
    }

    @Override
    public final int p() {
        f fVar = this.e;
        fVar.getClass();
        return fVar.p();
    }
}
