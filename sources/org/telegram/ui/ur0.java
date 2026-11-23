package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ur0 implements View.OnClickListener {
    public final lf0 f52713a;
    public final bn f52714b;
    public final org.telegram.ui.Components.ek0 f52715c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.x60 f52716e;
    public final org.telegram.ui.Components.x60 f52717f;
    public final zr0 h;

    public ur0(zr0 zr0Var, lf0 lf0Var, bn bnVar, org.telegram.ui.Components.ek0 ek0Var, LinearLayout linearLayout, org.telegram.ui.Components.x60 x60Var, org.telegram.ui.Components.x60 x60Var2) {
        this.h = zr0Var;
        this.f52713a = lf0Var;
        this.f52714b = bnVar;
        this.f52715c = ek0Var;
        this.d = linearLayout;
        this.f52716e = x60Var;
        this.f52717f = x60Var2;
    }

    @Override
    public final void onClick(View view) {
        lf0 lf0Var = this.f52713a;
        ArrayList arrayList = lf0Var.f49745b;
        ArrayList arrayList2 = lf0Var.f49746c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            zr0 zr0Var = this.h;
            bn bnVar = this.f52714b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f28641id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f28492id);
                }
                bnVar.presentFragment(new ProfileActivity(bundle, null));
                zr0Var.c(false);
                return;
            }
            if (org.telegram.messenger.bz.f23278c1 > 0 && bnVar.f46279m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.fc t6 = new org.telegram.ui.Components.kc(org.telegram.ui.Components.bb.a(zr0Var.getContext()), zr0Var.f54695b).t(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131748295, null)), null);
                bnVar.C1 = t6;
                t6.f35091j = 4000;
                t6.j();
                org.telegram.messenger.bz.S(org.telegram.messenger.bz.f23278c1 - 1);
            }
            org.telegram.ui.Components.ek0 ek0Var = this.f52715c;
            ek0Var.requestLayout();
            this.d.requestLayout();
            ek0Var.getAdapter().f();
            this.f52716e.L(this.f52717f);
        }
    }
}
