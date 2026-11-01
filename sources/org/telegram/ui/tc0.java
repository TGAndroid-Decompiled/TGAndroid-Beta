package org.telegram.ui;

import android.content.Context;
public final class tc0 extends zr {
    public final int h;
    public final Object f41616n;

    public tc0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f41616n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((vc0) this.f41616n).h(null);
                return;
            case 1:
                ((nd0) this.f41616n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f41616n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new kg0(this, 3), 260L);
                    return;
                } else {
                    passcodeActivity.u0();
                    return;
                }
            default:
                ((rc1) this.f41616n).H0();
                return;
        }
    }
}
