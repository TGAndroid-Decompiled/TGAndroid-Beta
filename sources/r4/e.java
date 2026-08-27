package r4;

import com.google.android.gms.common.api.internal.v;
import java.util.ArrayDeque;

public final class e extends l {

    public final int f46749c;
    public final h d;

    public e(h hVar, int i10) {
        this.f46749c = i10;
        this.d = hVar;
    }

    @Override
    public final void release() {
        switch (this.f46749c) {
            case 0:
                ArrayDeque arrayDeque = (ArrayDeque) ((v) this.d).d;
                d5.a.i(arrayDeque.size() < 2);
                d5.a.f(!arrayDeque.contains(this));
                clear();
                arrayDeque.addFirst(this);
                break;
            default:
                ((f) this.d).releaseOutputBuffer(this);
                break;
        }
    }
}
