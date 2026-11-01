package v7;

import java.util.concurrent.Future;
public abstract class p8 {
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

    public static j9.w b(Object obj) {
        if (obj == null) {
            return j9.w.f9769b;
        }
        return new j9.w(obj);
    }

    public static j9.p c(j9.y yVar, d9.k kVar) {
        ?? obj = new Object();
        yVar.getClass();
        obj.f9762n = yVar;
        obj.f9763r = kVar;
        yVar.a(obj, j9.r.f9764a);
        return obj;
    }
}
