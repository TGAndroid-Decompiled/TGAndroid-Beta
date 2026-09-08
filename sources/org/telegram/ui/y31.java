package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class y31 implements a41 {
    public final org.telegram.ui.ActionBar.n2 f43005a;
    public final Context f43006b;
    public final org.telegram.ui.ActionBar.f6 f43007c;
    public final org.telegram.ui.Components.jn0 d;

    public y31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.jn0 jn0Var) {
        this.f43005a = n2Var;
        this.f43006b = context;
        this.f43007c = f6Var;
        this.d = jn0Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new s31(this.f43005a, this.f43006b, this.f43007c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new rx0(26, this.f43005a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f43005a;
        n2Var.showDialog(new sg.a1(n2Var, 3, true));
    }
}
