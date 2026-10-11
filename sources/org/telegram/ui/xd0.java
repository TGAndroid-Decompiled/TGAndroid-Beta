package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xd0 implements Runnable {
    public final int f44046a;
    public final ee0 f44047b;

    public xd0(ee0 ee0Var, int i10) {
        this.f44046a = i10;
        this.f44047b = ee0Var;
    }

    @Override
    public final void run() {
        switch (this.f44046a) {
            case 0:
                this.f44047b.p();
                return;
            case 1:
                ee0 ee0Var = this.f44047b;
                ee0Var.postDelayed(new xd0(ee0Var, 2), 150L);
                xd0 xd0Var = ee0Var.S;
                ee0Var.removeCallbacks(xd0Var);
                ee0Var.postDelayed(xd0Var, 3000L);
                ee0Var.R = true;
                return;
            case 2:
                be0 be0Var = this.f44047b.f37278a;
                int i10 = 0;
                be0Var.f36449e = false;
                be0Var.f36450f[0].requestFocus();
                while (true) {
                    ds[] dsVarArr = be0Var.f36450f;
                    if (i10 < dsVarArr.length) {
                        dsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                ee0 ee0Var2 = this.f44047b;
                ee0Var2.postDelayed(new xd0(ee0Var2, 5), 150L);
                return;
            case 4:
                ee0 ee0Var3 = this.f44047b;
                de0 de0Var = ee0Var3.Q;
                boolean z10 = false;
                ee0Var3.R = false;
                int i11 = 0;
                while (true) {
                    ds[] dsVarArr2 = ee0Var3.f37278a.f36450f;
                    if (i11 < dsVarArr2.length) {
                        dsVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (de0Var.getCurrentView() != ee0Var3.f37281e) {
                        de0Var.showNext();
                        FrameLayout frameLayout = ee0Var3.h;
                        if (ee0Var3.f37282f.getVisibility() != 0 && ee0Var3.W.F != 3 && !ee0Var3.P) {
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
                be0 be0Var2 = this.f44047b.f37278a;
                int i12 = 0;
                be0Var2.f36449e = false;
                be0Var2.f36450f[0].requestFocus();
                while (true) {
                    ds[] dsVarArr3 = be0Var2.f36450f;
                    if (i12 < dsVarArr3.length) {
                        dsVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f44047b.q(true);
                return;
            case 7:
                this.f44047b.r();
                return;
            default:
                ee0 ee0Var4 = this.f44047b;
                org.telegram.ui.Components.hk0 hk0Var = ee0Var4.f37286w;
                hk0Var.getAnimatedDrawable().N(0, false, false);
                hk0Var.d();
                be0 be0Var3 = ee0Var4.f37278a;
                if (be0Var3 != null && be0Var3.f36450f != null) {
                    be0Var3.setText("");
                    be0Var3.f36450f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
