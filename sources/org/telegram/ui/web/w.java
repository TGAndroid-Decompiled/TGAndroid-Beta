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
public final class w implements org.telegram.ui.ActionBar.a2, pg.i0, q3.g, q9.e, pa.a, q9.d, OnFailureListener, androidx.car.app.utils.b {
    public final int f42420a;

    public w(int i10) {
        this.f42420a = i10;
    }

    public static AudioRecordingConfiguration d(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static MediaRoute2Info e(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override
    public Object E(cf.c cVar) {
        qa.d lambda$getComponents$0;
        switch (this.f42420a) {
            case 14:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(cVar);
                return lambda$getComponents$0;
            case 21:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7831a.get();
            case 22:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7833c.get();
            case 23:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7832b.get();
            default:
                q9.n nVar = ExecutorsRegistrar.f7831a;
                return r9.j.f45972a;
        }
    }

    @Override
    public Typeface a() {
        switch (this.f42420a) {
            case 5:
                return AndroidUtilities.getTypeface("fonts/rmedium.ttf");
            case 6:
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            case 7:
                return Typeface.create("serif", 1);
            case 8:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 9:
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
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42420a) {
            case 0:
                b2Var.dismiss();
                return;
            case 1:
                b2Var.dismiss();
                return;
            case 25:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = qg.n2.f45223r0;
    }

    @Override
    public void f(pa.b bVar) {
    }
}
