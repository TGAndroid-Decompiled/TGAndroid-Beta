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
    public final long B() {
        a();
        u4.g gVar = (u4.g) this.d.get((int) this.f42717c);
        return this.e + gVar.e + gVar.f45026c;
    }

    @Override
    public final long p() {
        a();
        return this.e + ((u4.g) this.d.get((int) this.f42717c)).e;
    }
}
