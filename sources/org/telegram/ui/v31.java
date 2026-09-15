package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class v31 implements x31 {
    public final org.telegram.ui.ActionBar.n2 f38340a;
    public final Context f38341b;
    public final org.telegram.ui.ActionBar.e6 f38342c;
    public final org.telegram.ui.Components.ny d;

    public v31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ny nyVar) {
        this.f38340a = n2Var;
        this.f38341b = context;
        this.f38342c = e6Var;
        this.d = nyVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new p31(this.f38340a, this.f38341b, this.f38342c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new iy0(20, this.f38340a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f38340a;
        n2Var.showDialog(new rg.x0(n2Var, 3, true));
    }
}
