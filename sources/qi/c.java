package qi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.ac0;
public final class c implements RequestTimeDelegate {
    public final e f44772a;
    public final d f44773b;

    public c(e eVar, d dVar) {
        this.f44772a = eVar;
        this.f44773b = dVar;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new ac0(this.f44772a, this.f44773b, j10, 2));
    }
}
