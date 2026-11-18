package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vr0 implements View.OnClickListener {
    public final nf0 f52832a;
    public final bn f52833b;
    public final org.telegram.ui.Components.ck0 f52834c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.y60 f52835e;
    public final org.telegram.ui.Components.y60 f52836f;
    public final as0 h;

    public vr0(as0 as0Var, nf0 nf0Var, bn bnVar, org.telegram.ui.Components.ck0 ck0Var, LinearLayout linearLayout, org.telegram.ui.Components.y60 y60Var, org.telegram.ui.Components.y60 y60Var2) {
        this.h = as0Var;
        this.f52832a = nf0Var;
        this.f52833b = bnVar;
        this.f52834c = ck0Var;
        this.d = linearLayout;
        this.f52835e = y60Var;
        this.f52836f = y60Var2;
    }

    @Override
    public final void onClick(View view) {
        nf0 nf0Var = this.f52832a;
        ArrayList arrayList = nf0Var.f50159b;
        ArrayList arrayList2 = nf0Var.f50160c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            as0 as0Var = this.h;
            bn bnVar = this.f52833b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f28552id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f28403id);
                }
                bnVar.presentFragment(new ProfileActivity(bundle, null));
                as0Var.c(false);
                return;
            }
            if (org.telegram.messenger.bz.f23153c1 > 0 && bnVar.f46084m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.gc t6 = new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(as0Var.getContext()), as0Var.f45639b).t(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131748296, null)), null);
                bnVar.C1 = t6;
                t6.f35461j = 4000;
                t6.j();
                org.telegram.messenger.bz.S(org.telegram.messenger.bz.f23153c1 - 1);
            }
            org.telegram.ui.Components.ck0 ck0Var = this.f52834c;
            ck0Var.requestLayout();
            this.d.requestLayout();
            ck0Var.getAdapter().f();
            this.f52835e.L(this.f52836f);
        }
    }
}
