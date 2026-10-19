package qi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.yb0;
public final class c implements RequestTimeDelegate {
    public final e f44745a;
    public final d f44746b;

    public c(e eVar, d dVar) {
        this.f44745a = eVar;
        this.f44746b = dVar;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new yb0(this.f44745a, this.f44746b, j10, 2));
    }
}
