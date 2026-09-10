package org.telegram.ui;
public final class ye0 implements Runnable {
    public final int f38982a;
    public final af0 f38983b;

    public ye0(af0 af0Var, int i10) {
        this.f38982a = i10;
        this.f38983b = af0Var;
    }

    @Override
    public final void run() {
        switch (this.f38982a) {
            case 0:
                af0 af0Var = this.f38983b;
                org.telegram.ui.Components.kj0 kj0Var = af0Var.e;
                kj0Var.getAnimatedDrawable().N(0, false, false);
                kj0Var.d();
                de0 de0Var = af0Var.f30986a;
                if (de0Var != null) {
                    de0Var.f32906f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                af0 af0Var2 = this.f38983b;
                int i10 = 0;
                af0Var2.f30993w = false;
                while (true) {
                    hs[] hsVarArr = af0Var2.f30986a.f32906f;
                    if (i10 < hsVarArr.length) {
                        hsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                af0 af0Var3 = this.f38983b;
                af0Var3.postDelayed(new ye0(af0Var3, 3), 150L);
                ye0 ye0Var = af0Var3.f30994x;
                af0Var3.removeCallbacks(ye0Var);
                af0Var3.postDelayed(ye0Var, 3000L);
                af0Var3.f30993w = true;
                return;
            default:
                de0 de0Var2 = this.f38983b.f30986a;
                int i11 = 0;
                de0Var2.e = false;
                de0Var2.f32906f[0].requestFocus();
                while (true) {
                    hs[] hsVarArr2 = de0Var2.f32906f;
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
