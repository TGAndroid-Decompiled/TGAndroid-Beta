package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e {
    public static final AtomicIntegerFieldUpdater f49195b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final h0[] f49196a;
    private volatile int notCompletedCount$volatile;

    public e(h0[] h0VarArr) {
        this.f49196a = h0VarArr;
        this.notCompletedCount$volatile = h0VarArr.length;
    }
}
