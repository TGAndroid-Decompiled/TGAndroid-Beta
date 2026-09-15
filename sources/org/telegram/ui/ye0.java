package org.telegram.ui;
public final class ye0 implements Runnable {
    public final int f39856a;
    public final af0 f39857b;

    public ye0(af0 af0Var, int i10) {
        this.f39856a = i10;
        this.f39857b = af0Var;
    }

    @Override
    public final void run() {
        switch (this.f39856a) {
            case 0:
                af0 af0Var = this.f39857b;
                org.telegram.ui.Components.aj0 aj0Var = af0Var.e;
                aj0Var.getAnimatedDrawable().N(0, false, false);
                aj0Var.d();
                de0 de0Var = af0Var.f31805a;
                if (de0Var != null) {
                    de0Var.f33120f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                af0 af0Var2 = this.f39857b;
                int i10 = 0;
                af0Var2.f31812w = false;
                while (true) {
                    gs[] gsVarArr = af0Var2.f31805a.f33120f;
                    if (i10 < gsVarArr.length) {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                af0 af0Var3 = this.f39857b;
                af0Var3.postDelayed(new ye0(af0Var3, 3), 150L);
                ye0 ye0Var = af0Var3.f31813x;
                af0Var3.removeCallbacks(ye0Var);
                af0Var3.postDelayed(ye0Var, 3000L);
                af0Var3.f31812w = true;
                return;
            default:
                de0 de0Var2 = this.f39857b.f31805a;
                int i11 = 0;
                de0Var2.e = false;
                de0Var2.f33120f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr2 = de0Var2.f33120f;
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
