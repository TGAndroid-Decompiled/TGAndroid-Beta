package pg;

import android.view.View;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class c implements c20 {
    public final int f53615a;

    public c(int i7) {
        this.f53615a = i7;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f53615a) {
            case 0:
                ((View) obj).invalidate();
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                return;
        }
    }
}
