package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class y00 extends org.telegram.ui.Components.vk0 {
    public final f10 f44665c;

    public y00(f10 f10Var) {
        this.f44665c = f10Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override
    public final int h() {
        f10 f10Var = this.f44665c;
        if (f10Var.f38094f.isEmpty()) {
            return 0;
        }
        return f10Var.f38094f.size() + (!f10Var.J ? 1 : 0);
    }

    @Override
    public final int j(int i9) {
        if (i9 >= this.f44665c.f38094f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        boolean z11;
        if (q1Var.f5505f == 0) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) q1Var.f5501a;
            f10 f10Var = this.f44665c;
            MessageObject messageObject = (MessageObject) f10Var.f38094f.get(i9);
            r2Var.K = f10Var.f38101l0;
            r2Var.V(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (i9 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            r2Var.f25024o2 = z10;
            if (r2Var.getMessage() != null && r2Var.getMessage().getId() == messageObject.getId()) {
                z11 = true;
            } else {
                z11 = false;
            }
            r2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.dk(this, r2Var, messageObject, z11, 1));
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        of.x xVar;
        if (i9 != 0) {
            if (i9 != 3) {
                org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
                xVar = v3Var;
            } else {
                org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(viewGroup.getContext(), null);
                e00Var.setIsSingleCell(true);
                e00Var.setViewType(1);
                xVar = e00Var;
            }
        } else {
            xVar = new of.x(2, viewGroup.getContext(), true);
        }
        return j3.r0.s(xVar, xVar, -1, -2);
    }
}
