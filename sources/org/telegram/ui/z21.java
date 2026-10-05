package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class z21 extends org.telegram.ui.Components.yl0 {
    public final Context f43689c;
    public final d31 d;

    public z21(d31 d31Var, Context context) {
        this.d = d31Var;
        this.f43689c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f46542f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        d31 d31Var = this.d;
        int i11 = d31Var.f35633f;
        if (d31Var.f35632e < 0) {
            i10 = d31Var.getMediaDataController().getReactionsList().size();
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
        d31 d31Var = this.d;
        if (i10 == d31Var.f35631c) {
            return 2;
        }
        if (i10 == d31Var.f35632e) {
            return 3;
        }
        if (i10 != h() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        if (j(i10) != 1) {
            return;
        }
        d31 d31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = d31Var.getMediaDataController().getReactionsList().get(i10 - d31Var.d);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.n2) d31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.n2) d31Var).currentAccount;
        ((org.telegram.ui.Cells.y) c1Var.f46538a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c5 c5Var;
        c31 c31Var;
        d31 d31Var = this.d;
        Context context = this.f43689c;
        if (i10 == 0) {
            c5Var = ((org.telegram.ui.ActionBar.n2) d31Var).parentLayout;
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(context, c5Var, 2);
            iaVar.setImportantForAccessibility(4);
            iaVar.f22293r = d31Var;
            c31Var = iaVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    c31Var = new org.telegram.ui.Cells.y(context, true, true);
                } else {
                    View nnVar = new org.telegram.ui.Components.nn(context, 23);
                    nnVar.setTag(-33024);
                    c31Var = nnVar;
                }
            } else {
                c31 c31Var2 = new c31(d31Var, context);
                c31Var2.a(false);
                c31Var = c31Var2;
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            c31Var = e9Var;
        }
        return new s4.c1(c31Var);
    }
}
