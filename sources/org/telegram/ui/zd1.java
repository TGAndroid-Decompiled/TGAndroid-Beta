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
public final class zd1 implements View.OnClickListener {
    public final di0 f43752a;
    public final yn f43753b;
    public final org.telegram.ui.Components.zl0 f43754c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.b80 f43755e;
    public final org.telegram.ui.Components.b80 f43756f;
    public final ee1 h;

    public zd1(ee1 ee1Var, di0 di0Var, yn ynVar, org.telegram.ui.Components.zl0 zl0Var, LinearLayout linearLayout, org.telegram.ui.Components.b80 b80Var, org.telegram.ui.Components.b80 b80Var2) {
        this.h = ee1Var;
        this.f43752a = di0Var;
        this.f43753b = ynVar;
        this.f43754c = zl0Var;
        this.d = linearLayout;
        this.f43755e = b80Var;
        this.f43756f = b80Var2;
    }

    @Override
    public final void onClick(View view) {
        di0 di0Var = this.f43752a;
        ArrayList arrayList = di0Var.f35825b;
        ArrayList arrayList2 = di0Var.f35826c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            ee1 ee1Var = this.h;
            yn ynVar = this.f43753b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f20194id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20047id);
                }
                ynVar.presentFragment(new ProfileActivity(bundle, null));
                ee1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && ynVar.V0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.rc t10 = new org.telegram.ui.Components.yc(org.telegram.ui.Components.mb.a(ee1Var.getContext()), ee1Var.f36024a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                ynVar.l1 = t10;
                t10.f30427j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.zl0 zl0Var = this.f43754c;
            zl0Var.requestLayout();
            this.d.requestLayout();
            zl0Var.getAdapter().l();
            this.f43755e.K(this.f43756f);
        }
    }
}
