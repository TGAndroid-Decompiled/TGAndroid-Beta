package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class to extends org.telegram.ui.Components.oj0 {
    public final Context f50312c;
    public ArrayList d = new ArrayList();
    public ArrayList f50313e = new ArrayList();
    public so f50314f;
    public final uo h;

    public to(uo uoVar, Context context) {
        this.h = uoVar;
        this.f50312c = context;
    }

    public static void E(to toVar, ArrayList arrayList, ArrayList arrayList2) {
        uo uoVar = toVar.h;
        if (!uoVar.N) {
            return;
        }
        toVar.d = arrayList;
        toVar.f50313e = arrayList2;
        if (uoVar.f50528b.getAdapter() == uoVar.f50530e) {
            uoVar.d.c();
        }
        super.f();
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57052a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57056f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f50314f != null) {
            Utilities.f21343g.a(this.f50314f);
            this.f50314f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.f50313e.clear();
            super.f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f21343g;
        so soVar = new so(this, str, 0);
        this.f50314f = soVar;
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
        CharSequence charSequence = (CharSequence) this.f50313e.get(i7);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(K)) {
            if (charSequence.toString().startsWith("@" + K)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) d1Var.f57052a;
        a5Var.setTag(Integer.valueOf(i7));
        a5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f50312c, 6, 2, false, null);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, a5Var, null);
        return new v4.d1(a5Var);
    }
}
