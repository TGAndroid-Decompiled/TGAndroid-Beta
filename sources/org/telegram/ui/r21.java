package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class r21 implements s21 {
    public final org.telegram.ui.ActionBar.r2 f42835a;
    public final Context f42836b;
    public final org.telegram.ui.ActionBar.u6 f42837c;
    public final org.telegram.ui.Components.u90 d;

    public r21(org.telegram.ui.ActionBar.r2 r2Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.u90 u90Var) {
        this.f42835a = r2Var;
        this.f42836b = context;
        this.f42837c = u6Var;
        this.d = u90Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new l21(this.f42835a, this.f42836b, this.f42837c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new by0(17, this.f42835a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f42835a;
        r2Var.showDialog(new tg.y0(r2Var, 3, true));
    }
}
