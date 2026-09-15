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
public final class vp extends org.telegram.ui.Components.kl0 {
    public final Context f38661c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public up f38662f;
    public final wp h;

    public vp(wp wpVar, Context context) {
        this.h = wpVar;
        this.f38661c = context;
    }

    public static void E(vp vpVar, ArrayList arrayList, ArrayList arrayList2) {
        wp wpVar = vpVar.h;
        if (!wpVar.N) {
            return;
        }
        vpVar.d = arrayList;
        vpVar.e = arrayList2;
        if (wpVar.f39348b.getAdapter() == wpVar.e) {
            wpVar.d.c();
        }
        super.l();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42675a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42678f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f38662f != null) {
            Utilities.searchQueue.cancelRunnable(this.f38662f);
            this.f38662f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.e.clear();
            super.l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        up upVar = new up(this, str, 0);
        this.f38662f = upVar;
        dispatchQueue.postRunnable(upVar, 300L);
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
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) c1Var.f42675a;
        a5Var.setTag(Integer.valueOf(i10));
        a5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(6, 2, this.f38661c, null, false);
        a5Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false));
        return new s4.c1(a5Var);
    }
}
