package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class r21 implements t21 {
    public final org.telegram.ui.ActionBar.o2 f41846a;
    public final Context f41847b;
    public final org.telegram.ui.ActionBar.c6 f41848c;
    public final org.telegram.ui.Components.ii0 d;

    public r21(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.ii0 ii0Var) {
        this.f41846a = o2Var;
        this.f41847b = context;
        this.f41848c = c6Var;
        this.d = ii0Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new l21(this.f41846a, this.f41847b, this.f41848c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new av0(29, this.f41846a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f41846a;
        o2Var.showDialog(new cg.p1(o2Var, 3, true));
    }
}
