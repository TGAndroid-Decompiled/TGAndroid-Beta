package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class sx extends org.telegram.ui.ActionBar.s0 {
    public final ey f43428a;

    public sx(ey eyVar) {
        this.f43428a = eyVar;
    }

    @Override
    public final boolean b() {
        ey eyVar = this.f43428a;
        org.telegram.ui.ActionBar.w0 w0Var = eyVar.D1;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (eyVar.f39044n2 != null) {
            eyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        ey eyVar = this.f43428a;
        kVar = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
        if (!kVar.q() && eyVar.R3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h() {
        oi.q qVar;
        org.telegram.ui.Components.c10 c10Var;
        ey eyVar = this.f43428a;
        rx rxVar = eyVar.X;
        if (rxVar != null) {
            ArrayList arrayList = rxVar.F;
            if (!arrayList.isEmpty() && rxVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((ig.p0) arrayList.get(i10)).h) {
                        ((lx) rxVar.H).f((ig.p0) arrayList.get(i10));
                    }
                }
            }
        }
        eyVar.f39026j2 = false;
        eyVar.f39031k2 = false;
        dy dyVar = eyVar.f38998e0[0];
        if (dyVar != null) {
            zx zxVar = dyVar.f38702a;
            if (eyVar.W2 == 0) {
                c10Var = dyVar.f38709w;
            } else {
                c10Var = null;
            }
            zxVar.setEmptyView(c10Var);
            eyVar.W4(false, false, true, false);
        }
        eyVar.i5(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        eyVar.X.setCloseButtonVisible(false);
        eyVar.h5(true);
        eyVar.J3();
        qVar = ((org.telegram.ui.ActionBar.r2) eyVar).glassEngine;
        qVar.g();
    }

    @Override
    public final void i() {
        org.telegram.ui.ActionBar.k kVar;
        oi.q qVar;
        org.telegram.ui.Components.xo0 xo0Var;
        org.telegram.ui.Components.xo0 xo0Var2;
        ey eyVar = this.f43428a;
        eyVar.f39026j2 = true;
        org.telegram.ui.ActionBar.w0 w0Var = eyVar.D1;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        eyVar.U3();
        dy dyVar = eyVar.f38998e0[0];
        if (dyVar != null) {
            if (eyVar.f39044n2 != null) {
                dyVar.f38702a.c1();
                mx mxVar = eyVar.C0;
                if (mxVar != null) {
                    bi.r1 r1Var = mxVar.f28241a0;
                    if (r1Var.f30974g1) {
                        r1Var.f30974g1 = false;
                        r1Var.K0(false);
                    }
                }
            }
            if (!eyVar.f39035l2) {
                fi.v3 v3Var = eyVar.f39052p0;
                if (v3Var != null) {
                    v3Var.e(true);
                }
                fi.v3 v3Var2 = eyVar.f39057q0;
                if (v3Var2 != null) {
                    v3Var2.e(true);
                }
            }
        }
        sw swVar = eyVar.E0;
        if (swVar != null && swVar.getPremiumHint() != null) {
            eyVar.E0.getPremiumHint().e(true);
        }
        if (!eyVar.K) {
            eyVar.K4(0.0f);
        }
        eyVar.i5(false, false);
        kVar = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        qVar = ((org.telegram.ui.ActionBar.r2) eyVar).glassEngine;
        qVar.g();
        mx mxVar2 = eyVar.C0;
        if (mxVar2 != null && (xo0Var2 = mxVar2.f28244d0) != null) {
            xo0Var2.f14073c = ig.f0.All;
        }
        if ((mxVar2 != null && (xo0Var = mxVar2.f28244d0) != null && xo0Var.M()) || eyVar.getMessagesController().getTotalDialogsCount() > 10 || eyVar.f39077t3 || eyVar.K) {
            eyVar.f39031k2 = true;
            if (!eyVar.f39060q3) {
                eyVar.W4(true, false, true, false);
            }
        }
        eyVar.X.setCloseButtonVisible(true);
        eyVar.h5(true);
        eyVar.J3();
    }

    @Override
    public final void l(EditText editText) {
        mx mxVar;
        org.telegram.ui.Components.xo0 xo0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        ey eyVar = this.f43428a;
        if (!isEmpty || (((mxVar = eyVar.C0) != null && (xo0Var = mxVar.f28244d0) != null && xo0Var.M()) || eyVar.f39077t3 || eyVar.K)) {
            eyVar.f39031k2 = true;
            if (!eyVar.f39060q3) {
                eyVar.W4(true, false, true, false);
            }
        }
        mx mxVar2 = eyVar.C0;
        if (mxVar2 != null) {
            View currentView = mxVar2.getCurrentView();
            boolean z11 = !mxVar2.f28247g0;
            if (!TextUtils.isEmpty(mxVar2.M0)) {
                z10 = z11;
            }
            mxVar2.M0 = obj;
            mxVar2.P(currentView, mxVar2.getCurrentPosition(), obj, z10);
        }
    }
}
