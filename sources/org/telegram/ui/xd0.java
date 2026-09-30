package org.telegram.ui;

import android.content.Context;
public final class xd0 extends yr {
    public final int h;
    public final Object f40002n;

    public xd0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f40002n = obj;
    }

    @Override
    public final void a() {
        switch (this.h) {
            case 0:
                ((ae0) this.f40002n).h(null);
                return;
            case 1:
                ((ue0) this.f40002n).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f40002n;
                if (passcodeActivity.E == 0) {
                    postDelayed(new il0(this, 0), 260L);
                    return;
                } else {
                    passcodeActivity.g0();
                    return;
                }
            default:
                ((zg1) this.f40002n).C0();
                return;
        }
    }
}
