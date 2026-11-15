package xi;

import org.telegram.messenger.g0;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.d80;
public final class c implements RequestTimeDelegate {
    public final e f60049a;
    public final d f60050b;

    public c(e eVar, d dVar) {
        this.f60049a = eVar;
        this.f60050b = dVar;
    }

    @Override
    public void run(long j3) {
        g0.h3(new d80(this.f60049a, this.f60050b, j3, 3));
    }
}
