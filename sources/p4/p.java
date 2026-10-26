package p4;

import a8.fg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import li.h5;
public abstract class p extends q {
    public final Object f46732a = new Object();
    public Executor f46733b;
    public h5 f46734c;
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
            synchronized (this.f46732a) {
                try {
                    try {
                        Executor executor = this.f46733b;
                        if (executor != null) {
                            executor.execute(new fg(this, this.f46734c, mVar, arrayList, false, 4));
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
