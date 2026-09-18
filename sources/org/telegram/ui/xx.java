package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class xx extends AnimatorListenerAdapter {
    public final int f39635a;
    public final float f39636b;
    public final uy f39637c;

    public xx(uy uyVar, float f7, int i10) {
        this.f39635a = i10;
        this.f39637c = uyVar;
        this.f39636b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f39635a) {
            case 0:
                super.onAnimationEnd(animator);
                uy uyVar = this.f39637c;
                uyVar.f38232u3 = null;
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
                uyVar.f38248x3 = -(AndroidUtilities.dp(i10 + 48) - this.f39636b);
                uyVar.f38149e0[0].setTranslationY(0.0f);
                while (true) {
                    ty[] tyVarArr = uyVar.f38149e0;
                    if (i12 < tyVarArr.length) {
                        ty tyVar = tyVarArr[i12];
                        if (tyVar != null) {
                            tyVar.f37826a.requestLayout();
                        }
                        i12++;
                    } else {
                        uyVar.fragmentView.requestLayout();
                        ky kyVar = uyVar.X;
                        if (kyVar != null && uyVar.f38132b.f14131f) {
                            kyVar.f22787r.requestFocus();
                            AndroidUtilities.showKeyboard(uyVar.X.f22787r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                uy uyVar2 = this.f39637c;
                uyVar2.f38232u3 = null;
                uyVar2.P = 0;
                uyVar2.O = true;
                if (uyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                uyVar2.f38248x3 = AndroidUtilities.dp(i11 + 48) - this.f39636b;
                uyVar2.f38149e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    ty[] tyVarArr2 = uyVar2.f38149e0;
                    if (i13 < tyVarArr2.length) {
                        ty tyVar2 = tyVarArr2[i13];
                        if (tyVar2 != null) {
                            tyVar2.f37826a.requestLayout();
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
