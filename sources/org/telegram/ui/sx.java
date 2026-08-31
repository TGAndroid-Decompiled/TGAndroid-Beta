package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class sx extends AnimatorListenerAdapter {
    public final int f41387a;
    public final float f41388b;
    public final py f41389c;

    public sx(py pyVar, float f10, int i10) {
        this.f41387a = i10;
        this.f41389c = pyVar;
        this.f41388b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f41387a) {
            case 0:
                super.onAnimationEnd(animator);
                py pyVar = this.f41389c;
                pyVar.f40270r3 = null;
                int i12 = 0;
                pyVar.L = false;
                pyVar.N = true;
                pyVar.O = true;
                pyVar.fragmentView.invalidate();
                if (pyVar.H) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                pyVar.f40286u3 = -(AndroidUtilities.dp(i10 + 48) - this.f41388b);
                pyVar.f40185b0[0].setTranslationY(0.0f);
                while (true) {
                    oy[] oyVarArr = pyVar.f40185b0;
                    if (i12 < oyVarArr.length) {
                        oy oyVar = oyVarArr[i12];
                        if (oyVar != null) {
                            oyVar.f39866a.requestLayout();
                        }
                        i12++;
                    } else {
                        pyVar.fragmentView.requestLayout();
                        fy fyVar = pyVar.U;
                        if (fyVar != null && pyVar.f40184b.f50505f) {
                            fyVar.f26172r.requestFocus();
                            AndroidUtilities.showKeyboard(pyVar.U.f26172r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                py pyVar2 = this.f41389c;
                pyVar2.f40270r3 = null;
                pyVar2.M = 0;
                pyVar2.L = true;
                if (pyVar2.H) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                pyVar2.f40286u3 = AndroidUtilities.dp(i11 + 48) - this.f41388b;
                pyVar2.f40185b0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    oy[] oyVarArr2 = pyVar2.f40185b0;
                    if (i13 < oyVarArr2.length) {
                        oy oyVar2 = oyVarArr2[i13];
                        if (oyVar2 != null) {
                            oyVar2.f39866a.requestLayout();
                        }
                        i13++;
                    } else {
                        pyVar2.B0.l(1.0f, false);
                        pyVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
