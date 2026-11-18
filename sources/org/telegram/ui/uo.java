package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uo extends org.telegram.ui.Components.bk0 {
    public final Context f52606c;
    public ArrayList d = new ArrayList();
    public ArrayList f52607e = new ArrayList();
    public to f52608f;
    public final vo h;

    public uo(vo voVar, Context context) {
        this.h = voVar;
        this.f52606c = context;
    }

    public static void E(uo uoVar, ArrayList arrayList, ArrayList arrayList2) {
        vo voVar = uoVar.h;
        if (!voVar.O) {
            return;
        }
        uoVar.d = arrayList;
        uoVar.f52607e = arrayList2;
        if (voVar.f52824b.getAdapter() == voVar.f52826e) {
            voVar.d.c();
        }
        super.f();
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59122a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59126f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f52608f != null) {
            Utilities.f22784g.a(this.f52608f);
            this.f52608f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.f52607e.clear();
            super.f();
            return;
        }
        org.telegram.messenger.q5 q5Var = Utilities.f22784g;
        to toVar = new to(this, str, 0);
        this.f52608f = toVar;
        q5Var.d(toVar, 300L);
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
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i7);
        String K = org.telegram.messenger.v3.K(chat, false);
        CharSequence charSequence = (CharSequence) this.f52607e.get(i7);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(K)) {
            if (charSequence.toString().startsWith("@" + K)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) f1Var.f59122a;
        a5Var.setTag(Integer.valueOf(i7));
        a5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f52606c, 6, 2, false, null);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, a5Var, null);
        return new v4.f1(a5Var);
    }
}
