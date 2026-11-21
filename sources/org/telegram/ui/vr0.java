package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vr0 implements View.OnClickListener {
    public final mf0 f52874a;
    public final bn f52875b;
    public final org.telegram.ui.Components.ek0 f52876c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.a70 f52877e;
    public final org.telegram.ui.Components.a70 f52878f;
    public final as0 h;

    public vr0(as0 as0Var, mf0 mf0Var, bn bnVar, org.telegram.ui.Components.ek0 ek0Var, LinearLayout linearLayout, org.telegram.ui.Components.a70 a70Var, org.telegram.ui.Components.a70 a70Var2) {
        this.h = as0Var;
        this.f52874a = mf0Var;
        this.f52875b = bnVar;
        this.f52876c = ek0Var;
        this.d = linearLayout;
        this.f52877e = a70Var;
        this.f52878f = a70Var2;
    }

    @Override
    public final void onClick(View view) {
        mf0 mf0Var = this.f52874a;
        ArrayList arrayList = mf0Var.f49867b;
        ArrayList arrayList2 = mf0Var.f49868c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            as0 as0Var = this.h;
            bn bnVar = this.f52875b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f28580id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f28431id);
                }
                bnVar.presentFragment(new ProfileActivity(bundle, null));
                as0Var.c(false);
                return;
            }
            if (org.telegram.messenger.bz.f23181c1 > 0 && bnVar.f46107m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.gc t6 = new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(as0Var.getContext()), as0Var.f45675b).t(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131748295, null)), null);
                bnVar.C1 = t6;
                t6.f35508j = 4000;
                t6.j();
                org.telegram.messenger.bz.S(org.telegram.messenger.bz.f23181c1 - 1);
            }
            org.telegram.ui.Components.ek0 ek0Var = this.f52876c;
            ek0Var.requestLayout();
            this.d.requestLayout();
            ek0Var.getAdapter().f();
            this.f52877e.L(this.f52878f);
        }
    }
}
