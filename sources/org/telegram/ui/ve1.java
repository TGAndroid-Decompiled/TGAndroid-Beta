package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ve1 extends pg.b {
    public final xe1 d;

    public ve1(xe1 xe1Var) {
        this.d = xe1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45913f;
        if (i10 == 1 || i10 == 2 || i10 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.d.size();
    }

    @Override
    public final int j(int i10) {
        return ((we1) this.d.d.get(i10)).f44286a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        xe1 xe1Var = this.d;
        ArrayList arrayList = xe1Var.d;
        if (((we1) arrayList.get(i10)).f44286a == 2) {
            org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) b1Var.f45910a;
            long j10 = xe1Var.f43199c;
            TLRPC.TL_forumTopic tL_forumTopic = ((we1) arrayList.get(i10)).f42542c;
            org.telegram.ui.Components.w9 w9Var = oaVar.f22739b;
            boolean z10 = false;
            og.d.p(w9Var, tL_forumTopic, false, false, null);
            if (w9Var != null && w9Var.getImageReceiver() != null && (w9Var.getImageReceiver().getDrawable() instanceof og.c)) {
                ((og.c) w9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20973c9, false));
            }
            oaVar.f22740c.setText(tL_forumTopic.title);
            oaVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j10, tL_forumTopic.f20327id));
            if (i10 == arrayList.size() - 1 || ((we1) arrayList.get(i10 + 1)).f44286a == 2) {
                z10 = true;
            }
            oaVar.f22738a = z10;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.q8 q8Var;
        View view = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(viewGroup.getContext());
                        q8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        q8Var2.e(-1, org.telegram.ui.ActionBar.h6.f21210p7);
                        q8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false));
                        q8Var = q8Var2;
                    }
                    return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
                }
                q8Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.c1) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                frameLayout.f22739b = w9Var;
                frameLayout.addView(w9Var, w7.z5.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f22740c = textView;
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
                textView.setTextSize(1, 16.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setMaxLines(1);
                frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21377y6, false));
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, w7.z5.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false));
                q8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.q8 q8Var3 = new org.telegram.ui.Cells.q8(viewGroup.getContext());
            q8Var3.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            q8Var3.e(org.telegram.ui.ActionBar.h6.f21322v6, org.telegram.ui.ActionBar.h6.f21305u6);
            q8Var3.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false));
            q8Var = q8Var3;
        }
        view = q8Var;
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
