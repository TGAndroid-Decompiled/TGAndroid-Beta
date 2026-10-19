package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class x00 extends org.telegram.ui.Components.hm0 {
    public final e10 f42981c;

    public x00(e10 e10Var) {
        this.f42981c = e10Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        e10 e10Var = this.f42981c;
        if (e10Var.f36493f.isEmpty()) {
            return 0;
        }
        return e10Var.f36493f.size() + (!e10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f42981c.f36493f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        boolean z11;
        if (b1Var.f45915f == 0) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) b1Var.f45912a;
            e10 e10Var = this.f42981c;
            MessageObject messageObject = (MessageObject) e10Var.f36493f.get(i10);
            r2Var.O = e10Var.f36504p0;
            r2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            r2Var.f22894s2 = z10;
            if (r2Var.getMessage() != null && r2Var.getMessage().getId() == messageObject.getId()) {
                z11 = true;
            } else {
                z11 = false;
            }
            r2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.lk(this, r2Var, messageObject, z11, 1));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        hg.z zVar;
        if (i10 != 0) {
            if (i10 != 3) {
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
                zVar = u3Var;
            } else {
                org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(viewGroup.getContext(), null);
                b10Var.setIsSingleCell(true);
                b10Var.setViewType(1);
                zVar = b10Var;
            }
        } else {
            zVar = new hg.z(2, viewGroup.getContext(), true);
        }
        return com.google.android.gms.internal.play_billing.k3.l(zVar, zVar, -1, -2);
    }
}
