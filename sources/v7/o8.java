package v7;

import java.util.concurrent.Future;
public abstract class o8 {
    public static Object a(Future future) {
        Object obj;
        boolean z10 = false;
        if (future.isDone()) {
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return obj;
        }
        throw new IllegalStateException(u6.a("Future was expected to be done: %s", future));
    }

    public static i9.u b(Object obj) {
        if (obj == null) {
            return i9.u.f10538b;
        }
        return new i9.u(obj);
    }
}
