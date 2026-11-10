package s0;

import android.graphics.Typeface;
import android.media.MediaRoute2Info;
import android.view.WindowManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.lt0;
import sg.z;
import tg.c2;
public final class b implements z, t3.g, OnFailureListener, kt0, lt0, u9.e, ua.a, r1 {
    public final int f54604a;

    public b(int i7) {
        this.f54604a = i7;
    }

    public static MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override
    public Typeface a() {
        switch (this.f54604a) {
            case 10:
                return g0.o1("fonts/rmedium.ttf");
            case 11:
                return g0.o1("fonts/rmediumitalic.ttf");
            case 12:
                return Typeface.create("serif", 1);
            case 13:
                return g0.o1("fonts/rcondensedbold.ttf");
            case 14:
                return g0.o1("fonts/rmono.ttf");
            default:
                return g0.o1("fonts/mw_bold.ttf");
        }
    }

    @Override
    public boolean b(int i7, int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override
    public void f(Object obj, float f10) {
        ti.i iVar = (ti.i) obj;
        switch (this.f54604a) {
            case 21:
                WindowManager.LayoutParams layoutParams = iVar.f56096e;
                iVar.B = f10;
                layoutParams.x = (int) f10;
                iVar.r();
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = iVar.f56096e;
                iVar.C = f10;
                layoutParams2.y = (int) f10;
                iVar.r();
                return;
        }
    }

    @Override
    public void g(u1 u1Var, int i7) {
        switch (this.f54604a) {
            case 28:
                u1Var.dismiss();
                return;
            default:
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        ti.i iVar = (ti.i) obj;
        switch (this.f54604a) {
            case 20:
                return iVar.B;
            default:
                return iVar.C;
        }
    }

    @Override
    public List i(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override
    public void onFailure(Exception exc) {
        int i7 = c2.f55599r0;
    }

    @Override
    public void c(ua.b bVar) {
    }
}
