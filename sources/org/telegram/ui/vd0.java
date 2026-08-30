package org.telegram.ui;

import android.content.Context;
public final class vd0 extends yr {
    public final int h;
    public final Object f39146n;

    public vd0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f39146n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((yd0) this.f39146n).h(null);
                return;
            case 1:
                ((se0) this.f39146n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f39146n;
                if (passcodeActivity.B == 0) {
                    postDelayed(new el0(this, 0), 260L);
                    return;
                } else {
                    passcodeActivity.g0();
                    return;
                }
            default:
                ((og1) this.f39146n).C0();
                return;
        }
    }
}
