package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e {
    public static final AtomicIntegerFieldUpdater f48902b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final h0[] f48903a;
    private volatile int notCompletedCount$volatile;

    public e(h0[] h0VarArr) {
        this.f48903a = h0VarArr;
        this.notCompletedCount$volatile = h0VarArr.length;
    }
}
