package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class w31 implements a41 {
    public final eo f43033a;
    public final Activity f43034b;
    public final org.telegram.ui.ActionBar.c6 f43035c;
    public final MessageObject d;

    public w31(eo eoVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject) {
        this.f43033a = eoVar;
        this.f43034b = activity;
        this.f43035c = c6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new p31(this.f43033a, this.f43034b, this.f43035c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ze(this.f43033a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        eo eoVar = this.f43033a;
        eoVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) eoVar, 3, true));
    }
}
