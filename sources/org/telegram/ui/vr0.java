package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vr0 implements View.OnClickListener {
    public final mf0 f52842a;
    public final bn f52843b;
    public final org.telegram.ui.Components.ck0 f52844c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.y60 f52845e;
    public final org.telegram.ui.Components.y60 f52846f;
    public final as0 h;

    public vr0(as0 as0Var, mf0 mf0Var, bn bnVar, org.telegram.ui.Components.ck0 ck0Var, LinearLayout linearLayout, org.telegram.ui.Components.y60 y60Var, org.telegram.ui.Components.y60 y60Var2) {
        this.h = as0Var;
        this.f52842a = mf0Var;
        this.f52843b = bnVar;
        this.f52844c = ck0Var;
        this.d = linearLayout;
        this.f52845e = y60Var;
        this.f52846f = y60Var2;
    }

    @Override
    public final void onClick(View view) {
        mf0 mf0Var = this.f52842a;
        ArrayList arrayList = mf0Var.f49849b;
        ArrayList arrayList2 = mf0Var.f49850c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            as0 as0Var = this.h;
            bn bnVar = this.f52843b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f28554id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f28405id);
                }
                bnVar.presentFragment(new ProfileActivity(bundle, null));
                as0Var.c(false);
                return;
            }
            if (org.telegram.messenger.bz.f23156c1 > 0 && bnVar.f46093m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.gc t6 = new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(as0Var.getContext()), as0Var.f45649b).t(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131748296, null)), null);
                bnVar.C1 = t6;
                t6.f35461j = 4000;
                t6.j();
                org.telegram.messenger.bz.S(org.telegram.messenger.bz.f23156c1 - 1);
            }
            org.telegram.ui.Components.ck0 ck0Var = this.f52844c;
            ck0Var.requestLayout();
            this.d.requestLayout();
            ck0Var.getAdapter().f();
            this.f52845e.L(this.f52846f);
        }
    }
}
