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
public final class vc1 implements View.OnClickListener {
    public final rh0 f42151a;
    public final sn f42152b;
    public final org.telegram.ui.Components.im0 f42153c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.i80 e;
    public final org.telegram.ui.Components.i80 f42154f;
    public final ad1 h;

    public vc1(ad1 ad1Var, rh0 rh0Var, sn snVar, org.telegram.ui.Components.im0 im0Var, LinearLayout linearLayout, org.telegram.ui.Components.i80 i80Var, org.telegram.ui.Components.i80 i80Var2) {
        this.h = ad1Var;
        this.f42151a = rh0Var;
        this.f42152b = snVar;
        this.f42153c = im0Var;
        this.d = linearLayout;
        this.e = i80Var;
        this.f42154f = i80Var2;
    }

    @Override
    public final void onClick(View view) {
        rh0 rh0Var = this.f42151a;
        ArrayList arrayList = rh0Var.f40731b;
        ArrayList arrayList2 = rh0Var.f40732c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            ad1 ad1Var = this.h;
            sn snVar = this.f42152b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f20419id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20272id);
                }
                snVar.presentFragment(new ProfileActivity(bundle, null));
                ad1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && snVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(ad1Var.getContext()), ad1Var.f35368a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                snVar.f41293n1 = t10;
                t10.f29638j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.im0 im0Var = this.f42153c;
            im0Var.requestLayout();
            this.d.requestLayout();
            im0Var.getAdapter().l();
            this.e.K(this.f42154f);
        }
    }
}
