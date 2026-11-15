package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class so extends org.telegram.ui.Components.tj0 {
    public final Context f51251c;
    public ArrayList d = new ArrayList();
    public ArrayList f51252e = new ArrayList();
    public ro f51253f;
    public final to h;

    public so(to toVar, Context context) {
        this.h = toVar;
        this.f51251c = context;
    }

    public static void E(so soVar, ArrayList arrayList, ArrayList arrayList2) {
        to toVar = soVar.h;
        if (!toVar.O) {
            return;
        }
        soVar.d = arrayList;
        soVar.f51252e = arrayList2;
        if (toVar.f51619b.getAdapter() == toVar.f51621e) {
            toVar.d.c();
        }
        super.f();
    }

    @Override
    public final void A(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f51253f != null) {
            Utilities.f22418g.a(this.f51253f);
            this.f51253f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.f51252e.clear();
            super.f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f22418g;
        ro roVar = new ro(this, str, 0);
        this.f51253f = roVar;
        p5Var.d(roVar, 300L);
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
        String K = org.telegram.messenger.t3.K(chat, false);
        CharSequence charSequence = (CharSequence) this.f51252e.get(i7);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(K)) {
            if (charSequence.toString().startsWith("@" + K)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) e1Var.f58535a;
        a5Var.setTag(Integer.valueOf(i7));
        a5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f51251c, 6, 2, false, null);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, a5Var, null);
        return new v4.e1(a5Var);
    }
}
