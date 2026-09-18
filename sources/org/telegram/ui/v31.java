package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class v31 implements z31 {
    public final bo f38275a;
    public final Activity f38276b;
    public final org.telegram.ui.ActionBar.f6 f38277c;
    public final MessageObject d;

    public v31(bo boVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject) {
        this.f38275a = boVar;
        this.f38276b = activity;
        this.f38277c = f6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new p31(this.f38275a, this.f38276b, this.f38277c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ue(this.f38275a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        bo boVar = this.f38275a;
        boVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) boVar, 3, true));
    }
}
