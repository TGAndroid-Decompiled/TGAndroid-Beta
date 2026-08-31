package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class yd implements TextView.OnEditorActionListener {
    public final int f43602a;
    public final Object f43603b;
    public final Object f43604c;

    public yd(int i10, Object obj, Object obj2) {
        this.f43602a = i10;
        this.f43603b = obj;
        this.f43604c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        f2.m1 T;
        int b10;
        f2.m1 T2;
        int b11;
        switch (this.f43602a) {
            case 0:
                ke keVar = (ke) this.f43603b;
                ha1 ha1Var = (ha1) this.f43604c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    td tdVar = new td(keVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.W = 1;
                    twoStepVerificationActivity.Y = tdVar;
                    keVar.N0.setLoading(true);
                    twoStepVerificationActivity.s0(new ud(keVar, ha1Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f43603b;
                org.telegram.ui.Components.s1 s1Var = (org.telegram.ui.Components.s1) this.f43604c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !d2Var.isShowing()) {
                    return false;
                }
                s1Var.j(d2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.pn pnVar = (org.telegram.ui.Components.pn) this.f43604c;
                org.telegram.ui.Components.sn snVar = ((org.telegram.ui.Components.qn) this.f43603b).d;
                kb1 kb1Var = snVar.f31122s;
                if (i10 == 5) {
                    View F = kb1Var.F(pnVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = kb1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - snVar.f31119q0;
                    int i12 = snVar.J;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < snVar.G) {
                        snVar.P();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(pnVar.getTextView());
                        return true;
                    } else {
                        f2.m1 K = kb1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f5875a;
                        if (!(view instanceof org.telegram.ui.Cells.c6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.c6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                ev0 ev0Var = (ev0) this.f43604c;
                hv0 hv0Var = ((fv0) this.f43603b).d;
                if (i10 == 5) {
                    kb1 kb1Var2 = hv0Var.f37644c;
                    View F2 = kb1Var2.F(ev0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = kb1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - hv0Var.f37655k0;
                    int i15 = hv0Var.f37673y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < hv0Var.f37657n) {
                        hv0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(ev0Var.getTextView());
                        return true;
                    } else {
                        f2.m1 K2 = hv0Var.f37644c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f5875a;
                        if (!(view2 instanceof org.telegram.ui.Cells.c6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.c6) view2).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
        }
    }
}
