package qi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.ec0;
public final class c implements RequestTimeDelegate {
    public final e f45171a;
    public final d f45172b;

    public c(e eVar, d dVar) {
        this.f45171a = eVar;
        this.f45172b = dVar;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new ec0(this.f45171a, this.f45172b, j10, 2));
    }
}
