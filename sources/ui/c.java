package ui;

import org.telegram.messenger.g0;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.ea0;
public final class c implements RequestTimeDelegate {
    public final e f56924a;
    public final d f56925b;

    public c(e eVar, d dVar) {
        this.f56924a = eVar;
        this.f56925b = dVar;
    }

    @Override
    public void run(long j3) {
        g0.h3(new ea0(this.f56924a, this.f56925b, j3, 2));
    }
}
