package xi;

import org.telegram.messenger.g0;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.g80;
public final class c implements RequestTimeDelegate {
    public final e f60615a;
    public final d f60616b;

    public c(e eVar, d dVar) {
        this.f60615a = eVar;
        this.f60616b = dVar;
    }

    @Override
    public void run(long j3) {
        g0.g3(new g80(this.f60615a, this.f60616b, j3, 3));
    }
}
