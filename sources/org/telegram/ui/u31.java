package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class u31 implements y31 {
    public final zn f37949a;
    public final Activity f37950b;
    public final org.telegram.ui.ActionBar.f6 f37951c;
    public final MessageObject d;

    public u31(zn znVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject) {
        this.f37949a = znVar;
        this.f37950b = activity;
        this.f37951c = f6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new o31(this.f37949a, this.f37950b, this.f37951c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ue(this.f37949a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        zn znVar = this.f37949a;
        znVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) znVar, 3, true));
    }
}
