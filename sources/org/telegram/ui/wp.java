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
    public final Context f43578c;
    public ArrayList d = new ArrayList();
    public ArrayList f43579e = new ArrayList();
    public vp f43580f;
    public final xp h;

    public wp(xp xpVar, Context context) {
        this.h = xpVar;
        this.f43578c = context;
    }

    public static void E(wp wpVar, ArrayList arrayList, ArrayList arrayList2) {
        xp xpVar = wpVar.h;
        if (!xpVar.N) {
            return;
        }
        wpVar.d = arrayList;
        wpVar.f43579e = arrayList2;
        if (xpVar.f44133b.getAdapter() == xpVar.f44135e) {
            xpVar.d.c();
        }
        super.l();
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47897a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47901f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f43580f != null) {
            Utilities.searchQueue.cancelRunnable(this.f43580f);
            this.f43580f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.f43579e.clear();
            super.l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        vp vpVar = new vp(this, str, 0);
        this.f43580f = vpVar;
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
        CharSequence charSequence = (CharSequence) this.f43579e.get(i10);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
            if (charSequence.toString().startsWith("@" + publicUsername)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) d1Var.f47897a;
        b5Var.setTag(Integer.valueOf(i10));
        b5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(6, 2, this.f43578c, null, false);
        b5Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false));
        return new s4.d1(b5Var);
    }
}
