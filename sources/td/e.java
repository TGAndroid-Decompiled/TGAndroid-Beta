package td;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e {
    public static final AtomicIntegerFieldUpdater f48610b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final h0[] f48611a;
    private volatile int notCompletedCount$volatile;

    public e(h0[] h0VarArr) {
        this.f48611a = h0VarArr;
        this.notCompletedCount$volatile = h0VarArr.length;
    }
}
