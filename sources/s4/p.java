package s4;

import a8.pa;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.vy;
public abstract class p extends q {
    public final Object f54864a = new Object();
    public Executor f54865b;
    public vy f54866c;
    public m d;
    public ArrayList f54867e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(m mVar, ArrayList arrayList) {
        if (mVar != null) {
            synchronized (this.f54864a) {
                try {
                    try {
                        Executor executor = this.f54865b;
                        if (executor != null) {
                            executor.execute(new pa(this, this.f54866c, mVar, arrayList, false, 6));
                        } else {
                            this.d = mVar;
                            this.f54867e = new ArrayList(arrayList);
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
