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
public final class yd1 implements View.OnClickListener {
    public final zh0 f40127a;
    public final wn f40128b;
    public final org.telegram.ui.Components.wl0 f40129c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.y70 e;
    public final org.telegram.ui.Components.y70 f40130f;
    public final de1 h;

    public yd1(de1 de1Var, zh0 zh0Var, wn wnVar, org.telegram.ui.Components.wl0 wl0Var, LinearLayout linearLayout, org.telegram.ui.Components.y70 y70Var, org.telegram.ui.Components.y70 y70Var2) {
        this.h = de1Var;
        this.f40127a = zh0Var;
        this.f40128b = wnVar;
        this.f40129c = wl0Var;
        this.d = linearLayout;
        this.e = y70Var;
        this.f40130f = y70Var2;
    }

    @Override
    public final void onClick(View view) {
        zh0 zh0Var = this.f40127a;
        ArrayList arrayList = zh0Var.f40494b;
        ArrayList arrayList2 = zh0Var.f40495c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            de1 de1Var = this.h;
            wn wnVar = this.f40128b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f18482id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f18335id);
                }
                wnVar.presentFragment(new ProfileActivity(bundle, null));
                de1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && wnVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(de1Var.getContext()), de1Var.f33089a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                wnVar.f39570n1 = t10;
                t10.f27577j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.wl0 wl0Var = this.f40129c;
            wl0Var.requestLayout();
            this.d.requestLayout();
            wl0Var.getAdapter().l();
            this.e.K(this.f40130f);
        }
    }
}
