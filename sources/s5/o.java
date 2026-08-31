package s5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
import oh.h4;
public abstract class o extends BasePendingResult {
    public h4 f47066o;
    public final boolean f47067p;
    public final h f47068q;

    public o(h hVar, boolean z4) {
        super(null);
        this.f47068q = hVar;
        this.f47067p = z4;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new n(status, 1);
    }

    public abstract void n();

    public final u5.o o() {
        if (this.f47066o == null) {
            this.f47066o = new h4(this, 18);
        }
        return this.f47066o;
    }

    public final void p() {
        if (!this.f47067p) {
            Iterator it = this.f47068q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f47068q.f47051i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        try {
            synchronized (this.f47068q.f47045a) {
                n();
            }
        } catch (u5.l unused) {
            a(new n(new Status(2100, null, null, null), 1));
        }
    }
}
