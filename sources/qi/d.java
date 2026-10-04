package qi;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f45520a;
    public final e f45521b;

    public d(f fVar, e eVar) {
        this.f45520a = fVar;
        this.f45521b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f45520a, this.f45521b, j3, 29));
    }
}
