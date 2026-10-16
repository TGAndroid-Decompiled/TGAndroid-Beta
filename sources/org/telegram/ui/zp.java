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
public final class zp extends org.telegram.ui.Components.lm0 {
    public final Context f42398c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public yp f42399f;
    public final aq h;

    public zp(aq aqVar, Context context) {
        this.h = aqVar;
        this.f42398c = context;
    }

    public static void E(zp zpVar, ArrayList arrayList, ArrayList arrayList2) {
        aq aqVar = zpVar.h;
        if (!aqVar.N) {
            return;
        }
        zpVar.d = arrayList;
        zpVar.e = arrayList2;
        if (aqVar.f34049b.getAdapter() == aqVar.e) {
            aqVar.d.c();
        }
        super.l();
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f44838a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f42399f != null) {
            Utilities.searchQueue.cancelRunnable(this.f42399f);
            this.f42399f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.e.clear();
            super.l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        yp ypVar = new yp(this, str, 0);
        this.f42399f = ypVar;
        dispatchQueue.postRunnable(ypVar, 300L);
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
    public final void v(s4.b1 b1Var, int i10) {
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
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) b1Var.f44838a;
        b5Var.setTag(Integer.valueOf(i10));
        b5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(6, 2, this.f42398c, null, false);
        b5Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
        return new s4.b1(b5Var);
    }
}
