package org.webrtc.audio;

import android.graphics.Typeface;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import cf.c;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import pg.i0;
import q3.g;
import q9.d;
import q9.e;
import q9.n;
import qg.n2;
import r9.j;
public final class b implements i0, g, e, pa.a, d, OnFailureListener, androidx.car.app.utils.b, z1 {
    public final int f40617a;

    public b(int i10) {
        this.f40617a = i10;
    }

    public static AudioRecordingConfiguration d(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static MediaRoute2Info e(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override
    public Object G(c cVar) {
        qa.d lambda$getComponents$0;
        switch (this.f40617a) {
            case 12:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(cVar);
                return lambda$getComponents$0;
            case 19:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7243a.get();
            case 20:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7245c.get();
            case 21:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7244b.get();
            default:
                n nVar = ExecutorsRegistrar.f7243a;
                return j.f42457a;
        }
    }

    @Override
    public Typeface a() {
        switch (this.f40617a) {
            case 3:
                return AndroidUtilities.getTypeface("fonts/rmedium.ttf");
            case 4:
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            case 5:
                return Typeface.create("serif", 1);
            case 6:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 7:
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
        switch (this.f40617a) {
            case 23:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = n2.f41808r0;
    }

    @Override
    public void g(pa.b bVar) {
    }
}
