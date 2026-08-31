package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class s21 extends org.telegram.ui.Components.sl0 {
    public final Context f41120c;
    public final w21 d;

    public s21(w21 w21Var, Context context) {
        this.d = w21Var;
        this.f41120c = context;
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
        w21 w21Var = this.d;
        int i11 = w21Var.h;
        if (w21Var.f42366f < 0) {
            i10 = w21Var.getMediaDataController().getReactionsList().size();
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
        w21 w21Var = this.d;
        if (i10 == w21Var.d) {
            return 2;
        }
        if (i10 == w21Var.f42366f) {
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
        w21 w21Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = w21Var.getMediaDataController().getReactionsList().get(i10 - w21Var.f42365e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.p2) w21Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.p2) w21Var).currentAccount;
        ((org.telegram.ui.Cells.y) m1Var.f5875a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        v21 v21Var;
        w21 w21Var = this.d;
        Context context = this.f41120c;
        if (i10 == 0) {
            f5Var = ((org.telegram.ui.ActionBar.p2) w21Var).parentLayout;
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context, f5Var, 2);
            eaVar.setImportantForAccessibility(4);
            eaVar.f22781r = w21Var;
            v21Var = eaVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    v21Var = new org.telegram.ui.Cells.y(context, true, true);
                } else {
                    View jnVar = new org.telegram.ui.Components.jn(context, 20);
                    jnVar.setTag(-33024);
                    v21Var = jnVar;
                }
            } else {
                v21 v21Var2 = new v21(w21Var, context);
                v21Var2.a(false);
                v21Var = v21Var2;
            }
        } else {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            a9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            v21Var = a9Var;
        }
        return new f2.m1(v21Var);
    }
}
