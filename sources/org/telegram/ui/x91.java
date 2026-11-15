package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class x91 implements org.telegram.ui.Components.gj0 {
    public final aa1 f53133a;

    public x91(aa1 aa1Var) {
        this.f53133a = aa1Var;
    }

    @Override
    public final void b(int i7, View view) {
        aa1 aa1Var = this.f53133a;
        ArrayList arrayList = aa1Var.d;
        if (((z91) arrayList.get(i7)).f56015a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -aa1Var.f44982c);
            bundle.putBoolean("for_select", true);
            u91 u91Var = new u91(bundle);
            u91Var.B0 = aa1Var.f44983e;
            u91Var.f51878w = new v91(this);
            aa1Var.presentFragment(u91Var);
        }
        if (((z91) arrayList.get(i7)).f56015a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((z91) arrayList.get(i7)).f53916c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", aa1Var.f44982c);
            bundle2.putLong("topic_id", tL_forumTopic.f28103id);
            bundle2.putBoolean("exception", false);
            fx0 fx0Var = new fx0(bundle2, null);
            fx0Var.f47228s = new w91(this, tL_forumTopic);
            aa1Var.presentFragment(fx0Var);
        }
        if (((z91) arrayList.get(i7)).f56015a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(aa1Var.getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131747913, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.M0(2131747914, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new v91(this));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            aa1Var.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
            }
        }
    }
}
