package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class v31 implements a41 {
    public final eo f42663a;
    public final Activity f42664b;
    public final org.telegram.ui.ActionBar.c6 f42665c;
    public final MessageObject d;

    public v31(eo eoVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject) {
        this.f42663a = eoVar;
        this.f42664b = activity;
        this.f42665c = c6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new p31(this.f42663a, this.f42664b, this.f42665c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ze(this.f42663a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        eo eoVar = this.f42663a;
        eoVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) eoVar, 3, true));
    }
}
