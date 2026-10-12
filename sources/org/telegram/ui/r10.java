package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class r10 extends org.telegram.ui.Components.vm0 {
    public final y10 f41469c;

    public r10(y10 y10Var) {
        this.f41469c = y10Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        y10 y10Var = this.f41469c;
        if (y10Var.f44255f.isEmpty()) {
            return 0;
        }
        return y10Var.f44255f.size() + (!y10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f41469c.f44255f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        boolean z11;
        if (d1Var.f47901f == 0) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) d1Var.f47897a;
            y10 y10Var = this.f41469c;
            MessageObject messageObject = (MessageObject) y10Var.f44255f.get(i10);
            s2Var.O = y10Var.f44266p0;
            s2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            s2Var.f22621s2 = z10;
            if (s2Var.getMessage() != null && s2Var.getMessage().getId() == messageObject.getId()) {
                z11 = true;
            } else {
                z11 = false;
            }
            s2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.sk(this, s2Var, messageObject, z11, 1));
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        gg.z zVar;
        if (i10 != 0) {
            if (i10 != 3) {
                org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
                zVar = v3Var;
            } else {
                org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(viewGroup.getContext(), null);
                m10Var.setIsSingleCell(true);
                m10Var.setViewType(1);
                zVar = m10Var;
            }
        } else {
            zVar = new gg.z(2, viewGroup.getContext(), true);
        }
        return com.google.android.gms.internal.vision.e2.k(zVar, zVar, -1, -2);
    }
}
