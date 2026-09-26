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
public final class qp extends org.telegram.ui.Components.wl0 {
    public final Context f36956c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public pp f36957f;
    public final rp h;

    public qp(rp rpVar, Context context) {
        this.h = rpVar;
        this.f36956c = context;
    }

    public static void E(qp qpVar, ArrayList arrayList, ArrayList arrayList2) {
        rp rpVar = qpVar.h;
        if (!rpVar.N) {
            return;
        }
        qpVar.d = arrayList;
        qpVar.e = arrayList2;
        if (rpVar.f37426b.getAdapter() == rpVar.e) {
            rpVar.d.c();
        }
        super.l();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42959a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42962f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f36957f != null) {
            Utilities.searchQueue.cancelRunnable(this.f36957f);
            this.f36957f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.e.clear();
            super.l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        pp ppVar = new pp(this, str, 0);
        this.f36957f = ppVar;
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
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i10);
        String publicUsername = ChatObject.getPublicUsername(chat);
        CharSequence charSequence = (CharSequence) this.e.get(i10);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
            if (charSequence.toString().startsWith("@" + publicUsername)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) c1Var.f42959a;
        b5Var.setTag(Integer.valueOf(i10));
        b5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(6, 2, this.f36956c, null, false);
        b5Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false));
        return new s4.c1(b5Var);
    }
}
