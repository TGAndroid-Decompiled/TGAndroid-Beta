package r4;

import com.google.android.gms.common.api.internal.v;
import java.util.ArrayDeque;
public final class d extends k {
    public final int f47058c;
    public final g d;

    public d(g gVar, int i9) {
        this.f47058c = i9;
        this.d = gVar;
    }

    @Override
    public final void release() {
        boolean z10;
        switch (this.f47058c) {
            case 0:
                ArrayDeque arrayDeque = (ArrayDeque) ((v) this.d).d;
                if (arrayDeque.size() < 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d5.a.i(z10);
                d5.a.f(!arrayDeque.contains(this));
                clear();
                arrayDeque.addFirst(this);
                return;
            default:
                ((e) this.d).releaseOutputBuffer(this);
                return;
        }
    }
}
