package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class w31 implements y31 {
    public final org.telegram.ui.ActionBar.n2 f43127a;
    public final Context f43128b;
    public final org.telegram.ui.ActionBar.e6 f43129c;
    public final org.telegram.ui.Components.di0 d;

    public w31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.di0 di0Var) {
        this.f43127a = n2Var;
        this.f43128b = context;
        this.f43129c = e6Var;
        this.d = di0Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new q31(this.f43127a, this.f43128b, this.f43129c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new n31(4, this.f43127a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f43127a;
        n2Var.showDialog(new rg.y0(n2Var, 3, true));
    }
}
