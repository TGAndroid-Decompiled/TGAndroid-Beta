package org.telegram.ui.web;

import android.graphics.Typeface;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import rg.o2;
public final class d0 implements org.telegram.ui.ActionBar.z1, q3.g, g2.g, qg.j0, androidx.car.app.utils.b, r9.e, qa.a, r9.d, OnFailureListener {
    public final int f43091a;

    public d0(int i10) {
        this.f43091a = i10;
    }

    public static AudioRecordingConfiguration c(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override
    public Typeface a() {
        switch (this.f43091a) {
            case 7:
                return AndroidUtilities.getTypeface("fonts/rmedium.ttf");
            case 8:
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            case 9:
                return Typeface.create("serif", 1);
            case 10:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 11:
                return AndroidUtilities.getTypeface("fonts/rmono.ttf");
            default:
                return AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
        }
    }

    @Override
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
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
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        c2Var.dismiss();
    }

    @Override
    public Object j2(z5 z5Var) {
        ra.d lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(z5Var);
        return lambda$getComponents$0;
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = o2.f45985r0;
    }

    @Override
    public List v(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override
    public void h(qa.b bVar) {
    }
}
