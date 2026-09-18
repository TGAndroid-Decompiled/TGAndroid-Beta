package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class v31 implements x31 {
    public final org.telegram.ui.ActionBar.n2 f38281a;
    public final Context f38282b;
    public final org.telegram.ui.ActionBar.e6 f38283c;
    public final org.telegram.ui.Components.uw d;

    public v31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.uw uwVar) {
        this.f38281a = n2Var;
        this.f38282b = context;
        this.f38283c = e6Var;
        this.d = uwVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new p31(this.f38281a, this.f38282b, this.f38283c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new cy0(24, this.f38281a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f38281a;
        n2Var.showDialog(new rg.x0(n2Var, 3, true));
    }
}
