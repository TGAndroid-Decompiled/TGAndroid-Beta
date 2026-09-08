package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class zd0 implements Runnable {
    public final int f43407a;
    public final ge0 f43408b;

    public zd0(ge0 ge0Var, int i10) {
        this.f43407a = i10;
        this.f43408b = ge0Var;
    }

    @Override
    public final void run() {
        switch (this.f43407a) {
            case 0:
                this.f43408b.p();
                return;
            case 1:
                ge0 ge0Var = this.f43408b;
                ge0Var.postDelayed(new zd0(ge0Var, 2), 150L);
                zd0 zd0Var = ge0Var.S;
                ge0Var.removeCallbacks(zd0Var);
                ge0Var.postDelayed(zd0Var, 3000L);
                ge0Var.R = true;
                return;
            case 2:
                de0 de0Var = this.f43408b.f36669a;
                int i10 = 0;
                de0Var.f36189e = false;
                de0Var.f36190f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr = de0Var.f36190f;
                    if (i10 < gsVarArr.length) {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                ge0 ge0Var2 = this.f43408b;
                ge0Var2.postDelayed(new zd0(ge0Var2, 5), 150L);
                return;
            case 4:
                ge0 ge0Var3 = this.f43408b;
                fe0 fe0Var = ge0Var3.Q;
                boolean z10 = false;
                ge0Var3.R = false;
                int i11 = 0;
                while (true) {
                    gs[] gsVarArr2 = ge0Var3.f36669a.f36190f;
                    if (i11 < gsVarArr2.length) {
                        gsVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (fe0Var.getCurrentView() != ge0Var3.f36672e) {
                        fe0Var.showNext();
                        FrameLayout frameLayout = ge0Var3.h;
                        if (ge0Var3.f36673f.getVisibility() != 0 && ge0Var3.W.F != 3 && !ge0Var3.P) {
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
                de0 de0Var2 = this.f43408b.f36669a;
                int i12 = 0;
                de0Var2.f36189e = false;
                de0Var2.f36190f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr3 = de0Var2.f36190f;
                    if (i12 < gsVarArr3.length) {
                        gsVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f43408b.q(true);
                return;
            case 7:
                this.f43408b.r();
                return;
            default:
                ge0 ge0Var4 = this.f43408b;
                org.telegram.ui.Components.aj0 aj0Var = ge0Var4.f36677w;
                aj0Var.getAnimatedDrawable().L(0, false, false);
                aj0Var.d();
                de0 de0Var3 = ge0Var4.f36669a;
                if (de0Var3 != null && de0Var3.f36190f != null) {
                    de0Var3.setText("");
                    de0Var3.f36190f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
