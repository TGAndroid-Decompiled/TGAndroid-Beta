package org.telegram.utils.twidget;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l00;
public final class m1 implements l00 {
    public final Context f54884a;

    public m1(Context context) {
        this.f54884a = context;
    }

    @Override
    public final void a() {
        z0 z0Var = z0.f55042z;
        synchronized (z0Var.f55043e) {
            z0Var.f55053p = false;
        }
        z0Var.f55044f.removeCallbacks(z0Var.f55061y);
        z0Var.f55044f.postDelayed(z0Var.f55061y, 30000L);
    }

    @Override
    public final void b() {
        Utilities.f22810e.c(new j0(this.f54884a, 4));
    }
}
