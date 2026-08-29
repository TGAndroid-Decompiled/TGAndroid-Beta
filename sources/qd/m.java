package qd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class m {
    public static final AtomicReferenceFieldUpdater f46637b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");
    public static final AtomicIntegerFieldUpdater f46638c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");
    public static final AtomicIntegerFieldUpdater f46639e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");
    public final AtomicReferenceArray f46640a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer$volatile;
    private volatile int consumerIndex$volatile;
    private volatile Object lastScheduledTask$volatile;
    private volatile int producerIndex$volatile;

    public final i a() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f46638c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (iVar = (i) this.f46640a.getAndSet(i11, null)) != null) {
                if (iVar.f46628b.f161a == 1) {
                    f46639e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i b(int i10, boolean z10) {
        int i11 = i10 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f46640a;
        i iVar = (i) atomicReferenceArray.get(i11);
        if (iVar != null) {
            boolean z11 = true;
            if (iVar.f46628b.f161a != 1) {
                z11 = false;
            }
            if (z11 == z10) {
                while (!atomicReferenceArray.compareAndSet(i11, iVar, null)) {
                    if (atomicReferenceArray.get(i11) != iVar) {
                    }
                }
                if (z10) {
                    f46639e.decrementAndGet(this);
                }
                return iVar;
            }
        }
        return null;
    }
}
