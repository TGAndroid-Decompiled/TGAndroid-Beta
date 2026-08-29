package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class vx extends org.telegram.ui.ActionBar.e5 {
    public final fy f43794f;

    public vx(fy fyVar) {
        this.f43794f = fyVar;
    }

    @Override
    public final boolean b() {
        fy fyVar = this.f43794f;
        org.telegram.ui.ActionBar.w0 w0Var = fyVar.f38382z1;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (fyVar.f38305j2 != null) {
            fyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.l lVar;
        fy fyVar = this.f43794f;
        lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        if (!lVar.s() && fyVar.N3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.p00 p00Var;
        fy fyVar = this.f43794f;
        ux uxVar = fyVar.T;
        if (uxVar != null) {
            ArrayList arrayList = uxVar.B;
            if (!arrayList.isEmpty() && uxVar.D != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((rf.f0) arrayList.get(i10)).h) {
                        ((kx) uxVar.D).g((rf.f0) arrayList.get(i10));
                    }
                }
            }
        }
        fyVar.f38285f2 = false;
        fyVar.f38290g2 = false;
        ey eyVar = fyVar.f38256a0[0];
        if (eyVar != null) {
            ay ayVar = eyVar.f37921a;
            if (fyVar.R2 == 0) {
                p00Var = eyVar.f37929w;
            } else {
                p00Var = null;
            }
            ayVar.setEmptyView(p00Var);
            fyVar.O4(false, false, true, false);
        }
        fyVar.Z4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        fyVar.T.setCloseButtonVisible(false);
        fyVar.Y4(true);
        fyVar.B3();
        fyVar.m3();
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.Components.mn0 mn0Var;
        org.telegram.ui.Components.mn0 mn0Var2;
        fy fyVar = this.f43794f;
        fyVar.f38285f2 = true;
        org.telegram.ui.ActionBar.w0 w0Var = fyVar.f38382z1;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        fyVar.M3();
        ey eyVar = fyVar.f38256a0[0];
        if (eyVar != null) {
            if (fyVar.f38305j2 != null) {
                eyVar.f37921a.c1();
                ox oxVar = fyVar.f38377y0;
                if (oxVar != null) {
                    jh.e1 e1Var = oxVar.R;
                    if (e1Var.f29695e1) {
                        e1Var.f29695e1 = false;
                        e1Var.J0(false);
                    }
                }
            }
            if (!fyVar.f38295h2) {
                nh.t3 t3Var = fyVar.f38313l0;
                if (t3Var != null) {
                    t3Var.e(true);
                }
                nh.t3 t3Var2 = fyVar.m0;
                if (t3Var2 != null) {
                    t3Var2.e(true);
                }
            }
        }
        xw xwVar = fyVar.A0;
        if (xwVar != null && xwVar.getPremiumHint() != null) {
            fyVar.A0.getPremiumHint().e(true);
        }
        if (!fyVar.G) {
            fyVar.C4(0.0f);
        }
        fyVar.Z4(false, false);
        lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        lVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        fyVar.m3();
        ox oxVar2 = fyVar.f38377y0;
        if (oxVar2 != null && (mn0Var2 = oxVar2.U) != null) {
            mn0Var2.f47140c = rf.x.All;
        }
        if ((oxVar2 != null && (mn0Var = oxVar2.U) != null && mn0Var.N()) || fyVar.getMessagesController().getTotalDialogsCount() > 10 || fyVar.f38330o3 || fyVar.G) {
            fyVar.f38290g2 = true;
            if (!fyVar.f38315l3) {
                fyVar.O4(true, false, true, false);
            }
        }
        fyVar.T.setCloseButtonVisible(true);
        fyVar.Y4(true);
        fyVar.B3();
    }

    @Override
    public final void q(EditText editText) {
        ox oxVar;
        org.telegram.ui.Components.mn0 mn0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        fy fyVar = this.f43794f;
        if (!isEmpty || (((oxVar = fyVar.f38377y0) != null && (mn0Var = oxVar.U) != null && mn0Var.N()) || fyVar.f38330o3 || fyVar.G)) {
            fyVar.f38290g2 = true;
            if (!fyVar.f38315l3) {
                fyVar.O4(true, false, true, false);
            }
        }
        ox oxVar2 = fyVar.f38377y0;
        if (oxVar2 != null) {
            View currentView = oxVar2.getCurrentView();
            boolean z11 = !oxVar2.f32988a0;
            if (!TextUtils.isEmpty(oxVar2.G0)) {
                z10 = z11;
            }
            oxVar2.G0 = obj;
            oxVar2.O(currentView, oxVar2.getCurrentPosition(), obj, z10);
        }
    }
}
