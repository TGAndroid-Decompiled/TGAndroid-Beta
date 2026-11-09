package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wr0 implements View.OnClickListener {
    public final lf0 f51452a;
    public final cn f51453b;
    public final org.telegram.ui.Components.qj0 f51454c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.l60 f51455e;
    public final org.telegram.ui.Components.l60 f51456f;
    public final bs0 h;

    public wr0(bs0 bs0Var, lf0 lf0Var, cn cnVar, org.telegram.ui.Components.qj0 qj0Var, LinearLayout linearLayout, org.telegram.ui.Components.l60 l60Var, org.telegram.ui.Components.l60 l60Var2) {
        this.h = bs0Var;
        this.f51452a = lf0Var;
        this.f51453b = cnVar;
        this.f51454c = qj0Var;
        this.d = linearLayout;
        this.f51455e = l60Var;
        this.f51456f = l60Var2;
    }

    @Override
    public final void onClick(View view) {
        lf0 lf0Var = this.f51452a;
        ArrayList arrayList = lf0Var.f47591b;
        ArrayList arrayList2 = lf0Var.f47592c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            bs0 bs0Var = this.h;
            cn cnVar = this.f51453b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f27105id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f26956id);
                }
                cnVar.presentFragment(new ProfileActivity(bundle, null));
                bs0Var.c(false);
                return;
            }
            if (org.telegram.messenger.iz.f23393c1 > 0 && cnVar.l1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.cc t6 = new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(bs0Var.getContext()), bs0Var.f44113b).t(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748488, null)), null);
                cnVar.B1 = t6;
                t6.f32627j = 4000;
                t6.j();
                org.telegram.messenger.iz.S(org.telegram.messenger.iz.f23393c1 - 1);
            }
            org.telegram.ui.Components.qj0 qj0Var = this.f51454c;
            qj0Var.requestLayout();
            this.d.requestLayout();
            qj0Var.getAdapter().f();
            this.f51455e.K(this.f51456f);
        }
    }
}
