package org.telegram.ui;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class zr0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback2Return, org.telegram.ui.Components.sv0, pg.h0, q3.g, q9.e, pa.a, q9.d, OnFailureListener, androidx.car.app.utils.b {
    public final int f40296a;

    public zr0(int i10) {
        this.f40296a = i10;
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
        lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(cVar);
        return lambda$getComponents$0;
    }

    @Override
    public Typeface a() {
        switch (this.f40296a) {
            case 14:
                return AndroidUtilities.getTypeface("fonts/rmedium.ttf");
            case 15:
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            case 16:
                return Typeface.create("serif", 1);
            case 17:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 18:
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
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40296a) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.T8;
                return;
            case 1:
                b2Var.dismiss();
                return;
            case 2:
                b2Var.dismiss();
                return;
            case 3:
            case 6:
            default:
                b2Var.dismiss();
                return;
            case 4:
                b2Var.dismiss();
                return;
            case 5:
                b2Var.dismiss();
                return;
            case 7:
                b2Var.dismiss();
                return;
            case 8:
                b2Var.dismiss();
                return;
            case 9:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = qg.p2.f41553r0;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return yh.y7.X0(false, LocaleController.formatPluralStringComma("Stars", num.intValue()), 0.66f, null);
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void j(pa.b bVar) {
    }

    @Override
    public void l() {
    }
}
