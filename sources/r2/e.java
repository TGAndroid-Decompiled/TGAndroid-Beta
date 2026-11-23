package r2;

import java.util.List;
public final class e extends y2.b {
    public final List d;
    public final long f56392e;

    public e(long j3, List list) {
        super(0L, list.size() - 1);
        this.f56392e = j3;
        this.d = list;
    }

    @Override
    public final long O() {
        a();
        return this.f56392e + ((s2.k) this.d.get((int) this.f60709c)).f56862e;
    }

    @Override
    public final long S0() {
        a();
        s2.k kVar = (s2.k) this.d.get((int) this.f60709c);
        return this.f56392e + kVar.f56862e + kVar.f56861c;
    }
}
