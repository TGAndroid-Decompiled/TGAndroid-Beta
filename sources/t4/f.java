package t4;

import java.util.List;
public final class f extends q4.b {
    public final List d;
    public final long e;

    public f(long j10, List list) {
        super(0L, list.size() - 1);
        this.e = j10;
        this.d = list;
    }

    @Override
    public final long a1() {
        a();
        u4.g gVar = (u4.g) this.d.get((int) this.f42747c);
        return this.e + gVar.e + gVar.f45088c;
    }

    @Override
    public final long n0() {
        a();
        return this.e + ((u4.g) this.d.get((int) this.f42747c)).e;
    }
}
