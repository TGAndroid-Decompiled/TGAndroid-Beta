package q2;

import android.os.Handler;
import h2.l0;
import org.telegram.ui.web.z0;
public final class d implements l {
    public final j f55780a;
    public g f55781b;
    public boolean f55782c;
    public final e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.f55780a = jVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.K;
        handler.getClass();
        l0.W(handler, new z0(this, 3));
    }
}
