package org.telegram.ui;

import android.content.Context;
public final class wd0 extends zr {
    public final int h;
    public final Object f42411n;

    public wd0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f42411n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((zd0) this.f42411n).h(null);
                return;
            case 1:
                ((se0) this.f42411n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f42411n;
                if (passcodeActivity.B == 0) {
                    postDelayed(new gl0(this, 0), 260L);
                    return;
                } else {
                    passcodeActivity.g0();
                    return;
                }
            default:
                ((vg1) this.f42411n).C0();
                return;
        }
    }
}
