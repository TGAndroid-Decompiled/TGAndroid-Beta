package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class wd0 implements Runnable {
    public final int f38914a;
    public final de0 f38915b;

    public wd0(de0 de0Var, int i10) {
        this.f38914a = i10;
        this.f38915b = de0Var;
    }

    @Override
    public final void run() {
        switch (this.f38914a) {
            case 0:
                this.f38915b.p();
                return;
            case 1:
                de0 de0Var = this.f38915b;
                de0Var.postDelayed(new wd0(de0Var, 2), 150L);
                wd0 wd0Var = de0Var.S;
                de0Var.removeCallbacks(wd0Var);
                de0Var.postDelayed(wd0Var, 3000L);
                de0Var.R = true;
                return;
            case 2:
                ae0 ae0Var = this.f38915b.f32941a;
                int i10 = 0;
                ae0Var.e = false;
                ae0Var.f32431f[0].requestFocus();
                while (true) {
                    ds[] dsVarArr = ae0Var.f32431f;
                    if (i10 < dsVarArr.length) {
                        dsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                de0 de0Var2 = this.f38915b;
                de0Var2.postDelayed(new wd0(de0Var2, 5), 150L);
                return;
            case 4:
                de0 de0Var3 = this.f38915b;
                ce0 ce0Var = de0Var3.Q;
                boolean z10 = false;
                de0Var3.R = false;
                int i11 = 0;
                while (true) {
                    ds[] dsVarArr2 = de0Var3.f32941a.f32431f;
                    if (i11 < dsVarArr2.length) {
                        dsVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (ce0Var.getCurrentView() != de0Var3.e) {
                        ce0Var.showNext();
                        FrameLayout frameLayout = de0Var3.h;
                        if (de0Var3.f32944f.getVisibility() != 0 && de0Var3.W.F != 3 && !de0Var3.P) {
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
                ae0 ae0Var2 = this.f38915b.f32941a;
                int i12 = 0;
                ae0Var2.e = false;
                ae0Var2.f32431f[0].requestFocus();
                while (true) {
                    ds[] dsVarArr3 = ae0Var2.f32431f;
                    if (i12 < dsVarArr3.length) {
                        dsVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f38915b.q(true);
                return;
            case 7:
                this.f38915b.r();
                return;
            default:
                de0 de0Var4 = this.f38915b;
                org.telegram.ui.Components.nj0 nj0Var = de0Var4.f32948w;
                nj0Var.getAnimatedDrawable().N(0, false, false);
                nj0Var.d();
                ae0 ae0Var3 = de0Var4.f32941a;
                if (ae0Var3 != null && ae0Var3.f32431f != null) {
                    ae0Var3.setText("");
                    ae0Var3.f32431f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
