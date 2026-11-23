package pg;

import android.view.View;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class c implements y10 {
    public final int f55608a;

    public c(int i7) {
        this.f55608a = i7;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f55608a) {
            case 0:
                ((View) obj).invalidate();
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                return;
        }
    }
}
