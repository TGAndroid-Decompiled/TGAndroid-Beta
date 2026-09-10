package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public class v {
    public static final AtomicIntegerFieldUpdater f48056b = AtomicIntegerFieldUpdater.newUpdater(v.class, "_handled$volatile");
    private volatile int _handled$volatile;
    public final Throwable f48057a;

    public v(Throwable th2, boolean z10) {
        this.f48057a = th2;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f48057a + ']';
    }
}
