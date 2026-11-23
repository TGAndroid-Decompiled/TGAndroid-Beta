package r2;

import java.util.List;
public final class e extends y2.b {
    public final List d;
    public final long f56470e;

    public e(long j3, List list) {
        super(0L, list.size() - 1);
        this.f56470e = j3;
        this.d = list;
    }

    @Override
    public final long P0() {
        a();
        s2.l lVar = (s2.l) this.d.get((int) this.f60792c);
        return this.f56470e + lVar.f56943e + lVar.f56942c;
    }

    @Override
    public final long U() {
        a();
        return this.f56470e + ((s2.l) this.d.get((int) this.f60792c)).f56943e;
    }
}
