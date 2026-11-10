package q2;

import android.os.Handler;
import h2.m0;
import org.telegram.ui.ActionBar.p5;
public final class d implements l {
    public final j f53728a;
    public g f53729b;
    public boolean f53730c;
    public final e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.f53728a = jVar;
    }

    @Override
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        m0.W(handler, new p5(this, 18));
    }
}
