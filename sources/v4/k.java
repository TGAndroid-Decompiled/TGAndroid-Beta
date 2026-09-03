package v4;

import java.util.List;
public abstract class k extends n3.j implements f {
    public f f48944e;
    public long f48945f;

    @Override
    public final void b() {
        this.f15195b = 0;
        this.f48944e = null;
    }

    @Override
    public final int d(long j10) {
        f fVar = this.f48944e;
        fVar.getClass();
        return fVar.d(j10 - this.f48945f);
    }

    public final void j(long j10, f fVar, long j11) {
        this.f15221c = j10;
        this.f48944e = fVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f48945f = j10;
    }

    @Override
    public final long l(int i10) {
        f fVar = this.f48944e;
        fVar.getClass();
        return fVar.l(i10) + this.f48945f;
    }

    @Override
    public final List q(long j10) {
        f fVar = this.f48944e;
        fVar.getClass();
        return fVar.q(j10 - this.f48945f);
    }

    @Override
    public final int x() {
        f fVar = this.f48944e;
        fVar.getClass();
        return fVar.x();
    }
}
