package qi;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f45535a;
    public final e f45536b;

    public d(f fVar, e eVar) {
        this.f45535a = fVar;
        this.f45536b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f45535a, this.f45536b, j3, 29));
    }
}
