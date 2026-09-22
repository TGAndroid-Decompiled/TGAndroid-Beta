package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class w31 implements y31 {
    public final org.telegram.ui.ActionBar.n2 f38691a;
    public final Context f38692b;
    public final org.telegram.ui.ActionBar.f6 f38693c;
    public final org.telegram.ui.Components.yn0 d;

    public w31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.yn0 yn0Var) {
        this.f38691a = n2Var;
        this.f38692b = context;
        this.f38693c = f6Var;
        this.d = yn0Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new q31(this.f38691a, this.f38692b, this.f38693c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new rx0(26, this.f38691a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f38691a;
        n2Var.showDialog(new rg.x0(n2Var, 3, true));
    }
}
