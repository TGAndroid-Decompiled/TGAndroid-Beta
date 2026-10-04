package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e {
    public static final AtomicIntegerFieldUpdater f53211b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final h0[] f53212a;
    private volatile int notCompletedCount$volatile;

    public e(h0[] h0VarArr) {
        this.f53212a = h0VarArr;
        this.notCompletedCount$volatile = h0VarArr.length;
    }
}
