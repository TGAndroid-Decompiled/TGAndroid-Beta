package org.telegram.utils.twidget;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l00;
public final class m1 implements l00 {
    public final Context f54849a;

    public m1(Context context) {
        this.f54849a = context;
    }

    @Override
    public final void a() {
        z0 z0Var = z0.f55007z;
        synchronized (z0Var.f55008e) {
            z0Var.f55018p = false;
        }
        z0Var.f55009f.removeCallbacks(z0Var.f55026y);
        z0Var.f55009f.postDelayed(z0Var.f55026y, 30000L);
    }

    @Override
    public final void b() {
        Utilities.f22774e.c(new j0(this.f54849a, 4));
    }
}
