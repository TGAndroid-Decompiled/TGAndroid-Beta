package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class r21 implements t21 {
    public final org.telegram.ui.ActionBar.o2 f42256a;
    public final Context f42257b;
    public final org.telegram.ui.ActionBar.b6 f42258c;
    public final org.telegram.ui.Components.jg0 d;

    public r21(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.Components.jg0 jg0Var) {
        this.f42256a = o2Var;
        this.f42257b = context;
        this.f42258c = b6Var;
        this.d = jg0Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new k21(this.f42256a, this.f42257b, this.f42258c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new n21(2, this.f42256a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f42256a;
        o2Var.showDialog(new zf.x0(o2Var, 3, true));
    }
}
