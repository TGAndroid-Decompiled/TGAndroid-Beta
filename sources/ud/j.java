package ud;

import java.util.concurrent.atomic.AtomicReferenceArray;
import qd.t;
public final class j extends t {
    public final AtomicReferenceArray f48499e;

    public j(long j10, j jVar, int i10) {
        super(j10, jVar, i10);
        this.f48499e = new AtomicReferenceArray(i.f48498f);
    }

    @Override
    public final int g() {
        return i.f48498f;
    }

    @Override
    public final void h(int i10, uc.h hVar) {
        this.f48499e.set(i10, i.f48497e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f44820c + ", hashCode=" + hashCode() + ']';
    }
}
