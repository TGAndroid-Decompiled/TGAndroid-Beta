package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class z21 extends org.telegram.ui.Components.vl0 {
    public final Context f40325c;
    public final d31 d;

    public z21(d31 d31Var, Context context) {
        this.d = d31Var;
        this.f40325c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42964f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        d31 d31Var = this.d;
        int i11 = d31Var.h;
        if (d31Var.f32909f < 0) {
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
        if (i10 == d31Var.d) {
            return 2;
        }
        if (i10 == d31Var.f32909f) {
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
        TLRPC.TL_availableReaction tL_availableReaction = d31Var.getMediaDataController().getReactionsList().get(i10 - d31Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.m2) d31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.m2) d31Var).currentAccount;
        ((org.telegram.ui.Cells.y) c1Var.f42961a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        c31 c31Var;
        d31 d31Var = this.d;
        Context context = this.f40325c;
        if (i10 == 0) {
            b5Var = ((org.telegram.ui.ActionBar.m2) d31Var).parentLayout;
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(context, b5Var, 2);
            iaVar.setImportantForAccessibility(4);
            iaVar.f20471r = d31Var;
            c31Var = iaVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    c31Var = new org.telegram.ui.Cells.y(context, true, true);
                } else {
                    View lnVar = new org.telegram.ui.Components.ln(context, 23);
                    lnVar.setTag(-33024);
                    c31Var = lnVar;
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
