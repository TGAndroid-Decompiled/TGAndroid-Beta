package q2;

import android.os.Handler;
import h2.l0;
import org.telegram.ui.web.z0;
public final class d implements l {
    public final j f55862a;
    public g f55863b;
    public boolean f55864c;
    public final e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.f55862a = jVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.K;
        handler.getClass();
        l0.W(handler, new z0(this, 3));
    }
}
