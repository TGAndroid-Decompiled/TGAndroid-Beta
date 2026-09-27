package org.telegram.ui;
public final class ve0 implements Runnable {
    public final int f38561a;
    public final xe0 f38562b;

    public ve0(xe0 xe0Var, int i10) {
        this.f38561a = i10;
        this.f38562b = xe0Var;
    }

    @Override
    public final void run() {
        switch (this.f38561a) {
            case 0:
                xe0 xe0Var = this.f38562b;
                org.telegram.ui.Components.nj0 nj0Var = xe0Var.e;
                nj0Var.getAnimatedDrawable().N(0, false, false);
                nj0Var.d();
                ae0 ae0Var = xe0Var.f39618a;
                if (ae0Var != null) {
                    ae0Var.f32431f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                xe0 xe0Var2 = this.f38562b;
                int i10 = 0;
                xe0Var2.f39625w = false;
                while (true) {
                    ds[] dsVarArr = xe0Var2.f39618a.f32431f;
                    if (i10 < dsVarArr.length) {
                        dsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                xe0 xe0Var3 = this.f38562b;
                xe0Var3.postDelayed(new ve0(xe0Var3, 3), 150L);
                ve0 ve0Var = xe0Var3.f39626x;
                xe0Var3.removeCallbacks(ve0Var);
                xe0Var3.postDelayed(ve0Var, 3000L);
                xe0Var3.f39625w = true;
                return;
            default:
                ae0 ae0Var2 = this.f38562b.f39618a;
                int i11 = 0;
                ae0Var2.e = false;
                ae0Var2.f32431f[0].requestFocus();
                while (true) {
                    ds[] dsVarArr2 = ae0Var2.f32431f;
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
