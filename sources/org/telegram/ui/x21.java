package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class x21 extends org.telegram.ui.Components.rl0 {
    public final Context f42910c;
    public final b31 d;

    public x21(b31 b31Var, Context context) {
        this.d = b31Var;
        this.f42910c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        b31 b31Var = this.d;
        int i11 = b31Var.h;
        if (b31Var.f35340f < 0) {
            i10 = b31Var.getMediaDataController().getReactionsList().size();
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
        b31 b31Var = this.d;
        if (i10 == b31Var.d) {
            return 2;
        }
        if (i10 == b31Var.f35340f) {
            return 3;
        }
        if (i10 != h() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        int i12;
        if (j(i10) != 1) {
            return;
        }
        b31 b31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = b31Var.getMediaDataController().getReactionsList().get(i10 - b31Var.f35339e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.p2) b31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.p2) b31Var).currentAccount;
        ((org.telegram.ui.Cells.y) m1Var.f5875a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        a31 a31Var;
        b31 b31Var = this.d;
        Context context = this.f42910c;
        if (i10 == 0) {
            f5Var = ((org.telegram.ui.ActionBar.p2) b31Var).parentLayout;
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context, f5Var, 2);
            eaVar.setImportantForAccessibility(4);
            eaVar.f22783r = b31Var;
            a31Var = eaVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    a31Var = new org.telegram.ui.Cells.y(context, true, true);
                } else {
                    View inVar = new org.telegram.ui.Components.in(context, 20);
                    inVar.setTag(-33024);
                    a31Var = inVar;
                }
            } else {
                a31 a31Var2 = new a31(b31Var, context);
                a31Var2.a(false);
                a31Var = a31Var2;
            }
        } else {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            a9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            a31Var = a9Var;
        }
        return new f2.m1(a31Var);
    }
}
