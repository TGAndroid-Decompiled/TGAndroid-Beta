package s4;

import a8.pa;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.vy;
public abstract class p extends q {
    public final Object f54865a = new Object();
    public Executor f54866b;
    public vy f54867c;
    public m d;
    public ArrayList f54868e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(m mVar, ArrayList arrayList) {
        if (mVar != null) {
            synchronized (this.f54865a) {
                try {
                    try {
                        Executor executor = this.f54866b;
                        if (executor != null) {
                            executor.execute(new pa(this, this.f54867c, mVar, arrayList, false, 6));
                        } else {
                            this.d = mVar;
                            this.f54868e = new ArrayList(arrayList);
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
