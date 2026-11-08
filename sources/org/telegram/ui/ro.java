package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ro extends org.telegram.ui.Components.oj0 {
    public final Context f49518c;
    public ArrayList d = new ArrayList();
    public ArrayList f49519e = new ArrayList();
    public qo f49520f;
    public final so h;

    public ro(so soVar, Context context) {
        this.h = soVar;
        this.f49518c = context;
    }

    public static void E(ro roVar, ArrayList arrayList, ArrayList arrayList2) {
        so soVar = roVar.h;
        if (!soVar.N) {
            return;
        }
        roVar.d = arrayList;
        roVar.f49519e = arrayList2;
        if (soVar.f49788b.getAdapter() == soVar.f49790e) {
            soVar.d.c();
        }
        super.f();
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57043a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57047f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f49520f != null) {
            Utilities.f21338g.a(this.f49520f);
            this.f49520f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.f49519e.clear();
            super.f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f21338g;
        qo qoVar = new qo(this, str, 0);
        this.f49520f = qoVar;
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
        CharSequence charSequence = (CharSequence) this.f49519e.get(i7);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(K)) {
            if (charSequence.toString().startsWith("@" + K)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) d1Var.f57043a;
        a5Var.setTag(Integer.valueOf(i7));
        a5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f49518c, 6, 2, false, null);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, a5Var, null);
        return new v4.d1(a5Var);
    }
}
