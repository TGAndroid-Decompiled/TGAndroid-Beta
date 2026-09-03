package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class sd0 implements Runnable {
    public final int f41132a;
    public final zd0 f41133b;

    public sd0(zd0 zd0Var, int i10) {
        this.f41132a = i10;
        this.f41133b = zd0Var;
    }

    @Override
    public final void run() {
        switch (this.f41132a) {
            case 0:
                this.f41133b.p();
                return;
            case 1:
                zd0 zd0Var = this.f41133b;
                zd0Var.postDelayed(new sd0(zd0Var, 2), 150L);
                sd0 sd0Var = zd0Var.P;
                zd0Var.removeCallbacks(sd0Var);
                zd0Var.postDelayed(sd0Var, 3000L);
                zd0Var.O = true;
                return;
            case 2:
                wd0 wd0Var = this.f41133b.f43912a;
                int i10 = 0;
                wd0Var.f44010e = false;
                wd0Var.f44011f[0].requestFocus();
                while (true) {
                    cs[] csVarArr = wd0Var.f44011f;
                    if (i10 < csVarArr.length) {
                        csVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                zd0 zd0Var2 = this.f41133b;
                zd0Var2.postDelayed(new sd0(zd0Var2, 5), 150L);
                return;
            case 4:
                zd0 zd0Var3 = this.f41133b;
                yd0 yd0Var = zd0Var3.N;
                boolean z4 = false;
                zd0Var3.O = false;
                int i11 = 0;
                while (true) {
                    cs[] csVarArr2 = zd0Var3.f43912a.f44011f;
                    if (i11 < csVarArr2.length) {
                        csVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (yd0Var.getCurrentView() != zd0Var3.f43915e) {
                        yd0Var.showNext();
                        FrameLayout frameLayout = zd0Var3.h;
                        if (zd0Var3.f43916f.getVisibility() != 0 && zd0Var3.T.C != 3 && !zd0Var3.M) {
                            z4 = true;
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z4, 1.0f, true);
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 5:
                wd0 wd0Var2 = this.f41133b.f43912a;
                int i12 = 0;
                wd0Var2.f44010e = false;
                wd0Var2.f44011f[0].requestFocus();
                while (true) {
                    cs[] csVarArr3 = wd0Var2.f44011f;
                    if (i12 < csVarArr3.length) {
                        csVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f41133b.q(true);
                return;
            case 7:
                this.f41133b.r();
                return;
            default:
                zd0 zd0Var4 = this.f41133b;
                org.telegram.ui.Components.kj0 kj0Var = zd0Var4.f43920w;
                kj0Var.getAnimatedDrawable().L(0, false, false);
                kj0Var.d();
                wd0 wd0Var3 = zd0Var4.f43912a;
                if (wd0Var3 != null && wd0Var3.f44011f != null) {
                    wd0Var3.setText("");
                    wd0Var3.f44011f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
