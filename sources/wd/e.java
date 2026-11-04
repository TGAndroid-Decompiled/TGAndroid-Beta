package wd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e {
    public static final AtomicIntegerFieldUpdater f57481b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final e0[] f57482a;
    private volatile int notCompletedCount$volatile;

    public e(e0[] e0VarArr) {
        this.f57482a = e0VarArr;
        this.notCompletedCount$volatile = e0VarArr.length;
    }
}
