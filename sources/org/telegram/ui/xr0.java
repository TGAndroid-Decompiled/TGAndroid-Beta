package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xr0 implements View.OnClickListener {
    public final mf0 f51793a;
    public final cn f51794b;
    public final org.telegram.ui.Components.pj0 f51795c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.k60 f51796e;
    public final org.telegram.ui.Components.k60 f51797f;
    public final cs0 h;

    public xr0(cs0 cs0Var, mf0 mf0Var, cn cnVar, org.telegram.ui.Components.pj0 pj0Var, LinearLayout linearLayout, org.telegram.ui.Components.k60 k60Var, org.telegram.ui.Components.k60 k60Var2) {
        this.h = cs0Var;
        this.f51793a = mf0Var;
        this.f51794b = cnVar;
        this.f51795c = pj0Var;
        this.d = linearLayout;
        this.f51796e = k60Var;
        this.f51797f = k60Var2;
    }

    @Override
    public final void onClick(View view) {
        mf0 mf0Var = this.f51793a;
        ArrayList arrayList = mf0Var.f47942b;
        ArrayList arrayList2 = mf0Var.f47943c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            cs0 cs0Var = this.h;
            cn cnVar = this.f51794b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f27109id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f26960id);
                }
                cnVar.presentFragment(new ProfileActivity(bundle, null));
                cs0Var.c(false);
                return;
            }
            if (org.telegram.messenger.iz.f23397c1 > 0 && cnVar.l1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.bc t6 = new org.telegram.ui.Components.gc(org.telegram.ui.Components.wa.a(cs0Var.getContext()), cs0Var.f44785b).t(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748488, null)), null);
                cnVar.B1 = t6;
                t6.f32203j = 4000;
                t6.j();
                org.telegram.messenger.iz.S(org.telegram.messenger.iz.f23397c1 - 1);
            }
            org.telegram.ui.Components.pj0 pj0Var = this.f51795c;
            pj0Var.requestLayout();
            this.d.requestLayout();
            pj0Var.getAdapter().f();
            this.f51796e.K(this.f51797f);
        }
    }
}
