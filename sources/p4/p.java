package p4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
public abstract class p extends q {
    public final Object f42779a = new Object();
    public Executor f42780b;
    public m.h f42781c;
    public m d;
    public ArrayList e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(m mVar, ArrayList arrayList) {
        if (mVar != null) {
            synchronized (this.f42779a) {
                try {
                    try {
                        Executor executor = this.f42780b;
                        if (executor != null) {
                            executor.execute(new com.google.android.gms.internal.cast.p(this, this.f42781c, mVar, arrayList, false, 3));
                        } else {
                            this.d = mVar;
                            this.e = new ArrayList(arrayList);
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
        }
        throw new NullPointerException("groupRoute must not be null");
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(List list);
}
