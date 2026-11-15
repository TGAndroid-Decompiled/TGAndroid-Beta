package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y91 extends rg.b {
    public final aa1 d;

    public y91(aa1 aa1Var) {
        this.d = aa1Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 == 1 || i7 == 2 || i7 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.d.size();
    }

    @Override
    public final int d(int i7) {
        return ((z91) this.d.d.get(i7)).f56015a;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        long j3;
        String M0;
        aa1 aa1Var = this.d;
        ArrayList arrayList = aa1Var.d;
        if (((z91) arrayList.get(i7)).f56015a == 2) {
            org.telegram.ui.Cells.ia iaVar = (org.telegram.ui.Cells.ia) e1Var.f58535a;
            long j10 = aa1Var.f44982c;
            TLRPC.TL_forumTopic tL_forumTopic = ((z91) arrayList.get(i7)).f53881c;
            org.telegram.ui.Components.i9 i9Var = iaVar.f30457b;
            boolean z10 = false;
            qg.c.p(i9Var, tL_forumTopic, false, false, null);
            if (i9Var != null && i9Var.getImageReceiver() != null && (i9Var.getImageReceiver().t() instanceof qg.b)) {
                ((qg.b) i9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28834c9, false));
            }
            iaVar.f30458c.setText(tL_forumTopic.title);
            TextView textView = iaVar.d;
            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0);
            if (s12.getMessagesController().r2(j10, tL_forumTopic.f28103id, null)) {
                int i10 = s12.f25273e7.getInt("notifyuntil_" + org.telegram.messenger.at.v(j10, j3, false), 0);
                if (i10 >= s12.getConnectionsManager().getCurrentTime()) {
                    M0 = org.telegram.messenger.hd.a0("NotificationsMutedForHint", null, 2131747900, org.telegram.messenger.hd.c0(i10));
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131747901, null);
                }
            } else {
                M0 = org.telegram.messenger.hd.M0(2131747856, null);
            }
            textView.setText(M0);
            if (i7 == arrayList.size() - 1 || ((z91) arrayList.get(i7 + 1)).f56015a == 2) {
                z10 = true;
            }
            iaVar.f30456a = z10;
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.l8 l8Var;
        View view = null;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                        l8Var2.k(org.telegram.messenger.hd.M0(2131747915, null), false);
                        l8Var2.g(-1, org.telegram.ui.ActionBar.j6.f29070p7);
                        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, l8Var2, null);
                        l8Var = l8Var2;
                    }
                    return i5.c.q(view, view, -1, -2);
                }
                l8Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (org.telegram.ui.Cells.y0) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
                frameLayout.f30457b = i9Var;
                frameLayout.addView(i9Var, c8.ja.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f30458c = textView;
                org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.G6, null, 1, 16.0f);
                textView.setMaxLines(1);
                frameLayout.addView(textView, c8.ja.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29241y6, null);
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, c8.ja.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, frameLayout, null);
                l8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.l8 l8Var3 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
            l8Var3.o(2131232100, org.telegram.messenger.hd.M0(2131747923, null), true);
            l8Var3.g(org.telegram.ui.ActionBar.j6.f29184v6, org.telegram.ui.ActionBar.j6.f29165u6);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, l8Var3, null);
            l8Var = l8Var3;
        }
        view = l8Var;
        return i5.c.q(view, view, -1, -2);
    }
}
