package xi;

import org.telegram.messenger.g0;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.g80;
public final class c implements RequestTimeDelegate {
    public final e f60660a;
    public final d f60661b;

    public c(e eVar, d dVar) {
        this.f60660a = eVar;
        this.f60661b = dVar;
    }

    @Override
    public void run(long j3) {
        g0.g3(new g80(this.f60660a, this.f60661b, j3, 3));
    }
}
