package ti;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.dc0;
public final class c implements RequestTimeDelegate {
    public final e f49212a;
    public final d f49213b;

    public c(e eVar, d dVar) {
        this.f49212a = eVar;
        this.f49213b = dVar;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new dc0(this.f49212a, this.f49213b, j10, 2));
    }
}
