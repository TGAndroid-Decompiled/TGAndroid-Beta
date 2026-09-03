package org.telegram.ui;

import android.content.Context;
public final class xd0 extends as {
    public final int h;
    public final Object f39962n;

    public xd0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f39962n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((ae0) this.f39962n).h(null);
                return;
            case 1:
                ((ue0) this.f39962n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f39962n;
                if (passcodeActivity.B == 0) {
                    postDelayed(new gl0(this, 0), 260L);
                    return;
                } else {
                    passcodeActivity.g0();
                    return;
                }
            default:
                ((wg1) this.f39962n).C0();
                return;
        }
    }
}
