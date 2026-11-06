package r2;

import java.util.List;
public final class f extends y2.b {
    public final List d;
    public final long f54175e;

    public f(long j3, List list) {
        super(0L, list.size() - 1);
        this.f54175e = j3;
        this.d = list;
    }

    @Override
    public final long E() {
        a();
        s2.k kVar = (s2.k) this.d.get((int) this.f58758c);
        return this.f54175e + kVar.f54561e + kVar.f54560c;
    }

    @Override
    public final long w() {
        a();
        return this.f54175e + ((s2.k) this.d.get((int) this.f58758c)).f54561e;
    }
}
