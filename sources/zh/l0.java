package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class l0 implements Runnable {
    public final int f51761a = 0;
    public final Utilities.Callback f51762b;
    public final Object f51763c;

    public l0(String str, Utilities.Callback callback) {
        this.f51763c = str;
        this.f51762b = callback;
    }

    @Override
    public final void run() {
        switch (this.f51761a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l0(this.f51762b, f.b(AndroidUtilities.dp(240.0f), (String) this.f51763c)));
                return;
            default:
                this.f51762b.run((e) this.f51763c);
                return;
        }
    }

    public l0(Utilities.Callback callback, e eVar) {
        this.f51762b = callback;
        this.f51763c = eVar;
    }
}
