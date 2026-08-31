package t4;

import java.util.List;
public final class f extends q4.b {
    public final List d;
    public final long f47884e;

    public f(long j10, List list) {
        super(0L, list.size() - 1);
        this.f47884e = j10;
        this.d = list;
    }

    @Override
    public final long k() {
        a();
        return this.f47884e + ((u4.g) this.d.get((int) this.f44459c)).f48272e;
    }

    @Override
    public final long l() {
        a();
        u4.g gVar = (u4.g) this.d.get((int) this.f44459c);
        return this.f47884e + gVar.f48272e + gVar.f48271c;
    }
}
