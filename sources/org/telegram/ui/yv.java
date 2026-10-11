package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class yv implements org.telegram.ui.Components.fm0 {
    public final int f44546a;
    public final sy f44547b;

    public yv(sy syVar, int i10) {
        this.f44546a = i10;
        this.f44547b = syVar;
    }

    @Override
    public final void d(int i10, View view) {
        gg.p0 p0Var;
        switch (this.f44546a) {
            case 0:
                sy syVar = this.f44547b;
                Object obj = syVar.C0.f26184v0.G(i10).G;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    zn znVar = new zn(bundle);
                    sy.a4(znVar, messageObject);
                    syVar.presentFragment(znVar);
                    return;
                } else if (obj instanceof ai.w8) {
                    ai.w8 w8Var = (ai.w8) obj;
                    Bundle f7 = org.telegram.ui.Cells.c1.f(3, "type");
                    f7.putString("hashtag", w8Var.C);
                    f7.putInt("storiesCount", w8Var.J);
                    syVar.presentFragment(new org.telegram.ui.Components.db0(f7, null));
                    return;
                } else {
                    return;
                }
            default:
                sy syVar2 = this.f44547b;
                syVar2.f41924b0.I0(true);
                ArrayList arrayList = syVar2.f41924b0.V2;
                if (arrayList.isEmpty()) {
                    p0Var = gg.r0.f10778a3[i10];
                } else {
                    p0Var = (gg.p0) arrayList.get(i10);
                }
                syVar2.g3(p0Var);
                return;
        }
    }
}
