package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class we1 implements org.telegram.ui.Components.wl0 {
    public final ze1 f42499a;

    public we1(ze1 ze1Var) {
        this.f42499a = ze1Var;
    }

    @Override
    public final void a(int i10, View view) {
        ze1 ze1Var = this.f42499a;
        ArrayList arrayList = ze1Var.d;
        if (((ye1) arrayList.get(i10)).f44291a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -ze1Var.f43724c);
            bundle.putBoolean("for_select", true);
            te1 te1Var = new te1(bundle);
            te1Var.A0 = ze1Var.e;
            te1Var.v = new ue1(this);
            ze1Var.presentFragment(te1Var);
        }
        if (((ye1) arrayList.get(i10)).f44291a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((ye1) arrayList.get(i10)).f43385c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ze1Var.f43724c);
            bundle2.putLong("topic_id", tL_forumTopic.f20324id);
            bundle2.putBoolean("exception", false);
            b11 b11Var = new b11(bundle2, null);
            b11Var.f35520r = new ve1(this, tL_forumTopic);
            ze1Var.presentFragment(b11Var);
        }
        if (((ye1) arrayList.get(i10)).f44291a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ze1Var.getParentActivity());
            alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ue1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
            ze1Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21224q7, false));
            }
        }
    }
}
