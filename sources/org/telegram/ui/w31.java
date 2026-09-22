package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class w31 implements y31 {
    public final org.telegram.ui.ActionBar.n2 f38690a;
    public final Context f38691b;
    public final org.telegram.ui.ActionBar.e6 f38692c;
    public final org.telegram.ui.Components.ny d;

    public w31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ny nyVar) {
        this.f38690a = n2Var;
        this.f38691b = context;
        this.f38692c = e6Var;
        this.d = nyVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new q31(this.f38690a, this.f38691b, this.f38692c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new iy0(20, this.f38690a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f38690a;
        n2Var.showDialog(new rg.x0(n2Var, 3, true));
    }
}
