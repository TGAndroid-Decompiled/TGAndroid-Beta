package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class y31 implements a41 {
    public final org.telegram.ui.ActionBar.m2 f44287a;
    public final Context f44288b;
    public final org.telegram.ui.ActionBar.c6 f44289c;
    public final org.telegram.ui.Components.sj0 d;

    public y31(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.sj0 sj0Var) {
        this.f44287a = m2Var;
        this.f44288b = context;
        this.f44289c = c6Var;
        this.d = sj0Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new r31(this.f44287a, this.f44288b, this.f44289c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new w31(1, this.f44287a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f44287a;
        m2Var.showDialog(new rg.y0(m2Var, 3, true));
    }
}
