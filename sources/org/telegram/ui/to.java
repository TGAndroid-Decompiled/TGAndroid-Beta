package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class to extends org.telegram.ui.Components.dk0 {
    public final Context f52436c;
    public ArrayList d = new ArrayList();
    public ArrayList f52437e = new ArrayList();
    public so f52438f;
    public final uo h;

    public to(uo uoVar, Context context) {
        this.h = uoVar;
        this.f52436c = context;
    }

    public static void E(to toVar, ArrayList arrayList, ArrayList arrayList2) {
        uo uoVar = toVar.h;
        if (!uoVar.O) {
            return;
        }
        toVar.d = arrayList;
        toVar.f52437e = arrayList2;
        if (uoVar.f52697b.getAdapter() == uoVar.f52699e) {
            uoVar.d.c();
        }
        super.f();
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59245a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59249f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f52438f != null) {
            Utilities.f22879g.a(this.f52438f);
            this.f52438f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.f52437e.clear();
            super.f();
            return;
        }
        org.telegram.messenger.q5 q5Var = Utilities.f22879g;
        so soVar = new so(this, str, 0);
        this.f52438f = soVar;
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
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i7);
        String K = org.telegram.messenger.v3.K(chat, false);
        CharSequence charSequence = (CharSequence) this.f52437e.get(i7);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(K)) {
            if (charSequence.toString().startsWith("@" + K)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) f1Var.f59245a;
        b5Var.setTag(Integer.valueOf(i7));
        b5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(this.f52436c, 6, 2, false, null);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, b5Var, null);
        return new v4.f1(b5Var);
    }
}
