package q2;

import android.os.Handler;
import h2.m0;
import org.telegram.ui.ActionBar.m5;
public final class d implements l {
    public final j f53599a;
    public g f53600b;
    public boolean f53601c;
    public final e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.f53599a = jVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        m0.W(handler, new m5(this, 20));
    }
}
