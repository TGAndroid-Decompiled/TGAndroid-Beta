package org.telegram.ui;
public final class se0 implements Runnable {
    public final int f37705a;
    public final ue0 f37706b;

    public se0(ue0 ue0Var, int i10) {
        this.f37705a = i10;
        this.f37706b = ue0Var;
    }

    @Override
    public final void run() {
        switch (this.f37705a) {
            case 0:
                ue0 ue0Var = this.f37706b;
                org.telegram.ui.Components.lj0 lj0Var = ue0Var.e;
                lj0Var.getAnimatedDrawable().N(0, false, false);
                lj0Var.d();
                xd0 xd0Var = ue0Var.f38424a;
                if (xd0Var != null) {
                    xd0Var.f40221f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                ue0 ue0Var2 = this.f37706b;
                int i10 = 0;
                ue0Var2.f38431w = false;
                while (true) {
                    as[] asVarArr = ue0Var2.f38424a.f40221f;
                    if (i10 < asVarArr.length) {
                        asVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                ue0 ue0Var3 = this.f37706b;
                ue0Var3.postDelayed(new se0(ue0Var3, 3), 150L);
                se0 se0Var = ue0Var3.f38432x;
                ue0Var3.removeCallbacks(se0Var);
                ue0Var3.postDelayed(se0Var, 3000L);
                ue0Var3.f38431w = true;
                return;
            default:
                xd0 xd0Var2 = this.f37706b.f38424a;
                int i11 = 0;
                xd0Var2.e = false;
                xd0Var2.f40221f[0].requestFocus();
                while (true) {
                    as[] asVarArr2 = xd0Var2.f40221f;
                    if (i11 < asVarArr2.length) {
                        asVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
