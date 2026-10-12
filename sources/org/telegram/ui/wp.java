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
public final class wp extends org.telegram.ui.Components.vm0 {
    public final Context f43573c;
    public ArrayList d = new ArrayList();
    public ArrayList f43574e = new ArrayList();
    public vp f43575f;
    public final xp h;

    public wp(xp xpVar, Context context) {
        this.h = xpVar;
        this.f43573c = context;
    }

    public static void E(wp wpVar, ArrayList arrayList, ArrayList arrayList2) {
        xp xpVar = wpVar.h;
        if (!xpVar.N) {
            return;
        }
        wpVar.d = arrayList;
        wpVar.f43574e = arrayList2;
        if (xpVar.f44128b.getAdapter() == xpVar.f44130e) {
            xpVar.d.c();
        }
        super.l();
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47889a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47893f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f43575f != null) {
            Utilities.searchQueue.cancelRunnable(this.f43575f);
            this.f43575f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.f43574e.clear();
            super.l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        vp vpVar = new vp(this, str, 0);
        this.f43575f = vpVar;
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
    public final void v(s4.d1 d1Var, int i10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i10);
        String publicUsername = ChatObject.getPublicUsername(chat);
        CharSequence charSequence = (CharSequence) this.f43574e.get(i10);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
            if (charSequence.toString().startsWith("@" + publicUsername)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) d1Var.f47889a;
        b5Var.setTag(Integer.valueOf(i10));
        b5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(6, 2, this.f43573c, null, false);
        b5Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
        return new s4.d1(b5Var);
    }
}
