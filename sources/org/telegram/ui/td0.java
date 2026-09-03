package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class td0 implements Runnable {
    public final int f38467a;
    public final ae0 f38468b;

    public td0(ae0 ae0Var, int i10) {
        this.f38467a = i10;
        this.f38468b = ae0Var;
    }

    @Override
    public final void run() {
        switch (this.f38467a) {
            case 0:
                this.f38468b.p();
                return;
            case 1:
                ae0 ae0Var = this.f38468b;
                ae0Var.postDelayed(new td0(ae0Var, 2), 150L);
                td0 td0Var = ae0Var.P;
                ae0Var.removeCallbacks(td0Var);
                ae0Var.postDelayed(td0Var, 3000L);
                ae0Var.O = true;
                return;
            case 2:
                xd0 xd0Var = this.f38468b.f32561a;
                int i10 = 0;
                xd0Var.e = false;
                xd0Var.f32635f[0].requestFocus();
                while (true) {
                    ds[] dsVarArr = xd0Var.f32635f;
                    if (i10 < dsVarArr.length) {
                        dsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                ae0 ae0Var2 = this.f38468b;
                ae0Var2.postDelayed(new td0(ae0Var2, 5), 150L);
                return;
            case 4:
                ae0 ae0Var3 = this.f38468b;
                zd0 zd0Var = ae0Var3.N;
                boolean z4 = false;
                ae0Var3.O = false;
                int i11 = 0;
                while (true) {
                    ds[] dsVarArr2 = ae0Var3.f32561a.f32635f;
                    if (i11 < dsVarArr2.length) {
                        dsVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (zd0Var.getCurrentView() != ae0Var3.e) {
                        zd0Var.showNext();
                        FrameLayout frameLayout = ae0Var3.h;
                        if (ae0Var3.f32564f.getVisibility() != 0 && ae0Var3.T.C != 3 && !ae0Var3.M) {
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
                xd0 xd0Var2 = this.f38468b.f32561a;
                int i12 = 0;
                xd0Var2.e = false;
                xd0Var2.f32635f[0].requestFocus();
                while (true) {
                    ds[] dsVarArr3 = xd0Var2.f32635f;
                    if (i12 < dsVarArr3.length) {
                        dsVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f38468b.q(true);
                return;
            case 7:
                this.f38468b.r();
                return;
            default:
                ae0 ae0Var4 = this.f38468b;
                org.telegram.ui.Components.jj0 jj0Var = ae0Var4.f32568w;
                jj0Var.getAnimatedDrawable().L(0, false, false);
                jj0Var.d();
                xd0 xd0Var3 = ae0Var4.f32561a;
                if (xd0Var3 != null && xd0Var3.f32635f != null) {
                    xd0Var3.setText("");
                    xd0Var3.f32635f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
