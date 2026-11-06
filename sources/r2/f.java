package r2;

import java.util.List;
public final class f extends y2.b {
    public final List d;
    public final long f54199e;

    public f(long j3, List list) {
        super(0L, list.size() - 1);
        this.f54199e = j3;
        this.d = list;
    }

    @Override
    public final long E() {
        a();
        s2.k kVar = (s2.k) this.d.get((int) this.f58782c);
        return this.f54199e + kVar.f54585e + kVar.f54584c;
    }

    @Override
    public final long w() {
        a();
        return this.f54199e + ((s2.k) this.d.get((int) this.f58782c)).f54585e;
    }
}
