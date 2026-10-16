package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class u10 extends org.telegram.ui.Components.lm0 {
    public final b20 f40243c;

    public u10(b20 b20Var) {
        this.f40243c = b20Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        b20 b20Var = this.f40243c;
        if (b20Var.f34169f.isEmpty()) {
            return 0;
        }
        return b20Var.f34169f.size() + (!b20Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f40243c.f34169f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        boolean z11;
        if (b1Var.f44841f == 0) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) b1Var.f44838a;
            b20 b20Var = this.f40243c;
            MessageObject messageObject = (MessageObject) b20Var.f34169f.get(i10);
            s2Var.O = b20Var.f34180p0;
            s2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            s2Var.f21592s2 = z10;
            if (s2Var.getMessage() != null && s2Var.getMessage().getId() == messageObject.getId()) {
                z11 = true;
            } else {
                z11 = false;
            }
            s2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.nk(this, s2Var, messageObject, z11, 1));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        hg.z zVar;
        if (i10 != 0) {
            if (i10 != 3) {
                org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
                zVar = v3Var;
            } else {
                org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(viewGroup.getContext(), null);
                f10Var.setIsSingleCell(true);
                f10Var.setViewType(1);
                zVar = f10Var;
            }
        } else {
            zVar = new hg.z(2, viewGroup.getContext(), true);
        }
        return com.google.android.gms.internal.play_billing.k3.l(zVar, zVar, -1, -2);
    }
}
