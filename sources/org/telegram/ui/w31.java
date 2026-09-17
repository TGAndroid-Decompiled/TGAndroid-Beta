package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class w31 implements a41 {
    public final co f41782a;
    public final Activity f41783b;
    public final org.telegram.ui.ActionBar.f6 f41784c;
    public final MessageObject d;

    public w31(co coVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject) {
        this.f41782a = coVar;
        this.f41783b = activity;
        this.f41784c = f6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new p31(this.f41782a, this.f41783b, this.f41784c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new te(this.f41782a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        co coVar = this.f41782a;
        coVar.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) coVar, 3, true));
    }
}
