package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xd0 implements Runnable {
    public final int f42832a;
    public final ee0 f42833b;

    public xd0(ee0 ee0Var, int i10) {
        this.f42832a = i10;
        this.f42833b = ee0Var;
    }

    @Override
    public final void run() {
        switch (this.f42832a) {
            case 0:
                this.f42833b.p();
                return;
            case 1:
                ee0 ee0Var = this.f42833b;
                ee0Var.postDelayed(new xd0(ee0Var, 2), 150L);
                xd0 xd0Var = ee0Var.S;
                ee0Var.removeCallbacks(xd0Var);
                ee0Var.postDelayed(xd0Var, 3000L);
                ee0Var.R = true;
                return;
            case 2:
                be0 be0Var = this.f42833b.f35995a;
                int i10 = 0;
                be0Var.f35542e = false;
                be0Var.f35543f[0].requestFocus();
                while (true) {
                    es[] esVarArr = be0Var.f35543f;
                    if (i10 < esVarArr.length) {
                        esVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                ee0 ee0Var2 = this.f42833b;
                ee0Var2.postDelayed(new xd0(ee0Var2, 5), 150L);
                return;
            case 4:
                ee0 ee0Var3 = this.f42833b;
                de0 de0Var = ee0Var3.Q;
                boolean z10 = false;
                ee0Var3.R = false;
                int i11 = 0;
                while (true) {
                    es[] esVarArr2 = ee0Var3.f35995a.f35543f;
                    if (i11 < esVarArr2.length) {
                        esVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (de0Var.getCurrentView() != ee0Var3.f35998e) {
                        de0Var.showNext();
                        FrameLayout frameLayout = ee0Var3.h;
                        if (ee0Var3.f35999f.getVisibility() != 0 && ee0Var3.W.F != 3 && !ee0Var3.P) {
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
                be0 be0Var2 = this.f42833b.f35995a;
                int i12 = 0;
                be0Var2.f35542e = false;
                be0Var2.f35543f[0].requestFocus();
                while (true) {
                    es[] esVarArr3 = be0Var2.f35543f;
                    if (i12 < esVarArr3.length) {
                        esVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f42833b.q(true);
                return;
            case 7:
                this.f42833b.r();
                return;
            default:
                ee0 ee0Var4 = this.f42833b;
                org.telegram.ui.Components.nj0 nj0Var = ee0Var4.f36003w;
                nj0Var.getAnimatedDrawable().N(0, false, false);
                nj0Var.d();
                be0 be0Var3 = ee0Var4.f35995a;
                if (be0Var3 != null && be0Var3.f35543f != null) {
                    be0Var3.setText("");
                    be0Var3.f35543f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
