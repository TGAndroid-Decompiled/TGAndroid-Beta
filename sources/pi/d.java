package pi;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f45932a;
    public final e f45933b;

    public d(f fVar, e eVar) {
        this.f45932a = fVar;
        this.f45933b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f45932a, this.f45933b, j3, 29));
    }
}
