package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class x21 extends org.telegram.ui.Components.ql0 {
    public final Context f39834c;
    public final b31 d;

    public x21(b31 b31Var, Context context) {
        this.d = b31Var;
        this.f39834c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
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
        if (b31Var.f32726f < 0) {
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
        if (i10 == b31Var.f32726f) {
            return 3;
        }
        if (i10 != h() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12;
        if (j(i10) != 1) {
            return;
        }
        b31 b31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = b31Var.getMediaDataController().getReactionsList().get(i10 - b31Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.p2) b31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.p2) b31Var).currentAccount;
        ((org.telegram.ui.Cells.y) l1Var.f5774a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.e5 e5Var;
        a31 a31Var;
        b31 b31Var = this.d;
        Context context = this.f39834c;
        if (i10 == 0) {
            e5Var = ((org.telegram.ui.ActionBar.p2) b31Var).parentLayout;
            org.telegram.ui.Cells.da daVar = new org.telegram.ui.Cells.da(context, e5Var, 2);
            daVar.setImportantForAccessibility(4);
            daVar.f20955r = b31Var;
            a31Var = daVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    a31Var = new org.telegram.ui.Cells.y(context, true, true);
                } else {
                    View gnVar = new org.telegram.ui.Components.gn(context, 20);
                    gnVar.setTag(-33024);
                    a31Var = gnVar;
                }
            } else {
                a31 a31Var2 = new a31(b31Var, context);
                a31Var2.a(false);
                a31Var = a31Var2;
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            a31Var = z8Var;
        }
        return new f2.l1(a31Var);
    }
}
