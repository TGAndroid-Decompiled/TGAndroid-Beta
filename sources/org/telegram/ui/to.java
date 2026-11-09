package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class to extends org.telegram.ui.Components.pj0 {
    public final Context f50208c;
    public ArrayList d = new ArrayList();
    public ArrayList f50209e = new ArrayList();
    public so f50210f;
    public final uo h;

    public to(uo uoVar, Context context) {
        this.h = uoVar;
        this.f50208c = context;
    }

    public static void E(to toVar, ArrayList arrayList, ArrayList arrayList2) {
        uo uoVar = toVar.h;
        if (!uoVar.N) {
            return;
        }
        toVar.d = arrayList;
        toVar.f50209e = arrayList2;
        if (uoVar.f50432b.getAdapter() == uoVar.f50434e) {
            uoVar.d.c();
        }
        super.f();
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57056a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57060f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f50210f != null) {
            Utilities.f21338g.a(this.f50210f);
            this.f50210f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.f50209e.clear();
            super.f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f21338g;
        so soVar = new so(this, str, 0);
        this.f50210f = soVar;
        p5Var.d(soVar, 300L);
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
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i7);
        String K = org.telegram.messenger.t3.K(chat, false);
        CharSequence charSequence = (CharSequence) this.f50209e.get(i7);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(K)) {
            if (charSequence.toString().startsWith("@" + K)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) d1Var.f57056a;
        a5Var.setTag(Integer.valueOf(i7));
        a5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f50208c, 6, 2, false, null);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, a5Var, null);
        return new v4.d1(a5Var);
    }
}
