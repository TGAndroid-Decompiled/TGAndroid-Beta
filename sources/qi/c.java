package qi;

import a3.i0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class c implements RequestTimeDelegate {
    public final e f43657a;
    public final d f43658b;

    public c(e eVar, d dVar) {
        this.f43657a = eVar;
        this.f43658b = dVar;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new i0(this.f43657a, this.f43658b, j10, 29));
    }
}
