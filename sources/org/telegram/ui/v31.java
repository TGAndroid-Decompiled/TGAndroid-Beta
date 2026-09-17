package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class v31 implements z31 {
    public final bo f38270a;
    public final Activity f38271b;
    public final org.telegram.ui.ActionBar.f6 f38272c;
    public final MessageObject d;

    public v31(bo boVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject) {
        this.f38270a = boVar;
        this.f38271b = activity;
        this.f38272c = f6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new p31(this.f38270a, this.f38271b, this.f38272c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ue(this.f38270a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        bo boVar = this.f38270a;
        boVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) boVar, 3, true));
    }
}
