package org.telegram.ui;
public final class se0 implements Runnable {
    public final int f38162a;
    public final ue0 f38163b;

    public se0(ue0 ue0Var, int i10) {
        this.f38162a = i10;
        this.f38163b = ue0Var;
    }

    @Override
    public final void run() {
        switch (this.f38162a) {
            case 0:
                ue0 ue0Var = this.f38163b;
                org.telegram.ui.Components.jj0 jj0Var = ue0Var.e;
                jj0Var.getAnimatedDrawable().L(0, false, false);
                jj0Var.d();
                xd0 xd0Var = ue0Var.f38787a;
                if (xd0Var != null) {
                    xd0Var.f32635f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                ue0 ue0Var2 = this.f38163b;
                int i10 = 0;
                ue0Var2.f38794w = false;
                while (true) {
                    ds[] dsVarArr = ue0Var2.f38787a.f32635f;
                    if (i10 < dsVarArr.length) {
                        dsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                ue0 ue0Var3 = this.f38163b;
                ue0Var3.postDelayed(new se0(ue0Var3, 3), 150L);
                se0 se0Var = ue0Var3.f38795x;
                ue0Var3.removeCallbacks(se0Var);
                ue0Var3.postDelayed(se0Var, 3000L);
                ue0Var3.f38794w = true;
                return;
            default:
                xd0 xd0Var2 = this.f38163b.f38787a;
                int i11 = 0;
                xd0Var2.e = false;
                xd0Var2.f32635f[0].requestFocus();
                while (true) {
                    ds[] dsVarArr2 = xd0Var2.f32635f;
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
