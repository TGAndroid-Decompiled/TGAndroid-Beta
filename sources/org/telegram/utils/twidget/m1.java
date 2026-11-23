package org.telegram.utils.twidget;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j00;
public final class m1 implements j00 {
    public final Context f54965a;

    public m1(Context context) {
        this.f54965a = context;
    }

    @Override
    public final void a() {
        z0 z0Var = z0.f55123z;
        synchronized (z0Var.f55124e) {
            z0Var.f55134p = false;
        }
        z0Var.f55125f.removeCallbacks(z0Var.f55142y);
        z0Var.f55125f.postDelayed(z0Var.f55142y, 30000L);
    }

    @Override
    public final void b() {
        Utilities.f22877e.c(new j0(this.f54965a, 4));
    }
}
