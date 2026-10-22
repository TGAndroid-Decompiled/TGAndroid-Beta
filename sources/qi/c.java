package qi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.yb0;
public final class c implements RequestTimeDelegate {
    public final e f44758a;
    public final d f44759b;

    public c(e eVar, d dVar) {
        this.f44758a = eVar;
        this.f44759b = dVar;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new yb0(this.f44758a, this.f44759b, j10, 2));
    }
}
