package r4;

import java.util.List;
public abstract class k extends k3.k implements f {
    public f f47062a;
    public long f47063b;

    public final void a(long j10, f fVar, long j11) {
        this.timeUs = j10;
        this.f47062a = fVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f47063b = j10;
    }

    @Override
    public final int b(long j10) {
        f fVar = this.f47062a;
        fVar.getClass();
        return fVar.b(j10 - this.f47063b);
    }

    @Override
    public final void clear() {
        super.clear();
        this.f47062a = null;
    }

    @Override
    public final long h(int i9) {
        f fVar = this.f47062a;
        fVar.getClass();
        return fVar.h(i9) + this.f47063b;
    }

    @Override
    public final List m(long j10) {
        f fVar = this.f47062a;
        fVar.getClass();
        return fVar.m(j10 - this.f47063b);
    }

    @Override
    public final int r() {
        f fVar = this.f47062a;
        fVar.getClass();
        return fVar.r();
    }
}
