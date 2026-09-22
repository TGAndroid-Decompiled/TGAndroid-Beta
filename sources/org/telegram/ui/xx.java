package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class xx extends AnimatorListenerAdapter {
    public final int f39700a;
    public final float f39701b;
    public final uy f39702c;

    public xx(uy uyVar, float f7, int i10) {
        this.f39700a = i10;
        this.f39702c = uyVar;
        this.f39701b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f39700a) {
            case 0:
                super.onAnimationEnd(animator);
                uy uyVar = this.f39702c;
                uyVar.f38305u3 = null;
                int i12 = 0;
                uyVar.O = false;
                uyVar.Q = true;
                uyVar.R = true;
                uyVar.fragmentView.invalidate();
                if (uyVar.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                uyVar.f38321x3 = -(AndroidUtilities.dp(i10 + 48) - this.f39701b);
                uyVar.f38222e0[0].setTranslationY(0.0f);
                while (true) {
                    ty[] tyVarArr = uyVar.f38222e0;
                    if (i12 < tyVarArr.length) {
                        ty tyVar = tyVarArr[i12];
                        if (tyVar != null) {
                            tyVar.f37752a.requestLayout();
                        }
                        i12++;
                    } else {
                        uyVar.fragmentView.requestLayout();
                        ky kyVar = uyVar.X;
                        if (kyVar != null && uyVar.f38205b.f13973f) {
                            kyVar.f22569r.requestFocus();
                            AndroidUtilities.showKeyboard(uyVar.X.f22569r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                uy uyVar2 = this.f39702c;
                uyVar2.f38305u3 = null;
                uyVar2.P = 0;
                uyVar2.O = true;
                if (uyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                uyVar2.f38321x3 = AndroidUtilities.dp(i11 + 48) - this.f39701b;
                uyVar2.f38222e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    ty[] tyVarArr2 = uyVar2.f38222e0;
                    if (i13 < tyVarArr2.length) {
                        ty tyVar2 = tyVarArr2[i13];
                        if (tyVar2 != null) {
                            tyVar2.f37752a.requestLayout();
                        }
                        i13++;
                    } else {
                        uyVar2.E0.l(1.0f, false);
                        uyVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
