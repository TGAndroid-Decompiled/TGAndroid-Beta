package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class tx extends AnimatorListenerAdapter {
    public final int f37943a;
    public final float f37944b;
    public final ty f37945c;

    public tx(ty tyVar, float f7, int i10) {
        this.f37943a = i10;
        this.f37945c = tyVar;
        this.f37944b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f37943a) {
            case 0:
                super.onAnimationEnd(animator);
                ty tyVar = this.f37945c;
                tyVar.f38059u3 = null;
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
                tyVar.f38074x3 = -(AndroidUtilities.dp(i10 + 48) - this.f37944b);
                tyVar.f37976e0[0].setTranslationY(0.0f);
                while (true) {
                    sy[] syVarArr = tyVar.f37976e0;
                    if (i12 < syVarArr.length) {
                        sy syVar = syVarArr[i12];
                        if (syVar != null) {
                            syVar.f37593a.requestLayout();
                        }
                        i12++;
                    } else {
                        tyVar.fragmentView.requestLayout();
                        gy gyVar = tyVar.X;
                        if (gyVar != null && tyVar.f37959b.f14203f) {
                            gyVar.f23850r.requestFocus();
                            AndroidUtilities.showKeyboard(tyVar.X.f23850r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                ty tyVar2 = this.f37945c;
                tyVar2.f38059u3 = null;
                tyVar2.P = 0;
                tyVar2.O = true;
                if (tyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                tyVar2.f38074x3 = AndroidUtilities.dp(i11 + 48) - this.f37944b;
                tyVar2.f37976e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    sy[] syVarArr2 = tyVar2.f37976e0;
                    if (i13 < syVarArr2.length) {
                        sy syVar2 = syVarArr2[i13];
                        if (syVar2 != null) {
                            syVar2.f37593a.requestLayout();
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
