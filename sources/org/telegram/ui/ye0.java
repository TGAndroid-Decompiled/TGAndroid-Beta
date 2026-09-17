package org.telegram.ui;
public final class ye0 implements Runnable {
    public final int f43119a;
    public final af0 f43120b;

    public ye0(af0 af0Var, int i10) {
        this.f43119a = i10;
        this.f43120b = af0Var;
    }

    @Override
    public final void run() {
        switch (this.f43119a) {
            case 0:
                af0 af0Var = this.f43120b;
                org.telegram.ui.Components.aj0 aj0Var = af0Var.f34430e;
                aj0Var.getAnimatedDrawable().L(0, false, false);
                aj0Var.d();
                de0 de0Var = af0Var.f34427a;
                if (de0Var != null) {
                    de0Var.f36191f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                af0 af0Var2 = this.f43120b;
                int i10 = 0;
                af0Var2.f34435w = false;
                while (true) {
                    gs[] gsVarArr = af0Var2.f34427a.f36191f;
                    if (i10 < gsVarArr.length) {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                af0 af0Var3 = this.f43120b;
                af0Var3.postDelayed(new ye0(af0Var3, 3), 150L);
                ye0 ye0Var = af0Var3.f34436x;
                af0Var3.removeCallbacks(ye0Var);
                af0Var3.postDelayed(ye0Var, 3000L);
                af0Var3.f34435w = true;
                return;
            default:
                de0 de0Var2 = this.f43120b.f34427a;
                int i11 = 0;
                de0Var2.f36190e = false;
                de0Var2.f36191f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr2 = de0Var2.f36191f;
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
