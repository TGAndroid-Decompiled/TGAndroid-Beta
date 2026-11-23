package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class z91 implements org.telegram.ui.Components.qj0 {
    public final ca1 f54556a;

    public z91(ca1 ca1Var) {
        this.f54556a = ca1Var;
    }

    @Override
    public final void b(int i7, View view) {
        ca1 ca1Var = this.f54556a;
        ArrayList arrayList = ca1Var.d;
        if (((ba1) arrayList.get(i7)).f56712a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -ca1Var.f46754c);
            bundle.putBoolean("for_select", true);
            w91 w91Var = new w91(bundle);
            w91Var.B0 = ca1Var.f46755e;
            w91Var.f53261w = new x91(this);
            ca1Var.presentFragment(w91Var);
        }
        if (((ba1) arrayList.get(i7)).f56712a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((ba1) arrayList.get(i7)).f45999c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ca1Var.f46754c);
            bundle2.putLong("topic_id", tL_forumTopic.f28544id);
            bundle2.putBoolean("exception", false);
            hx0 hx0Var = new hx0(bundle2, null);
            hx0Var.f48653s = new y91(this, tL_forumTopic);
            ca1Var.presentFragment(hx0Var);
        }
        if (((ba1) arrayList.get(i7)).f56712a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ca1Var.getParentActivity());
            String N0 = org.telegram.messenger.gd.N0(2131747719, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.N0(2131747720, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new x91(this));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            ca1Var.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
            }
        }
    }
}
