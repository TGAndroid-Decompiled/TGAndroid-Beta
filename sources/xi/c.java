package xi;

import org.telegram.messenger.g0;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.f80;
public final class c implements RequestTimeDelegate {
    public final e f60614a;
    public final d f60615b;

    public c(e eVar, d dVar) {
        this.f60614a = eVar;
        this.f60615b = dVar;
    }

    @Override
    public void run(long j3) {
        g0.g3(new f80(this.f60614a, this.f60615b, j3, 3));
    }
}
