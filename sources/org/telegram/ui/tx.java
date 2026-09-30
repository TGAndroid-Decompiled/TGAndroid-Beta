package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class tx extends AnimatorListenerAdapter {
    public final int f38339a;
    public final float f38340b;
    public final qy f38341c;

    public tx(qy qyVar, float f7, int i10) {
        this.f38339a = i10;
        this.f38341c = qyVar;
        this.f38340b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f38339a) {
            case 0:
                super.onAnimationEnd(animator);
                qy qyVar = this.f38341c;
                qyVar.f37217u3 = null;
                int i12 = 0;
                qyVar.O = false;
                qyVar.Q = true;
                qyVar.R = true;
                qyVar.fragmentView.invalidate();
                if (qyVar.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                qyVar.f37233x3 = -(AndroidUtilities.dp(i10 + 48) - this.f38340b);
                qyVar.f37134e0[0].setTranslationY(0.0f);
                while (true) {
                    py[] pyVarArr = qyVar.f37134e0;
                    if (i12 < pyVarArr.length) {
                        py pyVar = pyVarArr[i12];
                        if (pyVar != null) {
                            pyVar.f36794a.requestLayout();
                        }
                        i12++;
                    } else {
                        qyVar.fragmentView.requestLayout();
                        gy gyVar = qyVar.X;
                        if (gyVar != null && qyVar.f37117b.f14217f) {
                            gyVar.f24137r.requestFocus();
                            AndroidUtilities.showKeyboard(qyVar.X.f24137r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                qy qyVar2 = this.f38341c;
                qyVar2.f37217u3 = null;
                qyVar2.P = 0;
                qyVar2.O = true;
                if (qyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                qyVar2.f37233x3 = AndroidUtilities.dp(i11 + 48) - this.f38340b;
                qyVar2.f37134e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    py[] pyVarArr2 = qyVar2.f37134e0;
                    if (i13 < pyVarArr2.length) {
                        py pyVar2 = pyVarArr2[i13];
                        if (pyVar2 != null) {
                            pyVar2.f36794a.requestLayout();
                        }
                        i13++;
                    } else {
                        qyVar2.E0.l(1.0f, false);
                        qyVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
