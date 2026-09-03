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
public final class sv0 implements View.OnClickListener {
    public final yh0 f38320a;
    public final zn f38321b;
    public final org.telegram.ui.Components.rl0 f38322c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.p70 e;
    public final org.telegram.ui.Components.p70 f38323f;
    public final yv0 h;

    public sv0(yv0 yv0Var, yh0 yh0Var, zn znVar, org.telegram.ui.Components.rl0 rl0Var, LinearLayout linearLayout, org.telegram.ui.Components.p70 p70Var, org.telegram.ui.Components.p70 p70Var2) {
        this.h = yv0Var;
        this.f38320a = yh0Var;
        this.f38321b = znVar;
        this.f38322c = rl0Var;
        this.d = linearLayout;
        this.e = p70Var;
        this.f38323f = p70Var2;
    }

    @Override
    public final void onClick(View view) {
        yh0 yh0Var = this.f38320a;
        ArrayList arrayList = yh0Var.f40277b;
        ArrayList arrayList2 = yh0Var.f40278c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            yv0 yv0Var = this.h;
            zn znVar = this.f38321b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f19306id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19159id);
                }
                znVar.presentFragment(new ProfileActivity(bundle, null));
                yv0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && znVar.U0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.ic t6 = new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(yv0Var.getContext()), yv0Var.f40334b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                znVar.f40638k1 = t6;
                t6.f25671j = 4000;
                t6.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.rl0 rl0Var = this.f38322c;
            rl0Var.requestLayout();
            this.d.requestLayout();
            rl0Var.getAdapter().l();
            this.e.K(this.f38323f);
        }
    }
}
