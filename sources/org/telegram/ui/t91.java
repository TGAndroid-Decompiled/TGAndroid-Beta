package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t91 implements View.OnClickListener {
    public final rg0 f41774a;
    public final un f41775b;
    public final org.telegram.ui.Components.tk0 f41776c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.z60 e;
    public final org.telegram.ui.Components.z60 f41777f;
    public final x91 h;

    public t91(x91 x91Var, rg0 rg0Var, un unVar, org.telegram.ui.Components.tk0 tk0Var, LinearLayout linearLayout, org.telegram.ui.Components.z60 z60Var, org.telegram.ui.Components.z60 z60Var2) {
        this.h = x91Var;
        this.f41774a = rg0Var;
        this.f41775b = unVar;
        this.f41776c = tk0Var;
        this.d = linearLayout;
        this.e = z60Var;
        this.f41777f = z60Var2;
    }

    @Override
    public final void onClick(View view) {
        rg0 rg0Var = this.f41774a;
        ArrayList arrayList = rg0Var.f41222b;
        ArrayList arrayList2 = rg0Var.f41223c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            x91 x91Var = this.h;
            un unVar = this.f41775b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f19942id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19793id);
                }
                unVar.presentFragment(new ProfileActivity(bundle, null));
                x91Var.c(false);
                return;
            }
            if (org.telegram.messenger.tz.f18139c1 > 0 && unVar.l1.getKeyboardHeight() < org.telegram.messenger.i0.L(20.0f)) {
                org.telegram.ui.Components.wb t10 = new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(x91Var.getContext()), x91Var.f43508a).t(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131748503, null)), null);
                unVar.B1 = t10;
                t10.f32135j = 4000;
                t10.j();
                org.telegram.messenger.tz.S(org.telegram.messenger.tz.f18139c1 - 1);
            }
            org.telegram.ui.Components.tk0 tk0Var = this.f41776c;
            tk0Var.requestLayout();
            this.d.requestLayout();
            tk0Var.getAdapter().f();
            this.e.K(this.f41777f);
        }
    }
}
