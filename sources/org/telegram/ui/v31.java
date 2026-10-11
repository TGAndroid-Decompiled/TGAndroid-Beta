package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class v31 implements x31 {
    public final org.telegram.ui.ActionBar.m2 f42900a;
    public final Context f42901b;
    public final org.telegram.ui.ActionBar.d6 f42902c;
    public final org.telegram.ui.Components.ei0 d;

    public v31(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ei0 ei0Var) {
        this.f42900a = m2Var;
        this.f42901b = context;
        this.f42902c = d6Var;
        this.d = ei0Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new p31(this.f42900a, this.f42901b, this.f42902c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new m31(3, this.f42900a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f42900a;
        m2Var.showDialog(new rg.y0(m2Var, 3, true));
    }
}
