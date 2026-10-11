package org.telegram.ui;
public final class we0 implements Runnable {
    public final int f43400a;
    public final ye0 f43401b;

    public we0(ye0 ye0Var, int i10) {
        this.f43400a = i10;
        this.f43401b = ye0Var;
    }

    @Override
    public final void run() {
        switch (this.f43400a) {
            case 0:
                ye0 ye0Var = this.f43401b;
                org.telegram.ui.Components.hk0 hk0Var = ye0Var.f44338e;
                hk0Var.getAnimatedDrawable().N(0, false, false);
                hk0Var.d();
                be0 be0Var = ye0Var.f44335a;
                if (be0Var != null) {
                    be0Var.f36450f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                ye0 ye0Var2 = this.f43401b;
                int i10 = 0;
                ye0Var2.f44343w = false;
                while (true) {
                    ds[] dsVarArr = ye0Var2.f44335a.f36450f;
                    if (i10 < dsVarArr.length) {
                        dsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                ye0 ye0Var3 = this.f43401b;
                ye0Var3.postDelayed(new we0(ye0Var3, 3), 150L);
                we0 we0Var = ye0Var3.f44344x;
                ye0Var3.removeCallbacks(we0Var);
                ye0Var3.postDelayed(we0Var, 3000L);
                ye0Var3.f44343w = true;
                return;
            default:
                be0 be0Var2 = this.f43401b.f44335a;
                int i11 = 0;
                be0Var2.f36449e = false;
                be0Var2.f36450f[0].requestFocus();
                while (true) {
                    ds[] dsVarArr2 = be0Var2.f36450f;
                    if (i11 < dsVarArr2.length) {
                        dsVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
