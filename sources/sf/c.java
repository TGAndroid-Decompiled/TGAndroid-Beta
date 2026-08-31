package sf;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.jv0;
public final class c implements RequestTimeDelegate {
    public final e f47308a;
    public final d f47309b;

    public c(e eVar, d dVar) {
        this.f47308a = eVar;
        this.f47309b = dVar;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new jv0(this.f47308a, this.f47309b, j10));
    }
}
