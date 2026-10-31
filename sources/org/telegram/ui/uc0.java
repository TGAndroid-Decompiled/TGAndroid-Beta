package org.telegram.ui;

import android.content.Context;
public final class uc0 extends zr {
    public final int h;
    public final Object f42113n;

    public uc0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f42113n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((wc0) this.f42113n).h(null);
                return;
            case 1:
                ((od0) this.f42113n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f42113n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new mg0(this, 3), 260L);
                    return;
                } else {
                    passcodeActivity.t0();
                    return;
                }
            default:
                ((tc1) this.f42113n).G0();
                return;
        }
    }
}
