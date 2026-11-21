package org.telegram.utils.twidget;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l00;
public final class m1 implements l00 {
    public final Context f54880a;

    public m1(Context context) {
        this.f54880a = context;
    }

    @Override
    public final void a() {
        z0 z0Var = z0.f55038z;
        synchronized (z0Var.f55039e) {
            z0Var.f55049p = false;
        }
        z0Var.f55040f.removeCallbacks(z0Var.f55057y);
        z0Var.f55040f.postDelayed(z0Var.f55057y, 30000L);
    }

    @Override
    public final void b() {
        Utilities.f22807e.c(new j0(this.f54880a, 4));
    }
}
