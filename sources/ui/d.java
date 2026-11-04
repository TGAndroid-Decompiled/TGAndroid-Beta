package ui;

import org.telegram.messenger.g0;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.z70;
public final class d implements RequestTimeDelegate {
    public final f f56383a;
    public final e f56384b;

    public d(f fVar, e eVar) {
        this.f56383a = fVar;
        this.f56384b = eVar;
    }

    @Override
    public void run(long j10) {
        g0.h3(new z70(this.f56383a, this.f56384b, j10, 3));
    }
}
