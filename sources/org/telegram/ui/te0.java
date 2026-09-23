package org.telegram.ui;
public final class te0 implements Runnable {
    public final int f37625a;
    public final ve0 f37626b;

    public te0(ve0 ve0Var, int i10) {
        this.f37625a = i10;
        this.f37626b = ve0Var;
    }

    @Override
    public final void run() {
        switch (this.f37625a) {
            case 0:
                ve0 ve0Var = this.f37626b;
                org.telegram.ui.Components.bj0 bj0Var = ve0Var.e;
                bj0Var.getAnimatedDrawable().N(0, false, false);
                bj0Var.d();
                yd0 yd0Var = ve0Var.f38367a;
                if (yd0Var != null) {
                    yd0Var.f40230f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                ve0 ve0Var2 = this.f37626b;
                int i10 = 0;
                ve0Var2.f38374w = false;
                while (true) {
                    bs[] bsVarArr = ve0Var2.f38367a.f40230f;
                    if (i10 < bsVarArr.length) {
                        bsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                ve0 ve0Var3 = this.f37626b;
                ve0Var3.postDelayed(new te0(ve0Var3, 3), 150L);
                te0 te0Var = ve0Var3.f38375x;
                ve0Var3.removeCallbacks(te0Var);
                ve0Var3.postDelayed(te0Var, 3000L);
                ve0Var3.f38374w = true;
                return;
            default:
                yd0 yd0Var2 = this.f37626b.f38367a;
                int i11 = 0;
                yd0Var2.e = false;
                yd0Var2.f40230f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr2 = yd0Var2.f40230f;
                    if (i11 < bsVarArr2.length) {
                        bsVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
