package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class y91 implements org.telegram.ui.Components.bj0 {
    public final ba1 f52176a;

    public y91(ba1 ba1Var) {
        this.f52176a = ba1Var;
    }

    @Override
    public final void c(int i7, View view) {
        ba1 ba1Var = this.f52176a;
        ArrayList arrayList = ba1Var.d;
        if (((aa1) arrayList.get(i7)).f54439a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -ba1Var.f44238c);
            bundle.putBoolean("for_select", true);
            v91 v91Var = new v91(bundle);
            v91Var.A0 = ba1Var.f44239e;
            v91Var.f50671w = new w91(this);
            ba1Var.presentFragment(v91Var);
        }
        if (((aa1) arrayList.get(i7)).f54439a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((aa1) arrayList.get(i7)).f43611c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ba1Var.f44238c);
            bundle2.putLong("topic_id", tL_forumTopic.f27005id);
            bundle2.putBoolean("exception", false);
            gx0 gx0Var = new gx0(bundle2, null);
            gx0Var.f46137s = new x91(this, tL_forumTopic);
            ba1Var.presentFragment(gx0Var);
        }
        if (((aa1) arrayList.get(i7)).f54439a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ba1Var.getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131747912, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(2131747913, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new w91(this));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            ba1Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28090q7, null);
            }
        }
    }
}
