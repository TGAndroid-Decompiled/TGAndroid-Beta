package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class yx0 extends org.telegram.ui.Components.dk0 {
    public final Context f54447c;
    public final cy0 d;

    public yx0(cy0 cy0Var, Context context) {
        this.d = cy0Var;
        this.f54447c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 3 && i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        int i7;
        cy0 cy0Var = this.d;
        int i10 = cy0Var.f46911f;
        if (cy0Var.f46910e < 0) {
            i7 = cy0Var.getMediaDataController().h.size();
        } else {
            i7 = 0;
        }
        return i10 + i7 + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        cy0 cy0Var = this.d;
        if (i7 == cy0Var.f46909c) {
            return 2;
        }
        if (i7 == cy0Var.f46910e) {
            return 3;
        }
        if (i7 != b() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        if (d(i7) != 1) {
            return;
        }
        cy0 cy0Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) cy0Var.getMediaDataController().h.get(i7 - cy0Var.d);
        String str = tL_availableReaction.reaction;
        i10 = ((org.telegram.ui.ActionBar.g2) cy0Var).currentAccount;
        boolean contains = str.contains(org.telegram.messenger.ri.d0(i10).S());
        i11 = ((org.telegram.ui.ActionBar.g2) cy0Var).currentAccount;
        ((org.telegram.ui.Cells.x) f1Var.f59245a).a(tL_availableReaction, contains, i11);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.r4 r4Var;
        by0 by0Var;
        cy0 cy0Var = this.d;
        Context context = this.f54447c;
        if (i7 == 0) {
            r4Var = ((org.telegram.ui.ActionBar.g2) cy0Var).parentLayout;
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context, r4Var, 2);
            baVar.setImportantForAccessibility(4);
            baVar.f30549x = cy0Var;
            by0Var = baVar;
        } else if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 4) {
                    by0Var = new org.telegram.ui.Cells.x(context, true, true);
                } else {
                    View inVar = new org.telegram.ui.Components.in(context, 22);
                    inVar.setTag(-33024);
                    by0Var = inVar;
                }
            } else {
                by0 by0Var2 = new by0(cy0Var, context);
                by0Var2.a(false);
                by0Var = by0Var2;
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setText(org.telegram.messenger.gd.N0(2131751340, null));
            by0Var = z8Var;
        }
        return new v4.f1(by0Var);
    }
}
