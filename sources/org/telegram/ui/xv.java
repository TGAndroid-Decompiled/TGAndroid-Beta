package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xv extends AnimatorListenerAdapter {
    public final int f52108a;
    public final float f52109b;
    public final uw f52110c;

    public xv(uw uwVar, float f10, int i3) {
        this.f52108a = i3;
        this.f52110c = uwVar;
        this.f52109b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3;
        int i10;
        switch (this.f52108a) {
            case 0:
                super.onAnimationEnd(animator);
                uw uwVar = this.f52110c;
                uwVar.f50317w3 = null;
                int i11 = 0;
                uwVar.P = false;
                uwVar.R = true;
                uwVar.S = true;
                uwVar.fragmentView.invalidate();
                if (uwVar.L) {
                    i3 = 81;
                } else {
                    i3 = 0;
                }
                uwVar.f50333z3 = -(org.telegram.messenger.g0.L(i3 + 48) - this.f52109b);
                uwVar.f50230f0[0].setTranslationY(0.0f);
                while (true) {
                    tw[] twVarArr = uwVar.f50230f0;
                    if (i11 < twVarArr.length) {
                        tw twVar = twVarArr[i11];
                        if (twVar != null) {
                            twVar.f49897a.requestLayout();
                        }
                        i11++;
                    } else {
                        uwVar.fragmentView.requestLayout();
                        iw iwVar = uwVar.Y;
                        if (iwVar != null && uwVar.f50207b.f53841f) {
                            iwVar.f36302r.requestFocus();
                            org.telegram.messenger.g0.K3(uwVar.Y.f36302r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                uw uwVar2 = this.f52110c;
                uwVar2.f50317w3 = null;
                uwVar2.Q = 0;
                uwVar2.P = true;
                if (uwVar2.L) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                uwVar2.f50333z3 = org.telegram.messenger.g0.L(i10 + 48) - this.f52109b;
                uwVar2.f50230f0[0].setTranslationY(0.0f);
                int i12 = 0;
                while (true) {
                    tw[] twVarArr2 = uwVar2.f50230f0;
                    if (i12 < twVarArr2.length) {
                        tw twVar2 = twVarArr2[i12];
                        if (twVar2 != null) {
                            twVar2.f49897a.requestLayout();
                        }
                        i12++;
                    } else {
                        uwVar2.F0.l(false, 1.0f);
                        uwVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
