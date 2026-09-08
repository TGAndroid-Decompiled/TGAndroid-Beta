package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e {
    public static final AtomicIntegerFieldUpdater f51564b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final h0[] f51565a;
    private volatile int notCompletedCount$volatile;

    public e(h0[] h0VarArr) {
        this.f51565a = h0VarArr;
        this.notCompletedCount$volatile = h0VarArr.length;
    }
}
