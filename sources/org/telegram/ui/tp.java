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
public final class tp extends org.telegram.ui.Components.pm0 {
    public final Context f42037c;
    public ArrayList d = new ArrayList();
    public ArrayList f42038e = new ArrayList();
    public sp f42039f;
    public final up h;

    public tp(up upVar, Context context) {
        this.h = upVar;
        this.f42037c = context;
    }

    public static void E(tp tpVar, ArrayList arrayList, ArrayList arrayList2) {
        up upVar = tpVar.h;
        if (!upVar.N) {
            return;
        }
        tpVar.d = arrayList;
        tpVar.f42038e = arrayList2;
        if (upVar.f42501b.getAdapter() == upVar.f42503e) {
            upVar.d.c();
        }
        super.l();
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47658a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47662f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f42039f != null) {
            Utilities.searchQueue.cancelRunnable(this.f42039f);
            this.f42039f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.f42038e.clear();
            super.l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        sp spVar = new sp(this, str, 0);
        this.f42039f = spVar;
        dispatchQueue.postRunnable(spVar, 300L);
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
    public final void v(s4.d1 d1Var, int i10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i10);
        String publicUsername = ChatObject.getPublicUsername(chat);
        CharSequence charSequence = (CharSequence) this.f42038e.get(i10);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
            if (charSequence.toString().startsWith("@" + publicUsername)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) d1Var.f47658a;
        b5Var.setTag(Integer.valueOf(i10));
        b5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(6, 2, this.f42037c, null, false);
        b5Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
        return new s4.d1(b5Var);
    }
}
