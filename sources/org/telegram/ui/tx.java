package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class tx extends org.telegram.ui.ActionBar.e5 {
    public final dy f43080f;

    public tx(dy dyVar) {
        this.f43080f = dyVar;
    }

    @Override
    public final boolean b() {
        dy dyVar = this.f43080f;
        org.telegram.ui.ActionBar.w0 w0Var = dyVar.f37755z1;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (dyVar.f37678j2 != null) {
            dyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        dy dyVar = this.f43080f;
        kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        if (!kVar.s() && dyVar.N3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.e00 e00Var;
        dy dyVar = this.f43080f;
        sx sxVar = dyVar.T;
        if (sxVar != null) {
            ArrayList arrayList = sxVar.B;
            if (!arrayList.isEmpty() && sxVar.D != null) {
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    if (((of.m0) arrayList.get(i9)).h) {
                        ((ix) sxVar.D).e((of.m0) arrayList.get(i9));
                    }
                }
            }
        }
        dyVar.f37658f2 = false;
        dyVar.f37663g2 = false;
        cy cyVar = dyVar.f37629a0[0];
        if (cyVar != null) {
            yx yxVar = cyVar.f37350a;
            if (dyVar.R2 == 0) {
                e00Var = cyVar.f37358w;
            } else {
                e00Var = null;
            }
            yxVar.setEmptyView(e00Var);
            dyVar.O4(false, false, true, false);
        }
        dyVar.Z4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        dyVar.T.setCloseButtonVisible(false);
        dyVar.Y4(true);
        dyVar.B3();
        dyVar.m3();
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.an0 an0Var;
        org.telegram.ui.Components.an0 an0Var2;
        dy dyVar = this.f43080f;
        dyVar.f37658f2 = true;
        org.telegram.ui.ActionBar.w0 w0Var = dyVar.f37755z1;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        dyVar.M3();
        cy cyVar = dyVar.f37629a0[0];
        if (cyVar != null) {
            if (dyVar.f37678j2 != null) {
                cyVar.f37350a.c1();
                mx mxVar = dyVar.f37750y0;
                if (mxVar != null) {
                    gh.f1 f1Var = mxVar.R;
                    if (f1Var.f34246e1) {
                        f1Var.f34246e1 = false;
                        f1Var.J0(false);
                    }
                }
            }
            if (!dyVar.f37668h2) {
                kh.x3 x3Var = dyVar.f37686l0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                kh.x3 x3Var2 = dyVar.m0;
                if (x3Var2 != null) {
                    x3Var2.e(true);
                }
            }
        }
        vw vwVar = dyVar.A0;
        if (vwVar != null && vwVar.getPremiumHint() != null) {
            dyVar.A0.getPremiumHint().e(true);
        }
        if (!dyVar.G) {
            dyVar.C4(0.0f);
        }
        dyVar.Z4(false, false);
        kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        dyVar.m3();
        mx mxVar2 = dyVar.f37750y0;
        if (mxVar2 != null && (an0Var2 = mxVar2.U) != null) {
            an0Var2.f19288c = of.c0.All;
        }
        if ((mxVar2 != null && (an0Var = mxVar2.U) != null && an0Var.N()) || dyVar.getMessagesController().getTotalDialogsCount() > 10 || dyVar.f37703o3 || dyVar.G) {
            dyVar.f37663g2 = true;
            if (!dyVar.f37688l3) {
                dyVar.O4(true, false, true, false);
            }
        }
        dyVar.T.setCloseButtonVisible(true);
        dyVar.Y4(true);
        dyVar.B3();
    }

    @Override
    public final void q(EditText editText) {
        mx mxVar;
        org.telegram.ui.Components.an0 an0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        dy dyVar = this.f43080f;
        if (!isEmpty || (((mxVar = dyVar.f37750y0) != null && (an0Var = mxVar.U) != null && an0Var.N()) || dyVar.f37703o3 || dyVar.G)) {
            dyVar.f37663g2 = true;
            if (!dyVar.f37688l3) {
                dyVar.O4(true, false, true, false);
            }
        }
        mx mxVar2 = dyVar.f37750y0;
        if (mxVar2 != null) {
            View currentView = mxVar2.getCurrentView();
            boolean z11 = !mxVar2.f29135a0;
            if (!TextUtils.isEmpty(mxVar2.G0)) {
                z10 = z11;
            }
            mxVar2.G0 = obj;
            mxVar2.O(currentView, mxVar2.getCurrentPosition(), obj, z10);
        }
    }
}
