package s5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
import oh.h4;
public abstract class o extends BasePendingResult {
    public h4 f47097o;
    public final boolean f47098p;
    public final h f47099q;

    public o(h hVar, boolean z4) {
        super(null);
        this.f47099q = hVar;
        this.f47098p = z4;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new n(status, 1);
    }

    public abstract void n();

    public final u5.o o() {
        if (this.f47097o == null) {
            this.f47097o = new h4(this, 18);
        }
        return this.f47097o;
    }

    public final void p() {
        if (!this.f47098p) {
            Iterator it = this.f47099q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f47099q.f47082i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        try {
            synchronized (this.f47099q.f47076a) {
                n();
            }
        } catch (u5.l unused) {
            a(new n(new Status(2100, null, null, null), 1));
        }
    }
}
