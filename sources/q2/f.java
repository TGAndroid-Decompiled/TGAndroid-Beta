package q2;

import java.util.List;
public final class f extends x2.b {
    public final List d;
    public final long f53678e;

    public f(long j10, List list) {
        super(0L, list.size() - 1);
        this.f53678e = j10;
        this.d = list;
    }

    @Override
    public final long D() {
        a();
        r2.k kVar = (r2.k) this.d.get((int) this.f58131c);
        return this.f53678e + kVar.f54143e + kVar.f54142c;
    }

    @Override
    public final long t() {
        a();
        return this.f53678e + ((r2.k) this.d.get((int) this.f58131c)).f54143e;
    }
}
