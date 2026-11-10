package ui;

import org.telegram.messenger.g0;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.ha0;
public final class c implements RequestTimeDelegate {
    public final e f56932a;
    public final d f56933b;

    public c(e eVar, d dVar) {
        this.f56932a = eVar;
        this.f56933b = dVar;
    }

    @Override
    public void run(long j3) {
        g0.h3(new ha0(this.f56932a, this.f56933b, j3, 2));
    }
}
