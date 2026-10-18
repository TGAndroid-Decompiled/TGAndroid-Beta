package qi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.ac0;
public final class c implements RequestTimeDelegate {
    public final e f44747a;
    public final d f44748b;

    public c(e eVar, d dVar) {
        this.f44747a = eVar;
        this.f44748b = dVar;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new ac0(this.f44747a, this.f44748b, j10, 2));
    }
}
