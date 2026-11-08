package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class sh implements View.OnClickListener {
    public final jf0 f49752a;
    public final org.telegram.ui.Components.pj0 f49753b;
    public final LinearLayout f49754c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f49755e;
    public final an f49756f;

    public sh(an anVar, jf0 jf0Var, org.telegram.ui.Components.pj0 pj0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f49756f = anVar;
        this.f49752a = jf0Var;
        this.f49753b = pj0Var;
        this.f49754c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f49755e = iArr;
    }

    @Override
    public final void onClick(View view) {
        jf0 jf0Var = this.f49752a;
        ArrayList arrayList = jf0Var.f46948b;
        ArrayList arrayList2 = jf0Var.f46949c;
        an anVar = this.f49756f;
        if (anVar.f43787e9 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f27105id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f26956id);
                    }
                    anVar.presentFragment(new ProfileActivity(bundle, null));
                    anVar.O7(true);
                    return;
                }
                return;
            }
            if (org.telegram.messenger.iz.f23393c1 > 0 && anVar.l1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.cc t6 = new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(anVar.getParentActivity()), anVar.f44028xa).t(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748489, null)), null);
                anVar.B1 = t6;
                t6.f32545j = 4000;
                t6.j();
                org.telegram.messenger.iz.S(org.telegram.messenger.iz.f23393c1 - 1);
            }
            org.telegram.ui.Components.pj0 pj0Var = this.f49753b;
            pj0Var.requestLayout();
            this.f49754c.requestLayout();
            pj0Var.getAdapter().f();
            this.d.getSwipeBack().e(this.f49755e[0]);
        }
    }
}
