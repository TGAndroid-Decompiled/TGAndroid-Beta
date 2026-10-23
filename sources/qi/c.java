package qi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.yb0;
public final class c implements RequestTimeDelegate {
    public final e f44759a;
    public final d f44760b;

    public c(e eVar, d dVar) {
        this.f44759a = eVar;
        this.f44760b = dVar;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new yb0(this.f44759a, this.f44760b, j10, 2));
    }
}
