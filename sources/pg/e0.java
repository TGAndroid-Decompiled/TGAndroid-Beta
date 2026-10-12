package pg;

import android.graphics.Typeface;
import ci.u5;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import qg.o2;
public final class e0 implements i0, q3.g, q9.e, pa.a, q9.d, OnFailureListener, androidx.car.app.utils.b, z1 {
    public final int f45526a;

    public e0(int i10) {
        this.f45526a = i10;
    }

    @Override
    public Typeface a() {
        switch (this.f45526a) {
            case 0:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 1:
                return AndroidUtilities.getTypeface("fonts/rmono.ttf");
            default:
                return AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
        }
    }

    @Override
    public List b(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override
    public void call() {
        throw null;
    }

    @Override
    public void f(a2 a2Var, int i10) {
        switch (this.f45526a) {
            case 19:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = o2.f46409r0;
    }

    @Override
    public Object x0(u5 u5Var) {
        switch (this.f45526a) {
            case 6:
                return FirebaseInstallationsRegistrar.a(u5Var);
            case 15:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7878a.get();
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7880c.get();
            case 17:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7879b.get();
            default:
                q9.n nVar = ExecutorsRegistrar.f7878a;
                return r9.j.f47338a;
        }
    }

    @Override
    public void g(pa.b bVar) {
    }
}
