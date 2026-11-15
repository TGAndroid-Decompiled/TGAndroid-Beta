package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class sh implements View.OnClickListener {
    public final jf0 f51216a;
    public final org.telegram.ui.Components.uj0 f51217b;
    public final LinearLayout f51218c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f51219e;
    public final an f51220f;

    public sh(an anVar, jf0 jf0Var, org.telegram.ui.Components.uj0 uj0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f51220f = anVar;
        this.f51216a = jf0Var;
        this.f51217b = uj0Var;
        this.f51218c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f51219e = iArr;
    }

    @Override
    public final void onClick(View view) {
        jf0 jf0Var = this.f51216a;
        ArrayList arrayList = jf0Var.f48321b;
        ArrayList arrayList2 = jf0Var.f48322c;
        an anVar = this.f51220f;
        if (anVar.f45197f9 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f28200id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f28051id);
                    }
                    anVar.presentFragment(new ProfileActivity(bundle, null));
                    anVar.P7(true);
                    return;
                }
                return;
            }
            if (org.telegram.messenger.gz.f23937c1 > 0 && anVar.f45278m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.xb t6 = new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(anVar.getParentActivity()), anVar.Aa).t(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748488, null)), null);
                anVar.C1 = t6;
                t6.f41643j = 4000;
                t6.j();
                org.telegram.messenger.gz.S(org.telegram.messenger.gz.f23937c1 - 1);
            }
            org.telegram.ui.Components.uj0 uj0Var = this.f51217b;
            uj0Var.requestLayout();
            this.f51218c.requestLayout();
            uj0Var.getAdapter().f();
            this.d.getSwipeBack().e(this.f51219e[0]);
        }
    }
}
