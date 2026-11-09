package q2;

import android.os.Handler;
import h2.m0;
import org.telegram.ui.ActionBar.o5;
public final class d implements l {
    public final j f53729a;
    public g f53730b;
    public boolean f53731c;
    public final e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.f53729a = jVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        m0.W(handler, new o5(this, 18));
    }
}
