package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class rd0 implements Runnable {
    public final int f37985a;
    public final yd0 f37986b;

    public rd0(yd0 yd0Var, int i10) {
        this.f37985a = i10;
        this.f37986b = yd0Var;
    }

    @Override
    public final void run() {
        switch (this.f37985a) {
            case 0:
                this.f37986b.p();
                return;
            case 1:
                yd0 yd0Var = this.f37986b;
                yd0Var.postDelayed(new rd0(yd0Var, 2), 150L);
                rd0 rd0Var = yd0Var.P;
                yd0Var.removeCallbacks(rd0Var);
                yd0Var.postDelayed(rd0Var, 3000L);
                yd0Var.O = true;
                return;
            case 2:
                vd0 vd0Var = this.f37986b.f40482a;
                int i10 = 0;
                vd0Var.e = false;
                vd0Var.f40565f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr = vd0Var.f40565f;
                    if (i10 < bsVarArr.length) {
                        bsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                yd0 yd0Var2 = this.f37986b;
                yd0Var2.postDelayed(new rd0(yd0Var2, 5), 150L);
                return;
            case 4:
                yd0 yd0Var3 = this.f37986b;
                xd0 xd0Var = yd0Var3.N;
                boolean z4 = false;
                yd0Var3.O = false;
                int i11 = 0;
                while (true) {
                    bs[] bsVarArr2 = yd0Var3.f40482a.f40565f;
                    if (i11 < bsVarArr2.length) {
                        bsVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (xd0Var.getCurrentView() != yd0Var3.e) {
                        xd0Var.showNext();
                        FrameLayout frameLayout = yd0Var3.h;
                        if (yd0Var3.f40485f.getVisibility() != 0 && yd0Var3.T.C != 3 && !yd0Var3.M) {
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
                vd0 vd0Var2 = this.f37986b.f40482a;
                int i12 = 0;
                vd0Var2.e = false;
                vd0Var2.f40565f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr3 = vd0Var2.f40565f;
                    if (i12 < bsVarArr3.length) {
                        bsVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f37986b.q(true);
                return;
            case 7:
                this.f37986b.r();
                return;
            default:
                yd0 yd0Var4 = this.f37986b;
                org.telegram.ui.Components.jj0 jj0Var = yd0Var4.f40489w;
                jj0Var.getAnimatedDrawable().L(0, false, false);
                jj0Var.d();
                vd0 vd0Var3 = yd0Var4.f40482a;
                if (vd0Var3 != null && vd0Var3.f40565f != null) {
                    vd0Var3.setText("");
                    vd0Var3.f40565f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
