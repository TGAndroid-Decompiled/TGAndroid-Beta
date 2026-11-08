package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e {
    public static final AtomicIntegerFieldUpdater f60061b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final e0[] f60062a;
    private volatile int notCompletedCount$volatile;

    public e(e0[] e0VarArr) {
        this.f60062a = e0VarArr;
        this.notCompletedCount$volatile = e0VarArr.length;
    }
}
