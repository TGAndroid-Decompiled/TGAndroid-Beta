package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class vx0 extends org.telegram.ui.Components.tj0 {
    public final Context f52322c;
    public final zx0 d;

    public vx0(zx0 zx0Var, Context context) {
        this.d = zx0Var;
        this.f52322c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 3 && i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        int i7;
        zx0 zx0Var = this.d;
        int i10 = zx0Var.f54058f;
        if (zx0Var.f54057e < 0) {
            i7 = zx0Var.getMediaDataController().h.size();
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
        zx0 zx0Var = this.d;
        if (i7 == zx0Var.f54056c) {
            return 2;
        }
        if (i7 == zx0Var.f54057e) {
            return 3;
        }
        if (i7 != b() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        int i11;
        if (d(i7) != 1) {
            return;
        }
        zx0 zx0Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) zx0Var.getMediaDataController().h.get(i7 - zx0Var.d);
        String str = tL_availableReaction.reaction;
        i10 = ((org.telegram.ui.ActionBar.e2) zx0Var).currentAccount;
        boolean contains = str.contains(org.telegram.messenger.si.b0(i10).Q());
        i11 = ((org.telegram.ui.ActionBar.e2) zx0Var).currentAccount;
        ((org.telegram.ui.Cells.x) e1Var.f58535a).a(tL_availableReaction, contains, i11);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.o4 o4Var;
        yx0 yx0Var;
        zx0 zx0Var = this.d;
        Context context = this.f52322c;
        if (i7 == 0) {
            o4Var = ((org.telegram.ui.ActionBar.e2) zx0Var).parentLayout;
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, o4Var, 2);
            z9Var.setImportantForAccessibility(4);
            z9Var.f32140x = zx0Var;
            yx0Var = z9Var;
        } else if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 4) {
                    yx0Var = new org.telegram.ui.Cells.x(context, true, true);
                } else {
                    View bnVar = new org.telegram.ui.Components.bn(context, 22);
                    bnVar.setTag(-33024);
                    yx0Var = bnVar;
                }
            } else {
                yx0 yx0Var2 = new yx0(zx0Var, context);
                yx0Var2.a(false);
                yx0Var = yx0Var2;
            }
        } else {
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            y8Var.setText(org.telegram.messenger.hd.M0(2131751352, null));
            yx0Var = y8Var;
        }
        return new v4.e1(yx0Var);
    }
}
