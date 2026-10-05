package org.telegram.ui;
public final class we0 implements Runnable {
    public final int f42096a;
    public final ye0 f42097b;

    public we0(ye0 ye0Var, int i10) {
        this.f42096a = i10;
        this.f42097b = ye0Var;
    }

    @Override
    public final void run() {
        switch (this.f42096a) {
            case 0:
                ye0 ye0Var = this.f42097b;
                org.telegram.ui.Components.nj0 nj0Var = ye0Var.f43206e;
                nj0Var.getAnimatedDrawable().N(0, false, false);
                nj0Var.d();
                be0 be0Var = ye0Var.f43203a;
                if (be0Var != null) {
                    be0Var.f35541f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                ye0 ye0Var2 = this.f42097b;
                int i10 = 0;
                ye0Var2.f43211w = false;
                while (true) {
                    es[] esVarArr = ye0Var2.f43203a.f35541f;
                    if (i10 < esVarArr.length) {
                        esVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                ye0 ye0Var3 = this.f42097b;
                ye0Var3.postDelayed(new we0(ye0Var3, 3), 150L);
                we0 we0Var = ye0Var3.f43212x;
                ye0Var3.removeCallbacks(we0Var);
                ye0Var3.postDelayed(we0Var, 3000L);
                ye0Var3.f43211w = true;
                return;
            default:
                be0 be0Var2 = this.f42097b.f43203a;
                int i11 = 0;
                be0Var2.f35540e = false;
                be0Var2.f35541f[0].requestFocus();
                while (true) {
                    es[] esVarArr2 = be0Var2.f35541f;
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
