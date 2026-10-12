package p4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
public abstract class p extends q {
    public final Object f43081a = new Object();
    public Executor f43082b;
    public l2.f f43083c;
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
            synchronized (this.f43081a) {
                try {
                    try {
                        Executor executor = this.f43082b;
                        if (executor != null) {
                            executor.execute(new com.google.android.gms.internal.cast.p(this, this.f43083c, mVar, arrayList, false, 3));
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
