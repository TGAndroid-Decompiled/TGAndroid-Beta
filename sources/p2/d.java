package p2;

import android.os.Handler;
import g2.n0;
import org.telegram.ui.ActionBar.d4;
public final class d implements l {
    public final j f53095a;
    public g f53096b;
    public boolean f53097c;
    public final e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.f53095a = jVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.K;
        handler.getClass();
        n0.W(handler, new d4(this, 25));
    }
}
