package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zf1 implements org.telegram.ui.Components.ll0 {
    public final cg1 f40466a;

    public zf1(cg1 cg1Var) {
        this.f40466a = cg1Var;
    }

    @Override
    public final void d(int i10, View view) {
        cg1 cg1Var = this.f40466a;
        ArrayList arrayList = cg1Var.d;
        if (((bg1) arrayList.get(i10)).f15715a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -cg1Var.f32717c);
            bundle.putBoolean("for_select", true);
            wf1 wf1Var = new wf1(bundle);
            wf1Var.A0 = cg1Var.e;
            wf1Var.v = new xf1(this);
            cg1Var.presentFragment(wf1Var);
        }
        if (((bg1) arrayList.get(i10)).f15715a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((bg1) arrayList.get(i10)).f32417c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", cg1Var.f32717c);
            bundle2.putLong("topic_id", tL_forumTopic.f18387id);
            bundle2.putBoolean("exception", false);
            n11 n11Var = new n11(bundle2, null);
            n11Var.f35729r = new yf1(this, tL_forumTopic);
            cg1Var.presentFragment(n11Var);
        }
        if (((bg1) arrayList.get(i10)).f15715a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cg1Var.getParentActivity());
            alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xf1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
            cg1Var.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19298q7, false));
            }
        }
    }
}
