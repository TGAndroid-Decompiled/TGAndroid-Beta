package q4;

import java.util.List;
public final class f extends n4.b {
    public final List d;
    public final long f46260e;

    public f(long j10, List list) {
        super(0L, list.size() - 1);
        this.f46260e = j10;
        this.d = list;
    }

    @Override
    public final long b() {
        a();
        return this.f46260e + ((r4.h) this.d.get((int) this.f17113c)).f46965e;
    }

    @Override
    public final long l() {
        a();
        r4.h hVar = (r4.h) this.d.get((int) this.f17113c);
        return this.f46260e + hVar.f46965e + hVar.f46964c;
    }
}
