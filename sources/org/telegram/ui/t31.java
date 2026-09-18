package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class t31 implements x31 {
    public final zn f37558a;
    public final Activity f37559b;
    public final org.telegram.ui.ActionBar.e6 f37560c;
    public final MessageObject d;

    public t31(zn znVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject) {
        this.f37558a = znVar;
        this.f37559b = activity;
        this.f37560c = e6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new n31(this.f37558a, this.f37559b, this.f37560c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ue(this.f37558a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        zn znVar = this.f37558a;
        znVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) znVar, 3, true));
    }
}
