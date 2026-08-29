package q5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class n extends BasePendingResult {
    public o1.a f46409o;
    public final boolean f46410p;
    public final h f46411q;

    public n(h hVar, boolean z10) {
        super(null);
        this.f46411q = hVar;
        this.f46410p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new m(status, 1);
    }

    public abstract void n();

    public final s5.o o() {
        if (this.f46409o == null) {
            this.f46409o = new o1.a(this, 16);
        }
        return this.f46409o;
    }

    public final void p() {
        if (!this.f46410p) {
            Iterator it = this.f46411q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f46411q.f46397i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        try {
            synchronized (this.f46411q.f46391a) {
                n();
            }
        } catch (s5.l unused) {
            a(new m(new Status(2100, null, null, null), 1));
        }
    }
}
