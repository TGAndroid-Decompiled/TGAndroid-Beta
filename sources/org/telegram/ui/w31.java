package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class w31 implements y31 {
    public final org.telegram.ui.ActionBar.n2 f43081a;
    public final Context f43082b;
    public final org.telegram.ui.ActionBar.e6 f43083c;
    public final org.telegram.ui.Components.ci0 d;

    public w31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ci0 ci0Var) {
        this.f43081a = n2Var;
        this.f43082b = context;
        this.f43083c = e6Var;
        this.d = ci0Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new q31(this.f43081a, this.f43082b, this.f43083c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new n31(4, this.f43081a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f43081a;
        n2Var.showDialog(new rg.y0(n2Var, 3, true));
    }
}
