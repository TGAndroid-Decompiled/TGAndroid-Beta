package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class sh implements View.OnClickListener {
    public final jf0 f49761a;
    public final org.telegram.ui.Components.pj0 f49762b;
    public final LinearLayout f49763c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f49764e;
    public final an f49765f;

    public sh(an anVar, jf0 jf0Var, org.telegram.ui.Components.pj0 pj0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f49765f = anVar;
        this.f49761a = jf0Var;
        this.f49762b = pj0Var;
        this.f49763c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f49764e = iArr;
    }

    @Override
    public final void onClick(View view) {
        jf0 jf0Var = this.f49761a;
        ArrayList arrayList = jf0Var.f46950b;
        ArrayList arrayList2 = jf0Var.f46951c;
        an anVar = this.f49765f;
        if (anVar.f43781e9 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f27102id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f26953id);
                    }
                    anVar.presentFragment(new ProfileActivity(bundle, null));
                    anVar.O7(true);
                    return;
                }
                return;
            }
            if (org.telegram.messenger.iz.f23372c1 > 0 && anVar.l1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.cc t6 = new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(anVar.getParentActivity()), anVar.f44022xa).t(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748487, null)), null);
                anVar.B1 = t6;
                t6.f32514j = 4000;
                t6.j();
                org.telegram.messenger.iz.S(org.telegram.messenger.iz.f23372c1 - 1);
            }
            org.telegram.ui.Components.pj0 pj0Var = this.f49762b;
            pj0Var.requestLayout();
            this.f49763c.requestLayout();
            pj0Var.getAdapter().f();
            this.d.getSwipeBack().e(this.f49764e[0]);
        }
    }
}
