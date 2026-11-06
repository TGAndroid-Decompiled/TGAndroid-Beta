package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tr0 implements View.OnClickListener {
    public final jf0 f50099a;
    public final an f50100b;
    public final org.telegram.ui.Components.pj0 f50101c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.k60 f50102e;
    public final org.telegram.ui.Components.k60 f50103f;
    public final yr0 h;

    public tr0(yr0 yr0Var, jf0 jf0Var, an anVar, org.telegram.ui.Components.pj0 pj0Var, LinearLayout linearLayout, org.telegram.ui.Components.k60 k60Var, org.telegram.ui.Components.k60 k60Var2) {
        this.h = yr0Var;
        this.f50099a = jf0Var;
        this.f50100b = anVar;
        this.f50101c = pj0Var;
        this.d = linearLayout;
        this.f50102e = k60Var;
        this.f50103f = k60Var2;
    }

    @Override
    public final void onClick(View view) {
        jf0 jf0Var = this.f50099a;
        ArrayList arrayList = jf0Var.f46927b;
        ArrayList arrayList2 = jf0Var.f46928c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            yr0 yr0Var = this.h;
            an anVar = this.f50100b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f27101id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f26952id);
                }
                anVar.presentFragment(new ProfileActivity(bundle, null));
                yr0Var.c(false);
                return;
            }
            if (org.telegram.messenger.iz.f23365c1 > 0 && anVar.l1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.cc t6 = new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(yr0Var.getContext()), yr0Var.f52299b).t(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748487, null)), null);
                anVar.B1 = t6;
                t6.f32523j = 4000;
                t6.j();
                org.telegram.messenger.iz.S(org.telegram.messenger.iz.f23365c1 - 1);
            }
            org.telegram.ui.Components.pj0 pj0Var = this.f50101c;
            pj0Var.requestLayout();
            this.d.requestLayout();
            pj0Var.getAdapter().f();
            this.f50102e.K(this.f50103f);
        }
    }
}
