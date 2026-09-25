package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class td0 implements Runnable {
    public final int f38052a;
    public final ae0 f38053b;

    public td0(ae0 ae0Var, int i10) {
        this.f38052a = i10;
        this.f38053b = ae0Var;
    }

    @Override
    public final void run() {
        switch (this.f38052a) {
            case 0:
                this.f38053b.p();
                return;
            case 1:
                ae0 ae0Var = this.f38053b;
                ae0Var.postDelayed(new td0(ae0Var, 2), 150L);
                td0 td0Var = ae0Var.S;
                ae0Var.removeCallbacks(td0Var);
                ae0Var.postDelayed(td0Var, 3000L);
                ae0Var.R = true;
                return;
            case 2:
                xd0 xd0Var = this.f38053b.f32138a;
                int i10 = 0;
                xd0Var.e = false;
                xd0Var.f40238f[0].requestFocus();
                while (true) {
                    as[] asVarArr = xd0Var.f40238f;
                    if (i10 < asVarArr.length) {
                        asVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                ae0 ae0Var2 = this.f38053b;
                ae0Var2.postDelayed(new td0(ae0Var2, 5), 150L);
                return;
            case 4:
                ae0 ae0Var3 = this.f38053b;
                zd0 zd0Var = ae0Var3.Q;
                boolean z10 = false;
                ae0Var3.R = false;
                int i11 = 0;
                while (true) {
                    as[] asVarArr2 = ae0Var3.f32138a.f40238f;
                    if (i11 < asVarArr2.length) {
                        asVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (zd0Var.getCurrentView() != ae0Var3.e) {
                        zd0Var.showNext();
                        FrameLayout frameLayout = ae0Var3.h;
                        if (ae0Var3.f32141f.getVisibility() != 0 && ae0Var3.W.F != 3 && !ae0Var3.P) {
                            z10 = true;
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, true);
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 5:
                xd0 xd0Var2 = this.f38053b.f32138a;
                int i12 = 0;
                xd0Var2.e = false;
                xd0Var2.f40238f[0].requestFocus();
                while (true) {
                    as[] asVarArr3 = xd0Var2.f40238f;
                    if (i12 < asVarArr3.length) {
                        asVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f38053b.q(true);
                return;
            case 7:
                this.f38053b.r();
                return;
            default:
                ae0 ae0Var4 = this.f38053b;
                org.telegram.ui.Components.lj0 lj0Var = ae0Var4.f32145w;
                lj0Var.getAnimatedDrawable().N(0, false, false);
                lj0Var.d();
                xd0 xd0Var3 = ae0Var4.f32138a;
                if (xd0Var3 != null && xd0Var3.f40238f != null) {
                    xd0Var3.setText("");
                    xd0Var3.f40238f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
