package org.telegram.utils.twidget;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j00;
public final class m1 implements j00 {
    public final Context f54839a;

    public m1(Context context) {
        this.f54839a = context;
    }

    @Override
    public final void a() {
        z0 z0Var = z0.f54997z;
        synchronized (z0Var.f54998e) {
            z0Var.f55008p = false;
        }
        z0Var.f54999f.removeCallbacks(z0Var.f55016y);
        z0Var.f54999f.postDelayed(z0Var.f55016y, 30000L);
    }

    @Override
    public final void b() {
        Utilities.f22779e.c(new j0(this.f54839a, 4));
    }
}
