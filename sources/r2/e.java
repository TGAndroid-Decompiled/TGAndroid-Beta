package r2;

import java.util.List;
public final class e extends y2.b {
    public final List d;
    public final long f56388e;

    public e(long j3, List list) {
        super(0L, list.size() - 1);
        this.f56388e = j3;
        this.d = list;
    }

    @Override
    public final long O() {
        a();
        return this.f56388e + ((s2.k) this.d.get((int) this.f60705c)).f56858e;
    }

    @Override
    public final long S0() {
        a();
        s2.k kVar = (s2.k) this.d.get((int) this.f60705c);
        return this.f56388e + kVar.f56858e + kVar.f56857c;
    }
}
