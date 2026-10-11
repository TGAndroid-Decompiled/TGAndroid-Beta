package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class vx extends AnimatorListenerAdapter {
    public final int f43180a;
    public final float f43181b;
    public final sy f43182c;

    public vx(sy syVar, float f7, int i10) {
        this.f43180a = i10;
        this.f43182c = syVar;
        this.f43181b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f43180a) {
            case 0:
                super.onAnimationEnd(animator);
                sy syVar = this.f43182c;
                syVar.f42024u3 = null;
                int i12 = 0;
                syVar.O = false;
                syVar.Q = true;
                syVar.R = true;
                syVar.fragmentView.invalidate();
                if (syVar.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                syVar.f42040x3 = -(AndroidUtilities.dp(i10 + 48) - this.f43181b);
                syVar.f41941e0[0].setTranslationY(0.0f);
                while (true) {
                    ry[] ryVarArr = syVar.f41941e0;
                    if (i12 < ryVarArr.length) {
                        ry ryVar = ryVarArr[i12];
                        if (ryVar != null) {
                            ryVar.f41564a.requestLayout();
                        }
                        i12++;
                    } else {
                        syVar.fragmentView.requestLayout();
                        iy iyVar = syVar.X;
                        if (iyVar != null && syVar.f41923b.f16402f) {
                            iyVar.f31038r.requestFocus();
                            AndroidUtilities.showKeyboard(syVar.X.f31038r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                sy syVar2 = this.f43182c;
                syVar2.f42024u3 = null;
                syVar2.P = 0;
                syVar2.O = true;
                if (syVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                syVar2.f42040x3 = AndroidUtilities.dp(i11 + 48) - this.f43181b;
                syVar2.f41941e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    ry[] ryVarArr2 = syVar2.f41941e0;
                    if (i13 < ryVarArr2.length) {
                        ry ryVar2 = ryVarArr2[i13];
                        if (ryVar2 != null) {
                            ryVar2.f41564a.requestLayout();
                        }
                        i13++;
                    } else {
                        syVar2.E0.l(1.0f, false);
                        syVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
