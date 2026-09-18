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
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class wk0 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.zc0, Utilities.Callback2Return, org.telegram.ui.Components.ew0, pg.i0, q3.g, q9.e, pa.a, q9.d, OnFailureListener, androidx.car.app.utils.b {
    public final int f39184a;

    public wk0(int i10) {
        this.f39184a = i10;
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
        switch (this.f39184a) {
            case 16:
                return AndroidUtilities.getTypeface("fonts/rmedium.ttf");
            case 17:
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            case 18:
                return Typeface.create("serif", 1);
            case 19:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 20:
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
        switch (this.f39184a) {
            case 0:
                b2Var.dismiss();
                return;
            case 1:
            case 5:
            case 8:
            default:
                b2Var.dismiss();
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                return;
            case 3:
                b2Var.dismiss();
                return;
            case 4:
                b2Var.dismiss();
                return;
            case 6:
                b2Var.dismiss();
                return;
            case 7:
                b2Var.dismiss();
                return;
            case 9:
                b2Var.dismiss();
                return;
            case 10:
                b2Var.dismiss();
                return;
            case 11:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void h(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override
    public String j(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.AutoLockDisabled);
        }
        if (i10 == 1) {
            return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 1, new Object[0]));
        }
        if (i10 == 2) {
            return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 5, new Object[0]));
        }
        if (i10 == 3) {
            return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 1, new Object[0]));
        }
        if (i10 == 4) {
            return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 5, new Object[0]));
        }
        return "";
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = qg.m2.f41775r0;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return yh.v7.X0(false, LocaleController.formatPluralStringComma("Stars", num.intValue()), 0.66f, null);
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void g(pa.b bVar) {
    }

    @Override
    public void n() {
    }
}
