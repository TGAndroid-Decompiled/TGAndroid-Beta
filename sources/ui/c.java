package ui;

import org.telegram.messenger.g0;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.ea0;
public final class c implements RequestTimeDelegate {
    public final e f56831a;
    public final d f56832b;

    public c(e eVar, d dVar) {
        this.f56831a = eVar;
        this.f56832b = dVar;
    }

    @Override
    public void run(long j3) {
        g0.h3(new ea0(this.f56831a, this.f56832b, j3, 2));
    }
}
