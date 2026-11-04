package r4;

import b8.cg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.nh;
public abstract class p extends q {
    public final Object f54333a = new Object();
    public Executor f54334b;
    public nh f54335c;
    public m d;
    public ArrayList f54336e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(m mVar, ArrayList arrayList) {
        if (mVar != null) {
            synchronized (this.f54333a) {
                try {
                    try {
                        Executor executor = this.f54334b;
                        if (executor != null) {
                            executor.execute(new cg(this, this.f54335c, mVar, arrayList, false, 5));
                        } else {
                            this.d = mVar;
                            this.f54336e = new ArrayList(arrayList);
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
