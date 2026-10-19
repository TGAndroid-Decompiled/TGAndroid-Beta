package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class t0 implements Runnable {
    public final int f52118a = 0;
    public final Utilities.Callback f52119b;
    public final Object f52120c;

    public t0(String str, Utilities.Callback callback) {
        this.f52120c = str;
        this.f52119b = callback;
    }

    @Override
    public final void run() {
        switch (this.f52118a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t0(this.f52119b, f.c((String) this.f52120c, AndroidUtilities.dp(240.0f), ic.c.M, 0.75f, null)));
                return;
            default:
                this.f52119b.run((e) this.f52120c);
                return;
        }
    }

    public t0(Utilities.Callback callback, e eVar) {
        this.f52119b = callback;
        this.f52120c = eVar;
    }
}
