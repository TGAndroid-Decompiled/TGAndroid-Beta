package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
public final class xd implements TextView.OnEditorActionListener {
    public final int f43354a;
    public final Object f43355b;
    public final Object f43356c;

    public xd(int i10, Object obj, Object obj2) {
        this.f43354a = i10;
        this.f43355b = obj;
        this.f43356c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.c1 T;
        int b10;
        s4.c1 T2;
        int b11;
        switch (this.f43354a) {
            case 0:
                le leVar = (le) this.f43355b;
                s61 s61Var = (s61) this.f43356c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    rd rdVar = new rd(leVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f34136b0 = rdVar;
                    leVar.G0.setLoading(true);
                    twoStepVerificationActivity.x0(new sd(leVar, s61Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.f43355b;
                di.a aVar = (di.a) this.f43356c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !x1Var.isShowing()) {
                    return false;
                }
                aVar.h(x1Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.hn hnVar = (org.telegram.ui.Components.hn) this.f43356c;
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) ((fg.j) this.f43355b).e;
                u71 u71Var = jnVar.f27511s;
                if (i10 == 5) {
                    View F = u71Var.F(hnVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = u71Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - jnVar.f27513t0;
                    int i12 = jnVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < jnVar.J) {
                        jnVar.S();
                        return true;
                    } else if (i11 == i13) {
                        org.telegram.messenger.i0.v1(hnVar.getTextView());
                        return true;
                    } else {
                        s4.c1 K = u71Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f47909a;
                        if (!(view instanceof org.telegram.ui.Cells.e6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.e6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                ws0 ws0Var = (ws0) this.f43356c;
                zs0 zs0Var = ((xs0) this.f43355b).d;
                if (i10 == 5) {
                    u71 u71Var2 = zs0Var.f44056c;
                    View F2 = u71Var2.F(ws0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = u71Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - zs0Var.f44069n0;
                    int i15 = zs0Var.D;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < zs0Var.f44068n) {
                        zs0Var.k0();
                        return true;
                    } else if (i14 == i16) {
                        org.telegram.messenger.i0.v1(ws0Var.getTextView());
                        return true;
                    } else {
                        s4.c1 K2 = zs0Var.f44056c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f47909a;
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
