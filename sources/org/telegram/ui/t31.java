package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class t31 implements x31 {
    public final bo f37541a;
    public final Activity f37542b;
    public final org.telegram.ui.ActionBar.e6 f37543c;
    public final MessageObject d;

    public t31(bo boVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject) {
        this.f37541a = boVar;
        this.f37542b = activity;
        this.f37543c = e6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new n31(this.f37541a, this.f37542b, this.f37543c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new se(this.f37541a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        bo boVar = this.f37541a;
        boVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) boVar, 3, true));
    }
}
