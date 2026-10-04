package org.telegram.ui;
public final class we0 implements Runnable {
    public final int f42085a;
    public final ye0 f42086b;

    public we0(ye0 ye0Var, int i10) {
        this.f42085a = i10;
        this.f42086b = ye0Var;
    }

    @Override
    public final void run() {
        switch (this.f42085a) {
            case 0:
                ye0 ye0Var = this.f42086b;
                org.telegram.ui.Components.nj0 nj0Var = ye0Var.f43153e;
                nj0Var.getAnimatedDrawable().N(0, false, false);
                nj0Var.d();
                be0 be0Var = ye0Var.f43150a;
                if (be0Var != null) {
                    be0Var.f35549f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                ye0 ye0Var2 = this.f42086b;
                int i10 = 0;
                ye0Var2.f43158w = false;
                while (true) {
                    es[] esVarArr = ye0Var2.f43150a.f35549f;
                    if (i10 < esVarArr.length) {
                        esVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                ye0 ye0Var3 = this.f42086b;
                ye0Var3.postDelayed(new we0(ye0Var3, 3), 150L);
                we0 we0Var = ye0Var3.f43159x;
                ye0Var3.removeCallbacks(we0Var);
                ye0Var3.postDelayed(we0Var, 3000L);
                ye0Var3.f43158w = true;
                return;
            default:
                be0 be0Var2 = this.f42086b.f43150a;
                int i11 = 0;
                be0Var2.f35548e = false;
                be0Var2.f35549f[0].requestFocus();
                while (true) {
                    es[] esVarArr2 = be0Var2.f35549f;
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
