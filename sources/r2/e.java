package r2;

import java.util.List;
public final class e extends y2.b {
    public final List d;
    public final long f54303e;

    public e(long j3, List list) {
        super(0L, list.size() - 1);
        this.f54303e = j3;
        this.d = list;
    }

    @Override
    public final long E() {
        a();
        s2.k kVar = (s2.k) this.d.get((int) this.f58885c);
        return this.f54303e + kVar.f54689e + kVar.f54688c;
    }

    @Override
    public final long w() {
        a();
        return this.f54303e + ((s2.k) this.d.get((int) this.f58885c)).f54689e;
    }
}
