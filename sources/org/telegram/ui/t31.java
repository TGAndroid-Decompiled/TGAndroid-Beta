package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class t31 implements x31 {
    public final zn f42053a;
    public final Activity f42054b;
    public final org.telegram.ui.ActionBar.d6 f42055c;
    public final MessageObject d;

    public t31(zn znVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject) {
        this.f42053a = znVar;
        this.f42054b = activity;
        this.f42055c = d6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new n31(this.f42053a, this.f42054b, this.f42055c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ue(this.f42053a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        zn znVar = this.f42053a;
        znVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) znVar, 3, true));
    }
}
