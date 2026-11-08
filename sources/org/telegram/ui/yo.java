package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class yo extends v4.g0 {
    public final Context f52273c;
    public final zo d;

    public yo(zo zoVar, Context context) {
        this.d = zoVar;
        this.f52273c = context;
    }

    @Override
    public final int b() {
        int i7;
        zo zoVar = this.d;
        if (!zoVar.d.isEmpty()) {
            i7 = zoVar.f52631n.size() + 1;
        } else {
            i7 = 0;
        }
        return i7 + 2;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 3;
        }
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        View view = d1Var.f57044a;
        int d = d(i7);
        zo zoVar = this.d;
        if (d != 0) {
            if (d != 1) {
                if (d == 2) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) zoVar.f52631n.get(i7 - 3);
                    boolean contains = zoVar.d.contains(tL_availableReaction.reaction);
                    i10 = ((org.telegram.ui.ActionBar.f2) zoVar).currentAccount;
                    ((org.telegram.ui.Cells.x) view).a(tL_availableReaction, contains, i10);
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.id.M0(2131747823, null));
            return;
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        org.telegram.ui.ActionBar.r6.V(z8Var.getTextView(), org.telegram.ui.ActionBar.k6.B6, null);
        int i11 = zoVar.f52633s;
        if (i11 == 1) {
            z8Var.setText(org.telegram.messenger.id.M0(2131751148, null));
        } else if (i11 == 0) {
            z8Var.setText(org.telegram.messenger.id.M0(2131751160, null));
        } else if (i11 == 2) {
            z8Var.setText(org.telegram.messenger.id.M0(2131751430, null));
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = this.f52273c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    return new v4.d1(new org.telegram.ui.Cells.x(context, false, false));
                }
                FrameLayout frameLayout = new FrameLayout(context);
                zo zoVar = this.d;
                org.telegram.messenger.g0.E2(zoVar.f52632r);
                frameLayout.addView(zoVar.f52632r);
                frameLayout.setLayoutParams(new v4.o0(-1, -2));
                return new v4.d1(frameLayout);
            }
            return new v4.d1(new org.telegram.ui.Cells.n4(context, 23));
        }
        return new v4.d1(new org.telegram.ui.Cells.z8(context));
    }
}
