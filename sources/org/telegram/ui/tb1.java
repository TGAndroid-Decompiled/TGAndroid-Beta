package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tb1 extends hg.c {
    public final vb1 d;

    public tb1(vb1 vb1Var) {
        this.d = vb1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 == 1 || i10 == 2 || i10 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.d.size();
    }

    @Override
    public final int d(int i10) {
        return ((ub1) this.d.d.get(i10)).f7680a;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        long j10;
        String L0;
        vb1 vb1Var = this.d;
        ArrayList arrayList = vb1Var.d;
        if (((ub1) arrayList.get(i10)).f7680a == 2) {
            org.telegram.ui.Cells.ia iaVar = (org.telegram.ui.Cells.ia) c1Var.f47898a;
            long j11 = vb1Var.f42699c;
            TLRPC.TL_forumTopic tL_forumTopic = ((ub1) arrayList.get(i10)).f42112c;
            org.telegram.ui.Components.g9 g9Var = iaVar.f22052b;
            boolean z10 = false;
            gg.e.p(g9Var, tL_forumTopic, false, false, null);
            if (g9Var != null && g9Var.getImageReceiver() != null && (g9Var.getImageReceiver().t() instanceof gg.d)) {
                ((gg.d) g9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20913c9, false));
            }
            iaVar.f22053c.setText(tL_forumTopic.title);
            TextView textView = iaVar.d;
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0);
            if (r12.getMessagesController().q2(j11, tL_forumTopic.f19845id, null)) {
                int i11 = r12.e7.getInt("notifyuntil_" + org.telegram.messenger.ot.v(j11, j10, false), 0);
                if (i11 >= r12.getConnectionsManager().getCurrentTime()) {
                    L0 = org.telegram.messenger.cd.a0("NotificationsMutedForHint", null, 2131747916, org.telegram.messenger.cd.c0(i11));
                } else {
                    L0 = org.telegram.messenger.cd.L0(2131747917, null);
                }
            } else {
                L0 = org.telegram.messenger.cd.L0(2131747872, null);
            }
            textView.setText(L0);
            if (i10 == arrayList.size() - 1 || ((ub1) arrayList.get(i10 + 1)).f7680a == 2) {
                z10 = true;
            }
            iaVar.f22051a = z10;
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.p8 p8Var;
        View view = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                        p8Var2.k(org.telegram.messenger.cd.L0(2131747931, null), false);
                        p8Var2.g(-1, org.telegram.ui.ActionBar.t6.f21153p7);
                        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, p8Var2, null);
                        p8Var = p8Var2;
                    }
                    return sc.e.o(view, view, -1, -2);
                }
                p8Var = new org.telegram.ui.Cells.c7(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
                frameLayout.f22052b = g9Var;
                frameLayout.addView(g9Var, w7.b6.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f22053c = textView;
                org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.G6, null, 1, 16.0f);
                textView.setMaxLines(1);
                frameLayout.addView(textView, w7.b6.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21311y6, null);
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, w7.b6.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, frameLayout, null);
                p8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.p8 p8Var3 = new org.telegram.ui.Cells.p8(viewGroup.getContext());
            p8Var3.o(2131232098, org.telegram.messenger.cd.L0(2131747939, null), true);
            p8Var3.g(org.telegram.ui.ActionBar.t6.f21259v6, org.telegram.ui.ActionBar.t6.f21242u6);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, p8Var3, null);
            p8Var = p8Var3;
        }
        view = p8Var;
        return sc.e.o(view, view, -1, -2);
    }
}
