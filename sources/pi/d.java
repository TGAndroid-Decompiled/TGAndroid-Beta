package pi;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f41360a;
    public final e f41361b;

    public d(f fVar, e eVar) {
        this.f41360a = fVar;
        this.f41361b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f41360a, this.f41361b, j3, 29));
    }
}
