package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class wx0 extends org.telegram.ui.Components.oj0 {
    public final Context f51678c;
    public final ay0 d;

    public wx0(ay0 ay0Var, Context context) {
        this.d = ay0Var;
        this.f51678c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57048f;
        if (i7 != 3 && i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        int i7;
        ay0 ay0Var = this.d;
        int i10 = ay0Var.f44126f;
        if (ay0Var.f44125e < 0) {
            i7 = ay0Var.getMediaDataController().h.size();
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
        ay0 ay0Var = this.d;
        if (i7 == ay0Var.f44124c) {
            return 2;
        }
        if (i7 == ay0Var.f44125e) {
            return 3;
        }
        if (i7 != b() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11;
        if (d(i7) != 1) {
            return;
        }
        ay0 ay0Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ay0Var.getMediaDataController().h.get(i7 - ay0Var.d);
        String str = tL_availableReaction.reaction;
        i10 = ((org.telegram.ui.ActionBar.f2) ay0Var).currentAccount;
        boolean contains = str.contains(org.telegram.messenger.ui.b0(i10).Q());
        i11 = ((org.telegram.ui.ActionBar.f2) ay0Var).currentAccount;
        ((org.telegram.ui.Cells.x) d1Var.f57044a).a(tL_availableReaction, contains, i11);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.q4 q4Var;
        zx0 zx0Var;
        ay0 ay0Var = this.d;
        Context context = this.f51678c;
        if (i7 == 0) {
            q4Var = ((org.telegram.ui.ActionBar.f2) ay0Var).parentLayout;
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, q4Var, 2);
            z9Var.setImportantForAccessibility(4);
            z9Var.f31001x = ay0Var;
            zx0Var = z9Var;
        } else if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 4) {
                    zx0Var = new org.telegram.ui.Cells.x(context, true, true);
                } else {
                    View tmVar = new org.telegram.ui.Components.tm(context, 22);
                    tmVar.setTag(-33024);
                    zx0Var = tmVar;
                }
            } else {
                zx0 zx0Var2 = new zx0(ay0Var, context);
                zx0Var2.a(false);
                zx0Var = zx0Var2;
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setText(org.telegram.messenger.id.M0(2131751353, null));
            zx0Var = z8Var;
        }
        return new v4.d1(zx0Var);
    }
}
