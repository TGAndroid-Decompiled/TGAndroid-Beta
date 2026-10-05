package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zf1 implements org.telegram.ui.Components.ml0 {
    public final cg1 f43771a;

    public zf1(cg1 cg1Var) {
        this.f43771a = cg1Var;
    }

    @Override
    public final void d(int i10, View view) {
        cg1 cg1Var = this.f43771a;
        ArrayList arrayList = cg1Var.d;
        if (((bg1) arrayList.get(i10)).f17192a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -cg1Var.f35454c);
            bundle.putBoolean("for_select", true);
            wf1 wf1Var = new wf1(bundle);
            wf1Var.A0 = cg1Var.f35455e;
            wf1Var.v = new xf1(this);
            cg1Var.presentFragment(wf1Var);
        }
        if (((bg1) arrayList.get(i10)).f17192a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((bg1) arrayList.get(i10)).f35138c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", cg1Var.f35454c);
            bundle2.putLong("topic_id", tL_forumTopic.f20099id);
            bundle2.putBoolean("exception", false);
            p11 p11Var = new p11(bundle2, null);
            p11Var.f39337s = new yf1(this, tL_forumTopic);
            cg1Var.presentFragment(p11Var);
        }
        if (((bg1) arrayList.get(i10)).f17192a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cg1Var.getParentActivity());
            alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xf1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
            cg1Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21068q7, false));
            }
        }
    }
}
