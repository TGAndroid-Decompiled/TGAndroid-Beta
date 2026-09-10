package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class zd0 implements Runnable {
    public final int f39264a;
    public final ge0 f39265b;

    public zd0(ge0 ge0Var, int i10) {
        this.f39264a = i10;
        this.f39265b = ge0Var;
    }

    @Override
    public final void run() {
        switch (this.f39264a) {
            case 0:
                this.f39265b.p();
                return;
            case 1:
                ge0 ge0Var = this.f39265b;
                ge0Var.postDelayed(new zd0(ge0Var, 2), 150L);
                zd0 zd0Var = ge0Var.S;
                ge0Var.removeCallbacks(zd0Var);
                ge0Var.postDelayed(zd0Var, 3000L);
                ge0Var.R = true;
                return;
            case 2:
                de0 de0Var = this.f39265b.f33070a;
                int i10 = 0;
                de0Var.e = false;
                de0Var.f32906f[0].requestFocus();
                while (true) {
                    hs[] hsVarArr = de0Var.f32906f;
                    if (i10 < hsVarArr.length) {
                        hsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                ge0 ge0Var2 = this.f39265b;
                ge0Var2.postDelayed(new zd0(ge0Var2, 5), 150L);
                return;
            case 4:
                ge0 ge0Var3 = this.f39265b;
                fe0 fe0Var = ge0Var3.Q;
                boolean z10 = false;
                ge0Var3.R = false;
                int i11 = 0;
                while (true) {
                    hs[] hsVarArr2 = ge0Var3.f33070a.f32906f;
                    if (i11 < hsVarArr2.length) {
                        hsVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (fe0Var.getCurrentView() != ge0Var3.e) {
                        fe0Var.showNext();
                        FrameLayout frameLayout = ge0Var3.h;
                        if (ge0Var3.f33073f.getVisibility() != 0 && ge0Var3.W.F != 3 && !ge0Var3.P) {
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
                de0 de0Var2 = this.f39265b.f33070a;
                int i12 = 0;
                de0Var2.e = false;
                de0Var2.f32906f[0].requestFocus();
                while (true) {
                    hs[] hsVarArr3 = de0Var2.f32906f;
                    if (i12 < hsVarArr3.length) {
                        hsVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f39265b.q(true);
                return;
            case 7:
                this.f39265b.r();
                return;
            default:
                ge0 ge0Var4 = this.f39265b;
                org.telegram.ui.Components.kj0 kj0Var = ge0Var4.f33077w;
                kj0Var.getAnimatedDrawable().N(0, false, false);
                kj0Var.d();
                de0 de0Var3 = ge0Var4.f33070a;
                if (de0Var3 != null && de0Var3.f32906f != null) {
                    de0Var3.setText("");
                    de0Var3.f32906f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
