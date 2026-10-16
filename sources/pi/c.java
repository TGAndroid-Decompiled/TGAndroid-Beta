package pi;

import a3.i0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class c implements RequestTimeDelegate {
    public final e f42939a;
    public final d f42940b;

    public c(e eVar, d dVar) {
        this.f42939a = eVar;
        this.f42940b = dVar;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new i0(this.f42939a, this.f42940b, j10, 29));
    }
}
