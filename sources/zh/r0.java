package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r0 implements Runnable {
    public final int f52096a = 0;
    public final Utilities.Callback f52097b;
    public final Object f52098c;

    public r0(String str, Utilities.Callback callback) {
        this.f52098c = str;
        this.f52097b = callback;
    }

    @Override
    public final void run() {
        switch (this.f52096a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r0(this.f52097b, h.a(AndroidUtilities.dp(240.0f), (String) this.f52098c)));
                return;
            default:
                this.f52097b.run((g) this.f52098c);
                return;
        }
    }

    public r0(Utilities.Callback callback, g gVar) {
        this.f52097b = callback;
        this.f52098c = gVar;
    }
}
