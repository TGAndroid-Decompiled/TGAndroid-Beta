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
public final class wv0 implements View.OnClickListener {
    public final zh0 f39862a;
    public final wn f39863b;
    public final org.telegram.ui.Components.zl0 f39864c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.b80 e;
    public final org.telegram.ui.Components.b80 f39865f;
    public final dw0 h;

    public wv0(dw0 dw0Var, zh0 zh0Var, wn wnVar, org.telegram.ui.Components.zl0 zl0Var, LinearLayout linearLayout, org.telegram.ui.Components.b80 b80Var, org.telegram.ui.Components.b80 b80Var2) {
        this.h = dw0Var;
        this.f39862a = zh0Var;
        this.f39863b = wnVar;
        this.f39864c = zl0Var;
        this.d = linearLayout;
        this.e = b80Var;
        this.f39865f = b80Var2;
    }

    @Override
    public final void onClick(View view) {
        zh0 zh0Var = this.f39862a;
        ArrayList arrayList = zh0Var.f40604b;
        ArrayList arrayList2 = zh0Var.f40605c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            dw0 dw0Var = this.h;
            wn wnVar = this.f39863b;
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
                dw0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && wnVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.rc t10 = new org.telegram.ui.Components.yc(org.telegram.ui.Components.mb.a(dw0Var.getContext()), dw0Var.f33287b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                wnVar.f39663n1 = t10;
                t10.f27946j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.zl0 zl0Var = this.f39864c;
            zl0Var.requestLayout();
            this.d.requestLayout();
            zl0Var.getAdapter().l();
            this.e.K(this.f39865f);
        }
    }
}
