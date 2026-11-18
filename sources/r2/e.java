package r2;

import java.util.List;
public final class e extends y2.b {
    public final List d;
    public final long f56347e;

    public e(long j3, List list) {
        super(0L, list.size() - 1);
        this.f56347e = j3;
        this.d = list;
    }

    @Override
    public final long O() {
        a();
        return this.f56347e + ((s2.k) this.d.get((int) this.f60663c)).f56817e;
    }

    @Override
    public final long S0() {
        a();
        s2.k kVar = (s2.k) this.d.get((int) this.f60663c);
        return this.f56347e + kVar.f56817e + kVar.f56816c;
    }
}
