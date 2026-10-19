package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class t0 implements Runnable {
    public final int f52116a = 0;
    public final Utilities.Callback f52117b;
    public final Object f52118c;

    public t0(String str, Utilities.Callback callback) {
        this.f52118c = str;
        this.f52117b = callback;
    }

    @Override
    public final void run() {
        switch (this.f52116a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t0(this.f52117b, f.b(AndroidUtilities.dp(240.0f), (String) this.f52118c)));
                return;
            default:
                this.f52117b.run((e) this.f52118c);
                return;
        }
    }

    public t0(Utilities.Callback callback, e eVar) {
        this.f52117b = callback;
        this.f52118c = eVar;
    }
}
