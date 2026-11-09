package ui;

import org.telegram.messenger.g0;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.ga0;
public final class c implements RequestTimeDelegate {
    public final e f56936a;
    public final d f56937b;

    public c(e eVar, d dVar) {
        this.f56936a = eVar;
        this.f56937b = dVar;
    }

    @Override
    public void run(long j3) {
        g0.h3(new ga0(this.f56936a, this.f56937b, j3, 2));
    }
}
