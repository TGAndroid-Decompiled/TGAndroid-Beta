package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uo extends org.telegram.ui.Components.bk0 {
    public final Context f52591c;
    public ArrayList d = new ArrayList();
    public ArrayList f52592e = new ArrayList();
    public to f52593f;
    public final vo h;

    public uo(vo voVar, Context context) {
        this.h = voVar;
        this.f52591c = context;
    }

    public static void E(uo uoVar, ArrayList arrayList, ArrayList arrayList2) {
        vo voVar = uoVar.h;
        if (!voVar.O) {
            return;
        }
        uoVar.d = arrayList;
        uoVar.f52592e = arrayList2;
        if (voVar.f52814b.getAdapter() == voVar.f52816e) {
            voVar.d.c();
        }
        super.f();
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59123a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59127f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f52593f != null) {
            Utilities.f22781g.a(this.f52593f);
            this.f52593f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.f52592e.clear();
            super.f();
            return;
        }
        org.telegram.messenger.q5 q5Var = Utilities.f22781g;
        to toVar = new to(this, str, 0);
        this.f52593f = toVar;
        q5Var.d(toVar, 300L);
    }

    @Override
    public final int b() {
        return this.d.size();
    }

    @Override
    public final int d(int i7) {
        return 0;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i7);
        String K = org.telegram.messenger.v3.K(chat, false);
        CharSequence charSequence = (CharSequence) this.f52592e.get(i7);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(K)) {
            if (charSequence.toString().startsWith("@" + K)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) f1Var.f59123a;
        b5Var.setTag(Integer.valueOf(i7));
        b5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(this.f52591c, 6, 2, false, null);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, b5Var, null);
        return new v4.f1(b5Var);
    }
}
