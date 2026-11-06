package s4;

import a8.pa;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.uy;
public abstract class p extends q {
    public final Object f54748a = new Object();
    public Executor f54749b;
    public uy f54750c;
    public m d;
    public ArrayList f54751e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(m mVar, ArrayList arrayList) {
        if (mVar != null) {
            synchronized (this.f54748a) {
                try {
                    try {
                        Executor executor = this.f54749b;
                        if (executor != null) {
                            executor.execute(new pa(this, this.f54750c, mVar, arrayList, false, 6));
                        } else {
                            this.d = mVar;
                            this.f54751e = new ArrayList(arrayList);
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
