package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

public final class wx extends org.telegram.ui.ActionBar.e5 {

    public final gy f44207f;

    public wx(gy gyVar) {
        this.f44207f = gyVar;
    }

    @Override
    public final boolean b() {
        gy gyVar = this.f44207f;
        org.telegram.ui.ActionBar.v0 v0Var = gyVar.f38624z1;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (gyVar.f38547j2 == null) {
            return true;
        }
        gyVar.finishFragment();
        return false;
    }

    @Override
    public final boolean c() {
        gy gyVar = this.f44207f;
        return !((org.telegram.ui.ActionBar.n2) gyVar).actionBar.t() && gyVar.N3 == null;
    }

    @Override
    public final void m() {
        gy gyVar = this.f44207f;
        vx vxVar = gyVar.T;
        if (vxVar != null) {
            ArrayList arrayList = vxVar.B;
            if (!arrayList.isEmpty() && vxVar.D != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((pf.e0) arrayList.get(i10)).h) {
                        ((lx) vxVar.D).e((pf.e0) arrayList.get(i10));
                    }
                }
            }
        }
        gyVar.f38527f2 = false;
        gyVar.f38532g2 = false;
        fy fyVar = gyVar.f38498a0[0];
        if (fyVar != null) {
            fyVar.f38225a.setEmptyView(gyVar.R2 == 0 ? fyVar.f38233w : null);
            gyVar.O4(false, false, true, false);
        }
        gyVar.Z4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        gyVar.T.setCloseButtonVisible(false);
        gyVar.Y4(true);
        gyVar.B3();
        gyVar.m3();
    }

    @Override
    public final void n() {
        org.telegram.ui.Components.cn0 cn0Var;
        org.telegram.ui.Components.cn0 cn0Var2;
        gy gyVar = this.f44207f;
        gyVar.f38527f2 = true;
        org.telegram.ui.ActionBar.v0 v0Var = gyVar.f38624z1;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        gyVar.M3();
        fy fyVar = gyVar.f38498a0[0];
        if (fyVar != null) {
            if (gyVar.f38547j2 != null) {
                fyVar.f38225a.c1();
                px pxVar = gyVar.f38619y0;
                if (pxVar != null) {
                    hh.f1 f1Var = pxVar.R;
                    if (f1Var.f35263e1) {
                        f1Var.f35263e1 = false;
                        f1Var.J0(false);
                    }
                }
            }
            if (!gyVar.f38537h2) {
                lh.w3 w3Var = gyVar.f38555l0;
                if (w3Var != null) {
                    w3Var.e(true);
                }
                lh.w3 w3Var2 = gyVar.m0;
                if (w3Var2 != null) {
                    w3Var2.e(true);
                }
            }
        }
        yw ywVar = gyVar.A0;
        if (ywVar != null && ywVar.getPremiumHint() != null) {
            gyVar.A0.getPremiumHint().e(true);
        }
        if (!gyVar.G) {
            gyVar.C4(0.0f);
        }
        gyVar.Z4(false, false);
        ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        gyVar.m3();
        px pxVar2 = gyVar.f38619y0;
        if (pxVar2 != null && (cn0Var2 = pxVar2.U) != null) {
            cn0Var2.f45981c = pf.w.All;
        }
        if ((pxVar2 != null && (cn0Var = pxVar2.U) != null && cn0Var.N()) || gyVar.getMessagesController().getTotalDialogsCount() > 10 || gyVar.f38572o3 || gyVar.G) {
            gyVar.f38532g2 = true;
            if (!gyVar.f38557l3) {
                gyVar.O4(true, false, true, false);
            }
        }
        gyVar.T.setCloseButtonVisible(true);
        gyVar.Y4(true);
        gyVar.B3();
    }

    @Override
    public final void q(EditText editText) {
        px pxVar;
        org.telegram.ui.Components.cn0 cn0Var;
        String string = editText.getText().toString();
        boolean zIsEmpty = string.isEmpty();
        gy gyVar = this.f44207f;
        if (!zIsEmpty || (((pxVar = gyVar.f38619y0) != null && (cn0Var = pxVar.U) != null && cn0Var.N()) || gyVar.f38572o3 || gyVar.G)) {
            gyVar.f38532g2 = true;
            if (!gyVar.f38557l3) {
                gyVar.O4(true, false, true, false);
            }
        }
        px pxVar2 = gyVar.f38619y0;
        if (pxVar2 != null) {
            View currentView = pxVar2.getCurrentView();
            boolean z10 = TextUtils.isEmpty(pxVar2.G0) ? true : !pxVar2.f29742a0;
            pxVar2.G0 = string;
            pxVar2.O(currentView, pxVar2.getCurrentPosition(), string, z10);
        }
    }
}
