package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class y11 extends org.telegram.ui.Components.km0 {
    public final Context f43729c;
    public final c21 d;

    public y11(c21 c21Var, Context context) {
        this.d = c21Var;
        this.f43729c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        c21 c21Var = this.d;
        int i11 = c21Var.h;
        if (c21Var.f36200f < 0) {
            i10 = c21Var.getMediaDataController().getReactionsList().size();
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
        c21 c21Var = this.d;
        if (i10 == c21Var.d) {
            return 2;
        }
        if (i10 == c21Var.f36200f) {
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
        c21 c21Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = c21Var.getMediaDataController().getReactionsList().get(i10 - c21Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.o2) c21Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.o2) c21Var).currentAccount;
        ((org.telegram.ui.Cells.x) b1Var.f46342a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.h5 h5Var;
        b21 b21Var;
        c21 c21Var = this.d;
        Context context = this.f43729c;
        if (i10 == 0) {
            h5Var = ((org.telegram.ui.ActionBar.o2) c21Var).parentLayout;
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context, h5Var, 2);
            gaVar.setImportantForAccessibility(4);
            gaVar.f22440r = c21Var;
            b21Var = gaVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    b21Var = new org.telegram.ui.Cells.x(context, true, true);
                } else {
                    View snVar = new org.telegram.ui.Components.sn(context, 23);
                    snVar.setTag(-33024);
                    b21Var = snVar;
                }
            } else {
                b21 b21Var2 = new b21(c21Var, context);
                b21Var2.a(false);
                b21Var = b21Var2;
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            b21Var = e9Var;
        }
        return new s4.b1(b21Var);
    }
}
