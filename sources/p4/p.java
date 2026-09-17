package p4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
public abstract class p extends q {
    public final Object f43883a = new Object();
    public Executor f43884b;
    public l.d f43885c;
    public m d;
    public ArrayList f43886e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(m mVar, ArrayList arrayList) {
        if (mVar != null) {
            synchronized (this.f43883a) {
                try {
                    try {
                        Executor executor = this.f43884b;
                        if (executor != null) {
                            executor.execute(new com.google.android.gms.internal.cast.p(this, this.f43885c, mVar, arrayList, false, 3));
                        } else {
                            this.d = mVar;
                            this.f43886e = new ArrayList(arrayList);
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
