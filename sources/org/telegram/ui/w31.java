package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class w31 implements y31 {
    public final org.telegram.ui.ActionBar.n2 f38670a;
    public final Context f38671b;
    public final org.telegram.ui.ActionBar.f6 f38672c;
    public final org.telegram.ui.Components.wn0 d;

    public w31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.wn0 wn0Var) {
        this.f38670a = n2Var;
        this.f38671b = context;
        this.f38672c = f6Var;
        this.d = wn0Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new q31(this.f38670a, this.f38671b, this.f38672c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new rx0(26, this.f38670a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f38670a;
        n2Var.showDialog(new rg.x0(n2Var, 3, true));
    }
}
