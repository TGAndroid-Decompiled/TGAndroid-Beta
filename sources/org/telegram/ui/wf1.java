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
public final class wf1 extends bg.c {
    public final yf1 d;

    public wf1(yf1 yf1Var) {
        this.d = yf1Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
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
        return ((xf1) this.d.d.get(i10)).f1830a;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        yf1 yf1Var = this.d;
        ArrayList arrayList = yf1Var.d;
        if (((xf1) arrayList.get(i10)).f1830a == 2) {
            org.telegram.ui.Cells.ma maVar = (org.telegram.ui.Cells.ma) l1Var.f5774a;
            long j10 = yf1Var.f40268c;
            TLRPC.TL_forumTopic tL_forumTopic = ((xf1) arrayList.get(i10)).f39976c;
            org.telegram.ui.Components.p9 p9Var = maVar.f21381b;
            boolean z4 = false;
            ag.f.p(p9Var, tL_forumTopic, false, false, null);
            if (p9Var != null && p9Var.getImageReceiver() != null && (p9Var.getImageReceiver().getDrawable() instanceof ag.e)) {
                ((ag.e) p9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19866c9, false));
            }
            maVar.f21382c.setText(tL_forumTopic.title);
            maVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j10, tL_forumTopic.f19211id));
            maVar.f21380a = (i10 == arrayList.size() - 1 || ((xf1) arrayList.get(i10 + 1)).f1830a == 2) ? true : true;
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.n8 n8Var;
        View view = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(viewGroup.getContext());
                        n8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        n8Var2.e(-1, org.telegram.ui.ActionBar.j6.f20097p7);
                        n8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                        n8Var = n8Var2;
                    }
                    return ai.n(view, view, -1, -2);
                }
                n8Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (b) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                frameLayout.f21381b = p9Var;
                frameLayout.addView(p9Var, k7.b6.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f21382c = textView;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                textView.setTextSize(1, 16.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setMaxLines(1);
                frameLayout.addView(textView, k7.b6.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20256y6, false));
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, k7.b6.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                n8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.n8 n8Var3 = new org.telegram.ui.Cells.n8(viewGroup.getContext());
            n8Var3.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            n8Var3.e(org.telegram.ui.ActionBar.j6.f20200v6, org.telegram.ui.ActionBar.j6.f20182u6);
            n8Var3.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
            n8Var = n8Var3;
        }
        view = n8Var;
        return ai.n(view, view, -1, -2);
    }
}
