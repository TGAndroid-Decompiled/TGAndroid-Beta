package rf;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.ov0;
public final class d implements RequestTimeDelegate {
    public final f f43483a;
    public final e f43484b;

    public d(f fVar, e eVar) {
        this.f43483a = fVar;
        this.f43484b = eVar;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new ov0(this.f43483a, this.f43484b, j10));
    }
}
