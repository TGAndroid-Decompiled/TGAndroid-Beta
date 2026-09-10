package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class zx extends AnimatorListenerAdapter {
    public final int f39459a;
    public final float f39460b;
    public final wy f39461c;

    public zx(wy wyVar, float f7, int i10) {
        this.f39459a = i10;
        this.f39461c = wyVar;
        this.f39460b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f39459a) {
            case 0:
                super.onAnimationEnd(animator);
                wy wyVar = this.f39461c;
                wyVar.f38514u3 = null;
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
                wyVar.f38531x3 = -(AndroidUtilities.dp(i10 + 48) - this.f39460b);
                wyVar.f38431e0[0].setTranslationY(0.0f);
                while (true) {
                    vy[] vyVarArr = wyVar.f38431e0;
                    if (i12 < vyVarArr.length) {
                        vy vyVar = vyVarArr[i12];
                        if (vyVar != null) {
                            vyVar.f37645a.requestLayout();
                        }
                        i12++;
                    } else {
                        wyVar.fragmentView.requestLayout();
                        my myVar = wyVar.X;
                        if (myVar != null && wyVar.f38414b.f12870f) {
                            myVar.f24572r.requestFocus();
                            AndroidUtilities.showKeyboard(wyVar.X.f24572r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                wy wyVar2 = this.f39461c;
                wyVar2.f38514u3 = null;
                wyVar2.P = 0;
                wyVar2.O = true;
                if (wyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                wyVar2.f38531x3 = AndroidUtilities.dp(i11 + 48) - this.f39460b;
                wyVar2.f38431e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    vy[] vyVarArr2 = wyVar2.f38431e0;
                    if (i13 < vyVarArr2.length) {
                        vy vyVar2 = vyVarArr2[i13];
                        if (vyVar2 != null) {
                            vyVar2.f37645a.requestLayout();
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
