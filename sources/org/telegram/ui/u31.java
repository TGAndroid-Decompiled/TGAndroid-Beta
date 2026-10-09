package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class u31 implements y31 {
    public final zn f42317a;
    public final Activity f42318b;
    public final org.telegram.ui.ActionBar.e6 f42319c;
    public final MessageObject d;

    public u31(zn znVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject) {
        this.f42317a = znVar;
        this.f42318b = activity;
        this.f42319c = e6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new o31(this.f42317a, this.f42318b, this.f42319c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ve(this.f42317a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        zn znVar = this.f42317a;
        znVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) znVar, 3, true));
    }
}
