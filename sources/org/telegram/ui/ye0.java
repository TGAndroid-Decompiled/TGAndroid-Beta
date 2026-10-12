package org.telegram.ui;
public final class ye0 implements Runnable {
    public final int f44462a;
    public final af0 f44463b;

    public ye0(af0 af0Var, int i10) {
        this.f44462a = i10;
        this.f44463b = af0Var;
    }

    @Override
    public final void run() {
        switch (this.f44462a) {
            case 0:
                af0 af0Var = this.f44463b;
                org.telegram.ui.Components.ik0 ik0Var = af0Var.f35783e;
                ik0Var.getAnimatedDrawable().N(0, false, false);
                ik0Var.d();
                de0 de0Var = af0Var.f35780a;
                if (de0Var != null) {
                    de0Var.f37837f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                af0 af0Var2 = this.f44463b;
                int i10 = 0;
                af0Var2.f35788w = false;
                while (true) {
                    hs[] hsVarArr = af0Var2.f35780a.f37837f;
                    if (i10 < hsVarArr.length) {
                        hsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                af0 af0Var3 = this.f44463b;
                af0Var3.postDelayed(new ye0(af0Var3, 3), 150L);
                ye0 ye0Var = af0Var3.f35789x;
                af0Var3.removeCallbacks(ye0Var);
                af0Var3.postDelayed(ye0Var, 3000L);
                af0Var3.f35788w = true;
                return;
            default:
                de0 de0Var2 = this.f44463b.f35780a;
                int i11 = 0;
                de0Var2.f37836e = false;
                de0Var2.f37837f[0].requestFocus();
                while (true) {
                    hs[] hsVarArr2 = de0Var2.f37837f;
                    if (i11 < hsVarArr2.length) {
                        hsVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
