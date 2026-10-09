package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yd0 implements Runnable {
    public final int f44318a;
    public final fe0 f44319b;

    public yd0(fe0 fe0Var, int i10) {
        this.f44318a = i10;
        this.f44319b = fe0Var;
    }

    @Override
    public final void run() {
        switch (this.f44318a) {
            case 0:
                this.f44319b.p();
                return;
            case 1:
                fe0 fe0Var = this.f44319b;
                fe0Var.postDelayed(new yd0(fe0Var, 2), 150L);
                yd0 yd0Var = fe0Var.S;
                fe0Var.removeCallbacks(yd0Var);
                fe0Var.postDelayed(yd0Var, 3000L);
                fe0Var.R = true;
                return;
            case 2:
                ce0 ce0Var = this.f44319b.f37523a;
                int i10 = 0;
                ce0Var.f36731e = false;
                ce0Var.f36732f[0].requestFocus();
                while (true) {
                    es[] esVarArr = ce0Var.f36732f;
                    if (i10 < esVarArr.length) {
                        esVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                fe0 fe0Var2 = this.f44319b;
                fe0Var2.postDelayed(new yd0(fe0Var2, 5), 150L);
                return;
            case 4:
                fe0 fe0Var3 = this.f44319b;
                ee0 ee0Var = fe0Var3.Q;
                boolean z10 = false;
                fe0Var3.R = false;
                int i11 = 0;
                while (true) {
                    es[] esVarArr2 = fe0Var3.f37523a.f36732f;
                    if (i11 < esVarArr2.length) {
                        esVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (ee0Var.getCurrentView() != fe0Var3.f37526e) {
                        ee0Var.showNext();
                        FrameLayout frameLayout = fe0Var3.h;
                        if (fe0Var3.f37527f.getVisibility() != 0 && fe0Var3.W.F != 3 && !fe0Var3.P) {
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
                ce0 ce0Var2 = this.f44319b.f37523a;
                int i12 = 0;
                ce0Var2.f36731e = false;
                ce0Var2.f36732f[0].requestFocus();
                while (true) {
                    es[] esVarArr3 = ce0Var2.f36732f;
                    if (i12 < esVarArr3.length) {
                        esVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f44319b.q(true);
                return;
            case 7:
                this.f44319b.r();
                return;
            default:
                fe0 fe0Var4 = this.f44319b;
                org.telegram.ui.Components.fk0 fk0Var = fe0Var4.f37531w;
                fk0Var.getAnimatedDrawable().N(0, false, false);
                fk0Var.d();
                ce0 ce0Var3 = fe0Var4.f37523a;
                if (ce0Var3 != null && ce0Var3.f36732f != null) {
                    ce0Var3.setText("");
                    ce0Var3.f36732f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
