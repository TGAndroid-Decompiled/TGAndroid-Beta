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

    public final rh0 f44771a;

    public final rn f44772b;

    public final org.telegram.ui.Components.zk0 f44773c;
    public final LinearLayout d;

    public final org.telegram.ui.Components.b70 f44774e;

    public final org.telegram.ui.Components.b70 f44775f;
    public final dd1 h;

    public yc1(dd1 dd1Var, rh0 rh0Var, rn rnVar, org.telegram.ui.Components.zk0 zk0Var, LinearLayout linearLayout, org.telegram.ui.Components.b70 b70Var, org.telegram.ui.Components.b70 b70Var2) {
        this.h = dd1Var;
        this.f44771a = rh0Var;
        this.f44772b = rnVar;
        this.f44773c = zk0Var;
        this.d = linearLayout;
        this.f44774e = b70Var;
        this.f44775f = b70Var2;
    }

    @Override
    public final void onClick(View view) {
        rh0 rh0Var = this.f44771a;
        ArrayList arrayList = rh0Var.f41934b;
        ArrayList arrayList2 = rh0Var.f41935c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        dd1 dd1Var = this.h;
        rn rnVar = this.f44772b;
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
            rnVar.presentFragment(new ProfileActivity(bundle, null));
            dd1Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && rnVar.T0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.ec ecVarT = new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(dd1Var.getContext()), dd1Var.f37363a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            rnVar.f42091j1 = ecVarT;
            ecVarT.f28020j = 4000;
            ecVarT.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.zk0 zk0Var = this.f44773c;
        zk0Var.requestLayout();
        this.d.requestLayout();
        zk0Var.getAdapter().l();
        this.f44774e.K(this.f44775f);
    }
}
