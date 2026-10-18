package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class x11 extends org.telegram.ui.Components.hm0 {
    public final Context f42996c;
    public final b21 d;

    public x11(b21 b21Var, Context context) {
        this.d = b21Var;
        this.f42996c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45961f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        b21 b21Var = this.d;
        int i11 = b21Var.h;
        if (b21Var.f35578f < 0) {
            i10 = b21Var.getMediaDataController().getReactionsList().size();
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
        b21 b21Var = this.d;
        if (i10 == b21Var.d) {
            return 2;
        }
        if (i10 == b21Var.f35578f) {
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
        b21 b21Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = b21Var.getMediaDataController().getReactionsList().get(i10 - b21Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.n2) b21Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.n2) b21Var).currentAccount;
        ((org.telegram.ui.Cells.y) b1Var.f45958a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        a21 a21Var;
        b21 b21Var = this.d;
        Context context = this.f42996c;
        if (i10 == 0) {
            d5Var = ((org.telegram.ui.ActionBar.n2) b21Var).parentLayout;
            org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context, d5Var, 2);
            faVar.setImportantForAccessibility(4);
            faVar.f22275r = b21Var;
            a21Var = faVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    a21Var = new org.telegram.ui.Cells.y(context, true, true);
                } else {
                    View unVar = new org.telegram.ui.Components.un(context, 23);
                    unVar.setTag(-33024);
                    a21Var = unVar;
                }
            } else {
                a21 a21Var2 = new a21(b21Var, context);
                a21Var2.a(false);
                a21Var = a21Var2;
            }
        } else {
            org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
            d9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            a21Var = d9Var;
        }
        return new s4.b1(a21Var);
    }
}
