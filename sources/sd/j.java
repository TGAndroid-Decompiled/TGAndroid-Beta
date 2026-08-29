package sd;

import java.util.concurrent.atomic.AtomicReferenceArray;
import od.u;
public final class j extends u {
    public final AtomicReferenceArray f47730e;

    public j(long j10, j jVar, int i10) {
        super(j10, jVar, i10);
        this.f47730e = new AtomicReferenceArray(i.f47729f);
    }

    @Override
    public final int g() {
        return i.f47729f;
    }

    @Override
    public final void h(int i10, sc.h hVar) {
        this.f47730e.set(i10, i.f47728e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f19536c + ", hashCode=" + hashCode() + ']';
    }
}
