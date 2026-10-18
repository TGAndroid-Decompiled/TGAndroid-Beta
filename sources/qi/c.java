package qi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.ac0;
public final class c implements RequestTimeDelegate {
    public final e f44792a;
    public final d f44793b;

    public c(e eVar, d dVar) {
        this.f44792a = eVar;
        this.f44793b = dVar;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new ac0(this.f44792a, this.f44793b, j10, 2));
    }
}
