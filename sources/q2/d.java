package q2;

import android.os.Handler;
import h2.l0;
import org.telegram.ui.web.i1;
public final class d implements l {
    public final j f55749a;
    public g f55750b;
    public boolean f55751c;
    public final e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.f55749a = jVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.K;
        handler.getClass();
        l0.W(handler, new i1(this, 2));
    }
}
