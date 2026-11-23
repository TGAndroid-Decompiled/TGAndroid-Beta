package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e {
    public static final AtomicIntegerFieldUpdater f61964b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final e0[] f61965a;
    private volatile int notCompletedCount$volatile;

    public e(e0[] e0VarArr) {
        this.f61965a = e0VarArr;
        this.notCompletedCount$volatile = e0VarArr.length;
    }
}
