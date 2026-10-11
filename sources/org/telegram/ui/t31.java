package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class t31 implements x31 {
    public final zn f42087a;
    public final Activity f42088b;
    public final org.telegram.ui.ActionBar.d6 f42089c;
    public final MessageObject d;

    public t31(zn znVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject) {
        this.f42087a = znVar;
        this.f42088b = activity;
        this.f42089c = d6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new n31(this.f42087a, this.f42088b, this.f42089c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ue(this.f42087a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        zn znVar = this.f42087a;
        znVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) znVar, 3, true));
    }
}
