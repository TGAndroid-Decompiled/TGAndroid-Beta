package v4;

import com.google.android.gms.common.api.internal.v;
import java.util.ArrayDeque;
public final class d extends k {
    public final int h;
    public final g f48941n;

    public d(g gVar, int i10) {
        this.h = i10;
        this.f48941n = gVar;
    }

    @Override
    public final void i() {
        boolean z4;
        switch (this.h) {
            case 0:
                ArrayDeque arrayDeque = (ArrayDeque) ((v) this.f48941n).d;
                if (arrayDeque.size() < 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h5.a.i(z4);
                h5.a.f(!arrayDeque.contains(this));
                b();
                arrayDeque.addFirst(this);
                return;
            default:
                ((e) this.f48941n).j(this);
                return;
        }
    }
}
