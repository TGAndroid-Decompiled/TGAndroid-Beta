package s4;

import a8.qa;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.nd0;
public abstract class p extends q {
    public final Object f57130a = new Object();
    public Executor f57131b;
    public nd0 f57132c;
    public m d;
    public ArrayList f57133e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(m mVar, ArrayList arrayList) {
        if (mVar != null) {
            synchronized (this.f57130a) {
                try {
                    try {
                        Executor executor = this.f57131b;
                        if (executor != null) {
                            executor.execute(new qa(this, this.f57132c, mVar, arrayList, false, 6));
                        } else {
                            this.d = mVar;
                            this.f57133e = new ArrayList(arrayList);
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
