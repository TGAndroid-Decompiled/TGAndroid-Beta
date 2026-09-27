package org.telegram.ui.web;

import android.graphics.Typeface;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.AndroidUtilities;
public final class d0 implements org.telegram.ui.ActionBar.b2, pg.i0, q3.g, q9.e, pa.a, q9.d, OnFailureListener, androidx.car.app.utils.b {
    public final int f38994a;

    public d0(int i10) {
        this.f38994a = i10;
    }

    public static AudioRecordingConfiguration d(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static MediaRoute2Info e(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override
    public Object G(cf.c cVar) {
        qa.d lambda$getComponents$0;
        switch (this.f38994a) {
            case 13:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(cVar);
                return lambda$getComponents$0;
            case 20:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7244a.get();
            case 21:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7246c.get();
            case 22:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7245b.get();
            default:
                q9.n nVar = ExecutorsRegistrar.f7244a;
                return r9.j.f42502a;
        }
    }

    @Override
    public Typeface a() {
        switch (this.f38994a) {
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
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override
    public void call() {
        throw null;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f38994a) {
            case 0:
                c2Var.dismiss();
                return;
            case 24:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = qg.n2.f41846r0;
    }

    @Override
    public void g(pa.b bVar) {
    }
}
