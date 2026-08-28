package v0;

import android.graphics.Typeface;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import xf.g0;
import yf.m2;
public final class l implements t2.g, com.google.android.exoplayer2.upstream.l, g0, y8.e, x9.a, y8.d, OnFailureListener, b2 {
    public final int f48237a;

    public l(int i9) {
        this.f48237a = i9;
    }

    @Override
    public Object H1(b3.b bVar) {
        switch (this.f48237a) {
            case 12:
                return FirebaseInstallationsRegistrar.a(bVar);
            case 13:
            default:
                y8.n nVar = ExecutorsRegistrar.f4089a;
                return z8.j.f50384a;
            case 14:
                return (ScheduledExecutorService) ExecutorsRegistrar.f4089a.get();
            case 15:
                return (ScheduledExecutorService) ExecutorsRegistrar.f4091c.get();
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.f4090b.get();
        }
    }

    @Override
    public Typeface a() {
        switch (this.f48237a) {
            case 4:
                return AndroidUtilities.getTypeface("fonts/rmedium.ttf");
            case 5:
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            case 6:
                return Typeface.create("serif", 1);
            case 7:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 8:
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
    public com.google.android.exoplayer2.upstream.m createDataSource() {
        return new com.google.android.exoplayer2.upstream.c(ApplicationLoader.applicationContext);
    }

    @Override
    public void f(c2 c2Var, int i9) {
        switch (this.f48237a) {
            case 18:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i9 = m2.f49981n0;
    }

    @Override
    public void c(Exception exc) {
    }

    @Override
    public void e(x9.b bVar) {
    }
}
