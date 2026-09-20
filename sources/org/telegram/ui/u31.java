package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class u31 implements y31 {
    public final zn f37948a;
    public final Activity f37949b;
    public final org.telegram.ui.ActionBar.f6 f37950c;
    public final MessageObject d;

    public u31(zn znVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject) {
        this.f37948a = znVar;
        this.f37949b = activity;
        this.f37950c = f6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new o31(this.f37948a, this.f37949b, this.f37950c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ue(this.f37948a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        zn znVar = this.f37948a;
        znVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) znVar, 3, true));
    }
}
