package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class zx extends AnimatorListenerAdapter {
    public final int f40354a;
    public final float f40355b;
    public final wy f40356c;

    public zx(wy wyVar, float f7, int i10) {
        this.f40354a = i10;
        this.f40356c = wyVar;
        this.f40355b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f40354a) {
            case 0:
                super.onAnimationEnd(animator);
                wy wyVar = this.f40356c;
                wyVar.f39304u3 = null;
                int i12 = 0;
                wyVar.O = false;
                wyVar.Q = true;
                wyVar.R = true;
                wyVar.fragmentView.invalidate();
                if (wyVar.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                wyVar.f39320x3 = -(AndroidUtilities.dp(i10 + 48) - this.f40355b);
                wyVar.f39221e0[0].setTranslationY(0.0f);
                while (true) {
                    vy[] vyVarArr = wyVar.f39221e0;
                    if (i12 < vyVarArr.length) {
                        vy vyVar = vyVarArr[i12];
                        if (vyVar != null) {
                            vyVar.f38527a.requestLayout();
                        }
                        i12++;
                    } else {
                        wyVar.fragmentView.requestLayout();
                        my myVar = wyVar.X;
                        if (myVar != null && wyVar.f39204b.f13985f) {
                            myVar.f22546r.requestFocus();
                            AndroidUtilities.showKeyboard(wyVar.X.f22546r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                wy wyVar2 = this.f40356c;
                wyVar2.f39304u3 = null;
                wyVar2.P = 0;
                wyVar2.O = true;
                if (wyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                wyVar2.f39320x3 = AndroidUtilities.dp(i11 + 48) - this.f40355b;
                wyVar2.f39221e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    vy[] vyVarArr2 = wyVar2.f39221e0;
                    if (i13 < vyVarArr2.length) {
                        vy vyVar2 = vyVarArr2[i13];
                        if (vyVar2 != null) {
                            vyVar2.f38527a.requestLayout();
                        }
                        i13++;
                    } else {
                        wyVar2.E0.l(1.0f, false);
                        wyVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
