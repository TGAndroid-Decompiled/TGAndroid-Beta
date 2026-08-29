package t4;

import java.util.List;
public abstract class k extends m3.k implements f {
    public f f48145a;
    public long f48146b;

    public final void a(long j10, f fVar, long j11) {
        this.timeUs = j10;
        this.f48145a = fVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f48146b = j10;
    }

    @Override
    public final void clear() {
        super.clear();
        this.f48145a = null;
    }

    @Override
    public final int e(long j10) {
        f fVar = this.f48145a;
        fVar.getClass();
        return fVar.e(j10 - this.f48146b);
    }

    @Override
    public final long m(int i10) {
        f fVar = this.f48145a;
        fVar.getClass();
        return fVar.m(i10) + this.f48146b;
    }

    @Override
    public final List q(long j10) {
        f fVar = this.f48145a;
        fVar.getClass();
        return fVar.q(j10 - this.f48146b);
    }

    @Override
    public final int v() {
        f fVar = this.f48145a;
        fVar.getClass();
        return fVar.v();
    }
}
