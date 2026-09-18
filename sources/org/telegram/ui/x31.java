package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class x31 implements z31 {
    public final org.telegram.ui.ActionBar.o2 f39366a;
    public final Context f39367b;
    public final org.telegram.ui.ActionBar.f6 f39368c;
    public final org.telegram.ui.Components.ny d;

    public x31(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ny nyVar) {
        this.f39366a = o2Var;
        this.f39367b = context;
        this.f39368c = f6Var;
        this.d = nyVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new r31(this.f39366a, this.f39367b, this.f39368c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ky0(20, this.f39366a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f39366a;
        o2Var.showDialog(new rg.x0(o2Var, 3, true));
    }
}
