package qi;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f45528a;
    public final e f45529b;

    public d(f fVar, e eVar) {
        this.f45528a = fVar;
        this.f45529b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f45528a, this.f45529b, j3, 29));
    }
}
