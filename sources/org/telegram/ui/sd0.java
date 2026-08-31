package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class sd0 implements Runnable {
    public final int f41232a;
    public final zd0 f41233b;

    public sd0(zd0 zd0Var, int i10) {
        this.f41232a = i10;
        this.f41233b = zd0Var;
    }

    @Override
    public final void run() {
        switch (this.f41232a) {
            case 0:
                this.f41233b.p();
                return;
            case 1:
                zd0 zd0Var = this.f41233b;
                zd0Var.postDelayed(new sd0(zd0Var, 2), 150L);
                sd0 sd0Var = zd0Var.P;
                zd0Var.removeCallbacks(sd0Var);
                zd0Var.postDelayed(sd0Var, 3000L);
                zd0Var.O = true;
                return;
            case 2:
                wd0 wd0Var = this.f41233b.f43906a;
                int i10 = 0;
                wd0Var.f43981e = false;
                wd0Var.f43982f[0].requestFocus();
                while (true) {
                    cs[] csVarArr = wd0Var.f43982f;
                    if (i10 < csVarArr.length) {
                        csVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                zd0 zd0Var2 = this.f41233b;
                zd0Var2.postDelayed(new sd0(zd0Var2, 5), 150L);
                return;
            case 4:
                zd0 zd0Var3 = this.f41233b;
                yd0 yd0Var = zd0Var3.N;
                boolean z4 = false;
                zd0Var3.O = false;
                int i11 = 0;
                while (true) {
                    cs[] csVarArr2 = zd0Var3.f43906a.f43982f;
                    if (i11 < csVarArr2.length) {
                        csVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (yd0Var.getCurrentView() != zd0Var3.f43909e) {
                        yd0Var.showNext();
                        FrameLayout frameLayout = zd0Var3.h;
                        if (zd0Var3.f43910f.getVisibility() != 0 && zd0Var3.T.C != 3 && !zd0Var3.M) {
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
                wd0 wd0Var2 = this.f41233b.f43906a;
                int i12 = 0;
                wd0Var2.f43981e = false;
                wd0Var2.f43982f[0].requestFocus();
                while (true) {
                    cs[] csVarArr3 = wd0Var2.f43982f;
                    if (i12 < csVarArr3.length) {
                        csVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f41233b.q(true);
                return;
            case 7:
                this.f41233b.r();
                return;
            default:
                zd0 zd0Var4 = this.f41233b;
                org.telegram.ui.Components.lj0 lj0Var = zd0Var4.f43914w;
                lj0Var.getAnimatedDrawable().L(0, false, false);
                lj0Var.d();
                wd0 wd0Var3 = zd0Var4.f43906a;
                if (wd0Var3 != null && wd0Var3.f43982f != null) {
                    wd0Var3.setText("");
                    wd0Var3.f43982f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
