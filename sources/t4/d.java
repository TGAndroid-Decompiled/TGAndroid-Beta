package t4;

import com.google.android.gms.common.api.internal.v;
import java.util.ArrayDeque;
public final class d extends k {
    public final int f48141c;
    public final g d;

    public d(g gVar, int i10) {
        this.f48141c = i10;
        this.d = gVar;
    }

    @Override
    public final void release() {
        boolean z10;
        switch (this.f48141c) {
            case 0:
                ArrayDeque arrayDeque = (ArrayDeque) ((v) this.d).d;
                if (arrayDeque.size() < 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f5.a.i(z10);
                f5.a.f(!arrayDeque.contains(this));
                clear();
                arrayDeque.addFirst(this);
                return;
            default:
                ((e) this.d).releaseOutputBuffer(this);
                return;
        }
    }
}
