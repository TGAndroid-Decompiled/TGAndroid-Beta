package ti;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.bc0;
public final class c implements RequestTimeDelegate {
    public final e f49174a;
    public final d f49175b;

    public c(e eVar, d dVar) {
        this.f49174a = eVar;
        this.f49175b = dVar;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new bc0(this.f49174a, this.f49175b, j10, 2));
    }
}
