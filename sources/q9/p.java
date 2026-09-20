package q9;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import qg.n2;
public final class p implements pa.a, d, OnFailureListener, androidx.car.app.utils.b, a2 {
    public final int f41505a;

    public p(int i10) {
        this.f41505a = i10;
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f41505a) {
            case 1:
                return FirebaseInstallationsRegistrar.a(cVar);
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7261a.get();
            case 9:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7263c.get();
            case 10:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7262b.get();
            default:
                n nVar = ExecutorsRegistrar.f7261a;
                return r9.j.f42471a;
        }
    }

    @Override
    public void call() {
        throw null;
    }

    @Override
    public void k(b2 b2Var, int i10) {
        switch (this.f41505a) {
            case 12:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = n2.f41822r0;
    }

    @Override
    public void f(pa.b bVar) {
    }
}
