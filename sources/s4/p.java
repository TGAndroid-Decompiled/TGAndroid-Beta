package s4;

import a8.qa;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.jn;
public abstract class p extends q {
    public final Object f57049a = new Object();
    public Executor f57050b;
    public jn f57051c;
    public m d;
    public ArrayList f57052e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(m mVar, ArrayList arrayList) {
        if (mVar != null) {
            synchronized (this.f57049a) {
                try {
                    try {
                        Executor executor = this.f57050b;
                        if (executor != null) {
                            executor.execute(new qa(this, this.f57051c, mVar, arrayList, false, 6));
                        } else {
                            this.d = mVar;
                            this.f57052e = new ArrayList(arrayList);
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
