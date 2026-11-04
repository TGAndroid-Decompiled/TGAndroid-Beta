package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s71 implements View.OnClickListener {
    public final df0 f49411a;
    public final wm f49412b;
    public final org.telegram.ui.Components.tj0 f49413c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.f60 f49414e;
    public final org.telegram.ui.Components.f60 f49415f;
    public final w71 h;

    public s71(w71 w71Var, df0 df0Var, wm wmVar, org.telegram.ui.Components.tj0 tj0Var, LinearLayout linearLayout, org.telegram.ui.Components.f60 f60Var, org.telegram.ui.Components.f60 f60Var2) {
        this.h = w71Var;
        this.f49411a = df0Var;
        this.f49412b = wmVar;
        this.f49413c = tj0Var;
        this.d = linearLayout;
        this.f49414e = f60Var;
        this.f49415f = f60Var2;
    }

    @Override
    public final void onClick(View view) {
        df0 df0Var = this.f49411a;
        ArrayList arrayList = df0Var.f44676b;
        ArrayList arrayList2 = df0Var.f44677c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            w71 w71Var = this.h;
            wm wmVar = this.f49412b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f27150id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f27001id);
                }
                wmVar.presentFragment(new ProfileActivity(bundle, null));
                w71Var.c(false);
                return;
            }
            if (org.telegram.messenger.az.f21620c1 > 0 && wmVar.m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.ac t10 = new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(w71Var.getContext()), w71Var.f50731a).t(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131748496, null)), null);
                wmVar.C1 = t10;
                t10.f31792j = 4000;
                t10.j();
                org.telegram.messenger.az.S(org.telegram.messenger.az.f21620c1 - 1);
            }
            org.telegram.ui.Components.tj0 tj0Var = this.f49413c;
            tj0Var.requestLayout();
            this.d.requestLayout();
            tj0Var.getAdapter().f();
            this.f49414e.K(this.f49415f);
        }
    }
}
