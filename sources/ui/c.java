package ui;

import org.telegram.messenger.g0;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.ea0;
public final class c implements RequestTimeDelegate {
    public final e f56807a;
    public final d f56808b;

    public c(e eVar, d dVar) {
        this.f56807a = eVar;
        this.f56808b = dVar;
    }

    @Override
    public void run(long j3) {
        g0.h3(new ea0(this.f56807a, this.f56808b, j3, 2));
    }
}
