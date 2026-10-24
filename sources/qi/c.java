package qi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.dc0;
public final class c implements RequestTimeDelegate {
    public final e f45170a;
    public final d f45171b;

    public c(e eVar, d dVar) {
        this.f45170a = eVar;
        this.f45171b = dVar;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new dc0(this.f45170a, this.f45171b, j10, 2));
    }
}
