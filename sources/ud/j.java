package ud;

import java.util.concurrent.atomic.AtomicReferenceArray;
import qd.t;
public final class j extends t {
    public final AtomicReferenceArray f48535e;

    public j(long j10, j jVar, int i10) {
        super(j10, jVar, i10);
        this.f48535e = new AtomicReferenceArray(i.f48534f);
    }

    @Override
    public final int g() {
        return i.f48534f;
    }

    @Override
    public final void h(int i10, uc.h hVar) {
        this.f48535e.set(i10, i.f48533e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f44851c + ", hashCode=" + hashCode() + ']';
    }
}
