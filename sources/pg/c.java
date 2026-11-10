package pg;

import android.view.View;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class c implements c20 {
    public final int f53614a;

    public c(int i7) {
        this.f53614a = i7;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f53614a) {
            case 0:
                ((View) obj).invalidate();
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                return;
        }
    }
}
