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
public final class xp extends org.telegram.ui.Components.ul0 {
    public final Context f38787c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public wp f38788f;
    public final yp h;

    public xp(yp ypVar, Context context) {
        this.h = ypVar;
        this.f38787c = context;
    }

    public static void E(xp xpVar, ArrayList arrayList, ArrayList arrayList2) {
        yp ypVar = xpVar.h;
        if (!ypVar.N) {
            return;
        }
        xpVar.d = arrayList;
        xpVar.e = arrayList2;
        if (ypVar.f39077b.getAdapter() == ypVar.e) {
            ypVar.d.c();
        }
        super.l();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f41610a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f38788f != null) {
            Utilities.searchQueue.cancelRunnable(this.f38788f);
            this.f38788f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.e.clear();
            super.l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        wp wpVar = new wp(this, str, 0);
        this.f38788f = wpVar;
        dispatchQueue.postRunnable(wpVar, 300L);
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
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) c1Var.f41610a;
        b5Var.setTag(Integer.valueOf(i10));
        b5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(6, 2, this.f38787c, null, false);
        b5Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
        return new s4.c1(b5Var);
    }
}
