package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class sp extends org.telegram.ui.Components.yl0 {
    public final Context f40588c;
    public ArrayList d = new ArrayList();
    public ArrayList f40589e = new ArrayList();
    public rp f40590f;
    public final tp h;

    public sp(tp tpVar, Context context) {
        this.h = tpVar;
        this.f40588c = context;
    }

    public static void E(sp spVar, ArrayList arrayList, ArrayList arrayList2) {
        tp tpVar = spVar.h;
        if (!tpVar.N) {
            return;
        }
        spVar.d = arrayList;
        spVar.f40589e = arrayList2;
        if (tpVar.f40927b.getAdapter() == tpVar.f40929e) {
            tpVar.d.c();
        }
        super.l();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f46531a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f46535f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f40590f != null) {
            Utilities.searchQueue.cancelRunnable(this.f40590f);
            this.f40590f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.f40589e.clear();
            super.l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        rp rpVar = new rp(this, str, 0);
        this.f40590f = rpVar;
        dispatchQueue.postRunnable(rpVar, 300L);
    }

    @Override
    public final int h() {
        return this.d.size();
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i10);
        String publicUsername = ChatObject.getPublicUsername(chat);
        CharSequence charSequence = (CharSequence) this.f40589e.get(i10);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
            if (charSequence.toString().startsWith("@" + publicUsername)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) c1Var.f46531a;
        b5Var.setTag(Integer.valueOf(i10));
        b5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(6, 2, this.f40588c, null, false);
        b5Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20822d6, false));
        return new s4.c1(b5Var);
    }
}
