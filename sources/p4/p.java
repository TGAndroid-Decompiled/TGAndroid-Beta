package p4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
public abstract class p extends q {
    public final Object f44231a = new Object();
    public Executor f44232b;
    public k2.e f44233c;
    public m d;
    public ArrayList f44234e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(m mVar, ArrayList arrayList) {
        if (mVar != null) {
            synchronized (this.f44231a) {
                try {
                    try {
                        Executor executor = this.f44232b;
                        if (executor != null) {
                            executor.execute(new com.google.android.gms.internal.cast.p(this, this.f44233c, mVar, arrayList, false, 3));
                        } else {
                            this.d = mVar;
                            this.f44234e = new ArrayList(arrayList);
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
