package sd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class m {
    public static final AtomicReferenceFieldUpdater f47308b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");
    public static final AtomicIntegerFieldUpdater f47309c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");
    public static final AtomicIntegerFieldUpdater f47310e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");
    public final AtomicReferenceArray f47311a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer$volatile;
    private volatile int consumerIndex$volatile;
    private volatile Object lastScheduledTask$volatile;
    private volatile int producerIndex$volatile;

    public final i a() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f47309c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (iVar = (i) this.f47311a.getAndSet(i11, null)) != null) {
                if (iVar.f47299b.f2264a == 1) {
                    f47310e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i b(int i10, boolean z4) {
        int i11 = i10 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f47311a;
        i iVar = (i) atomicReferenceArray.get(i11);
        if (iVar != null) {
            boolean z10 = true;
            if (iVar.f47299b.f2264a != 1) {
                z10 = false;
            }
            if (z10 == z4) {
                while (!atomicReferenceArray.compareAndSet(i11, iVar, null)) {
                    if (atomicReferenceArray.get(i11) != iVar) {
                    }
                }
                if (z4) {
                    f47310e.decrementAndGet(this);
                }
                return iVar;
            }
        }
        return null;
    }
}
