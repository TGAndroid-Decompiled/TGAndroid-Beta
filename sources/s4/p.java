package s4;

import a8.qa;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.hn;
public abstract class p extends q {
    public final Object f57004a = new Object();
    public Executor f57005b;
    public hn f57006c;
    public m d;
    public ArrayList f57007e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(m mVar, ArrayList arrayList) {
        if (mVar != null) {
            synchronized (this.f57004a) {
                try {
                    try {
                        Executor executor = this.f57005b;
                        if (executor != null) {
                            executor.execute(new qa(this, this.f57006c, mVar, arrayList, false, 6));
                        } else {
                            this.d = mVar;
                            this.f57007e = new ArrayList(arrayList);
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
