package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zo implements org.telegram.ui.Components.hk0 {
    public final bp f44030a;

    public zo(bp bpVar) {
        this.f44030a = bpVar;
    }

    @Override
    public final void f(int i10, View view) {
        TLRPC.TL_username tL_username;
        int i11;
        int i12;
        int i13;
        bp bpVar = this.f44030a;
        cp cpVar = bpVar.f36095h3;
        if ((view instanceof la) && (tL_username = ((la) view).f39164w) != null) {
            if (tL_username.editable) {
                if (cpVar.fragmentView instanceof ScrollView) {
                    cpVar.f36357a.smoothScrollTo(0, cpVar.D.getTop() - org.telegram.messenger.i0.L(128.0f));
                }
                cpVar.f36359b.requestFocus();
                org.telegram.messenger.i0.J3(cpVar.f36359b);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bpVar.getContext(), cpVar.getResourceProvider());
            if (tL_username.active) {
                i11 = 2131743690;
            } else {
                i11 = 2131743697;
            }
            String L0 = org.telegram.messenger.dd.L0(i11, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            if (tL_username.active) {
                i12 = 2131743689;
            } else {
                i12 = 2131743696;
            }
            x1Var.T = org.telegram.messenger.dd.L0(i12, null);
            if (tL_username.active) {
                i13 = 2131749334;
            } else {
                i13 = 2131745371;
            }
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(i13, null), new a7(this, tL_username, view, 8));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new org.telegram.ui.Cells.m5(7));
            alertDialog$Builder.p();
        }
    }
}
