package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class vd implements TextView.OnEditorActionListener {
    public final int f42978a;
    public final Object f42979b;
    public final Object f42980c;

    public vd(int i10, Object obj, Object obj2) {
        this.f42978a = i10;
        this.f42979b = obj;
        this.f42980c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.d1 T;
        int b10;
        s4.d1 T2;
        int b11;
        switch (this.f42978a) {
            case 0:
                je jeVar = (je) this.f42979b;
                ab1 ab1Var = (ab1) this.f42980c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    rd rdVar = new rd(jeVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f34601b0 = rdVar;
                    jeVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new sd(jeVar, ab1Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f42979b;
                ei.u1 u1Var = (ei.u1) this.f42980c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !a2Var.isShowing()) {
                    return false;
                }
                u1Var.f(a2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.io ioVar = (org.telegram.ui.Components.io) this.f42980c;
                org.telegram.ui.Components.lo loVar = ((org.telegram.ui.Components.jo) this.f42979b).d;
                ec1 ec1Var = loVar.f28403s;
                if (i10 == 5) {
                    View F = ec1Var.F(ioVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = ec1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - loVar.f28405t0;
                    int i12 = loVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < loVar.J) {
                        loVar.S();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(ioVar.getTextView());
                        return true;
                    } else {
                        s4.d1 K = ec1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f47748a;
                        if (!(view instanceof org.telegram.ui.Cells.d6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.d6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                wv0 wv0Var = (wv0) this.f42980c;
                zv0 zv0Var = ((xv0) this.f42979b).d;
                if (i10 == 5) {
                    ec1 ec1Var2 = zv0Var.f45092c;
                    View F2 = ec1Var2.F(wv0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = ec1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - zv0Var.f45106n0;
                    int i15 = zv0Var.f45121y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < zv0Var.f45105n) {
                        zv0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(wv0Var.getTextView());
                        return true;
                    } else {
                        s4.d1 K2 = zv0Var.f45092c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f47748a;
                        if (!(view2 instanceof org.telegram.ui.Cells.d6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.d6) view2).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
        }
    }
}
