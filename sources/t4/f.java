package t4;

import java.util.List;
public final class f extends q4.b {
    public final List d;
    public final long f47920e;

    public f(long j10, List list) {
        super(0L, list.size() - 1);
        this.f47920e = j10;
        this.d = list;
    }

    @Override
    public final long k() {
        a();
        return this.f47920e + ((u4.g) this.d.get((int) this.f44490c)).f48308e;
    }

    @Override
    public final long l() {
        a();
        u4.g gVar = (u4.g) this.d.get((int) this.f44490c);
        return this.f47920e + gVar.f48308e + gVar.f48307c;
    }
}
