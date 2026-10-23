package v7;

import java.util.concurrent.Future;
public abstract class q8 {
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
        throw new IllegalStateException(v6.a("Future was expected to be done: %s", future));
    }

    public static j9.w b(Object obj) {
        if (obj == null) {
            return j9.w.f14406b;
        }
        return new j9.w(obj);
    }

    public static j9.p c(j9.y yVar, d9.k kVar) {
        ?? obj = new Object();
        yVar.getClass();
        obj.f14399n = yVar;
        obj.f14400r = kVar;
        yVar.a(obj, j9.r.f14401a);
        return obj;
    }
}
