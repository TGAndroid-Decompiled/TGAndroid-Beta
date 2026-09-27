package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class yd implements TextView.OnEditorActionListener {
    public final int f40189a;
    public final Object f40190b;
    public final Object f40191c;

    public yd(int i10, Object obj, Object obj2) {
        this.f40189a = i10;
        this.f40190b = obj;
        this.f40191c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.c1 U;
        int b10;
        s4.c1 U2;
        int b11;
        switch (this.f40189a) {
            case 0:
                me meVar = (me) this.f40190b;
                ra1 ra1Var = (ra1) this.f40191c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    ud udVar = new ud(meVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f31879b0 = udVar;
                    meVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new vd(meVar, ra1Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f40190b;
                ei.u1 u1Var = (ei.u1) this.f40191c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !c2Var.isShowing()) {
                    return false;
                }
                u1Var.f(c2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.tn tnVar = (org.telegram.ui.Components.tn) this.f40191c;
                org.telegram.ui.Components.wn wnVar = ((org.telegram.ui.Components.un) this.f40190b).d;
                wb1 wb1Var = wnVar.f30106s;
                if (i10 == 5) {
                    View G = wb1Var.G(tnVar);
                    if (G == null) {
                        U = null;
                    } else {
                        U = wb1Var.U(G);
                    }
                    if (U == null || (b10 = U.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - wnVar.f30108t0;
                    int i12 = wnVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < wnVar.J) {
                        wnVar.P();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(tnVar.getTextView());
                        return true;
                    } else {
                        s4.c1 L = wb1Var.L(b10 + 1);
                        if (L == null) {
                            return true;
                        }
                        View view = L.f43005a;
                        if (!(view instanceof org.telegram.ui.Cells.d6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.d6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                rv0 rv0Var = (rv0) this.f40191c;
                uv0 uv0Var = ((sv0) this.f40190b).d;
                if (i10 == 5) {
                    wb1 wb1Var2 = uv0Var.f38341c;
                    View G2 = wb1Var2.G(rv0Var);
                    if (G2 == null) {
                        U2 = null;
                    } else {
                        U2 = wb1Var2.U(G2);
                    }
                    if (U2 == null || (b11 = U2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - uv0Var.f38354n0;
                    int i15 = uv0Var.f38369y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < uv0Var.f38353n) {
                        uv0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(rv0Var.getTextView());
                        return true;
                    } else {
                        s4.c1 L2 = uv0Var.f38341c.L(b11 + 1);
                        if (L2 == null) {
                            return true;
                        }
                        View view2 = L2.f43005a;
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
