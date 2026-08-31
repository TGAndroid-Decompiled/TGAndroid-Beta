package org.telegram.ui;
public final class re0 implements Runnable {
    public final int f40944a;
    public final te0 f40945b;

    public re0(te0 te0Var, int i10) {
        this.f40944a = i10;
        this.f40945b = te0Var;
    }

    @Override
    public final void run() {
        switch (this.f40944a) {
            case 0:
                te0 te0Var = this.f40945b;
                org.telegram.ui.Components.lj0 lj0Var = te0Var.f41589e;
                lj0Var.getAnimatedDrawable().L(0, false, false);
                lj0Var.d();
                wd0 wd0Var = te0Var.f41586a;
                if (wd0Var != null) {
                    wd0Var.f43982f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                te0 te0Var2 = this.f40945b;
                int i10 = 0;
                te0Var2.f41594w = false;
                while (true) {
                    cs[] csVarArr = te0Var2.f41586a.f43982f;
                    if (i10 < csVarArr.length) {
                        csVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                te0 te0Var3 = this.f40945b;
                te0Var3.postDelayed(new re0(te0Var3, 3), 150L);
                re0 re0Var = te0Var3.f41595x;
                te0Var3.removeCallbacks(re0Var);
                te0Var3.postDelayed(re0Var, 3000L);
                te0Var3.f41594w = true;
                return;
            default:
                wd0 wd0Var2 = this.f40945b.f41586a;
                int i11 = 0;
                wd0Var2.f43981e = false;
                wd0Var2.f43982f[0].requestFocus();
                while (true) {
                    cs[] csVarArr2 = wd0Var2.f43982f;
                    if (i11 < csVarArr2.length) {
                        csVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
