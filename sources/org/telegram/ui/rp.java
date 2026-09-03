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
public final class rp extends org.telegram.ui.Components.ql0 {
    public final Context f37936c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public qp f37937f;
    public final sp h;

    public rp(sp spVar, Context context) {
        this.h = spVar;
        this.f37936c = context;
    }

    public static void E(rp rpVar, ArrayList arrayList, ArrayList arrayList2) {
        sp spVar = rpVar.h;
        if (!spVar.K) {
            return;
        }
        rpVar.d = arrayList;
        rpVar.e = arrayList2;
        if (spVar.f38282b.getAdapter() == spVar.e) {
            spVar.d.c();
        }
        super.l();
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f37937f != null) {
            Utilities.searchQueue.cancelRunnable(this.f37937f);
            this.f37937f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.e.clear();
            super.l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        qp qpVar = new qp(this, str, 0);
        this.f37937f = qpVar;
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
    public final void v(f2.l1 l1Var, int i10) {
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
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) l1Var.f5774a;
        a5Var.setTag(Integer.valueOf(i10));
        a5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(6, 2, this.f37936c, null, false);
        a5Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
        return new f2.l1(a5Var);
    }
}
