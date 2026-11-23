package xi;

import org.telegram.messenger.g0;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.f80;
public final class c implements RequestTimeDelegate {
    public final e f60743a;
    public final d f60744b;

    public c(e eVar, d dVar) {
        this.f60743a = eVar;
        this.f60744b = dVar;
    }

    @Override
    public void run(long j3) {
        g0.g3(new f80(this.f60743a, this.f60744b, j3, 3));
    }
}
