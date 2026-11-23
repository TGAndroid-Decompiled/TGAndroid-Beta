package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class to extends org.telegram.ui.Components.dk0 {
    public final Context f52309c;
    public ArrayList d = new ArrayList();
    public ArrayList f52310e = new ArrayList();
    public so f52311f;
    public final uo h;

    public to(uo uoVar, Context context) {
        this.h = uoVar;
        this.f52309c = context;
    }

    public static void E(to toVar, ArrayList arrayList, ArrayList arrayList2) {
        uo uoVar = toVar.h;
        if (!uoVar.O) {
            return;
        }
        toVar.d = arrayList;
        toVar.f52310e = arrayList2;
        if (uoVar.f52598b.getAdapter() == uoVar.f52600e) {
            uoVar.d.c();
        }
        super.f();
    }

    @Override
    public final void A(v4.e1 e1Var) {
        View view = e1Var.f59111a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f59115f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f52311f != null) {
            Utilities.f22776g.a(this.f52311f);
            this.f52311f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.f52310e.clear();
            super.f();
            return;
        }
        org.telegram.messenger.q5 q5Var = Utilities.f22776g;
        so soVar = new so(this, str, 0);
        this.f52311f = soVar;
        q5Var.d(soVar, 300L);
    }

    @Override
    public final int b() {
        return this.d.size();
    }

    @Override
    public final int d(int i7) {
        return 0;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i7);
        String K = org.telegram.messenger.v3.K(chat, false);
        CharSequence charSequence = (CharSequence) this.f52310e.get(i7);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(K)) {
            if (charSequence.toString().startsWith("@" + K)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) e1Var.f59111a;
        b5Var.setTag(Integer.valueOf(i7));
        b5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(this.f52309c, 6, 2, false, null);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, b5Var, null);
        return new v4.e1(b5Var);
    }
}
