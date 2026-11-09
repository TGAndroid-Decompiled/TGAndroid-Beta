package r2;

import java.util.List;
public final class e extends y2.b {
    public final List d;
    public final long f54304e;

    public e(long j3, List list) {
        super(0L, list.size() - 1);
        this.f54304e = j3;
        this.d = list;
    }

    @Override
    public final long E() {
        a();
        s2.k kVar = (s2.k) this.d.get((int) this.f58887c);
        return this.f54304e + kVar.f54690e + kVar.f54689c;
    }

    @Override
    public final long w() {
        a();
        return this.f54304e + ((s2.k) this.d.get((int) this.f58887c)).f54690e;
    }
}
