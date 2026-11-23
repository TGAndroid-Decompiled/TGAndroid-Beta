package r2;

import java.util.List;
public final class e extends y2.b {
    public final List d;
    public final long f56357e;

    public e(long j3, List list) {
        super(0L, list.size() - 1);
        this.f56357e = j3;
        this.d = list;
    }

    @Override
    public final long O() {
        a();
        return this.f56357e + ((s2.k) this.d.get((int) this.f60674c)).f56827e;
    }

    @Override
    public final long S0() {
        a();
        s2.k kVar = (s2.k) this.d.get((int) this.f60674c);
        return this.f56357e + kVar.f56827e + kVar.f56826c;
    }
}
