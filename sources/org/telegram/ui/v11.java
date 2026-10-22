package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class v11 extends org.telegram.ui.Components.im0 {
    public final Context f42099c;
    public final z11 d;

    public v11(z11 z11Var, Context context) {
        this.d = z11Var;
        this.f42099c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45923f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        z11 z11Var = this.d;
        int i11 = z11Var.h;
        if (z11Var.f43609f < 0) {
            i10 = z11Var.getMediaDataController().getReactionsList().size();
        } else {
            i10 = 0;
        }
        return i11 + i10 + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        z11 z11Var = this.d;
        if (i10 == z11Var.d) {
            return 2;
        }
        if (i10 == z11Var.f43609f) {
            return 3;
        }
        if (i10 != h() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12;
        if (j(i10) != 1) {
            return;
        }
        z11 z11Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = z11Var.getMediaDataController().getReactionsList().get(i10 - z11Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.n2) z11Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.n2) z11Var).currentAccount;
        ((org.telegram.ui.Cells.y) b1Var.f45920a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        y11 y11Var;
        z11 z11Var = this.d;
        Context context = this.f42099c;
        if (i10 == 0) {
            d5Var = ((org.telegram.ui.ActionBar.n2) z11Var).parentLayout;
            org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context, d5Var, 2);
            faVar.setImportantForAccessibility(4);
            faVar.f22275r = z11Var;
            y11Var = faVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    y11Var = new org.telegram.ui.Cells.y(context, true, true);
                } else {
                    View unVar = new org.telegram.ui.Components.un(context, 23);
                    unVar.setTag(-33024);
                    y11Var = unVar;
                }
            } else {
                y11 y11Var2 = new y11(z11Var, context);
                y11Var2.a(false);
                y11Var = y11Var2;
            }
        } else {
            org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
            d9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            y11Var = d9Var;
        }
        return new s4.b1(y11Var);
    }
}
