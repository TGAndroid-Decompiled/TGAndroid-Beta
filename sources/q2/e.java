package q2;

import android.os.Handler;
import h2.l0;
public final class e implements m {
    public final k f55165a;
    public h f55166b;
    public boolean f55167c;
    public final f d;

    public e(f fVar, k kVar) {
        this.d = fVar;
        this.f55165a = kVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.K;
        handler.getClass();
        l0.W(handler, new d(this, 0));
    }
}
