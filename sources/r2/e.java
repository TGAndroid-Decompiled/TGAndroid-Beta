package r2;

import java.util.List;
public final class e extends y2.b {
    public final List d;
    public final long f55772e;

    public e(long j3, List list) {
        super(0L, list.size() - 1);
        this.f55772e = j3;
        this.d = list;
    }

    @Override
    public final long S0() {
        a();
        s2.k kVar = (s2.k) this.d.get((int) this.f60098c);
        return this.f55772e + kVar.f56243e + kVar.f56242c;
    }

    @Override
    public final long k0() {
        a();
        return this.f55772e + ((s2.k) this.d.get((int) this.f60098c)).f56243e;
    }
}
