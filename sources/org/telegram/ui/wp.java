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
public final class wp extends org.telegram.ui.Components.kl0 {
    public final Context f42446c;
    public ArrayList d = new ArrayList();
    public ArrayList f42447e = new ArrayList();
    public vp f42448f;
    public final xp h;

    public wp(xp xpVar, Context context) {
        this.h = xpVar;
        this.f42446c = context;
    }

    public static void E(wp wpVar, ArrayList arrayList, ArrayList arrayList2) {
        xp xpVar = wpVar.h;
        if (!xpVar.N) {
            return;
        }
        wpVar.d = arrayList;
        wpVar.f42447e = arrayList2;
        if (xpVar.f42849b.getAdapter() == xpVar.f42851e) {
            xpVar.d.c();
        }
        super.l();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f45739a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45743f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f42448f != null) {
            Utilities.searchQueue.cancelRunnable(this.f42448f);
            this.f42448f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.f42447e.clear();
            super.l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        vp vpVar = new vp(this, str, 0);
        this.f42448f = vpVar;
        dispatchQueue.postRunnable(vpVar, 300L);
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
        CharSequence charSequence = (CharSequence) this.f42447e.get(i10);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
            if (charSequence.toString().startsWith("@" + publicUsername)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) c1Var.f45739a;
        a5Var.setTag(Integer.valueOf(i10));
        a5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(6, 2, this.f42446c, null, false);
        a5Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20664d6, false));
        return new s4.c1(a5Var);
    }
}
