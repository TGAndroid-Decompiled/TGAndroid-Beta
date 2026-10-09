package org.telegram.ui;
public final class xe0 implements Runnable {
    public final int f44012a;
    public final ze0 f44013b;

    public xe0(ze0 ze0Var, int i10) {
        this.f44012a = i10;
        this.f44013b = ze0Var;
    }

    @Override
    public final void run() {
        switch (this.f44012a) {
            case 0:
                ze0 ze0Var = this.f44013b;
                org.telegram.ui.Components.fk0 fk0Var = ze0Var.f44568e;
                fk0Var.getAnimatedDrawable().N(0, false, false);
                fk0Var.d();
                ce0 ce0Var = ze0Var.f44565a;
                if (ce0Var != null) {
                    ce0Var.f36734f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                ze0 ze0Var2 = this.f44013b;
                int i10 = 0;
                ze0Var2.f44573w = false;
                while (true) {
                    es[] esVarArr = ze0Var2.f44565a.f36734f;
                    if (i10 < esVarArr.length) {
                        esVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                ze0 ze0Var3 = this.f44013b;
                ze0Var3.postDelayed(new xe0(ze0Var3, 3), 150L);
                xe0 xe0Var = ze0Var3.f44574x;
                ze0Var3.removeCallbacks(xe0Var);
                ze0Var3.postDelayed(xe0Var, 3000L);
                ze0Var3.f44573w = true;
                return;
            default:
                ce0 ce0Var2 = this.f44013b.f44565a;
                int i11 = 0;
                ce0Var2.f36733e = false;
                ce0Var2.f36734f[0].requestFocus();
                while (true) {
                    es[] esVarArr2 = ce0Var2.f36734f;
                    if (i11 < esVarArr2.length) {
                        esVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
