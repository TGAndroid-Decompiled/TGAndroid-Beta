package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sr0 implements View.OnClickListener {
    public final jf0 f51263a;
    public final an f51264b;
    public final org.telegram.ui.Components.uj0 f51265c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.m60 f51266e;
    public final org.telegram.ui.Components.m60 f51267f;
    public final xr0 h;

    public sr0(xr0 xr0Var, jf0 jf0Var, an anVar, org.telegram.ui.Components.uj0 uj0Var, LinearLayout linearLayout, org.telegram.ui.Components.m60 m60Var, org.telegram.ui.Components.m60 m60Var2) {
        this.h = xr0Var;
        this.f51263a = jf0Var;
        this.f51264b = anVar;
        this.f51265c = uj0Var;
        this.d = linearLayout;
        this.f51266e = m60Var;
        this.f51267f = m60Var2;
    }

    @Override
    public final void onClick(View view) {
        jf0 jf0Var = this.f51263a;
        ArrayList arrayList = jf0Var.f48321b;
        ArrayList arrayList2 = jf0Var.f48322c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            xr0 xr0Var = this.h;
            an anVar = this.f51264b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f28200id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f28051id);
                }
                anVar.presentFragment(new ProfileActivity(bundle, null));
                xr0Var.c(false);
                return;
            }
            if (org.telegram.messenger.gz.f23937c1 > 0 && anVar.f45278m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.xb t6 = new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(xr0Var.getContext()), xr0Var.f53290b).t(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748488, null)), null);
                anVar.C1 = t6;
                t6.f41643j = 4000;
                t6.j();
                org.telegram.messenger.gz.S(org.telegram.messenger.gz.f23937c1 - 1);
            }
            org.telegram.ui.Components.uj0 uj0Var = this.f51265c;
            uj0Var.requestLayout();
            this.d.requestLayout();
            uj0Var.getAdapter().f();
            this.f51266e.K(this.f51267f);
        }
    }
}
