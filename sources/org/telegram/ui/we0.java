package org.telegram.ui;
public final class we0 implements Runnable {
    public final int f43434a;
    public final ye0 f43435b;

    public we0(ye0 ye0Var, int i10) {
        this.f43434a = i10;
        this.f43435b = ye0Var;
    }

    @Override
    public final void run() {
        switch (this.f43434a) {
            case 0:
                ye0 ye0Var = this.f43435b;
                org.telegram.ui.Components.gk0 gk0Var = ye0Var.f44372e;
                gk0Var.getAnimatedDrawable().N(0, false, false);
                gk0Var.d();
                be0 be0Var = ye0Var.f44369a;
                if (be0Var != null) {
                    be0Var.f36484f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                ye0 ye0Var2 = this.f43435b;
                int i10 = 0;
                ye0Var2.f44377w = false;
                while (true) {
                    ds[] dsVarArr = ye0Var2.f44369a.f36484f;
                    if (i10 < dsVarArr.length) {
                        dsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                ye0 ye0Var3 = this.f43435b;
                ye0Var3.postDelayed(new we0(ye0Var3, 3), 150L);
                we0 we0Var = ye0Var3.f44378x;
                ye0Var3.removeCallbacks(we0Var);
                ye0Var3.postDelayed(we0Var, 3000L);
                ye0Var3.f44377w = true;
                return;
            default:
                be0 be0Var2 = this.f43435b.f44369a;
                int i11 = 0;
                be0Var2.f36483e = false;
                be0Var2.f36484f[0].requestFocus();
                while (true) {
                    ds[] dsVarArr2 = be0Var2.f36484f;
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
