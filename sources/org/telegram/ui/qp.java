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
public final class qp extends org.telegram.ui.Components.rl0 {
    public final Context f40556c;
    public ArrayList d = new ArrayList();
    public ArrayList f40557e = new ArrayList();
    public pp f40558f;
    public final rp h;

    public qp(rp rpVar, Context context) {
        this.h = rpVar;
        this.f40556c = context;
    }

    public static void E(qp qpVar, ArrayList arrayList, ArrayList arrayList2) {
        rp rpVar = qpVar.h;
        if (!rpVar.K) {
            return;
        }
        qpVar.d = arrayList;
        qpVar.f40557e = arrayList2;
        if (rpVar.f40894b.getAdapter() == rpVar.f40896e) {
            rpVar.d.c();
        }
        super.l();
    }

    @Override
    public final void A(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f40558f != null) {
            Utilities.searchQueue.cancelRunnable(this.f40558f);
            this.f40558f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.f40557e.clear();
            super.l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        pp ppVar = new pp(this, str, 0);
        this.f40558f = ppVar;
        dispatchQueue.postRunnable(ppVar, 300L);
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
    public final void v(f2.m1 m1Var, int i10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i10);
        String publicUsername = ChatObject.getPublicUsername(chat);
        CharSequence charSequence = (CharSequence) this.f40557e.get(i10);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
            if (charSequence.toString().startsWith("@" + publicUsername)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) m1Var.f5875a;
        b5Var.setTag(Integer.valueOf(i10));
        b5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(6, 2, this.f40556c, null, false);
        b5Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
        return new f2.m1(b5Var);
    }
}
