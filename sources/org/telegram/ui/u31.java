package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class u31 implements y31 {
    public final zn f42363a;
    public final Activity f42364b;
    public final org.telegram.ui.ActionBar.e6 f42365c;
    public final MessageObject d;

    public u31(zn znVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject) {
        this.f42363a = znVar;
        this.f42364b = activity;
        this.f42365c = e6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new o31(this.f42363a, this.f42364b, this.f42365c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ve(this.f42363a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        zn znVar = this.f42363a;
        znVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) znVar, 3, true));
    }
}
