package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ud0 implements Runnable {
    public final int f38055a;
    public final be0 f38056b;

    public ud0(be0 be0Var, int i10) {
        this.f38055a = i10;
        this.f38056b = be0Var;
    }

    @Override
    public final void run() {
        switch (this.f38055a) {
            case 0:
                this.f38056b.p();
                return;
            case 1:
                be0 be0Var = this.f38056b;
                be0Var.postDelayed(new ud0(be0Var, 2), 150L);
                ud0 ud0Var = be0Var.S;
                be0Var.removeCallbacks(ud0Var);
                be0Var.postDelayed(ud0Var, 3000L);
                be0Var.R = true;
                return;
            case 2:
                yd0 yd0Var = this.f38056b.f32087a;
                int i10 = 0;
                yd0Var.e = false;
                yd0Var.f40230f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr = yd0Var.f40230f;
                    if (i10 < bsVarArr.length) {
                        bsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                be0 be0Var2 = this.f38056b;
                be0Var2.postDelayed(new ud0(be0Var2, 5), 150L);
                return;
            case 4:
                be0 be0Var3 = this.f38056b;
                ae0 ae0Var = be0Var3.Q;
                boolean z10 = false;
                be0Var3.R = false;
                int i11 = 0;
                while (true) {
                    bs[] bsVarArr2 = be0Var3.f32087a.f40230f;
                    if (i11 < bsVarArr2.length) {
                        bsVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (ae0Var.getCurrentView() != be0Var3.e) {
                        ae0Var.showNext();
                        FrameLayout frameLayout = be0Var3.h;
                        if (be0Var3.f32090f.getVisibility() != 0 && be0Var3.W.F != 3 && !be0Var3.P) {
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
                yd0 yd0Var2 = this.f38056b.f32087a;
                int i12 = 0;
                yd0Var2.e = false;
                yd0Var2.f40230f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr3 = yd0Var2.f40230f;
                    if (i12 < bsVarArr3.length) {
                        bsVarArr3[i12].i(0.0f);
                        i12++;
                    } else {
                        return;
                    }
                }
            case 6:
                this.f38056b.q(true);
                return;
            case 7:
                this.f38056b.r();
                return;
            default:
                be0 be0Var4 = this.f38056b;
                org.telegram.ui.Components.bj0 bj0Var = be0Var4.f32094w;
                bj0Var.getAnimatedDrawable().N(0, false, false);
                bj0Var.d();
                yd0 yd0Var3 = be0Var4.f32087a;
                if (yd0Var3 != null && yd0Var3.f40230f != null) {
                    yd0Var3.setText("");
                    yd0Var3.f40230f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
