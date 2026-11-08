package r2;

import java.util.List;
public final class e extends y2.b {
    public final List d;
    public final long f54291e;

    public e(long j3, List list) {
        super(0L, list.size() - 1);
        this.f54291e = j3;
        this.d = list;
    }

    @Override
    public final long E() {
        a();
        s2.k kVar = (s2.k) this.d.get((int) this.f58877c);
        return this.f54291e + kVar.f54677e + kVar.f54676c;
    }

    @Override
    public final long w() {
        a();
        return this.f54291e + ((s2.k) this.d.get((int) this.f58877c)).f54677e;
    }
}
