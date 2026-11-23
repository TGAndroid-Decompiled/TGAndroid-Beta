package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vr0 implements View.OnClickListener {
    public final mf0 f52878a;
    public final bn f52879b;
    public final org.telegram.ui.Components.ek0 f52880c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.a70 f52881e;
    public final org.telegram.ui.Components.a70 f52882f;
    public final as0 h;

    public vr0(as0 as0Var, mf0 mf0Var, bn bnVar, org.telegram.ui.Components.ek0 ek0Var, LinearLayout linearLayout, org.telegram.ui.Components.a70 a70Var, org.telegram.ui.Components.a70 a70Var2) {
        this.h = as0Var;
        this.f52878a = mf0Var;
        this.f52879b = bnVar;
        this.f52880c = ek0Var;
        this.d = linearLayout;
        this.f52881e = a70Var;
        this.f52882f = a70Var2;
    }

    @Override
    public final void onClick(View view) {
        mf0 mf0Var = this.f52878a;
        ArrayList arrayList = mf0Var.f49871b;
        ArrayList arrayList2 = mf0Var.f49872c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            as0 as0Var = this.h;
            bn bnVar = this.f52879b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f28583id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f28434id);
                }
                bnVar.presentFragment(new ProfileActivity(bundle, null));
                as0Var.c(false);
                return;
            }
            if (org.telegram.messenger.cz.f23398c1 > 0 && bnVar.f46111m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.gc t6 = new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(as0Var.getContext()), as0Var.f45679b).t(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131748295, null)), null);
                bnVar.C1 = t6;
                t6.f35527j = 4000;
                t6.j();
                org.telegram.messenger.cz.S(org.telegram.messenger.cz.f23398c1 - 1);
            }
            org.telegram.ui.Components.ek0 ek0Var = this.f52880c;
            ek0Var.requestLayout();
            this.d.requestLayout();
            ek0Var.getAdapter().f();
            this.f52881e.L(this.f52882f);
        }
    }
}
