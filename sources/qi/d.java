package qi;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f45521a;
    public final e f45522b;

    public d(f fVar, e eVar) {
        this.f45521a = fVar;
        this.f45522b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f45521a, this.f45522b, j3, 29));
    }
}
