package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class z31 implements d41 {
    public final eo f39202a;
    public final Activity f39203b;
    public final org.telegram.ui.ActionBar.f6 f39204c;
    public final MessageObject d;

    public z31(eo eoVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject) {
        this.f39202a = eoVar;
        this.f39203b = activity;
        this.f39204c = f6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new t31(this.f39202a, this.f39203b, this.f39204c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ve(this.f39202a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        eo eoVar = this.f39202a;
        eoVar.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) eoVar, 3, true));
    }
}
