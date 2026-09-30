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
    public final zh0 f40233a;
    public final wn f40234b;
    public final org.telegram.ui.Components.zl0 f40235c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.b80 e;
    public final org.telegram.ui.Components.b80 f40236f;
    public final de1 h;

    public yd1(de1 de1Var, zh0 zh0Var, wn wnVar, org.telegram.ui.Components.zl0 zl0Var, LinearLayout linearLayout, org.telegram.ui.Components.b80 b80Var, org.telegram.ui.Components.b80 b80Var2) {
        this.h = de1Var;
        this.f40233a = zh0Var;
        this.f40234b = wnVar;
        this.f40235c = zl0Var;
        this.d = linearLayout;
        this.e = b80Var;
        this.f40236f = b80Var2;
    }

    @Override
    public final void onClick(View view) {
        zh0 zh0Var = this.f40233a;
        ArrayList arrayList = zh0Var.f40604b;
        ArrayList arrayList2 = zh0Var.f40605c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            de1 de1Var = this.h;
            wn wnVar = this.f40234b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f18499id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f18352id);
                }
                wnVar.presentFragment(new ProfileActivity(bundle, null));
                de1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && wnVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.rc t10 = new org.telegram.ui.Components.yc(org.telegram.ui.Components.mb.a(de1Var.getContext()), de1Var.f33167a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                wnVar.f39663n1 = t10;
                t10.f27946j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.zl0 zl0Var = this.f40235c;
            zl0Var.requestLayout();
            this.d.requestLayout();
            zl0Var.getAdapter().l();
            this.e.K(this.f40236f);
        }
    }
}
