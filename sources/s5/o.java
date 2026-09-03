package s5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
import org.telegram.ui.Components.tp0;
public abstract class o extends BasePendingResult {
    public tp0 f44157o;
    public final boolean f44158p;
    public final h f44159q;

    public o(h hVar, boolean z4) {
        super(null);
        this.f44159q = hVar;
        this.f44158p = z4;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new n(status, 1);
    }

    public abstract void n();

    public final u5.o o() {
        if (this.f44157o == null) {
            this.f44157o = new tp0(this, 13);
        }
        return this.f44157o;
    }

    public final void p() {
        if (!this.f44158p) {
            Iterator it = this.f44159q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f44159q.f44142i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        try {
            synchronized (this.f44159q.f44137a) {
                n();
            }
        } catch (u5.l unused) {
            a(new n(new Status(2100, null, null, null), 1));
        }
    }
}
