package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class zx extends AnimatorListenerAdapter {
    public final int f40349a;
    public final float f40350b;
    public final wy f40351c;

    public zx(wy wyVar, float f7, int i10) {
        this.f40349a = i10;
        this.f40351c = wyVar;
        this.f40350b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f40349a) {
            case 0:
                super.onAnimationEnd(animator);
                wy wyVar = this.f40351c;
                wyVar.f39298u3 = null;
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
                wyVar.f39315x3 = -(AndroidUtilities.dp(i10 + 48) - this.f40350b);
                wyVar.f39215e0[0].setTranslationY(0.0f);
                while (true) {
                    vy[] vyVarArr = wyVar.f39215e0;
                    if (i12 < vyVarArr.length) {
                        vy vyVar = vyVarArr[i12];
                        if (vyVar != null) {
                            vyVar.f38522a.requestLayout();
                        }
                        i12++;
                    } else {
                        wyVar.fragmentView.requestLayout();
                        my myVar = wyVar.X;
                        if (myVar != null && wyVar.f39198b.f13985f) {
                            myVar.f22543r.requestFocus();
                            AndroidUtilities.showKeyboard(wyVar.X.f22543r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                wy wyVar2 = this.f40351c;
                wyVar2.f39298u3 = null;
                wyVar2.P = 0;
                wyVar2.O = true;
                if (wyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                wyVar2.f39315x3 = AndroidUtilities.dp(i11 + 48) - this.f40350b;
                wyVar2.f39215e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    vy[] vyVarArr2 = wyVar2.f39215e0;
                    if (i13 < vyVarArr2.length) {
                        vy vyVar2 = vyVarArr2[i13];
                        if (vyVar2 != null) {
                            vyVar2.f38522a.requestLayout();
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
