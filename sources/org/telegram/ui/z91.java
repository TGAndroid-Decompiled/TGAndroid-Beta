package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class z91 implements org.telegram.ui.Components.bj0 {
    public final ca1 f52493a;

    public z91(ca1 ca1Var) {
        this.f52493a = ca1Var;
    }

    @Override
    public final void c(int i7, View view) {
        ca1 ca1Var = this.f52493a;
        ArrayList arrayList = ca1Var.d;
        if (((ba1) arrayList.get(i7)).f54532a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -ca1Var.f44736c);
            bundle.putBoolean("for_select", true);
            w91 w91Var = new w91(bundle);
            w91Var.A0 = ca1Var.f44737e;
            w91Var.f51035w = new x91(this);
            ca1Var.presentFragment(w91Var);
        }
        if (((ba1) arrayList.get(i7)).f54532a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((ba1) arrayList.get(i7)).f44241c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ca1Var.f44736c);
            bundle2.putLong("topic_id", tL_forumTopic.f27008id);
            bundle2.putBoolean("exception", false);
            gx0 gx0Var = new gx0(bundle2, null);
            gx0Var.f46139s = new y91(this, tL_forumTopic);
            ca1Var.presentFragment(gx0Var);
        }
        if (((ba1) arrayList.get(i7)).f54532a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ca1Var.getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131747914, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131747915, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751599, null), new x91(this));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            ca1Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28093q7, null);
            }
        }
    }
}
