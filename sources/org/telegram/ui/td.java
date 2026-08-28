package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class td implements TextView.OnEditorActionListener {
    public final int f42962a;
    public final Object f42963b;
    public final Object f42964c;

    public td(int i9, Object obj, Object obj2) {
        this.f42962a = i9;
        this.f42963b = obj;
        this.f42964c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        f2.q1 T;
        int b10;
        f2.q1 T2;
        int b11;
        switch (this.f42962a) {
            case 0:
                fe feVar = (fe) this.f42963b;
                s91 s91Var = (s91) this.f42964c;
                if (i9 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    od odVar = new od(feVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.V = 1;
                    twoStepVerificationActivity.X = odVar;
                    feVar.M0.setLoading(true);
                    twoStepVerificationActivity.r0(new pd(feVar, s91Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f42963b;
                mh.q1 q1Var = (mh.q1) this.f42964c;
                if ((i9 != 6 && keyEvent.getKeyCode() != 66) || !c2Var.isShowing()) {
                    return false;
                }
                q1Var.f(c2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.gn gnVar = (org.telegram.ui.Components.gn) this.f42964c;
                org.telegram.ui.Components.jn jnVar = ((org.telegram.ui.Components.hn) this.f42963b).d;
                va1 va1Var = jnVar.f29791s;
                if (i9 == 5) {
                    View F = va1Var.F(gnVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = va1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i10 = b10 - jnVar.f29787p0;
                    int i11 = jnVar.I;
                    int i12 = i11 - 1;
                    if (i10 == i12 && i11 < jnVar.F) {
                        jnVar.O();
                        return true;
                    } else if (i10 == i12) {
                        AndroidUtilities.hideKeyboard(gnVar.getTextView());
                        return true;
                    } else {
                        f2.q1 K = va1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f5501a;
                        if (!(view instanceof org.telegram.ui.Cells.c6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.c6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                uu0 uu0Var = (uu0) this.f42964c;
                xu0 xu0Var = ((vu0) this.f42963b).d;
                if (i9 == 5) {
                    va1 va1Var2 = xu0Var.f44611c;
                    View F2 = va1Var2.F(uu0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = va1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i13 = b11 - xu0Var.f44621j0;
                    int i14 = xu0Var.f44640y;
                    int i15 = i14 - 1;
                    if (i13 == i15 && i14 < xu0Var.f44624n) {
                        xu0Var.e0();
                        return true;
                    } else if (i13 == i15) {
                        AndroidUtilities.hideKeyboard(uu0Var.getTextView());
                        return true;
                    } else {
                        f2.q1 K2 = xu0Var.f44611c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f5501a;
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
