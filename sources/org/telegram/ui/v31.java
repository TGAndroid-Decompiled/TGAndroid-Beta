package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class v31 implements x31 {
    public final org.telegram.ui.ActionBar.m2 f42866a;
    public final Context f42867b;
    public final org.telegram.ui.ActionBar.d6 f42868c;
    public final org.telegram.ui.Components.fi0 d;

    public v31(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.fi0 fi0Var) {
        this.f42866a = m2Var;
        this.f42867b = context;
        this.f42868c = d6Var;
        this.d = fi0Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new p31(this.f42866a, this.f42867b, this.f42868c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new m31(3, this.f42866a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f42866a;
        m2Var.showDialog(new rg.y0(m2Var, 3, true));
    }
}
