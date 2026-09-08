package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class w31 implements a41 {
    public final co f41781a;
    public final Activity f41782b;
    public final org.telegram.ui.ActionBar.f6 f41783c;
    public final MessageObject d;

    public w31(co coVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject) {
        this.f41781a = coVar;
        this.f41782b = activity;
        this.f41783c = f6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new p31(this.f41781a, this.f41782b, this.f41783c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new te(this.f41781a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        co coVar = this.f41781a;
        coVar.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) coVar, 3, true));
    }
}
