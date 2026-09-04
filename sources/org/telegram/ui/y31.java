package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class y31 implements a41 {
    public final org.telegram.ui.ActionBar.n2 f42978a;
    public final Context f42979b;
    public final org.telegram.ui.ActionBar.f6 f42980c;
    public final org.telegram.ui.Components.jn0 d;

    public y31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.jn0 jn0Var) {
        this.f42978a = n2Var;
        this.f42979b = context;
        this.f42980c = f6Var;
        this.d = jn0Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new s31(this.f42978a, this.f42979b, this.f42980c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new rx0(26, this.f42978a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f42978a;
        n2Var.showDialog(new sg.a1(n2Var, 3, true));
    }
}
