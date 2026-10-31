package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sb1 implements org.telegram.ui.Components.gk0 {
    public final vb1 f41465a;

    public sb1(vb1 vb1Var) {
        this.f41465a = vb1Var;
    }

    @Override
    public final void f(int i10, View view) {
        vb1 vb1Var = this.f41465a;
        ArrayList arrayList = vb1Var.d;
        if (((ub1) arrayList.get(i10)).f7680a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -vb1Var.f42699c);
            bundle.putBoolean("for_select", true);
            pb1 pb1Var = new pb1(bundle);
            pb1Var.A0 = vb1Var.e;
            pb1Var.f40609w = new qb1(this);
            vb1Var.presentFragment(pb1Var);
        }
        if (((ub1) arrayList.get(i10)).f7680a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((ub1) arrayList.get(i10)).f42112c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", vb1Var.f42699c);
            bundle2.putLong("topic_id", tL_forumTopic.f19845id);
            bundle2.putBoolean("exception", false);
            uy0 uy0Var = new uy0(bundle2, null);
            uy0Var.f42549s = new rb1(this, tL_forumTopic);
            vb1Var.presentFragment(uy0Var);
        }
        if (((ub1) arrayList.get(i10)).f7680a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vb1Var.getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131747929, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131747930, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new qb1(this));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            vb1Var.showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
            }
        }
    }
}
