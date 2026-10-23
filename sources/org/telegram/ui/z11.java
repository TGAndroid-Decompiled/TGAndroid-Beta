package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class z11 extends org.telegram.ui.Components.lm0 {
    public final Context f44038c;
    public final d21 d;

    public z11(d21 d21Var, Context context) {
        this.d = d21Var;
        this.f44038c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        d21 d21Var = this.d;
        int i11 = d21Var.h;
        if (d21Var.f36490f < 0) {
            i10 = d21Var.getMediaDataController().getReactionsList().size();
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
        d21 d21Var = this.d;
        if (i10 == d21Var.d) {
            return 2;
        }
        if (i10 == d21Var.f36490f) {
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
        d21 d21Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = d21Var.getMediaDataController().getReactionsList().get(i10 - d21Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.o2) d21Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.o2) d21Var).currentAccount;
        ((org.telegram.ui.Cells.x) b1Var.f46343a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.h5 h5Var;
        c21 c21Var;
        d21 d21Var = this.d;
        Context context = this.f44038c;
        if (i10 == 0) {
            h5Var = ((org.telegram.ui.ActionBar.o2) d21Var).parentLayout;
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context, h5Var, 2);
            gaVar.setImportantForAccessibility(4);
            gaVar.f22439r = d21Var;
            c21Var = gaVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    c21Var = new org.telegram.ui.Cells.x(context, true, true);
                } else {
                    View unVar = new org.telegram.ui.Components.un(context, 23);
                    unVar.setTag(-33024);
                    c21Var = unVar;
                }
            } else {
                c21 c21Var2 = new c21(d21Var, context);
                c21Var2.a(false);
                c21Var = c21Var2;
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            c21Var = e9Var;
        }
        return new s4.b1(c21Var);
    }
}
