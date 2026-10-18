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
    public final sh0 f42193a;
    public final sn f42194b;
    public final org.telegram.ui.Components.im0 f42195c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.i80 e;
    public final org.telegram.ui.Components.i80 f42196f;
    public final ad1 h;

    public vc1(ad1 ad1Var, sh0 sh0Var, sn snVar, org.telegram.ui.Components.im0 im0Var, LinearLayout linearLayout, org.telegram.ui.Components.i80 i80Var, org.telegram.ui.Components.i80 i80Var2) {
        this.h = ad1Var;
        this.f42193a = sh0Var;
        this.f42194b = snVar;
        this.f42195c = im0Var;
        this.d = linearLayout;
        this.e = i80Var;
        this.f42196f = i80Var2;
    }

    @Override
    public final void onClick(View view) {
        sh0 sh0Var = this.f42193a;
        ArrayList arrayList = sh0Var.f41131b;
        ArrayList arrayList2 = sh0Var.f41132c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            ad1 ad1Var = this.h;
            sn snVar = this.f42194b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f20426id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20279id);
                }
                snVar.presentFragment(new ProfileActivity(bundle, null));
                ad1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && snVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(ad1Var.getContext()), ad1Var.f35416a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                snVar.f41328n1 = t10;
                t10.f29645j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.im0 im0Var = this.f42195c;
            im0Var.requestLayout();
            this.d.requestLayout();
            im0Var.getAdapter().l();
            this.e.K(this.f42196f);
        }
    }
}
