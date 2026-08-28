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
public final class yc1 implements View.OnClickListener {
    public final ph0 f44821a;
    public final qn f44822b;
    public final org.telegram.ui.Components.wk0 f44823c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.x60 f44824e;
    public final org.telegram.ui.Components.x60 f44825f;
    public final dd1 h;

    public yc1(dd1 dd1Var, ph0 ph0Var, qn qnVar, org.telegram.ui.Components.wk0 wk0Var, LinearLayout linearLayout, org.telegram.ui.Components.x60 x60Var, org.telegram.ui.Components.x60 x60Var2) {
        this.h = dd1Var;
        this.f44821a = ph0Var;
        this.f44822b = qnVar;
        this.f44823c = wk0Var;
        this.d = linearLayout;
        this.f44824e = x60Var;
        this.f44825f = x60Var2;
    }

    @Override
    public final void onClick(View view) {
        ph0 ph0Var = this.f44821a;
        ArrayList arrayList = ph0Var.f41525b;
        ArrayList arrayList2 = ph0Var.f41526c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            dd1 dd1Var = this.h;
            qn qnVar = this.f44822b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f22527id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f22380id);
                }
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                dd1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && qnVar.T0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.gc t10 = new org.telegram.ui.Components.oc(org.telegram.ui.Components.cb.a(dd1Var.getContext()), dd1Var.f37503a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                qnVar.f41955j1 = t10;
                t10.f28737j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.wk0 wk0Var = this.f44823c;
            wk0Var.requestLayout();
            this.d.requestLayout();
            wk0Var.getAdapter().l();
            this.f44824e.K(this.f44825f);
        }
    }
}
