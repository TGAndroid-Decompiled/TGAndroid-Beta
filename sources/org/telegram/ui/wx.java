package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class wx extends AnimatorListenerAdapter {
    public final int f43762a;
    public final float f43763b;
    public final ty f43764c;

    public wx(ty tyVar, float f7, int i10) {
        this.f43762a = i10;
        this.f43764c = tyVar;
        this.f43763b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f43762a) {
            case 0:
                super.onAnimationEnd(animator);
                ty tyVar = this.f43764c;
                tyVar.f42255u3 = null;
                int i12 = 0;
                tyVar.O = false;
                tyVar.Q = true;
                tyVar.R = true;
                tyVar.fragmentView.invalidate();
                if (tyVar.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                tyVar.f42271x3 = -(AndroidUtilities.dp(i10 + 48) - this.f43763b);
                tyVar.f42172e0[0].setTranslationY(0.0f);
                while (true) {
                    sy[] syVarArr = tyVar.f42172e0;
                    if (i12 < syVarArr.length) {
                        sy syVar = syVarArr[i12];
                        if (syVar != null) {
                            syVar.f41788a.requestLayout();
                        }
                        i12++;
                    } else {
                        tyVar.fragmentView.requestLayout();
                        jy jyVar = tyVar.X;
                        if (jyVar != null && tyVar.f42154b.f16338f) {
                            jyVar.f30614r.requestFocus();
                            AndroidUtilities.showKeyboard(tyVar.X.f30614r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                ty tyVar2 = this.f43764c;
                tyVar2.f42255u3 = null;
                tyVar2.P = 0;
                tyVar2.O = true;
                if (tyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                tyVar2.f42271x3 = AndroidUtilities.dp(i11 + 48) - this.f43763b;
                tyVar2.f42172e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    sy[] syVarArr2 = tyVar2.f42172e0;
                    if (i13 < syVarArr2.length) {
                        sy syVar2 = syVarArr2[i13];
                        if (syVar2 != null) {
                            syVar2.f41788a.requestLayout();
                        }
                        i13++;
                    } else {
                        tyVar2.E0.l(1.0f, false);
                        tyVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
