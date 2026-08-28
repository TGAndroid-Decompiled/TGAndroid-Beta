package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class zh implements View.OnClickListener {
    public final ph0 f45156a;
    public final org.telegram.ui.Components.wk0 f45157b;
    public final LinearLayout f45158c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f45159e;
    public final qn f45160f;

    public zh(qn qnVar, ph0 ph0Var, org.telegram.ui.Components.wk0 wk0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f45160f = qnVar;
        this.f45156a = ph0Var;
        this.f45157b = wk0Var;
        this.f45158c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f45159e = iArr;
    }

    @Override
    public final void onClick(View view) {
        ph0 ph0Var = this.f45156a;
        ArrayList arrayList = ph0Var.f41525b;
        ArrayList arrayList2 = ph0Var.f41526c;
        qn qnVar = this.f45160f;
        if (qnVar.M8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f22527id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f22380id);
                    }
                    qnVar.presentFragment(new ProfileActivity(bundle, null));
                    qnVar.A7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && qnVar.T0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.gc t10 = new org.telegram.ui.Components.oc(org.telegram.ui.Components.cb.a(qnVar.getParentActivity()), qnVar.f41848aa).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                qnVar.f41955j1 = t10;
                t10.f28737j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.wk0 wk0Var = this.f45157b;
            wk0Var.requestLayout();
            this.f45158c.requestLayout();
            wk0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.f45159e[0]);
        }
    }
}
