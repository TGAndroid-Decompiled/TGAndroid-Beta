package org.telegram.ui;

import android.content.Context;
public final class yd0 extends zr {
    public final int h;
    public final Object f39796n;

    public yd0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f39796n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((be0) this.f39796n).h(null);
                return;
            case 1:
                ((ve0) this.f39796n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f39796n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new jl0(this, 0), 260L);
                    return;
                } else {
                    passcodeActivity.g0();
                    return;
                }
            default:
                ((zg1) this.f39796n).C0();
                return;
        }
    }
}
