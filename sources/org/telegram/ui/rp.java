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
public final class rp extends org.telegram.ui.Components.ll0 {
    public final Context f36904c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public qp f36905f;
    public final sp h;

    public rp(sp spVar, Context context) {
        this.h = spVar;
        this.f36904c = context;
    }

    public static void E(rp rpVar, ArrayList arrayList, ArrayList arrayList2) {
        sp spVar = rpVar.h;
        if (!spVar.N) {
            return;
        }
        rpVar.d = arrayList;
        rpVar.e = arrayList2;
        if (spVar.f37381b.getAdapter() == spVar.e) {
            spVar.d.c();
        }
        super.l();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42627a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42630f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f36905f != null) {
            Utilities.searchQueue.cancelRunnable(this.f36905f);
            this.f36905f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.e.clear();
            super.l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        qp qpVar = new qp(this, str, 0);
        this.f36905f = qpVar;
        dispatchQueue.postRunnable(qpVar, 300L);
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
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) c1Var.f42627a;
        b5Var.setTag(Integer.valueOf(i10));
        b5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(6, 2, this.f36904c, null, false);
        b5Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
        return new s4.c1(b5Var);
    }
}
