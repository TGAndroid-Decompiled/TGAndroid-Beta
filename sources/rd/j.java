package rd;

import java.util.concurrent.atomic.AtomicReferenceArray;
import nd.t;

public final class j extends t {

    public final AtomicReferenceArray f46918e;

    public j(long j10, j jVar, int i10) {
        super(j10, jVar, i10);
        this.f46918e = new AtomicReferenceArray(i.f46917f);
    }

    @Override
    public final int g() {
        return i.f46917f;
    }

    @Override
    public final void h(int i10, rc.h hVar) {
        this.f46918e.set(i10, i.f46916e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f18506c + ", hashCode=" + hashCode() + ']';
    }
}
