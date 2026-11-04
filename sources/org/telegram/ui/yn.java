package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yn implements org.telegram.ui.Components.fj0 {
    public final ao f52369a;

    public yn(ao aoVar) {
        this.f52369a = aoVar;
    }

    @Override
    public final void f(int i3, View view) {
        TLRPC.TL_username tL_username;
        int i10;
        int i11;
        int i12;
        ao aoVar = this.f52369a;
        bo boVar = aoVar.i3;
        if ((view instanceof ha) && (tL_username = ((ha) view).f45877w) != null) {
            if (tL_username.editable) {
                if (boVar.fragmentView instanceof ScrollView) {
                    boVar.f44088a.smoothScrollTo(0, boVar.E.getTop() - org.telegram.messenger.g0.L(128.0f));
                }
                boVar.f44090b.requestFocus();
                org.telegram.messenger.g0.K3(boVar.f44090b);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, aoVar.getContext(), boVar.getResourceProvider());
            if (tL_username.active) {
                i10 = 2131743674;
            } else {
                i10 = 2131743681;
            }
            String M0 = org.telegram.messenger.bd.M0(i10, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            if (tL_username.active) {
                i11 = 2131743673;
            } else {
                i11 = 2131743680;
            }
            s1Var.U = org.telegram.messenger.bd.M0(i11, null);
            if (tL_username.active) {
                i12 = 2131749333;
            } else {
                i12 = 2131745363;
            }
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(i12, null), new b7(this, tL_username, view, 8));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new org.telegram.messenger.go(20));
            alertDialog$Builder.p();
        }
    }
}
