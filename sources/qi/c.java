package qi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.yb0;
public final class c implements RequestTimeDelegate {
    public final e f44755a;
    public final d f44756b;

    public c(e eVar, d dVar) {
        this.f44755a = eVar;
        this.f44756b = dVar;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new yb0(this.f44755a, this.f44756b, j10, 2));
    }
}
