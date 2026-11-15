package r2;

import android.graphics.Typeface;
import android.media.MediaRoute2Info;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import h9.i0;
import java.util.List;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import sg.y;
import tg.f2;
import x2.p1;
public final class j implements g9.k, y, t3.g, OnFailureListener, u9.e, ua.a, q1 {
    public final int f55801a;

    public j(int i7) {
        this.f55801a = i7;
    }

    public static MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override
    public Typeface a() {
        switch (this.f55801a) {
            case 17:
                return g0.o1("fonts/rmedium.ttf");
            case 18:
                return g0.o1("fonts/rmediumitalic.ttf");
            case 19:
                return Typeface.create("serif", 1);
            case 20:
                return g0.o1("fonts/rcondensedbold.ttf");
            case 21:
                return g0.o1("fonts/rmono.ttf");
            default:
                return g0.o1("fonts/mw_bold.ttf");
        }
    }

    @Override
    public Object apply(Object obj) {
        q qVar = (q) obj;
        qVar.n();
        return i0.q(h9.o.y(qVar.Z.f59641b, new p1(0)));
    }

    @Override
    public boolean c(int i7, int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override
    public void h(t1 t1Var, int i7) {
        t1Var.dismiss();
    }

    @Override
    public List l(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override
    public void onFailure(Exception exc) {
        int i7 = f2.f57237s0;
    }

    @Override
    public void b(ua.b bVar) {
    }
}
