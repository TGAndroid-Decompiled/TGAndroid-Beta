package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class u31 implements y31 {
    public final bo f37798a;
    public final Activity f37799b;
    public final org.telegram.ui.ActionBar.e6 f37800c;
    public final MessageObject d;

    public u31(bo boVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject) {
        this.f37798a = boVar;
        this.f37799b = activity;
        this.f37800c = e6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new o31(this.f37798a, this.f37799b, this.f37800c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new se(this.f37798a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        bo boVar = this.f37798a;
        boVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) boVar, 3, true));
    }
}
