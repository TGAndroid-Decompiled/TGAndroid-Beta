package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class td0 implements Runnable {
    public final int f38051a;
    public final ae0 f38052b;

    public td0(ae0 ae0Var, int i10) {
        this.f38051a = i10;
        this.f38052b = ae0Var;
    }

    @Override
    public final void run() {
        switch (this.f38051a) {
            case 0:
                this.f38052b.p();
                return;
            case 1:
                ae0 ae0Var = this.f38052b;
                ae0Var.postDelayed(new td0(ae0Var, 2), 150L);
                td0 td0Var = ae0Var.S;
                ae0Var.removeCallbacks(td0Var);
                ae0Var.postDelayed(td0Var, 3000L);
                ae0Var.R = true;
                return;
            case 2:
                xd0 xd0Var = this.f38052b.f32137a;
                int i10 = 0;
                xd0Var.e = false;
                xd0Var.f40237f[0].requestFocus();
                while (true) {
                    as[] asVarArr = xd0Var.f40237f;
                    if (i10 < asVarArr.length) {
                        asVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                ae0 ae0Var2 = this.f38052b;
                ae0Var2.postDelayed(new td0(ae0Var2, 5), 150L);
                return;
            case 4:
                ae0 ae0Var3 = this.f38052b;
                zd0 zd0Var = ae0Var3.Q;
                boolean z10 = false;
                ae0Var3.R = false;
                int i11 = 0;
                while (true) {
                    as[] asVarArr2 = ae0Var3.f32137a.f40237f;
                    if (i11 < asVarArr2.length) {
                        asVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (zd0Var.getCurrentView() != ae0Var3.e) {
                        zd0Var.showNext();
                        FrameLayout frameLayout = ae0Var3.h;
                        if (ae0Var3.f32140f.getVisibility() != 0 && ae0Var3.W.F != 3 && !ae0Var3.P) {
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
                xd0 xd0Var2 = this.f38052b.f32137a;
                int i12 = 0;
                xd0Var2.e = false;
                xd0Var2.f40237f[0].requestFocus();
                while (true) {
                    as[] asVarArr3 = xd0Var2.f40237f;
                    if (i12 < asVarArr3.length) {
                        asVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f38052b.q(true);
                return;
            case 7:
                this.f38052b.r();
                return;
            default:
                ae0 ae0Var4 = this.f38052b;
                org.telegram.ui.Components.lj0 lj0Var = ae0Var4.f32144w;
                lj0Var.getAnimatedDrawable().N(0, false, false);
                lj0Var.d();
                xd0 xd0Var3 = ae0Var4.f32137a;
                if (xd0Var3 != null && xd0Var3.f40237f != null) {
                    xd0Var3.setText("");
                    xd0Var3.f40237f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
