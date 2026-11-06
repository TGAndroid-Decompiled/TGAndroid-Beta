package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ro extends org.telegram.ui.Components.oj0 {
    public final Context f49540c;
    public ArrayList d = new ArrayList();
    public ArrayList f49541e = new ArrayList();
    public qo f49542f;
    public final so h;

    public ro(so soVar, Context context) {
        this.h = soVar;
        this.f49540c = context;
    }

    public static void E(ro roVar, ArrayList arrayList, ArrayList arrayList2) {
        so soVar = roVar.h;
        if (!soVar.N) {
            return;
        }
        roVar.d = arrayList;
        roVar.f49541e = arrayList2;
        if (soVar.f49798b.getAdapter() == soVar.f49800e) {
            soVar.d.c();
        }
        super.f();
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f56952a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f56956f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f49542f != null) {
            Utilities.f21335g.a(this.f49542f);
            this.f49542f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.f49541e.clear();
            super.f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f21335g;
        qo qoVar = new qo(this, str, 0);
        this.f49542f = qoVar;
        p5Var.d(qoVar, 300L);
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
        CharSequence charSequence = (CharSequence) this.f49541e.get(i7);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(K)) {
            if (charSequence.toString().startsWith("@" + K)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) d1Var.f56952a;
        a5Var.setTag(Integer.valueOf(i7));
        a5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f49540c, 6, 2, false, null);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, a5Var, null);
        return new v4.d1(a5Var);
    }
}
