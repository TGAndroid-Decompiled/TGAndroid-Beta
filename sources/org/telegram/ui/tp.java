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
public final class tp extends org.telegram.ui.Components.ul0 {
    public final Context f37861c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public sp f37862f;
    public final up h;

    public tp(up upVar, Context context) {
        this.h = upVar;
        this.f37861c = context;
    }

    public static void E(tp tpVar, ArrayList arrayList, ArrayList arrayList2) {
        up upVar = tpVar.h;
        if (!upVar.N) {
            return;
        }
        tpVar.d = arrayList;
        tpVar.e = arrayList2;
        if (upVar.f38180b.getAdapter() == upVar.e) {
            upVar.d.c();
        }
        super.l();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42974a;
        if (view instanceof org.telegram.ui.Cells.c5) {
            ((org.telegram.ui.Cells.c5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42977f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f37862f != null) {
            Utilities.searchQueue.cancelRunnable(this.f37862f);
            this.f37862f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.e.clear();
            super.l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        sp spVar = new sp(this, str, 0);
        this.f37862f = spVar;
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
        org.telegram.ui.Cells.c5 c5Var = (org.telegram.ui.Cells.c5) c1Var.f42974a;
        c5Var.setTag(Integer.valueOf(i10));
        c5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.c5 c5Var = new org.telegram.ui.Cells.c5(6, 2, this.f37861c, null, false);
        c5Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
        return new s4.c1(c5Var);
    }
}
