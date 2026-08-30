package s5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class o extends BasePendingResult {
    public o2.o f44092o;
    public final boolean f44093p;
    public final h f44094q;

    public o(h hVar, boolean z4) {
        super(null);
        this.f44094q = hVar;
        this.f44093p = z4;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new n(status, 1);
    }

    public abstract void n();

    public final u5.o o() {
        if (this.f44092o == null) {
            this.f44092o = new o2.o(this, 21);
        }
        return this.f44092o;
    }

    public final void p() {
        if (!this.f44093p) {
            Iterator it = this.f44094q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f44094q.f44077i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        try {
            synchronized (this.f44094q.f44072a) {
                n();
            }
        } catch (u5.l unused) {
            a(new n(new Status(2100, null, null, null), 1));
        }
    }
}
