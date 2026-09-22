package org.telegram.ui;
public final class ye0 implements Runnable {
    public final int f39826a;
    public final af0 f39827b;

    public ye0(af0 af0Var, int i10) {
        this.f39826a = i10;
        this.f39827b = af0Var;
    }

    @Override
    public final void run() {
        switch (this.f39826a) {
            case 0:
                af0 af0Var = this.f39827b;
                org.telegram.ui.Components.aj0 aj0Var = af0Var.e;
                aj0Var.getAnimatedDrawable().N(0, false, false);
                aj0Var.d();
                de0 de0Var = af0Var.f31779a;
                if (de0Var != null) {
                    de0Var.f33081f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                af0 af0Var2 = this.f39827b;
                int i10 = 0;
                af0Var2.f31786w = false;
                while (true) {
                    gs[] gsVarArr = af0Var2.f31779a.f33081f;
                    if (i10 < gsVarArr.length) {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                af0 af0Var3 = this.f39827b;
                af0Var3.postDelayed(new ye0(af0Var3, 3), 150L);
                ye0 ye0Var = af0Var3.f31787x;
                af0Var3.removeCallbacks(ye0Var);
                af0Var3.postDelayed(ye0Var, 3000L);
                af0Var3.f31786w = true;
                return;
            default:
                de0 de0Var2 = this.f39827b.f31779a;
                int i11 = 0;
                de0Var2.e = false;
                de0Var2.f33081f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr2 = de0Var2.f33081f;
                    if (i11 < gsVarArr2.length) {
                        gsVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
