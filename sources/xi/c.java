package xi;

import org.telegram.messenger.g0;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.g80;
public final class c implements RequestTimeDelegate {
    public final e f60656a;
    public final d f60657b;

    public c(e eVar, d dVar) {
        this.f60656a = eVar;
        this.f60657b = dVar;
    }

    @Override
    public void run(long j3) {
        g0.g3(new g80(this.f60656a, this.f60657b, j3, 3));
    }
}
