package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class tx extends AnimatorListenerAdapter {
    public final int f38600a;
    public final float f38601b;
    public final qy f38602c;

    public tx(qy qyVar, float f10, int i10) {
        this.f38600a = i10;
        this.f38602c = qyVar;
        this.f38601b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f38600a) {
            case 0:
                super.onAnimationEnd(animator);
                qy qyVar = this.f38602c;
                qyVar.f37611r3 = null;
                int i12 = 0;
                qyVar.L = false;
                qyVar.N = true;
                qyVar.O = true;
                qyVar.fragmentView.invalidate();
                if (qyVar.H) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                qyVar.f37627u3 = -(AndroidUtilities.dp(i10 + 48) - this.f38601b);
                qyVar.f37527b0[0].setTranslationY(0.0f);
                while (true) {
                    py[] pyVarArr = qyVar.f37527b0;
                    if (i12 < pyVarArr.length) {
                        py pyVar = pyVarArr[i12];
                        if (pyVar != null) {
                            pyVar.f37246a.requestLayout();
                        }
                        i12++;
                    } else {
                        qyVar.fragmentView.requestLayout();
                        gy gyVar = qyVar.U;
                        if (gyVar != null && qyVar.f37526b.f46961f) {
                            gyVar.f24117r.requestFocus();
                            AndroidUtilities.showKeyboard(qyVar.U.f24117r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                qy qyVar2 = this.f38602c;
                qyVar2.f37611r3 = null;
                qyVar2.M = 0;
                qyVar2.L = true;
                if (qyVar2.H) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                qyVar2.f37627u3 = AndroidUtilities.dp(i11 + 48) - this.f38601b;
                qyVar2.f37527b0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    py[] pyVarArr2 = qyVar2.f37527b0;
                    if (i13 < pyVarArr2.length) {
                        py pyVar2 = pyVarArr2[i13];
                        if (pyVar2 != null) {
                            pyVar2.f37246a.requestLayout();
                        }
                        i13++;
                    } else {
                        qyVar2.B0.l(1.0f, false);
                        qyVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
