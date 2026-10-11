package pi;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f45966a;
    public final e f45967b;

    public d(f fVar, e eVar) {
        this.f45966a = fVar;
        this.f45967b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f45966a, this.f45967b, j3, 29));
    }
}
