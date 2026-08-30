package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class rx extends AnimatorListenerAdapter {
    public final int f38135a;
    public final float f38136b;
    public final oy f38137c;

    public rx(oy oyVar, float f10, int i10) {
        this.f38135a = i10;
        this.f38137c = oyVar;
        this.f38136b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f38135a) {
            case 0:
                super.onAnimationEnd(animator);
                oy oyVar = this.f38137c;
                oyVar.f37093r3 = null;
                int i12 = 0;
                oyVar.L = false;
                oyVar.N = true;
                oyVar.O = true;
                oyVar.fragmentView.invalidate();
                if (oyVar.H) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                oyVar.f37109u3 = -(AndroidUtilities.dp(i10 + 48) - this.f38136b);
                oyVar.f37009b0[0].setTranslationY(0.0f);
                while (true) {
                    ny[] nyVarArr = oyVar.f37009b0;
                    if (i12 < nyVarArr.length) {
                        ny nyVar = nyVarArr[i12];
                        if (nyVar != null) {
                            nyVar.f36741a.requestLayout();
                        }
                        i12++;
                    } else {
                        oyVar.fragmentView.requestLayout();
                        ey eyVar = oyVar.U;
                        if (eyVar != null && oyVar.f37008b.f46893f) {
                            eyVar.f23815r.requestFocus();
                            AndroidUtilities.showKeyboard(oyVar.U.f23815r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                oy oyVar2 = this.f38137c;
                oyVar2.f37093r3 = null;
                oyVar2.M = 0;
                oyVar2.L = true;
                if (oyVar2.H) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                oyVar2.f37109u3 = AndroidUtilities.dp(i11 + 48) - this.f38136b;
                oyVar2.f37009b0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    ny[] nyVarArr2 = oyVar2.f37009b0;
                    if (i13 < nyVarArr2.length) {
                        ny nyVar2 = nyVarArr2[i13];
                        if (nyVar2 != null) {
                            nyVar2.f36741a.requestLayout();
                        }
                        i13++;
                    } else {
                        oyVar2.B0.l(1.0f, false);
                        oyVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
