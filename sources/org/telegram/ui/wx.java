package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class wx extends AnimatorListenerAdapter {
    public final int f43764a;
    public final float f43765b;
    public final ty f43766c;

    public wx(ty tyVar, float f7, int i10) {
        this.f43764a = i10;
        this.f43766c = tyVar;
        this.f43765b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f43764a) {
            case 0:
                super.onAnimationEnd(animator);
                ty tyVar = this.f43766c;
                tyVar.f42257u3 = null;
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
                tyVar.f42273x3 = -(AndroidUtilities.dp(i10 + 48) - this.f43765b);
                tyVar.f42174e0[0].setTranslationY(0.0f);
                while (true) {
                    sy[] syVarArr = tyVar.f42174e0;
                    if (i12 < syVarArr.length) {
                        sy syVar = syVarArr[i12];
                        if (syVar != null) {
                            syVar.f41790a.requestLayout();
                        }
                        i12++;
                    } else {
                        tyVar.fragmentView.requestLayout();
                        jy jyVar = tyVar.X;
                        if (jyVar != null && tyVar.f42156b.f16338f) {
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
                ty tyVar2 = this.f43766c;
                tyVar2.f42257u3 = null;
                tyVar2.P = 0;
                tyVar2.O = true;
                if (tyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                tyVar2.f42273x3 = AndroidUtilities.dp(i11 + 48) - this.f43765b;
                tyVar2.f42174e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    sy[] syVarArr2 = tyVar2.f42174e0;
                    if (i13 < syVarArr2.length) {
                        sy syVar2 = syVarArr2[i13];
                        if (syVar2 != null) {
                            syVar2.f41790a.requestLayout();
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
