package r0;

import android.graphics.Typeface;
import android.media.MediaRoute2Info;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import tg.e2;
public final class f1 implements g9.k, sg.y, t3.g, OnFailureListener, u9.e, ua.a {
    public final int f56236a;

    public f1(int i7) {
        this.f56236a = i7;
    }

    public static MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override
    public Typeface a() {
        switch (this.f56236a) {
            case 18:
                return org.telegram.messenger.g0.o1("fonts/rmedium.ttf");
            case 19:
                return org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf");
            case 20:
                return Typeface.create("serif", 1);
            case 21:
                return org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf");
            case 22:
                return org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            default:
                return org.telegram.messenger.g0.o1("fonts/mw_bold.ttf");
        }
    }

    @Override
    public Object apply(Object obj) {
        r2.p pVar = (r2.p) obj;
        pVar.h();
        return h9.i0.q(h9.o.y(pVar.Z.f60213b, new x2.z0(1)));
    }

    @Override
    public boolean c(int i7, int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override
    public List k(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override
    public void onFailure(Exception exc) {
        int i7 = e2.f57800s0;
    }

    @Override
    public void b(ua.b bVar) {
    }
}
