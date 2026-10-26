package ti;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.bc0;
public final class c implements RequestTimeDelegate {
    public final e f49177a;
    public final d f49178b;

    public c(e eVar, d dVar) {
        this.f49177a = eVar;
        this.f49178b = dVar;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new bc0(this.f49177a, this.f49178b, j10, 2));
    }
}
