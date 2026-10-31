package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
public final class xd implements TextView.OnEditorActionListener {
    public final int f43551a;
    public final Object f43552b;
    public final Object f43553c;

    public xd(int i10, Object obj, Object obj2) {
        this.f43551a = i10;
        this.f43552b = obj;
        this.f43553c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.c1 T;
        int b10;
        s4.c1 T2;
        int b11;
        switch (this.f43551a) {
            case 0:
                le leVar = (le) this.f43552b;
                u61 u61Var = (u61) this.f43553c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    rd rdVar = new rd(leVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f34129b0 = rdVar;
                    leVar.G0.setLoading(true);
                    twoStepVerificationActivity.w0(new sd(leVar, u61Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.f43552b;
                di.a aVar = (di.a) this.f43553c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !x1Var.isShowing()) {
                    return false;
                }
                aVar.h(x1Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.hn hnVar = (org.telegram.ui.Components.hn) this.f43553c;
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) ((fg.j) this.f43552b).e;
                w71 w71Var = jnVar.f27445s;
                if (i10 == 5) {
                    View F = w71Var.F(hnVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = w71Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - jnVar.f27447t0;
                    int i12 = jnVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < jnVar.J) {
                        jnVar.S();
                        return true;
                    } else if (i11 == i13) {
                        org.telegram.messenger.i0.v1(hnVar.getTextView());
                        return true;
                    } else {
                        s4.c1 K = w71Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f47898a;
                        if (!(view instanceof org.telegram.ui.Cells.e6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.e6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                xs0 xs0Var = (xs0) this.f43553c;
                at0 at0Var = ((ys0) this.f43552b).d;
                if (i10 == 5) {
                    w71 w71Var2 = at0Var.f35713c;
                    View F2 = w71Var2.F(xs0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = w71Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - at0Var.f35726n0;
                    int i15 = at0Var.D;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < at0Var.f35725n) {
                        at0Var.j0();
                        return true;
                    } else if (i14 == i16) {
                        org.telegram.messenger.i0.v1(xs0Var.getTextView());
                        return true;
                    } else {
                        s4.c1 K2 = at0Var.f35713c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f47898a;
                        if (!(view2 instanceof org.telegram.ui.Cells.e6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.e6) view2).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
        }
    }
}
