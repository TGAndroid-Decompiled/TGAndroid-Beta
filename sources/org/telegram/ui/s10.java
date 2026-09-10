package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class s10 extends org.telegram.ui.Components.ul0 {
    public final z10 f36510c;

    public s10(z10 z10Var) {
        this.f36510c = z10Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        z10 z10Var = this.f36510c;
        if (z10Var.f39168f.isEmpty()) {
            return 0;
        }
        return z10Var.f39168f.size() + (!z10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f36510c.f39168f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        if (c1Var.f41613f == 0) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) c1Var.f41610a;
            z10 z10Var = this.f36510c;
            MessageObject messageObject = (MessageObject) z10Var.f39168f.get(i10);
            r2Var.O = z10Var.f39179p0;
            r2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            r2Var.f19844s2 = z10;
            if (r2Var.getMessage() != null && r2Var.getMessage().getId() == messageObject.getId()) {
                z11 = true;
            } else {
                z11 = false;
            }
            r2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.rk(this, r2Var, messageObject, z11, 1));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        fg.z zVar;
        if (i10 != 0) {
            if (i10 != 3) {
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
                zVar = u3Var;
            } else {
                org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(viewGroup.getContext(), null);
                a10Var.setIsSingleCell(true);
                a10Var.setViewType(1);
                zVar = a10Var;
            }
        } else {
            zVar = new fg.z(2, viewGroup.getContext(), true);
        }
        return com.google.android.gms.internal.vision.e2.j(zVar, zVar, -1, -2);
    }
}
