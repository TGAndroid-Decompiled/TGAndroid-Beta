package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e {
    public static final AtomicIntegerFieldUpdater f59968b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final e0[] f59969a;
    private volatile int notCompletedCount$volatile;

    public e(e0[] e0VarArr) {
        this.f59969a = e0VarArr;
        this.notCompletedCount$volatile = e0VarArr.length;
    }
}
