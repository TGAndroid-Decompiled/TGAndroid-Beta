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
public final class wf1 extends cg.c {
    public final yf1 d;

    public wf1(yf1 yf1Var) {
        this.d = yf1Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
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
        return ((xf1) this.d.d.get(i10)).f2505a;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        yf1 yf1Var = this.d;
        ArrayList arrayList = yf1Var.d;
        if (((xf1) arrayList.get(i10)).f2505a == 2) {
            org.telegram.ui.Cells.na naVar = (org.telegram.ui.Cells.na) m1Var.f5875a;
            long j10 = yf1Var.f43617c;
            TLRPC.TL_forumTopic tL_forumTopic = ((xf1) arrayList.get(i10)).f43033c;
            org.telegram.ui.Components.p9 p9Var = naVar.f23242b;
            boolean z4 = false;
            bg.e.p(p9Var, tL_forumTopic, false, false, null);
            if (p9Var != null && p9Var.getImageReceiver() != null && (p9Var.getImageReceiver().getDrawable() instanceof bg.d)) {
                ((bg.d) p9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21646c9, false));
            }
            naVar.f23243c.setText(tL_forumTopic.title);
            naVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j10, tL_forumTopic.f20897id));
            naVar.f23241a = (i10 == arrayList.size() - 1 || ((xf1) arrayList.get(i10 + 1)).f2505a == 2) ? true : true;
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.o8 o8Var;
        View view = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(viewGroup.getContext());
                        o8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        o8Var2.e(-1, org.telegram.ui.ActionBar.k6.f21878p7);
                        o8Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
                        o8Var = o8Var2;
                    }
                    return yh.o(view, view, -1, -2);
                }
                o8Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (b) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                frameLayout.f23242b = p9Var;
                frameLayout.addView(p9Var, k7.c6.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f23243c = textView;
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
                textView.setTextSize(1, 16.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setMaxLines(1);
                frameLayout.addView(textView, k7.c6.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22038y6, false));
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, k7.c6.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
                o8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.o8 o8Var3 = new org.telegram.ui.Cells.o8(viewGroup.getContext());
            o8Var3.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            o8Var3.e(org.telegram.ui.ActionBar.k6.f21981v6, org.telegram.ui.ActionBar.k6.f21963u6);
            o8Var3.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
            o8Var = o8Var3;
        }
        view = o8Var;
        return yh.o(view, view, -1, -2);
    }
}
