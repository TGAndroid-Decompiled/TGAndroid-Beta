package org.telegram.ui;

import android.graphics.Typeface;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class sw0 implements Utilities.Callback2Return, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.rv0, g2.g, q3.g, q9.e, pa.a, q9.d, qg.h0, androidx.car.app.utils.d {
    public final int f40560a;

    public sw0(int i10) {
        this.f40560a = i10;
    }

    public static AudioRecordingConfiguration d(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static MediaRoute2Info e(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override
    public Object D(cf.c cVar) {
        qa.d lambda$getComponents$0;
        switch (this.f40560a) {
            case 16:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(cVar);
                return lambda$getComponents$0;
            case 28:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6302a.get();
            default:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6304c.get();
        }
    }

    @Override
    public Typeface a() {
        switch (this.f40560a) {
            case 17:
                return AndroidUtilities.getTypeface("fonts/rmedium.ttf");
            case 18:
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            case 19:
                return Typeface.create("serif", 1);
            case 20:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 21:
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
    public g2.h createDataSource() {
        return new g2.b(ApplicationLoader.applicationContext);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40560a) {
            case 1:
                b2Var.dismiss();
                return;
            case 2:
                b2Var.dismiss();
                return;
            case 3:
            default:
                b2Var.dismiss();
                return;
            case 4:
                b2Var.dismiss();
                return;
            case 5:
                b2Var.dismiss();
                return;
            case 6:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void i(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return zh.v7.X0(false, LocaleController.formatPluralStringComma("Stars", num.intValue()), 0.66f, null);
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void h(pa.b bVar) {
    }

    @Override
    public void l() {
    }
}
