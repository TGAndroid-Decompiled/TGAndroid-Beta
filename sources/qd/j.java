package qd;

import java.util.concurrent.atomic.AtomicReferenceArray;
import md.t;
public final class j extends t {
    public final AtomicReferenceArray f46159e;

    public j(long j10, j jVar, int i9) {
        super(j10, jVar, i9);
        this.f46159e = new AtomicReferenceArray(i.f46158f);
    }

    @Override
    public final int g() {
        return i.f46158f;
    }

    @Override
    public final void h(int i9, qc.h hVar) {
        this.f46159e.set(i9, i.f46157e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f17670c + ", hashCode=" + hashCode() + ']';
    }
}
