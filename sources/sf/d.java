package sf;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.ov0;
public final class d implements RequestTimeDelegate {
    public final f f47344a;
    public final e f47345b;

    public d(f fVar, e eVar) {
        this.f47344a = fVar;
        this.f47345b = eVar;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new ov0(this.f47344a, this.f47345b, j10));
    }
}
