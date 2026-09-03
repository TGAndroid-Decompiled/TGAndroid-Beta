package ud;

import java.util.concurrent.atomic.AtomicReferenceArray;
import qd.t;
public final class j extends t {
    public final AtomicReferenceArray e;

    public j(long j10, j jVar, int i10) {
        super(j10, jVar, i10);
        this.e = new AtomicReferenceArray(i.f45297f);
    }

    @Override
    public final int g() {
        return i.f45297f;
    }

    @Override
    public final void h(int i10, uc.h hVar) {
        this.e.set(i10, i.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f43071c + ", hashCode=" + hashCode() + ']';
    }
}
