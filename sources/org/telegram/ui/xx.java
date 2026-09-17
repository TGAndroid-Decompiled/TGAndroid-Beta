package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class xx extends AnimatorListenerAdapter {
    public final int f42909a;
    public final float f42910b;
    public final uy f42911c;

    public xx(uy uyVar, float f7, int i10) {
        this.f42909a = i10;
        this.f42911c = uyVar;
        this.f42910b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f42909a) {
            case 0:
                super.onAnimationEnd(animator);
                uy uyVar = this.f42911c;
                uyVar.f41343u3 = null;
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
                uyVar.f41360x3 = -(AndroidUtilities.dp(i10 + 48) - this.f42910b);
                uyVar.f41260e0[0].setTranslationY(0.0f);
                while (true) {
                    ty[] tyVarArr = uyVar.f41260e0;
                    if (i12 < tyVarArr.length) {
                        ty tyVar = tyVarArr[i12];
                        if (tyVar != null) {
                            tyVar.f40859a.requestLayout();
                        }
                        i12++;
                    } else {
                        uyVar.fragmentView.requestLayout();
                        ky kyVar = uyVar.X;
                        if (kyVar != null && uyVar.f41242b.f15369f) {
                            kyVar.f24523r.requestFocus();
                            AndroidUtilities.showKeyboard(uyVar.X.f24523r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                uy uyVar2 = this.f42911c;
                uyVar2.f41343u3 = null;
                uyVar2.P = 0;
                uyVar2.O = true;
                if (uyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                uyVar2.f41360x3 = AndroidUtilities.dp(i11 + 48) - this.f42910b;
                uyVar2.f41260e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    ty[] tyVarArr2 = uyVar2.f41260e0;
                    if (i13 < tyVarArr2.length) {
                        ty tyVar2 = tyVarArr2[i13];
                        if (tyVar2 != null) {
                            tyVar2.f40859a.requestLayout();
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
