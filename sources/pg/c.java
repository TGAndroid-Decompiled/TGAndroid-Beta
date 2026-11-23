package pg;

import android.view.View;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
public final class c implements w10 {
    public final int f55721a;

    public c(int i7) {
        this.f55721a = i7;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f55721a) {
            case 0:
                ((View) obj).invalidate();
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                return;
        }
    }
}
