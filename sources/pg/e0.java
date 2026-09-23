package pg;

import android.graphics.Typeface;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import qg.p2;
public final class e0 implements i0, q3.g, q9.e, pa.a, q9.d, OnFailureListener, androidx.car.app.utils.b, a2 {
    public final int f40809a;

    public e0(int i10) {
        this.f40809a = i10;
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f40809a) {
            case 6:
                return FirebaseInstallationsRegistrar.a(cVar);
            case 13:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7243a.get();
            case 14:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7245c.get();
            case 15:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7244b.get();
            default:
                q9.n nVar = ExecutorsRegistrar.f7243a;
                return r9.j.f42124a;
        }
    }

    @Override
    public Typeface a() {
        switch (this.f40809a) {
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
    public void f(b2 b2Var, int i10) {
        switch (this.f40809a) {
            case 17:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = p2.f41505r0;
    }

    @Override
    public void g(pa.b bVar) {
    }
}
