package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ur0 implements View.OnClickListener {
    public final jf0 f50474a;
    public final an f50475b;
    public final org.telegram.ui.Components.pj0 f50476c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.k60 f50477e;
    public final org.telegram.ui.Components.k60 f50478f;
    public final zr0 h;

    public ur0(zr0 zr0Var, jf0 jf0Var, an anVar, org.telegram.ui.Components.pj0 pj0Var, LinearLayout linearLayout, org.telegram.ui.Components.k60 k60Var, org.telegram.ui.Components.k60 k60Var2) {
        this.h = zr0Var;
        this.f50474a = jf0Var;
        this.f50475b = anVar;
        this.f50476c = pj0Var;
        this.d = linearLayout;
        this.f50477e = k60Var;
        this.f50478f = k60Var2;
    }

    @Override
    public final void onClick(View view) {
        jf0 jf0Var = this.f50474a;
        ArrayList arrayList = jf0Var.f46951b;
        ArrayList arrayList2 = jf0Var.f46952c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            zr0 zr0Var = this.h;
            an anVar = this.f50475b;
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
                zr0Var.c(false);
                return;
            }
            if (org.telegram.messenger.iz.f23365c1 > 0 && anVar.l1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.cc t6 = new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(zr0Var.getContext()), zr0Var.f52652b).t(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748487, null)), null);
                anVar.B1 = t6;
                t6.f32527j = 4000;
                t6.j();
                org.telegram.messenger.iz.S(org.telegram.messenger.iz.f23365c1 - 1);
            }
            org.telegram.ui.Components.pj0 pj0Var = this.f50476c;
            pj0Var.requestLayout();
            this.d.requestLayout();
            pj0Var.getAdapter().f();
            this.f50477e.K(this.f50478f);
        }
    }
}
