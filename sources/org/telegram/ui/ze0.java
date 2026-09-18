package org.telegram.ui;
public final class ze0 implements Runnable {
    public final int f40095a;
    public final bf0 f40096b;

    public ze0(bf0 bf0Var, int i10) {
        this.f40095a = i10;
        this.f40096b = bf0Var;
    }

    @Override
    public final void run() {
        switch (this.f40095a) {
            case 0:
                bf0 bf0Var = this.f40096b;
                org.telegram.ui.Components.lj0 lj0Var = bf0Var.e;
                lj0Var.getAnimatedDrawable().N(0, false, false);
                lj0Var.d();
                ee0 ee0Var = bf0Var.f32354a;
                if (ee0Var != null) {
                    ee0Var.f33074f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                bf0 bf0Var2 = this.f40096b;
                int i10 = 0;
                bf0Var2.f32361w = false;
                while (true) {
                    gs[] gsVarArr = bf0Var2.f32354a.f33074f;
                    if (i10 < gsVarArr.length) {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                bf0 bf0Var3 = this.f40096b;
                bf0Var3.postDelayed(new ze0(bf0Var3, 3), 150L);
                ze0 ze0Var = bf0Var3.f32362x;
                bf0Var3.removeCallbacks(ze0Var);
                bf0Var3.postDelayed(ze0Var, 3000L);
                bf0Var3.f32361w = true;
                return;
            default:
                ee0 ee0Var2 = this.f40096b.f32354a;
                int i11 = 0;
                ee0Var2.e = false;
                ee0Var2.f33074f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr2 = ee0Var2.f33074f;
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
